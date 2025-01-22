
import java.util.*;
public class test_comparator {
    public static void main(String[] args) {

        // comparator_file comp = new comparator_file();
        List<students> stu_list = new LinkedList<>();

        stu_list.add(new students(5, "aasima"));
        stu_list.add(new students(15, "aasima"));
        stu_list.add(new students(2, "aasima"));

        Collections.sort(stu_list);

        for(students s : stu_list)
        {
            System.out.println(s);
        }
    }
}
