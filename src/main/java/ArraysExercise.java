
import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercise {

    // Make global variables to be accessed in the ArrayExercise class

    private static final Scanner input = new Scanner(System.in);
    private static final int[] numbers = new int[9];


    public static void main(String[] args) {
        System.out.println();
        int choice = 0;

        //Menu to access all done exercises from 1- 18
        //do while loop to run until the user stops the program
        do {
            menu();
            System.out.println();
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    printOutArray();
                    break;
                case 2:
                    System.out.println("(2) Find the Position of an element in the Array above");
                    System.out.println("What element position do you want to find?:");
                    int element = input.nextInt();
                    System.out.println("The position of " + element + " is : " + indexOf(element, numbers));
                    break;
                case 3:
                    sortedstringArray();
                    break;
                case 4:

                    copyArrayElements(numbers);
                    break;
                case 5:
                    twoDimensionalArray();
                    break;
                case 6:
                    System.out.println("(6) Average of Array {43,5,23,17,2,14}");
                    int[] array2 = {43, 5, 23, 17, 2, 14};
                    averageArrangeOfArray(array2);
                    System.out.println();

                    break;
                case 7:
                    System.out.println("(7) Find odd Number in an Array {1 2 4 7 9 12}");
                    int[] array = {1, 2, 4, 7, 9, 12};
                    printOutOddNumbers(array);

                    break;
                case 8:
                    int[] array3 = {20, 20, 40, 20, 30, 40, 50, 60, 50};
                    System.out.println("(8) Remove duplicates from " + Arrays.toString(array3));
                    removeDuplicateELements(array3, array3.length);

                    break;
                case 9:
                    addUpAllElementsInArray();

                    break;
                case 10:

                    int[][] store;
                    store = dimensionaltimesTable(10, 10);
                    for (int row = 0; row < store.length; row++) {
                        for (int column = 0; column < store[row].length; column++) {
                            System.out.printf("%2d ", store[row][column]);
                        }
                        System.out.println();
                    }

                    break;
                case 11:
                    reverseArrayElements();

                    break;
                case 12:
                    int n = 3;
                    int[][] matrix = {{1, 2, 3,}, {2, 4, 6}, {3, 6, 9}};

                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(matrix[i][j] + " ");
                        }

                        System.out.println();
                    }
                    System.out.println();
                    printOutdiagonalElements(matrix, n);

                    break;
                case 13:
                    oddnEvenArrangedArray();


                    break;
                case 14:
                    System.out.println("Goodbye thanks for checking out my implementation");
                    break;

            }


        } while (choice <= 13);


    }

    public static void menu() {
        System.out.println();
        System.out.println("Welcome to my second exercise (Arrays 2nd week)");
        System.out.println();
        System.out.println("(1) Store elements in an array and print them out");
        System.out.println("(2) Find the position of an element in array stored");
        System.out.println("(3) Sort Cities in ascending order (A-B)");
        System.out.println("(4) Copy elements in the above array into another array");
        System.out.println("(5) Match cities according to corresponding countries");
        System.out.println("(6) Finding the average of 10 elements in an array");
        System.out.println("(7) Finding odd numbers from an array");
        System.out.println("(8) Remove duplicate elements from an arra");
        System.out.println("(9) Add all elements in an array according to user inputs");
        System.out.println("(10) Multplication table stored in a multidimensional array");
        System.out.println("(11) Get a reversed order of an array basing on the user inputs");
        System.out.println("(12) Get diagonal elements from matrix ");
        System.out.println("(13) Odd and Even Arranged Array ");


    }

    public static void printOutArray() {
        System.out.println("(1) Enter 9 Numbers to be Stored");


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();

        }

        System.out.println(java.util.Arrays.toString(numbers));
        System.out.println();
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
        System.out.println("(3) sorting this in ascending order A-B " + java.util.Arrays.toString(stringarray));
        java.util.Arrays.sort(stringarray); // sort the array
        System.out.println("sorted Array: " + java.util.Arrays.toString(stringarray));

    }

    public static void copyArrayElements(int[] array) {

        // Create A new array same size as the original Array

        if (array == null) {
            System.out.println("Do task 1 to fill up the array in order to copy it into another array");
        }

        int[] NewArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {

            //Assign all values in Orinigal Array into New Array
            NewArray[i] = array[i];


        }
        System.out.println(Arrays.toString(NewArray));

    }

    public static void twoDimensionalArray() {
        String[][] countriesAndCities = {{"Sweden", "France", "United Kingdom", "USA", "Egypt", "Denmark"}, {"Stockholm", "Paris", "London", "Washington DC", "Cairo", "Copenhagen"}};

        System.out.println("we matching the following strings to there corresponding childs (countries - cities " + Arrays.toString(countriesAndCities[0]) + " " + Arrays.toString(countriesAndCities[1]));
        System.out.println();
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

    public static void printOutOddNumbers(int[] numbers) {
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

    public static void reverseArrayElements() {
        System.out.println("Enter the size of the array:");
        int arraylegth = input.nextInt();
        int[] array = new int[arraylegth];
        int sum = 0;
        System.out.println("Add elements in the array one by one");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();


        }
        System.out.println("Elements in the array include: " + Arrays.toString(array));
        System.out.println("Array in reverse order:");

        //Here we just use the opposite of the usual loop statement and substract the 1 from the length of our Array
        for (int i = array.length - 1; i >= 0; i--)
            System.out.print(array[i] + "  ");
    }

    public static void printOutdiagonalElements(int tx[][], int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(tx[i][j] + ", ");
                }
            }
        }
        System.out.println("");

    }

    public static void oddnEvenArrangedArray() {
        int[] randomNumberArray;
        int[] finalArray;
        int left = 0;

        System.out.println("Enter the size of the  Random array:");
        int arraylegth = input.nextInt();
        randomNumberArray = new int[arraylegth];
        int sum = 0;
        System.out.println("Add elements in the array one by one");
        for (int i = 0; i < randomNumberArray.length; i++) {
            randomNumberArray[i] = input.nextInt();


        }
        System.out.println("Elements in the random array: " + Arrays.toString(randomNumberArray));
        int right = randomNumberArray.length - 1;
        while (left < right) {
            /* Increment left index while we see 0 at left */
            while (randomNumberArray[left] % 2 == 0 && left < right)
                left++;

            /* Decrement right index while we see 1 at right */
            while (randomNumberArray[right] % 2 == 1 && left < right)
                right--;

            if (left < right) {
                /* Swap arr[left] and arr[right]*/
                int temp = randomNumberArray[left];
                randomNumberArray[left] = randomNumberArray[right];
                randomNumberArray[right] = temp;
                left++;
                right--;
            }

        }
        // Finnaly we copy all these elements into the Final Array
        finalArray = new int[randomNumberArray.length];
        for (int i = 0; i < randomNumberArray.length; i++) {

            //Assign all values in Orinigal Array into New Array
            finalArray[i] = finalArray[i];
        }
        System.out.println(Arrays.toString(randomNumberArray));


    }


}


