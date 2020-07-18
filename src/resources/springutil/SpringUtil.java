package resources.springutil;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public  class SpringUtil {

	static ApplicationContext applicationContext;

	public static ApplicationContext getContext(String configlocation) {
		String configlocationPrefix = "resources/";
		if (configlocation != null && !configlocation.isEmpty()) {
			applicationContext = new ClassPathXmlApplicationContext(configlocationPrefix + configlocation);
			return applicationContext;
		}
		return null;

	}

	public static void closeContext() throws IllegalAccessException {
		if (applicationContext != null) {
			((ClassPathXmlApplicationContext) applicationContext).close();
			return;
		}

		throw new IllegalAccessException("Spring container doesnt exist");
	}

}
