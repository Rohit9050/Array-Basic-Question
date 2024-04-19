// WAJP to print and count all the prime numbers of an array.

import java.util.Scanner;
public class PrimeNumberCount{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] arr = {3,5,19,12,56,78,101,141,200,374,389};
    int count = 0;
    System.out.println("The Prime Numbers are : ");
    for(int i = 0; i<arr.length; i++){
      if(checkPrime(arr[i])){
        System.out.print(arr[i] + " ");
        count++;
      }
    }
    System.out.println();
    System.out.println("Total Count of Prime Numbers are : " + count);
  }
  public static boolean checkPrime(int n){
    for(int i = 2; i<=Math.sqrt(n); i++){
      if(n%i == 0){
        return false;
      } 
    }
    return true;
  }
}