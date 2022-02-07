

public class Student implements Comparable <Student>

{
    private String LName;
    private String FName;
    private float SGrade;

    public Student(String last_name, String first_name, float grade)
    {
        LName = last_name;
        FName = first_name;
        SGrade = grade;
    }

    public String getLastName()
    {
        return LName;
    }

    public String getFirstName()
    {
        return FName;
    }

    public float getGrade()
    {
        return SGrade;
    }

    public String toString()
    {
        return String.format("[%-20s] [%-20s] - [%5.2f]", LName, FName, SGrade);
    }

    @Override
    public int compareTo(Student o)
    {
        return this.getLastName().compareTo(o.getLastName());
    }
}


