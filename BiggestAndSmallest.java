// WAJP to print the biggest and smallest elemnet in an array.


// 1    Taking input form user 

import java.util.Scanner;
public class BiggestAndSmallest{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int size = sc.nextInt();
    double[] arr = new double[size];
    for(int i = 0; i<size; i++){
      System.out.println("Enter the elemnet at index : " + i);
      arr[i] = sc.nextDouble();
    }
    getBigAndSmall(arr);
  }
  public static void getBigAndSmall(double[] arr){
    double sum = 0.0;
    int n = arr.length;
    double big = Integer.MIN_VALUE;
    double small = Integer.MAX_VALUE;
    for(int i = 0; i<n; i++){
      if(arr[i]>big){
        big = arr[i];
      }
      if(arr[i]<small){
        small = arr[i];
      }
    }
    System.out.println("The Biggest Number is : " + big);
    System.out.println("The Smallest Number is : " + small);
  }
}



// 2. Without taking userinput 


public class BiggestAndSmallest{
  public static void main(String[] args){
    double[] arr = {10,20,30,40,50,60,70,80,90,100};
    getBigAndSmall(arr);
  }
  public static void getBigAndSmall(double[] arr){
    double sum = 0;
    int n = arr.length;
    double big = Integer.MIN_VALUE;
    double small = Integer.MAX_VALUE;
    for(int i = 0; i<n; i++){
      if(arr[i]>big){
        big = arr[i];
      }
      if(arr[i]<small){
        small = arr[i];
      }
    }
    System.out.println("The Biggest Number is : " + big);
    System.out.println("The Smallest Number is : " + small);
  }
}



