//determine if two arrays are equal
import java.util.Scanner;

public class IdenticalArrays {

//start main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//create two arrays
        int m1[][] = new int[3][3];
        int m2[][] = new int[3][3];

//prompt to enter list1
        System.out.print("Enter list1:");
        for (int row = 0; row < m1.length; row++) {
            for (int column = 0; column < m1[row].length; column++) {
                m1[row][column] = input.nextInt();
            }
        }

//prompt to enter list2
        System.out.print("Enter list2:");
        for (int row = 0; row < m2.length; row++) {
            for (int column = 0; column < m2[row].length; column++) {
                m2[row][column] = input.nextInt();
            }
        }
//display result
        boolean areEqual = equals(m1, m2);
        System.out.println("The two arrays are " + (areEqual ? "identical." : "not identical."));
    }
//end main

    private static boolean equals(int[][] m1, int[][] m2) {
        int[] array1 = new int[m1.length * m1[0].length];
        int[] array2 = new int[m2.length * m2[0].length];

        int p = 0;
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                array1[p] = m1[i][j];
                p++;
            }
        }
        
        int q = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array2[q] = m2[i][j];
                q++;
            }
        }

        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }
}//end of class

