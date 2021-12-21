package ru.mirea.Тask28;

public class Car {
        public static void main(String[] args) {
            Car Lada = new Car("AB787CD", 134234);
            Car Delorian = new Car().new Drone("Google_AI","CD7878AB", 676543);

            System.out.println(Lada.toString());
            System.out.println(Delorian.toString());
        }
    private String id;
    private int price;

    public Car() {    };
    public Car(String id, int price) {
        this.id = id;
        this.price = price;
    }
    public void setID(String id) {
        this.id = id;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getID() {
        return(id);
    }
    public int getPrice() {
        return(price);
    }
    public String toString() {
        return("Номера машины -" + getID() + ", она стоит " + getPrice());
    }
    private Door door = new Door("Red");
    private class Door {
        private String color;
        private Door(String color) {
            this.color = color;
        }
        public String getColor() {
            return(color);
        }
        @Override
        public String toString() {
            return("Номера машины - " + getID() + ", она стоит " + getPrice()+", её двери цвета "+getColor());
        }

    }
    private class Drone extends Car {
        String AI;
        String id;
        int price;
        public Door d1 = new Door("blue");
        public Drone(String AI, String id, int price) {
            this.AI=AI;
            this.id = id;
            this.price = price;
        }
        public String getAI() {
            return(AI);
        }
        public String getID() {
            return(id);
        }
        public int getPrice() {
            return(price);
        }
        @Override
        public String toString() {
            return("Номер дрона - " + getID() + ", он стоит " + getPrice()+", в создании применялся искуственный интелект "+getAI());
        }
    }
}
