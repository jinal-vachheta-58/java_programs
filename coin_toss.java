// package package1.test;

// package package1.coin_toss;
import java.util.Scanner;

// class my_exception_class extends Exception{
//     public my_custom_exception(String message)
//     {
//         super(message);
//     }
// }


class my_exception_class extends Exception {
    public my_exception_class(String message) {
        super(message);
    }
}

class coin_toss{
    String name;
    int win;
    static int tie = 0;
    static int total_toss = 0 ;

    coin_toss()
    {
        name = "";
        win = 0;
        tie = 0;
        total_toss = 0;
    }
    static void set_tosses(int t)
    {
        total_toss = t;
    }
    static int get_tosses()
    {
        return total_toss;
    }

    static void reduce_toss()
    {
        total_toss--;
    }

    void set_name(String s)
    {
        this.name = s;
    }

String get_name()
{
    return this.name;
}


String which_coin(int c)
{
    if(c== 0)
    {
        return "Head";

    }
    else if(c == 1) {
        return "tail";
    }
    else
    {
        return "gdfugisjk";
    }
}

    // @SuppressWarnings("resource")
    public static void main(String[] args)
    {
        coin_toss u1 = new coin_toss();
        coin_toss u2 = new coin_toss();
        coin_toss u3 = new coin_toss();
        int u1_coin,u2_coin,u3_coin;
        int f = 0;
        Scanner i = new Scanner(System.in);
        int toss = 0;
        String s1;
        System.out.println("Let's play coin toss.");

try {
    System.out.println("Enter name u1 : ");
        s1 = i.nextLine();
        if(s1.trim().isEmpty())
        {
            throw new my_exception_class("u1 name missing ");
        }
        u1.set_name(s1);

        
        System.out.println("Enter name : ");
        s1 = i.nextLine();
        if(s1.trim().isEmpty())
        {
            throw new my_exception_class("u2 name missing ");
        }
        u2.set_name(s1);

        System.out.println("Enter name : ");
        s1 = i.nextLine();
        if(s1.trim().isEmpty())
        {
            throw new my_exception_class("u3 name missing ");
           
        }
        u3.set_name(s1);

        

} catch (Exception e) {
    System.out.println(e.getMessage());
    i.close();
    return;
}


try {
    System.out.println("Enter tosses : ");
        toss = i.nextInt();
        coin_toss.set_tosses(toss);

} catch (Exception e) {
    System.out.println(e.getMessage() + "Enter number only");
    i.close();
    return;
}
        

        

        while(coin_toss.get_tosses() > 0)
        {
            u1_coin =  u1.flip();
            u2_coin = u2.flip();
            u3_coin = u3.flip();

            System.out.println(u1.get_name() + " : "+ u1.which_coin(u1_coin));
            System.out.println(u2.get_name() + " : "+ u2.which_coin(u2_coin));
            System.out.println(u3.get_name() + " : "+ u3.which_coin(u3_coin));

            // System.out.println(u1_coin+u2_coin+u3_coin);
            // u3.flip();
            if(u1_coin == 0 && u2_coin == 0 && u3_coin == 0 || u1_coin == 1 && u2_coin == 1 && u3_coin == 1 )
            {
                coin_toss.set_tie();
                f = 1;
            }
            else if( u1_coin == 0 && u2_coin == 1 && u3_coin == 1  ||  u1_coin == 1 && u2_coin == 0 && u3_coin == 0 )
            {
                f =2;
                u1.win();
            }
            else if( u1_coin == 0 && u2_coin == 1 && u3_coin == 0  ||  u1_coin == 1 && u2_coin == 0 && u3_coin == 1 )
            {
                f = 3;
                u2.win();
            }
            else if( u1_coin == 0 && u2_coin == 0 && u3_coin == 1  ||  u1_coin == 1 && u2_coin == 1 && u3_coin == 0 )
            {
                f =4;
                u3.win();
            }

            if(f == 1)
            {
                System.out.println("tie");

            }
            else if(f == 2)
            {
                System.out.println(u1.get_name() +  " : wins!");
            }
            else if(f == 3)
            {
                System.out.println(u2.get_name() +  " : wins!");
            }
            else if(f == 4)
            {
                System.out.println(u3.get_name() +  " : wins!");
            }
System.out.println("________________________________________");
            coin_toss.reduce_toss();
        }
        System.out.println("u1 : "+u1.get_win());
        System.out.println("u1 : "+u2.get_win());
        System.out.println("u1 : "+u3.get_win());
        System.out.println("tie : "+coin_toss.get_tie());

        i.close();
    }
    int flip()
    {
        return (int) (Math.random() * 2);
    }
    
    static void set_tie()
    {
        tie++;
    }

    static int get_tie()
    {
        return tie;
    }

    void win()
    {
        win++;
    }
    int get_win()
    {
        return this.win;
    }
}
