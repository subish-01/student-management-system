
import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args)
    {
        ArrayList<Student> list = new ArrayList<>();
        Student st1 = new Student(1, "RaviKumar", 20, "CSE");
        Student st2 = new Student(2, "Vishnu", 18, "IT");
        list.add(st1);
        list.add(st2);

        for(Student s : list)
        {
            System.out.println(s);
        }  

    }
}
