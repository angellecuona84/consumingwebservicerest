package com.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Angel Luis on 14/05/2015.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class RestServiceBean {

    private String id;
    private String name;
    private String about;
    private String phone;
    private String website;

    public String getName() {
        return name;
    }

    public String getAbout() {
        return about;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }

    public String getId() {
        return id;
    }
}
