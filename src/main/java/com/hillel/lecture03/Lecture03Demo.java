package com.hillel.lecture03;

public class Lecture03Demo {
    public static void main(String[] args) {
//        increments();

//        mathOperations();
        conditions();
//        ternaryOperator();

    }

    private static void ternaryOperator() {
        byte result;
        if (10 > 8) {
            if(4> 10) {
                result = -1;
            } else
            {
                result = 0;
            }



        } else {
            result = -42;
        }

        result = 10 > 8 ? 4 > 10 ? -1 : 0 : -42;
    }

    private static void conditions() {


//        int age = -10;
////        int height = 120;
//
//        if (!(age > 5 && age < 18)) {
//            System.out.println("Young");
//        }
//
//
////        if (age < 0 || age > 100) {
////            System.out.println("error");
////        } else if (age > 18) {
////
////            System.out.println("Adult");
////        } else if (age > 5) {
////            System.out.println("Young");
////        }
//
//
//        byte a = 0b0000110;  //   6
//        byte b = 0b0000100;  //   4
//
////      resutl = 0b0000110;
//
//        byte result = (byte) (a | b);
//        System.out.println("Result = " + result);
//
////      resutl = 0b0000100;
//        result = (byte) (a & b);
//        System.out.println("Result = " + result);
//
//        System.out.println("xor");
//        result = (byte) (a ^ b);
////      resutl = 0b0000010;
//        System.out.println(result);
//
//        result = (byte) (result ^ b);
//        System.out.println(result);
//
//        result = (byte) ~a;
////      result = 0b1111001
//        System.out.println(result);
//
//
//        a = 0b0000110;  //   6
//        result = (byte) (a << 2);
//        //  0b0011000; // 24
//        System.out.println(result);
//        a = -6;
        //  1b1111110;

        //  1b0111111;
        //  0b1111111;
        int i = -8;
        System.out.println(Integer.toBinaryString(i));
        int resultInt = i >> 3;
        System.out.println(resultInt);
        System.out.println(Integer.toBinaryString(resultInt));
        resultInt = i >>> 3;
        System.out.println(resultInt);
        System.out.println(Integer.toBinaryString(resultInt));


    }

    private static void mathOperations() {
        int a = 10;
        int b = 3;

        System.out.println("a / b  = " + (a / b));
        int mod = a - (b * (a / b));
        System.out.println("Mod = " + mod);
        int originalMod = a % b;
        System.out.println("Mod = " + originalMod);
    }

    private static void increments() {
        int myPrettyLongValue = 1;
        System.out.println("Increment");
        System.out.println(myPrettyLongValue);
        myPrettyLongValue = myPrettyLongValue + 1;
        System.out.println(myPrettyLongValue);
        myPrettyLongValue += 1;
        System.out.println(myPrettyLongValue);
        myPrettyLongValue += 2 * 4 + 5 / 3;
        System.out.println(myPrettyLongValue);

        myPrettyLongValue++;
        System.out.println(myPrettyLongValue);

        ++myPrettyLongValue;
        System.out.println(myPrettyLongValue);

//        int result = ++myPrettyLongValue + 10; // 25 24
        myPrettyLongValue = myPrettyLongValue++ + 10;
//        System.out.println(result);
        System.out.println(myPrettyLongValue);

        System.out.println("Decrement");
        System.out.println(myPrettyLongValue);
        myPrettyLongValue = myPrettyLongValue - 1;
        System.out.println(myPrettyLongValue);
        myPrettyLongValue -= 1;
        System.out.println(myPrettyLongValue);
        myPrettyLongValue -= 2 * 4 + 5 / 3;
        System.out.println(myPrettyLongValue);

        myPrettyLongValue--;
        System.out.println(myPrettyLongValue);

        --myPrettyLongValue;
        System.out.println(myPrettyLongValue);

//        int result = ++myPrettyLongValue + 10; // 25 24
        myPrettyLongValue = myPrettyLongValue-- - 10;
//        System.out.println(result);
        System.out.println(myPrettyLongValue);

        myPrettyLongValue *= 2;
        myPrettyLongValue /= 2;

        myPrettyLongValue = myPrettyLongValue * 2;
        myPrettyLongValue = myPrettyLongValue * 2;
    }
}
