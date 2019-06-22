package com.kona.springboot.sample.web.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author : Yuan.Pan 2019/6/22 8:59 PM
 */
@Component
@ConfigurationProperties(prefix = "user")
public class UserConfig {

    private String userName;

    private String userAge;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }
}
