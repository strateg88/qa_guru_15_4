package qa_guru_15_4;

import java.sql.SQLOutput;

public class JavaPractice {
    public static void main(String[] args){
        String result = "Результат = ";

        /**
         * Мат. операторы
         */
        int a = 25;
        int b = 30;
        int c = 100;
        double d = 2.5;
        System.out.println(result + (a+b+c)*d);

        /**
         * Операторы сравнения
         */
        System.out.println(result + (a>b && c<d));
        System.out.println(result + (a!=b || c>=d));

        /**
         * Логические операторы, условные конструкции
         */
        if (a>b && c==d){
            System.out.println("Условие выполнено");
        }
        else if (a>b && c<d){
            System.out.println("Условие выполнено");
        }
        else {
            System.out.println("Условие не выполнено");
        }
        /**
         * Конструкции switch/case
         */
        int number = 10;
        switch (number){
            case 2:
                System.out.println(result + "2");
                break;
            case 5:
                System.out.println(result + "5");
                break;
            case 10:
                System.out.println(result + "10");
                break;
            default:
                System.out.println("Число не равно 2, 5, 10");
        }
    }
}
