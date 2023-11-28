package org.example;

public class Product {
    //overload
        public Product (int id,String name,String description,double price,int stockAmount,String color,String code) {
        System.out.println("Yapıcı blok çalıştı");
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
        this.color = color;
        this.code = code;

    }
    public Product (){

    }

    //Attribute | field
    private int id;
     private String name;
     private String description;
     private double price;
     private int stockAmount;
     private String color;
     private String code;
    //getter
    public int getId(){
        return id;
    }
    //setter
    public void setId(int id){
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCode() {
        return this.name.substring(0,1) + id;
    }




   /* public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = _name;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        this._description = _description;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double price) {
        this._price = _price;
    }

    public int getStockAmount() {
        return _stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this._stockAmount = _stockAmount;
    }

    public String getColor() {
        return _color;
    }

    public void setColor(String color) {
        this._color = _color;
    }

    public String getCode() {
        return _code;
    }

    public void setCode(String code) {
        this._code = _code;
    }*/
}
