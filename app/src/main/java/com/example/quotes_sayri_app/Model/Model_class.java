package com.example.quotes_sayri_app.Model;

public class Model_class {
    String s;
    int i;
    String name;
    int img;
    int set_img;
    int l;

    public Model_class(String s, int i) {

        this.s = s;
        this.i = i;

    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public Model_class(String name, int img, int set_img , int l) {
        this.name = name;
        this.img = img;
        this.set_img = set_img;
        this.l=l;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getSet_img() {
        return set_img;
    }

    public void setSet_img(int set_img) {
        this.set_img = set_img;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
