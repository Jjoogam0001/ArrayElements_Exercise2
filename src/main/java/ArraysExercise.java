import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercise {

    private static Scanner input = new Scanner(System.in);
    private static int[] numbers = new int[9];

    public static void main(String[] args) {
        System.out.println();
        menu();
        int[][] data;
        data = dimensionaltimesTable(10, 10);
        for (int row = 0; row < data.length; row++) {
            for (int column = 0; column < data[row].length; column++) {
                System.out.printf("%2d ", data[row][column]);
            }
            System.out.println();
        }


        System.out.println("(1) Enter 9 Numbers to be Stored");


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();

        }

        System.out.println(java.util.Arrays.toString(numbers));
        System.out.println();
        System.out.println("(2) Find the Position of an element in the Array above");
        System.out.println("What element position do you want to find?:");
        int element = input.nextInt();
        System.out.println("The position of " + element + " is : " + indexOf(element, numbers));

        System.out.println();

        sortedstringArray();
        copyArrayElements(numbers);
        System.out.println("Two dimensional Array");
        twoDimensionalArray();

        System.out.println();

        System.out.println("(6) Average of Array {43,5,23,17,2,14}");
        int[] array2 = {43, 5, 23, 17, 2, 14};
        averageArrangeOfArray(array2);
        System.out.println();

        System.out.println("(7) Find odd Number in an Array");
        int[] array = {1, 2, 6, 7, 9, 12, 70, 20, 12, 90};

        printOutEvenNumbers(array);

        int[] array3 = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        System.out.println("(8) Remove duplicates from " + Arrays.toString(array3));


        removeDuplicateELements(array3, array3.length);


    }

    public static int indexOf(int element, int[] array) {
        if (array == null) {
            return -1;
        }
        int len = array.length;
        int i = 0;
        while (i < len) {
            if (array[i] == element) {
                return i;
            } else {
                i = i + 1;
            }
        }
        return -1;


    }

    public static void sortedstringArray() {
        System.out.println("Sorting String Array");
        String[] stringarray = new String[]{"Paris", "London", "New York", "Stockholm"};
        System.out.println("(3) " + java.util.Arrays.toString(stringarray));
        java.util.Arrays.sort(stringarray); // sort the array
        System.out.println("sorted Array: " + java.util.Arrays.toString(stringarray));

    }

    public static void copyArrayElements(int[] array) {

        // Create A new array same size as the original Array
        int NewArray[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {

            //Assign all values in Orinigal Array into New Array
            NewArray[i] = array[i];

        }

    }

    public static void twoDimensionalArray() {
        String[][] countriesAndCities = {{"Sweden", "France", "United Kingdom", "USA", "Egypt", "Denmark"}, {"Stockholm", "Paris", "London", "Washington DC", "Cairo", "Copenhagen"}};


        for (int i = 0; i < countriesAndCities.length; i++) {
            for (int j = 0; j < countriesAndCities[i].length; j++) {
                System.out.println(countriesAndCities[0][j] + " --> " + countriesAndCities[1][j]);
            }
        }
        System.out.println();
    }

    public static void averageArrangeOfArray(int[] numbers) {
        float total = 0;
        float Average = 0;
        for (int i = 0; i < numbers.length; i++) {
            total = total + numbers[i];
            float numberOfelements = numbers.length;
            Average = total / numberOfelements;


        }
        System.out.println("The average of the array is : " + Average);

    }

    public static void printOutEvenNumbers(int[] numbers) {
        System.out.print("Odd Array:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(" " + numbers[i]);

            }
        }
    }


    public static void removeDuplicateELements(int[] array, int length) {
        Arrays.sort(array);
        //Assign value to length of the temporary array
        int j = 0;
        //Create temporary array
        int[] temp = new int[length];
        System.out.print("    Array without duplicates: ");

        for (int i = 0; i < length - 1; i++) {
            if (array[i] != array[i + 1]) {
                temp[j] = array[i];
                j++;
            }
        }
        temp[j++] = array[length - 1];
        for (int i = 0; i < j; i++) {
            array[i] = temp[i];
        }
        for (int i = 0; i < j; i++) {
            System.out.print(array[i] + " ");
        }

    }

    public static void addUpAllElementsInArray() {
        System.out.println("Enter the size of the array:");
        int arraylegth = input.nextInt();
        int[] array = new int[arraylegth];
        int sum = 0;
        System.out.println("Add elements in the array one by one");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
            sum = sum + array[i];

        }
        System.out.println("Elements in the array include: " + Arrays.toString(array));
        System.out.println("Sum of all these elements is: " + sum);

    }

    public static int[][] dimensionaltimesTable(int i, int j) {

        int[][] table = new int[i][j];
        for (int s = 0; s < table.length; s++) {
            for (int t = 0; t < table[s].length; t++) {
                table[s][t] = (s + 1) * (t + 1);
            }
        }
        return table;
    }


    public static void menu() {
        System.out.println();
        System.out.println("Welcome to my second exercise(Arrays 2nd week)");
        System.out.println();
        System.out.println("(1) Store elements in an array and print them out");
        System.out.println("(2) Find the position of an element in array stored");
        System.out.println("(3) Sort Cities in ascending order (A-B)");
        System.out.println("(4) Copy elements in the above array into another array");
        System.out.println("(5) Match cities according to corresponding countries");
        System.out.println("(6) Finding the average of 10 elements in an array");
        System.out.println("(7) Remove duplicate elements from an array");
        System.out.println("(8) Adding elements in array according to the user input");
        System.out.println("(9) Store elements in an array and print them out");
        System.out.println("(10) Mulplication table stored in a multidimensional array");


    }


}


