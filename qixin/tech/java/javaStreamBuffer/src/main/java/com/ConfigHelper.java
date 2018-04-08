package com;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Properties;

/**
 * Created by qixin on 2017/8/13.
 */
public final class ConfigHelper {
    private static Properties properties;
    static {
        InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("file.properties");
        properties = new Properties();
        try {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key, "");
    }

    public static File getFile(String filePath) {
        try {
            URL url = Thread.currentThread().getContextClassLoader().getResource(filePath);
            URI uri = url.toURI();
            File file = new File(uri);
            return file;
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return null;
    }
}
