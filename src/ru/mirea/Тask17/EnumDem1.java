package ru.mirea.Тask17;

class EnumDem1 {
public static void main(String[] args) {
        Doctor ap;
        System.out.println("Константы перечислимого типа Apple:");

        // создается переменная allapples, которой присваивается ссылка на массив значений перечислимого типа.
        Doctor allapples[] = Doctor.values();
        for (Doctor a : allapples) {
        System.out.println(a);
        }

        System.out.println("\nвозможыне врачи:");

        // цикл for можно написать и без переменной allapples
        for (Doctor a : Doctor.values() ) {
        System.out.print(a + " ");
        }

        System.out.println("\n");

        // метод valueOf() возвращает значение перечислимого типа, связанное с именем константы того же типа,
        // передаваемым этому методу в виде символьной строки.
        ap = Doctor.valueOf("ENT");
        System.out.println("вы записаны к " + ap + ", услуги стоят: "+ ap.getPrice());
        }
}
