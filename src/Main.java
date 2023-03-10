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
        // Присвоить переменным разные значения
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        // Увеличить значение каждой переменной на 4
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        // Уменьшить значение каждой переменной
        var dog = 8.0;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        // Сложение + деление
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        }
    public static void task5 () {
        System.out.println("Задача 5");
        // Умножение + деление + сложение
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        // Общий вес двух бойцов + разница в весе
        var fighterOne = 78.2;
        var fighterTwo = 82.7;
        var totalWeight = fighterOne + fighterTwo;
        var weightDifference = fighterTwo - fighterOne;
        System.out.println("Общий вес бойцов " + totalWeight + "кг");
        System.out.println("Разница между весами бойцов " + weightDifference + "кг");
        }
    public static void task7 () {
        System.out.println("Задача 7");
        // Вычислить разницу весов спортсменов, используйте 2 способа
        var fighterOne = 78.2;
        var fighterTwo = 82.7;
        var weightDifference = fighterTwo - fighterOne;
        System.out.println("Разница между весами бойцов " + weightDifference + "кг");
        var fighterOne1 = 78.2;
        var fighterTwo2 = 82.7;
        var weightDifference2 = fighterTwo2 % fighterOne1;
        System.out.println("Разница между весами бойцов " + weightDifference2 + "кг");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        // Решение задачи с помощью функций сложения, вычитания, умножения и деления
        var totalTime = 640;
        var workingHours = 8;
        var numberEmployees = totalTime / workingHours;
        System.out.println("Всего работников в компании — " + numberEmployees + " человек");
        var numberEmployees2 = numberEmployees + 94;
        var workingHours2 = 8;
        var totalTime2 = numberEmployees2 * workingHours2;
        System.out.println("Если в компании работает " + numberEmployees2 + " человека, то всего " + totalTime2 + " часов работы может быть поделено между сотрудниками" );
        //ДЗ выполнил
    }
    }