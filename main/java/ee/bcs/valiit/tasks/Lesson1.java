package ee.bcs.valiit.tasks;

public class Lesson1 {

    public static void main(String[] args) {
        excersie1();
        excersie2();
        excersie3();
        excersie4();
    }

    public static void excersie1() {
        // TODO
        // defineeri 3 muutujat a = 1, b = 1, c = 3
        int a = 1;
        int b = 1;
        int c = 3;

        // Prindi välja a==b ja a==c
        System.out.println(a == c);
        System.out.println(a == b);
        // Lisa rida a = c
        a = c;
        // Prindi välja a==b ja a==c, mis muutus???
        System.out.println(a == b);
        System.out.println(a == c);
    }

    public static void excersie2() {
        // TODO
        // Loo muutujad x1 = 10 ja x2 = 20, vali sobiv andmetüüp
        int x1 = 10;
        int x2 = 20;
        // Tekita muutuja y1 = ++x1, trüki välja nii x1 kui y1
        int y1 = ++x1;  //x1 = x1 + 1 on viimane tehe
        System.out.println("x1=" + x1);
        System.out.println("y1=" + y1);

        // Tekita muutuja y2 = x2++, trüki välja nii x2 ja y2
        int y2 = x2++;
        System.out.println("x2=" + x2);
        System.out.println("y2=" + y2);
        // Analüüsi tulemusi
    }

    public static void excersie3() {
        // TODO
        // Loo arvulised muutujad
        // a = 18 % 3
        // b = 19 % 3
        // c = 20 % 3
        // d = 21 % 3
        int a = 18 % 3;
        int b = 19 % 3;
        int c = 20 % 3;
        int d = 21 % 3;
        // Prindi välja kõigi muutujate väärtused
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
        System.out.println("d=" + d);
    }

    public static void excersie4() {
        // TODO
        // Defineeri String tüüpi muutuja mille sisu oleks "\"\\""
        String string = "\"\\\"\\\\\"\"";
        // " = \"
        // \ = \\
        // Trüki muutuja sisu välja
        System.out.println(string);
    }

}
