public class Lesson1MathUtil {

    public static void main(String[] args) {
        System.out.println(min(5, 6));
        System.out.println(min(3, 1));
        System.out.println(max(5, 6));
        System.out.println(max(3, 1));
        System.out.println(abs(7));
        System.out.println(isEven(7));
        System.out.println(min(2,4,7));
        System.out.println(max(2,4,7));
    }

    public static int min(int a, int b){
        // TODO tagasta a ja b väikseim väärtus
        if(a < b){
            return a;
        } else {
            return b;
        }
    }

    public static int max(int a, int b){
        // TODO tagasta a ja b suurim väärtus
        if(a > b) {
            return a;
        }else  {
            return b;
        }
    }

    public static int abs(int a){
        if(a>=0){
            return a;

        }else{
            return -a;
        }
        // TODO tagasta a absoluut arv

    }

    public static boolean isEven(int a){
        if(a % 2 == 0){
            return true;
        }else{
            return false;
        }
        // TODO tagasta true, kui a on paaris arv
        // tagasta false kui a on paaritu arv

    }

    public static int min(int a, int b, int c){
        // TODO tagasta a, b ja c väikseim väärtus
        if(a < b){
            if(a < c) {
                return a;
            } else {
                return c;
            }
        } else {
            if(b < c) {
                return b;
            } else {
                return c;
            }
        }
    }


    public static int max(int a, int b, int c){
        // TODO tagasta a, b ja c suurim väärtus
        if(a > b){
            if(a > c) {
                return a;
            } else {
                return c;
            }
        } else {
            if(b > c) {
                return b;
            } else {
                return c;
            }
        }
    }

}