package com.example.quotes_sayri_app.Model;

public class Model_class {
String name;
int img;
String name1;

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public Model_class(String name1) {


    }

    public String getName() {

        return name;
    }

    public static void setName(String name)
    {
        name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public Model_class(String name, int img) {
        this.name=name;
        this.img=img;

    }
}
