//  WAJP to print and count of three digit numbers. 

// Using normal for loop 
import java.util.Scanner;
public class ThreeDigitCount{
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
    System.out.println("Below are the three digit numbers :");
    getThreeDigitCount(arr);
  }
  public static void getThreeDigitCount(int[] arr){
    int count = 0;
    for(int i = 0; i<arr.length; i++){
      if(arr[i] >99 && arr[i] <=999){
        count++;
        System.out.println(arr[i]);
      }
    }
    System.out.println("Total such numbers are : "+ count);
  }
}


// Using For Each Loop or Enhanced Loop  


import java.util.Scanner;
public class ThreeDigitCount{
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
    System.out.println("Below are the three digit numbers :");
    getThreeDigitCount(arr);
  }
  public static void getThreeDigitCount(int[] arr){
    int count = 0;
    for(int num : arr){
      if(num >99 && num<=999){
        count++;
        System.out.println(num);
      }
    }
    System.out.println("Total such numbers are : "+ count);
  }
}