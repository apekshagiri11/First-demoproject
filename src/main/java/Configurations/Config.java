package Configurations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {

    private static Properties props = new Properties();

    static {
        try {
            FileInputStream fis = new FileInputStream("src/main/resources/PropertiesFile");
            props.load(fis);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load config.properties", e);
        }
    }

    public static String get(String key) {
        return props.getProperty(key);
    }

}