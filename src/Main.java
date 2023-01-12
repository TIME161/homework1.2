public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6 ;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = (friend + 2) / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var mass1 = 78.2;
        System.out.println(mass1 + "кг. Вес первого боксера");
        var mass2 = 82.7;
        System.out.println(mass2 + "кг. Вес второго боксера");
        var totalWeight = mass1 + mass2;
        System.out.println(totalWeight + "кг. Вес двух бойцов");
        var odds = mass2 - mass1;
        System.out.println(odds + "кг. Разница между весами бойцов");
    }
}
