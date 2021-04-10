package com.example.myapplication;

import java.util.List;

public class Category {
    Meta meta;
    List<Documents> documents = null;

    public Category(Meta meta, List<Documents> list) {
        this.meta = meta;
        this.documents = list;
    }

    public Meta getMeta() {
        return meta;
    }

    public List<Documents> getList() {
        return documents;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public void setList(List<Documents> list) {
        this.documents = list;
    }
}
