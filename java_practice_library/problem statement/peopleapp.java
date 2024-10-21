//ex-2
 
 class firstclass{
    static int idno = 555;
        public static void print(){
            System.out.println("first class citizen:"+idno);
        }
}

 class secondclass{
    
        static  int idno = 111;
        public static void print(){
            System.out.println("second class citizen:"+idno);
        }
}

public class peopleapp{
    
        public static void main(String[] args)
        {
            
            System.out.print("people from java world");
            firstclass.print();
            secondclass.print();
        }

}

/*

people from java world
first class citizen555
second class citizen111

*/