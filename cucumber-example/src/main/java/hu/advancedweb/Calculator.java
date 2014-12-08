package hu.advancedweb;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Simple, extensible calculator, that supports operations based on it's configuration.
 * After an operation is performed, the result can be queried.
 * 
 * @see config.properties
 * @see #performOperation(String, int, int)
 * @see #getResult()
 * 
 * @author David Csakvari
 */
public class Calculator {
	
	private static final String CONFIG_FILE_NAME = "config.properties";
	private Map<String, Operation> operations = new HashMap<String, Operation>();
	private int result = 0;
	
	public Calculator() {
		Properties properties = getConfig();
		registerOperations(properties);
	}
	
	private Properties getConfig() {
		try {
			Properties properties = new Properties();
			InputStream inputStream = getClass().getClassLoader().getResourceAsStream(CONFIG_FILE_NAME);
			properties.load(inputStream);
			return properties;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	private void registerOperations(Properties properties){
		try {
			for (String operationName : properties.stringPropertyNames()) {
				String operationClassName = properties.getProperty(operationName);
				operations.put(operationName, (Operation)Class.forName(operationClassName).newInstance());
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public void performOperation(String name, int arg1, int arg2) {
		if (operations.containsKey(name)) {
			result = operations.get(name).perform(arg1, arg2);
		} else {
			throw new RuntimeException("No such operation.");
		}
	}
	
	public int getResult() {
		return result;
	}
	
}
