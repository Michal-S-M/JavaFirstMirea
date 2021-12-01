package ru.mirea.Тask24;

public class User {
    private String name;
    private String phone;
    private String login;
    private String password;

    public User(String name, String phone, String login, String password) {
        this.name=name;
        this.phone=phone;
        this.login = login;
        this.password = password;
    }
    public String tpString(){
        return "имя:" +name+" телефон: "+phone+" логин: "+login+" парроль: "+password;
    }
}
