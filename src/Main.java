public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний");
            if (age < 18) {
                System.out.println("Если возраст человека равен " + age + " , то он не достиг совершеннолетия, нужно немного подождать");
            }
        }
    }
    public static void  task2() {
        System.out.println("Задача 2");
        int temperature = 12;
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
   }
   public static void task3() {
       System.out.println("Задача 3");
       int speed = 75;
       if (speed < 60) {
           System.out.println("Если скорость " + speed +" , то можно ездить спокойно");
       } else {
           System.out.println("Если скорость " + speed +" , то придется заплатить штраф");
       }
   }
   public static void  task4() {
       System.out.println("Задача 4");
       int age = 19;
       if (age > 2 && age <=6) {
           System.out.println("Если возраст человека равен " +  age +" ,то ему нужно ходить в детский сад");
       }
       else if  (age >= 7 && age < 18) {
           System.out.println("Если возраст человека равен " + age +" ,то ему нужно ходить в школу");
       }

       else if (age >= 18 && age <= 24) {
           System.out.println("Если возраст человека равен " + age +" ,то ему нужно ходить в университет");
       }
       else if (age > 24) {
           System.out.println("Если возраст человека равен " + age +" ,то ему нужно ходить на работу");
       }
   }
   public static void task5() {
       System.out.println("Задача 5");
       int age = 15;
       boolean hasAdult = true;
       if (age < 5) {
           System.out.println("Если возраст ребенка равен " + age + " , то ему нельзя кататься на аттракционе");
       }
       else if (age >= 5 && age < 14 && hasAdult) {
           System.out.println("Если возраст ребенка равен " + age + " , то ему можно кататься на аттракционе в сопровождении взрослого");
       }
       else if (age >= 5 && age < 14 && !hasAdult) {
           System.out.println("Возраст ребенка " + age + " , но ему нельзя кататься , потому что нет взрослого");
       } else {
           System.out.println("Если возраст ребенка равен " + age + " , то ему можно кататься на аттракционе");
       }
   }
   public static void task6() {
       System.out.println("Задача 6");
       int totalPlaces = 102;
       int seatingPlaces = 60;
       int standingPlaces = totalPlaces - seatingPlaces;

       int usedSeatingPlaces = 28;
       int usedStandingPlaces = 17;
       if (usedSeatingPlaces < seatingPlaces) {
           System.out.println(seatingPlaces - usedSeatingPlaces + " свободных сидячих мест");
       } else {
           System.out.println("Нет свободных сидячих мест");
       }
       if (usedStandingPlaces < standingPlaces) {
           System.out.println(standingPlaces - usedStandingPlaces + " свободных стоячих мест");
       } else {
           System.out.println("Нет свободных стоячих мест");
       }
   }
   public static void task7() {
       System.out.println("Задача 7");
       int one = 8;
       int two = 100;
       int three = 12;
       if ( one > two) {
           if (one > three) {
               System.out.println("Максимальное число one");
           } else {
               System.out.println("Максимальное число three");
           }
       } else if (two > one) {
           if (two > three) {
               System.out.println("Максимальное число two");
           } else {
               System.out.println("Максимальное число three");
           }
       } else  {
           if (one>three) {
               System.out.println("Максимальное число two");
           } else if (three > one) {
               System.out.println("Максимальное чсло three");
           }
       }
   }
}