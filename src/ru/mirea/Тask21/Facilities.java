package ru.mirea.Тask21;

public class Facilities {
    String type;
    int price;
    long ID;
    Facilities(int ID){
        this.ID = ID;
        price=0;
        type="";
    }
    public void changeID(long ID){
        this.ID = ID;
    }
    public void changeType(String type){
        this.type = type;
    }
    public void changePrice(int price){
        this.price = price;
    }
    public String toString(){
        return("оборудование типа "+type+" и ценой: "+price+" рублей, ID - "+ID);
    }
}
