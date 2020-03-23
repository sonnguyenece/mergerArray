import java.util.Scanner;

public class mergerArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input array 1 length : ");
        int lengthArr1 = scn.nextInt();
        int[] arr1 = new int[lengthArr1];

        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Input " + (i + 1) + " element: ");
            arr1[i] = scn.nextInt();
        }

        System.out.print("Input array 2 length : ");
        int lengthArr2 = scn.nextInt();
        int[] arr2 = new int[lengthArr2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Input " + (i + 1) + " element: ");
            arr2[i] = scn.nextInt();
        }
        System.out.print("Array 1 : ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.print("Array 2 : ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        int lengthArr3 = lengthArr1 + lengthArr2;
        int[] arr3 = new int[lengthArr3];
        for (int i = 0; i < lengthArr1; i++) {
            arr3[i]=arr1[i];
        }
        for (int i = lengthArr1,j=0; i < lengthArr3; i++,j++) {
            arr3[i]=arr2[j];
        }

        System.out.print("Array 3 : ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
    }
}
