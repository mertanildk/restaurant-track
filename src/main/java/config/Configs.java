package config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app")//prefix dediğimizle başlayan tüm değerleri alır
public class Configs {

    private String name;
    private String version;

    
    public Configs() {
    }


    public Configs(String name, String version) {
        this.name = name;
        this.version = version;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
    



}
