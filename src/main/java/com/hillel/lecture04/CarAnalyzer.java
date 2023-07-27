import java.util.Random;
import java.util.Scanner;

public class CarAnalyzer {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
//        naiveImplementation();
//        forExample();
//        forEachExample();
//        whileExample();
//        doWhileExample();
//        arraysExample();


        enumExample();
    }

    private static void enumExample() {
        String[] numbers = {
                "AA1111AA",
                "AA2222AA",
                "AB3333AB",
                "AA4444AA",
                "AA5555AA",
                "BB6666BB",
                "AA7777AA",
                "AA8888AC"
        };

        for (String value : numbers) {
//            if("AA1111AA".equals(value)) {
//                System.out.println("Hello Alex");
//            } else if("AA5555AA".equals(value)) {
//                System.out.println("Your cars is black");
//            } else {
//                System.out.println("Unknown number");
//            }
            switch (value) {
                case "AA1111AA":
                    System.out.println("Hello Alex");
                    break;
                case "AA5555AA":
                    System.out.println("Your cars is black");
                    break;
                default:
                    System.out.println("Unknown number");
            }

        }
    }


    private static void arraysExample() {
        int[] array = {1, 2, 3, 10};
        int[] anotherArray = {3, 9, 1, 4};

        int[] randomArray = generateArray(10);

        printArray(array);
        printArray(array);
        printArray(anotherArray);
        printArray(randomArray);
    }


    private static int[] generateArray(int size) {
        int[] result = new int[size];
        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
//            result[i] = ThreadLocalRandom.current().nextInt(1, 10);
            result[i] = random.nextInt(9) + 1;
        }
        return result;
    }

    public static void printArray(int[] array) {
        System.out.println("I'm from printArray method:)");
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + ": " + array[i]);
        }
    }


    private static void doWhileExample() {
        String[] numbers = {
                "AA1111AA",
                "AA2222AA",
                "AB3333AB",
                "AA4444AA",
                "AA5555AA",
                "BB6666BB",
                "AA7777AA",
                "AA8888AC"
                ,
                "lkdfjg",
                "lkdsfjg",
                "AC9999AA"

        };


        int count = 0;
        String pattern = "AA";


        int i = -1;
        do {
            i++;
            if (numbers[i].contains(pattern)) {
                count++;
            } else {
                System.out.println("continue");
                continue;
            }

            System.out.println(numbers[i]);
        } while (i < numbers.length - 1);


        System.out.println("Found " + count + " numbers");
    }

    private static void whileExample() {
        String[] numbers = {
                "AA1111AA",
                "AA2222AA",
                "AB3333AB",
                "AA4444AA",
                "AA5555AA",
                "BB6666BB",
                "AA7777AA",
                "AA8888AC"
                ,
                "lkdfjg",
                "lkdsfjg",
                "AC9999AA"

        };


        int count = 0;
        String pattern = "AA";


        int i = -1;
        while (i < numbers.length - 1) {
            i++;
            if (numbers[i].contains(pattern)) {
                count++;
            } else {
                System.out.println("continue");
                continue;
            }

            System.out.println(numbers[i]);
        }


        System.out.println("Found " + count + " numbers");
    }

    private static void forEachExample() {
        String[] numbers = {
                "AA1111AA",
                "AA2222AA",
                "AB3333AB",
                "AA4444AA",
                "AA5555AA",
                "BB6666BB",
                "AA7777AA",
                "AA8888AC"
                ,
                "lkdfjg",
                "lkdsfjg",
                "AC9999AA"

        };


        int count = 0;
        String pattern = "AA";


        for (String value : numbers) {
            if (value.contains(pattern)) {
                count++;
            } else {
                continue;
            }

            System.out.println(value);

        }


        System.out.println("Found " + count + " numbers");
    }

    private static void forExample() {
        String[] numbers = {
                "AA1111AA",
                "AA2222AA",
                "AB3333AB",
                "AA4444AA",
                "AA5555AA",
                "BB6666BB",
                "AA7777AA",
                "AA8888AC"
                ,
                "lkdfjg",
                "lkdsfjg",
                "AC9999AA"

        };


        int count = 0;
        String pattern = "AA";


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].contains(pattern)) {
                count++;
            } else {
                continue;
            }

            System.out.println(numbers[i]);

        }


        System.out.println("Found " + count + " numbers");
    }

    private static void naiveImplementation() {
        String firstNumber = "AA1111AA";
        String secondNumber = "AA2222AA";
        String thirdNumber = "AB3333AB";
        String fourthNumber = "AA4444AA";
        String fifthNumber = "AA5555AA";
        String sixthNumber = "BB6666BB";
        String seventhNumber = "AA7777AA";

        int count = 0;
        String pattern = "AB";
        if (firstNumber.contains(pattern)) {
            count++;
        }
        if (secondNumber.contains(pattern)) {
            count++;
        }
        if (thirdNumber.contains(pattern)) {
            count++;
        }
        if (fourthNumber.contains(pattern)) {
            count++;
        }
        if (fifthNumber.contains(pattern)) {
            count++;
        }
        if (sixthNumber.contains(pattern)) {
            count++;
        }
        if (seventhNumber.contains(pattern)) {
            count++;
        }

        System.out.println("Found " + count + " numbers");
    }
}
