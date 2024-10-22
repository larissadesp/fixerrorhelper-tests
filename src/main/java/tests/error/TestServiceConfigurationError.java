package tests.error;

import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

interface MyService {
	void execute();
}

class MyServiceImpl implements MyService {
	@Override
	public void execute() {
	}
}

public class TestServiceConfigurationError {
	public static void test() {
		try {
			ServiceLoader<MyService> loader = ServiceLoader.load(MyService.class);
			if (!loader.iterator().hasNext()) {
				throw new ServiceConfigurationError(null, null);
			}
			for (MyService service : loader) {
				service.execute();
			}
		} catch (ServiceConfigurationError ex) {
			ex.printStackTrace();
		}
	}
}
