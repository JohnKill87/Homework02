public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }

    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8.0 + 4;
        System.out.println(dog);
        var cat = 3.6 + 4;
        System.out.println(cat);
        var paper = 763789 + 4;
        System.out.println(paper);
    }
    public static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0 - 3.5;
        System.out.println(dog);
        var cat = 3.6 - 1.6;
        System.out.println(cat);
        var paper = 763789 - 7639;
        System.out.println(paper);
    }
    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6() {
        System.out.println("Задача 6");
        var boxerWeight1 = 78.2;
        System.out.println("Вес одного боксёра " + boxerWeight1 + " кг");
        var boxerWeight2 = 82.7;
        System.out.println("Вес второго боксёра " + boxerWeight2 + "кг");
        var totalWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Общий вес двух боксёров " + totalWeight + " кг");
        var differenceWeight = boxerWeight2 - boxerWeight1;
        System.out.println("Разница в весах между боксёрами " + differenceWeight + "кг");
    }
    public static void task7() {
        System.out.println("Задача 7");

        System.out.println("Способ 1");
        var boxerWeight1 = 78.2;
        System.out.println("Вес одного боксёра " + boxerWeight1 + " кг");
        var boxerWeight2 = 82.7;
        System.out.println("Вес второго боксёра " + boxerWeight2 + "кг");
        var differenceWeight = boxerWeight2 - boxerWeight1;
        System.out.println("Разница в весах между боксёрами " + differenceWeight + "кг");

        System.out.println("Способ 2");
        differenceWeight = (boxerWeight1 + boxerWeight2) % boxerWeight1;
        System.out.println("Разница в весах между боксёрами " + differenceWeight + "кг");
    }
    public static void task8() {
        System.out.println("Задача 8");
        var hours = 640;
        System.out.println( hours + " Часов работы");
        var workerHours = 8;
        System.out.println( workerHours + " Часов сотрудник восвящает работе");
        var workers = hours / workerHours;
        System.out.println("Всего сотрудников в компании " + workers + " человек");
        workers = workers + 94;
        workerHours = hours / workers;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + workerHours + " часов работы может быть поделено между сотрудниками");
    }
}
