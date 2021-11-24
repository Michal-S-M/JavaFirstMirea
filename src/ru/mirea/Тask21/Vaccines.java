package ru.mirea.Тask21;

public class Vaccines {
    long number;
    String type;
    int price;
    int quantity;

    public Vaccines(int number){
        this.number = number;
        type = "";
        price = 0;
        quantity=0;
    }

    public void changeNumber(int number){
        this.number = number;
    }
    public void changeType(String type){
        this.type = type;
    }
    public void changePrice(int price){
        this.price = price;
    }
    public void changeQuantity(int quantity){
        this.quantity = quantity;
    }
    public long getNumber(){
        return(this.number);
    }
    public String getType(){
        return(this.type);
    }
    public int getPrice(){
        return(this.price);
    }
    public int getQuantity(){
        return(this.quantity);
    }
    public String toString(){
        return("Вакцин типа "+type+" и ценой: "+price+" рублей, закупка которых обозначена номером "+number+" всего "+ quantity);
    }
}
