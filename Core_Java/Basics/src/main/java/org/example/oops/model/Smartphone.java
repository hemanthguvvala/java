package org.example.oops.model;

public class Smartphone {
    private String bodyType;
    private int internalRamGB;
    private String displayType;

    public Smartphone(){
        this.bodyType = "Square Body Type";
        this.internalRamGB = 500;
        this.displayType = "Touch";
    }

    public Smartphone(int internalRamGB){
        this.internalRamGB = 500;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getInternalRamGB() {
        return internalRamGB;
    }

    public void setInternalRamGB(int internalRamGB) {
        this.internalRamGB = internalRamGB;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }
}
