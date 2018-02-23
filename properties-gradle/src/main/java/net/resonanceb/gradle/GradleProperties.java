package net.resonanceb.gradle;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * My properties class for the testing of properties
 */
@ConfigurationProperties(prefix = "gradle")
public class GradleProperties {

    /**
     * My first favorite property
     */
    private String test1;

    /**
     * My second favorite property
     */
    private String test2;

    public String getTest1() {
        return test1;
    }

    public void setTest1(String test1) {
        this.test1 = test1;
    }

    public String getTest2() {
        return test2;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }
}
