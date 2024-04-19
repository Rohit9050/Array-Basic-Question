// WAJP to print and count all the even numbers 

import java.util.Scanner;
public class EvenCount{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    for(int i = 0; i<size; i++){
      System.out.println("Enter the elemnet at index : " + i);
      arr[i] = sc.nextInt();
    }
    System.out.println("====================================");
    System.out.println("Below are the numbers that are even :");
    getEvenCount(arr);
  }
  public static void getEvenCount(int[] arr){
    int count = 0;
    for(int i = 0; i<arr.length; i++){
      if(arr[i] %2 ==0){
        count++;
        System.out.println(arr[i]);
      }
    }
    System.out.println("Total such numbers are : "+ count);
  }
}