//package config;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Properties;
//
//public class ConfigReader {
//    private static Properties properties;
//
//    static {
//        try {
//            FileInputStream file = new FileInputStream("src/main/java/config/config.properties");
//            properties = new Properties();
//            properties.load(file);
//        } catch (IOException e) {
//            throw new RuntimeException("Failed to load configuration file.");
//        }
//    }
//
//    public static String getProperty(String key) {
//        return properties.getProperty(key);
//    }
//}

package config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties = new Properties();

    static {
        try (InputStream input = ConfigReader.class.getClassLoader().getResourceAsStream("config/config.properties")) {
            if (input == null) {
                throw new RuntimeException("Configuration file not found.");
            }
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load configuration file.");
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
