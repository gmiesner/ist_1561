import java.util.Scanner;

class Main {
  public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
       
        System.out.print("Enter numbers: ");
        String numbers = input.nextLine();
        String[] numb3rs = numbers.split(" ");
        System.out.print(numb3rs);
     int [] arr = new int [numb3rs.length];
      for(int i=0; i<numb3rs.length; i++) {
         arr[i] = Integer.parseInt(numb3rs[i]);
      }
        
      int largest = arr[0];
      int number;
      int occurrence = 0; 
      for(int i = 0; i < arr.length; i++){
        number = arr[i];
        if (number > largest){
          largest = number; 
          occurrence = 1; 
        } else if (number == largest){
          occurrence++; 
        }
      }
      
        System.out.println("The largest number is " + largest);
        System.out.println("The occurrence count is " + occurrence);
        }
}