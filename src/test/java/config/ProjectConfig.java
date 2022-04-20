package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:${properties}.properties"
})

public interface ProjectConfig extends Config {


        @Key("browser")
        @DefaultValue("Chrome")
        String browser();

        @Key("browserVersion")
        @DefaultValue("100.0")
        String browserVersion();

        @Key("browserSize")
        @DefaultValue("1680x1050")
        String browserSize();

        @Key("remoteDriverUrl")
        @DefaultValue("")
        String remoteDriverUrl();

        @Key("videoStorage")
        @DefaultValue("")
        String videoStorage();
    }

