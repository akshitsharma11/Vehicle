package com.example.vehicle;

public class UserPojo {
    private int image;
    private String ModelName;
    private String carname;
    private String carprice;
    private String showroomprice;
    private String mileage;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getModelName() {
        return ModelName;
    }

    public void setModelName(String modelName) {
        ModelName = modelName;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public String getCarprice() {
        return carprice;
    }

    public void setCarprice(String carprice) {
        this.carprice = carprice;
    }

    public String getShowroomprice() {
        return showroomprice;
    }

    public void setShowroomprice(String showroomprice) {
        this.showroomprice = showroomprice;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }
}
