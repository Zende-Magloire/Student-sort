

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
        return String.format("[%-12s] [%-12s] - [%5.2f]", FName, LName, SGrade);
    }

    @Override
    public int compareTo(Student o)
    {
        if (this.getGrade() < o.getGrade())
            return 1;
        else if (this.getGrade() > o.getGrade())
            return -1;
        else
            return 0;
    }
}


