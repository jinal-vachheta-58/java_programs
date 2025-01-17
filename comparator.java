// package new;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


 class student {
    int age;
    String name;

    student(int a,String n)
    {
        age = a;
        name = n;
    }
    
    public String toString()
    {
        return ("age : "+age + " name : "+name);
    }
}

class comparator {
    public static void main(String[] args) {
        Comparator<students> comp = new Comparator<students>(){
            public int compare(students i, students j)
            {
                if(i.age < j.age)
                {
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };

        List<students> student_list =new  LinkedList<>();

        student_list.add(new students(18, "jinal"));
        student_list.add(new students(15, "jinal"));
        student_list.add(new students(17, "jinal"));

        Collections.sort(student_list,comp);
        // Collections.sort(student_list, comp);
        for (students s : student_list) {
            System.out.println(s);
        }
    }
}