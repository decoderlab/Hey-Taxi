package com.tesseract.taxisharing.model;

/**
 * Created by BlackFlag on 9/10/2016.
 */
public class UserLocation {
    String username;
    String latitude;
    String longitude;
    String time;
    String email;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    String sex;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserLocation(String username, String latitude, String longitude, String time, String account_type) {

        this.username = username;
        this.latitude = latitude;
        this.longitude = longitude;
        this.time = time;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public UserLocation() {
    }
}