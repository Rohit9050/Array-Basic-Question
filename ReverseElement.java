public class ReverseElement {
  public static void main(String[] args){
    int[] arr = {12,56,78,101,141,374,389};
    System.out.println("The original array is : ");
    printArray(arr);
    System.out.println("=========================");
    System.out.println("The reversing element of array is : ");
    for(int i = 0; i<arr.length; i++){
      getReverseElement(arr[i]);
    }
  }
  public static void printArray(int[] arr){
    int n= arr.length;
    for(int i = 0; i<n; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void getReverseElement(int n){
    int rev = 0;
    while(n>0){
      int rem = n %10;
      rev = rev * 10 + rem;
      n = n/10;
    }
    System.out.print(rev + " ");
  }
}