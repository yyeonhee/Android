package com.example.myapplication;

public class Meta {
    SameName SameName;
    int pageable_count;
    int total_count;
    boolean is_end;

    public Meta(com.example.myapplication.SameName sameName, int pageable_count, int total_count, boolean is_end) {
        SameName = sameName;
        this.pageable_count = pageable_count;
        this.total_count = total_count;
        this.is_end = is_end;
    }

    public com.example.myapplication.SameName getSameName() {
        return SameName;
    }

    public int getPageable_count() {
        return pageable_count;
    }

    public int getTotal_count() {
        return total_count;
    }

    public boolean isIs_end() {
        return is_end;
    }

    public void setSameName(com.example.myapplication.SameName sameName) {
        SameName = sameName;
    }

    public void setPageable_count(int pageable_count) {
        this.pageable_count = pageable_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public void setIs_end(boolean is_end) {
        this.is_end = is_end;
    }
}
