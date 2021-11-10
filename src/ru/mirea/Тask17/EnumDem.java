package ru.mirea.Тask17;

enum Doctor {
    ENT(400), dental(350), СardiacSurgeon(450), Ophthalmologist(300);
    private int price;
    Doctor(int p) {
        price = p;
    }
    int getPrice() {
        return price;
    }
}

class EnumDem {
    public static void main(String[] args) {
        Doctor ap; // объявляется переменная ар перечислимого типа Apple

        ap = Doctor.ENT; //  переменной ар присваивается значение RedDel

        // вывести значение перечислимого типа
        System.out.println("Значение ap: " + ap);
        System.out.println();

        ap = Doctor.dental;

        // сравнить два значения перечислимого типа
        if (ap == Doctor.dental) System.out.println("Переменная ар содержит GoldenDel.\n");

        // применить перечисление для управления оператором switch
        switch (ap) {
            case ENT:
                System.out.println("вы записаны к ЛОРу");
                break;
            case dental:
                System.out.println("вы записаны к дантисту");
                break;
            case СardiacSurgeon:
                System.out.println("вы записаы к кардиохирургу");
                break;
            case Ophthalmologist:
                System.out.println("вы записаны к офтальмологу");
                break;
        }
    }
}