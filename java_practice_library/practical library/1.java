/*
    1) Write a program to print the following pattern :
    ****
    ***
    **
    *
*/ 
 
 class Pattern {
    public static void main(String[] args) {
        int rows = 4; 

        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
}

/*

****
***
**
*

 */
