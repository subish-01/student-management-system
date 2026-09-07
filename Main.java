
import java.util.*;

public class Main 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of students to be added : ");
        int repeat = scan.nextInt();
        ArrayList<Student> list = new ArrayList<>();
        for(int i = 1; i <= repeat; i++)
        {
            System.out.println("Student " + i);
            System.out.print("Enter student id : ");
            int id = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter student name : ");
            String name = scan.nextLine();
            System.out.print("Enter student age : ");
            int age = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter student department : ");
            String dept = scan.nextLine();
            Student st_i = new Student(id,name,age,dept);
            list.add(st_i);
            System.out.println();
        }
        // for(Student s : list)
        // {
        //     System.out.println(s);
        // }  
        System.out.print("Enter Student ID to search : ");
        int search_id = scan.nextInt();
        boolean found = false;
        for(Student s : list)
        {
            if(s.id == search_id)
            {
                found = true;
                System.out.print("Student Found :");
                System.out.print(s);
                break;
            }
        }
        if(!found)
        {
            System.out.print("Student with ID " + search_id + " is not found");
        }
    }
}
