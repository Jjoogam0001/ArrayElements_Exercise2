import java.util.Scanner;

public class ArraysExercise {
    public static void main(String[] args) {
        System.out.println();

        //1) This program store 9 elements of an array and prints it out
        System.out.println("Welcome to Arrays Exercise");
        System.out.println("(1) Enter 9 Numbers to be Stored");


        Scanner input = new Scanner(System.in);
        int[] numbers = new int[9];
        for (int i = 0;i < numbers.length;i++){
            numbers[i] = input.nextInt();

        }

        System.out.println(java.util.Arrays.toString(numbers));
        System.out.println();
        System.out.println("(2) Find the Position of an element in the Array above");
        System.out.println("What element position do you want to find?:");
        int element = input.nextInt();
        System.out.println("The position of "+ element + " is : "+indexOf(element,numbers));

        System.out.println();

        sortedstringArray();
        CopyArrayElements(numbers);
        System.out.println("Two dimensional Array");
        TwoDimensionalArray();

        
    }

    public static int indexOf(int element, int [] array) {
        if (array == null) {
            return -1;
        }
        int len = array.length;
        int i = 0;
        while (i < len) {
            if (array[i] == element) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;


    }

    public static void  sortedstringArray(){
        System.out.println("Sorting String Array");
        String [] stringarray = new String[]{"Paris","London","New York","Stockholm"};
        System.out.println("(3) "+ java.util.Arrays.toString(stringarray));
        java.util.Arrays.sort(stringarray); // sort the array
        System.out.println("sorted Array: " + java.util.Arrays.toString(stringarray));

    }

    public static void CopyArrayElements(int[] array){

        // Create A new array same size as the original Array
        int NewArray [] = new int[array.length];
        for (int i = 0; i < array.length; i++){

            //Assign all values in Orinigal Array into New Array
            NewArray[i] = array[i];

        }

    }
    public  static void  TwoDimensionalArray(){
        String [][] countriesAndCities = {{"Sweden","France","United Kingdom","USA","Egypt","Denmark"},{"Stockholm","Paris","London","Washington DC","Cairo","Copenhagen"}};


     for (int i = 0; i < countriesAndCities.length; i++) {
         for (int j = 0; j < countriesAndCities[i].length; j++) {
             System.out.println(countriesAndCities[0][j] + " --> " + countriesAndCities[1][j]);
         }
     }
        System.out.println();






    }
}


