package config;

import org.aeonbits.owner.ConfigFactory;

public class ProjectProvider {

    public static ProjectConfig config = ConfigFactory.create(ProjectConfig.class, System.getProperties());

    public static boolean isRemoteWebDriver() { return !config.remoteDriverUrl().equals("");}

    public static String browser() { return config.browser(); }

    public static String browserSize() { return config.browserSize(); }

    public static String remoteDriverUrl() { return config.browserVersion(); }

    public static boolean isVideoOn() { return !config.videoStorage().equals(""); }
}
