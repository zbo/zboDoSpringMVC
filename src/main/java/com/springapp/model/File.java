package com.springapp.model;

/**
 * Created by twer on 15-1-14.
 */
public class File {
    private long size;
    private String name;
    private String primitiveName;
    private String type;

    public File() {
    }

    public File(int size, String name, String primitiveName, String type) {
        this.size = size;
        this.name = name;
        this.primitiveName = primitiveName;
        this.type = type;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrimitiveName() {
        return primitiveName;
    }

    public void setPrimitiveName(String primitiveName) {
        this.primitiveName = primitiveName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
