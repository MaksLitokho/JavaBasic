/**
* Java Basic. Homework #3
*
* @author Maksym_Litokho
* @version 14.9.2022
*
*/
class HW03 {
    public static void main (String[] args) {
        //1 
        System.out.println(checkWeather(-5));
        System.out.println(checkWeather(5));
        System.out.println(checkWeather(20));
        System.out.println(checkWeather(30));
        
        //2
        System.out.println(canWalk(true, true)? "I can walk" : "I canot walk");
        System.out.println(canWalk(false, true)? "I can walk" : "I canot walk");
        System.out.println(canWalk(true, false)? "I can walk" : "I canot walk");
        System.out.println(canWalk(false, false)? "I can walk" : "I canot walk");
               
        //3
        int a = 7;
        int b = 4;
        System.out.printf("%d + %d = %d\n", a, b, add(a, b));
        System.out.printf("%d - %d = %d\n", a, b, sub(a, b));
        System.out.printf("%d * %d = %d\n", a, b, mul(a, b));
        System.out.printf("%d / %d = %f\n", a, b, div(a, b));      
    }

    static String checkWeather (int temperature) {
        if (temperature < 0) {
            return "It's frost";
        } else if (temperature <= 18) {
            return "It's cold";
        } else if (temperature <= 28) {
            return "It's warm";
        } else {
            return "It's hot";
        }
    }

    static boolean canWalk(boolean isWeekend, boolean isRain) {
        return isWeekend && !isRain;
    }

    static int add(int a, int b) {
        return a + b;
    }

        static int sub(int a, int b) {
        return a - b;
    }

        static int mul(int a, int b) {
        return a * b;
    }

        static float div(float a, float b) {
        return a / b;
    }
}