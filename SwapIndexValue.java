// WAJP to swap two index values of the array without using third variable.

import java.util.Scanner;
public class SwapIndexValue{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int [] arr = {10, 20,30,40,50,60,70};
    System.out.println("Enter the index 1 to swap");
    int x = sc.nextInt();
    System.out.println("Enter the index 2 to swap");
    int y = sc.nextInt();
    swapNumber(arr, x ,y);
  }
  public static void swapNumber(int[] arr , int x, int y){
    arr[x] = arr[x] + arr[y];
    arr[y] = arr[x] - arr[y];
    arr[x] = arr[x] - arr[y];
    for(int i = 0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }
  }
}


// WAJP to swap two index values of the array with using third variable.

import java.util.Scanner;
public class SwapIndexValue{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int [] arr = {10,20,30,40,50,60,70};
    System.out.println("Enter the index 1 to swap");
    int x = sc.nextInt();
    System.out.println("Enter the index 2 to swap");
    int y = sc.nextInt();
    swapNumber(arr, x ,y);
  }
  public static void swapNumber(int[] arr , int x, int y){
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
    for(int i = 0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }
  }
}



