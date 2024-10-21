//accept name from user and display it

import java.util.Scanner;

class j2{
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    String userName;
    
    System.out.println("Enter username"); 
    userName = myObj.nextLine();   
       
    System.out.println("Username is: " + userName);        
  }
}


/*

Enter username
khushi
Username is: khushi

*/