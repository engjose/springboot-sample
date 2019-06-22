package com.kona.springboot.sample.web.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author : Yuan.Pan 2019/6/22 9:09 PM
 */
@Component
@ConfigurationProperties(prefix = "student")
@PropertySource("classpath:business.properties")
public class StudentConfig {

    private Integer studentAge;
    private String studentName;

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
