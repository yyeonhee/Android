package com.example.myapplication;

import java.util.List;

public class SameName {
    List<Object> region;
    String keyword;
    String select_region;

    public SameName(List<Object> region, String keyword, String select_region) {
        this.region = region;
        this.keyword = keyword;
        this.select_region = select_region;
    }

    public List<Object> getRegion() {
        return region;
    }

    public String getKeyword() {
        return keyword;
    }

    public String getSelect_region() {
        return select_region;
    }

    public void setRegion(List<Object> region) {
        this.region = region;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setSelect_region(String select_region) {
        this.select_region = select_region;
    }
}