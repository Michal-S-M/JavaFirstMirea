package ru.mirea.task1.opt3;

    public class Task3 {
        public static void main(String[] args) {
            int[] arr  = new int[] {1, 2, 3, 4, 5, 6, 7};
            int sum=0;

            for(int i = 0; i < 7; i++){
                sum=arr[i]+sum;
            }
            System.out.println("сумма массива, посчитанная через цикл for: "+sum+"\n");
            int i=0;
            sum=0;
            while(i<7){
                sum=arr[i]+sum;
                i++;
            }
            System.out.println("сумма массива, посчитанная через цикл while: "+sum+"\n");
            i=0; sum=0;
            do{
                sum=arr[i]+sum;
                i++;}
            while(i<7);
            System.out.println("сумма массива, посчитанная через цикл do while: "+sum+"\n");
        }
    }

