import java.util.Comparator;
public class comparator_file implements Comparator<students>{
    public int compare(students i,students j)
    {
        if(i.age > j.age)
        {
            return 1;
        }
        else{
            return -1;
        }
    }
}
