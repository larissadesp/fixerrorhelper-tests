package tests.others;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; // Importando a SQLException do pacote java.sql
import java.sql.Statement;

public class TestSQLException {
	public static void test() {
		try {
			boolean simulateConnectionError = false;
			boolean simulateQueryError = false;

			if (simulateConnectionError) {
				throw new SQLException();
			} else if (simulateQueryError) {
				throw new SQLException();
			} else {
				try (Connection connection = DriverManager.getConnection("jdbc:h2:mem:testdb", "l", "")) {
					try (Statement statement = connection.createStatement()) {
						statement.execute("CREATE TABLE my_table (id INT PRIMARY KEY, name VARCHAR(255))");
						statement.execute("INSERT INTO my_table (id, name) VALUES (1, 'First Entry')");
						statement.execute("INSERT INTO my_table (id, name) VALUES (1, 'Duplicate Entry')");
					}
				}
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
