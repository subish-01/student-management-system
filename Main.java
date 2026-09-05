
import java.util.*;

public class Main 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student id : ");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter your name : ");
        String name = scan.nextLine();
        System.out.print("Enter your age : ");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter your department : ");
        String dept = scan.nextLine();
        ArrayList<Student> list = new ArrayList<>();
        Student st1 = new Student(id,name,age,dept);
        list.add(st1);
        for(Student s : list)
        {
            System.out.println(s);
        }  

    }
}
