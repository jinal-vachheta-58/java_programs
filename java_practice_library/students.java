// package new;
class students implements Comparable<students>{
    int age ;
    String  name;

    students(int a , String n)
    {
        age = a ;
         name = n;
    }

    public String toString()
    {
        return "age : "+ age+ " name : "+name;
    }

    public int compareTo(students that)
    {
        if(this.age < that.age)
        {
            return 1;
        }
        else{
            return -1;
        }
    }

}
