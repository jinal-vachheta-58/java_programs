//Write java program to add two numbers, take input as command line argument.

class q2
{
    public static void main(String[] args)
    {
		
        int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		int result = a+b;
		System.out.println("addition:"+result);
		
		int result1 = a-b;
		System.out.println("substraction:"+result1);
		
		int result2 = a*b;
		System.out.println("multiplication:"+result2);
		
		int result3 = a/b;
		System.out.println("division:"+result3);
		
    }

}	

/*

z:\java\problem statement>java q2 3 4
addition:7
substraction:-1
multiplication:12
division:0

*/
	