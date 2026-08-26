
public class Student 
{
    int id;
    String name;
    int age;
    String department;

    Student(int id,String name,int age,String dept)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = dept;
    }
    @Override
    public String toString()
    {
        return "id :" + id + " Name :" + name + " Age : " + age + " Department : " + department;
    }
}
