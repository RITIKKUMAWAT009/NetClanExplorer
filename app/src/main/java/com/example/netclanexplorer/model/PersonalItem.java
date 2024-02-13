package com.example.netclanexplorer.model;

public class PersonalItem {
    private String userName;
    private String location;
    private String distance;
    private String tag;
    private String userLogo;
    private String msgToCommunity;
public PersonalItem(){}
    public PersonalItem(String userName, String location, String distance, String tag, String userLogo, String msgToCommunity) {
        this.userName = userName;
        this.location = location;
        this.distance = distance;
        this.tag = tag;
        this.userLogo = userLogo;
        this.msgToCommunity = msgToCommunity;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getUserLogo() {
        return userLogo;
    }

    public void setUserLogo(String userLogo) {
        this.userLogo = userLogo;
    }

    public String getMsgToCommunity() {
        return msgToCommunity;
    }

    public void setMsgToCommunity(String msgToCommunity) {
        this.msgToCommunity = msgToCommunity;
    }
}
