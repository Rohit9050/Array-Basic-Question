public class EvenLengthString{
  public static void main(String[] args){
    String[] arr = {"Mohan", "Sohan","Suresh", "Ganesh", "Rohan", "Mukesh"};
    getEvenLength(arr);
  }
  public static void getEvenLength(String[] arr){
    int count = 0;
    for(int i = 0; i<arr.length; i++){
      if(arr[i].length()%2 ==0){
        System.out.println(arr[i]);
        count++;
      }
    }
    System.out.println("Total even length words are : " + count);
  }
}