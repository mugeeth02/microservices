package com.mugeeth.configPropertiesActuator.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration  //spring takes this class as bean
@ConfigurationProperties(prefix="api") //spring scans property files with api prefix
public class ApiConfig {
    public String host;
    public Integer port;
    public String timeout;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getTimeout() {
        return timeout;
    }

    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }
}
