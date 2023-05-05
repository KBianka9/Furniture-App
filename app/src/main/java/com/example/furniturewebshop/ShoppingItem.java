package com.example.furniturewebshop;

public class ShoppingItem {
    private String id;
    private String name;
    private String info;
    private String price;
    private float ratedInfo;
    private int imgResource;
    private int cartedCount;

    public ShoppingItem() {
    }

    public ShoppingItem(String name, String info, String price, float ratedInfo, int imgResource, int cartedCount) {
        this.name = name;
        this.info = info;
        this.price = price;
        this.ratedInfo = ratedInfo;
        this.imgResource = imgResource;
        this.cartedCount = cartedCount;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public String getPrice() {
        return price;
    }

    public float getRatedInfo() {
        return ratedInfo;
    }

    public int getImgResource() {
        return imgResource;
    }

    public int getCartedCount(){return cartedCount;}

    public String _getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
}
