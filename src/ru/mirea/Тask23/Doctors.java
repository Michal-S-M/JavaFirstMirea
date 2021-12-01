package ru.mirea.Тask23;
import java.util.Objects;

public class Doctors {
    private String Name;
    private int yearsOld;
    private int ID;

    Doctors(String Name, int yearsOld, int ID){
        this.Name=Name;
        this.yearsOld=yearsOld;
        this.ID=ID;
    }
    @Override
    public int hashCode() {
        int result = Name == null ? 0 : Name.hashCode();
        result = 31 * result + yearsOld;
        return result;
    }
    public String toString(){
        return "Доктор "+Name+", "+yearsOld+" лет, ID - "+ID+"\n";
    }
}
