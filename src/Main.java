public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадание 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog + "\ncat = " + cat + "\npaper = " + paper);
        System.out.println("\nЗадание 2");
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("dog = " + dog + "\ncat = " + cat + "\npaper = " + paper);
        System.out.println("\nЗадание 3");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("dog = " + dog + "\ncat = " + cat + "\npaper = " + paper);
        System.out.println("\nЗадание 4");
        var friend = 19;
        System.out.println("friend1 = " + friend);
        friend += 2;
        System.out.println("friend2 = " + friend);
        friend /= 7;
        System.out.println("friend3 = " + friend);
        System.out.println("\nЗадание 5");
        var frog = 3.5;
        System.out.println("frog1 = " + frog);
        frog *= 10;
        System.out.println("frog2 = " + frog);
        frog /= 3.5;
        System.out.println("frog3 = " + frog);
        frog += 4;
        System.out.println("frog4 = " + frog);
        System.out.println("\nЗадание 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var weightsSum = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общая масса бойцов = " + weightsSum + " кг");
        System.out.println("\nЗадание 7");
        var theRemainderOfTheDivision1 = firstBoxerWeight % secondBoxerWeight;
        System.out.println("Остаток от деления(1) = " + theRemainderOfTheDivision1 + " кг");
        var theRemainderOfTheDivision2 = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Остаток от деления(2) = " + theRemainderOfTheDivision2 + " кг");
        System.out.println("\nЗадание 8");
        var allHours = 640;
        var hourPerWorker = 8;
        var allWorkers = allHours / hourPerWorker;
        System.out.println("Всего работников в компании - " + allWorkers + " человек");
        allWorkers += 94;
        allHours = allWorkers * hourPerWorker;
        System.out.println("Если в компании " + allWorkers + " человек, то всего " + allHours + " часов работы может быть поделено между сотрудниками");
        }
    }