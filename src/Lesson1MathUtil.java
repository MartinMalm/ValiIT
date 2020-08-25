import java.util.Scanner;

public class Lesson1MathUtil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Palun sisesta soovitud funktsioon");
        String funktsioon = scanner.nextLine();
        if (funktsioon.equals("min")) {
            System.out.println("Palun sisesta number");
            int a = scanner.nextInt();
            System.out.println("Palun sisesta teine number");
            int b = scanner.nextInt();
            System.out.println(min(a, b));
        } else if (funktsioon.equals("max")) {
            System.out.println("Palun sisesta number");
            int a = scanner.nextInt();
            System.out.println("Palun sisesta teine number");
            int b = scanner.nextInt();
            System.out.println(max(a, b));
        } else if (funktsioon.equals("abs")) {
            System.out.println("Palun sisesta number");
            int a = scanner.nextInt();
            System.out.println(abs(a));
        } else if (funktsioon.equals("isEven")) {
            System.out.println("Palun sisesta number");
            int a = scanner.nextInt();
            System.out.println(isEven(a));
        } else if (funktsioon.equals("min3")) {
            System.out.println("Palun sisesta number");
            int a = scanner.nextInt();
            System.out.println("Palun sisesta teine number");
            int b = scanner.nextInt();
            System.out.println("Palun sisesta kolmas number");
            int c = scanner.nextInt();
            System.out.println(min3(a, b, c));
        } else if (funktsioon.equals("max3")) {
            System.out.println("Palun sisesta number");
            int a = scanner.nextInt();
            System.out.println("Palun sisesta teine number");
            int b = scanner.nextInt();
            System.out.println("Palun sisesta kolmas number");
            int c = scanner.nextInt();
            System.out.println(max3(a, b, c));
        } else {
            System.out.println("Tundmatu sisend");
        }
        /*
        System.out.println(min(5, 6));
        System.out.println(min(3, 1));
        System.out.println(max(5, 6));
        System.out.println(max(3, 1));
        System.out.println(abs(7));
        System.out.println(isEven(7));
        System.out.println(min(2,4,7));
        System.out.println(max(2,4,7));
        Scanner scanner = new Scanner(System.in);

        */
    }

    public static int min(int a, int b) {
        // TODO tagasta a ja b väikseim väärtus
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static int max(int a, int b) {
        // TODO tagasta a ja b suurim väärtus
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int abs(int a) {
        if (a >= 0) {
            return a;

        } else {
            return -a;
        }
        // TODO tagasta a absoluut arv

    }

    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
        // TODO tagasta true, kui a on paaris arv
        // tagasta false kui a on paaritu arv

    }

    public static int min3(int a, int b, int c) {
        // TODO tagasta a, b ja c väikseim väärtus
        if (a < b) {
            if (a < c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b < c) {
                return b;
            } else {
                return c;
            }
        }
    }


    public static int max3(int a, int b, int c) {
        // TODO tagasta a, b ja c suurim väärtus
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b > c) {
                return b;
            } else {
                return c;
            }
        }
    }

}


