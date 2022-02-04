import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

// TODO: first create your Student class

public class Main
{
    public static void main(String[] args)
    {
        loadStudents();
        // TODO: make an ArrayList of type Double (for the constants)
        List <Double> constants  = new ArrayList<>(loadConstants());
        // TODO: make a LinkedList of type Student (for the students)
        List <Student> sStudent  = new LinkedList<>(loadStudents());

        // TODO: call a method to load constants, returning an ArrayList of Doubles
        loadConstants();
        // TODO: call a method to load students, returning a LinkedList of Students
        loadStudents();
        
        // TODO: call the printStuff method with the list of constants
        printStuff(constants);
        // TODO: call the printStuff method with the list of students
        printStuff(sStudent);

        // TODO: sort the list of students with Collections.sort()
        Collections.sort(sStudent);
        // TODO: call the printStuff method again with the list of students
        printStuff(sStudent);
        
        // TODO: call the trimStudents() method
        // TODO: call the printStuff method again with the list of students
    }
    
    // TODO: create a method loadConstants() which returns an ArrayList of Doubles
    private static ArrayList<Double> loadConstants()
    {
        File file = new File("res/constants.txt");
        Scanner reader;

        try
        {
            reader = new Scanner(file);
        }
        catch (FileNotFoundException e)
        {
            System.err.println("Could not find file: " + file.toPath());
            return null;
        }

        ArrayList<Double> constants = new ArrayList<Double>();

        reader.nextLine(); // eat header
        while (reader.hasNext())
        {
            String line = reader.nextLine();
            Double d = Double.valueOf(line);
            constants.add(d);
        }

        return constants;
    }

    // TODO: uncomment this method below

    private static LinkedList<Student> loadStudents()
    {
        File file = new File("res/roster.csv");
        Scanner reader;

        try
        {
            reader = new Scanner(file);
        }
        catch (FileNotFoundException e)
        {
            System.err.println("Could not find file: " + file.toPath());
            return null;
        }

        LinkedList<Student> students = new LinkedList<Student>();

        reader.nextLine(); // eat header
        while (reader.hasNext())
        {
            String line = reader.nextLine();
            StringTokenizer tokenizer = new StringTokenizer(line, ",\n");

            String last = tokenizer.nextToken();
            String first = tokenizer.nextToken();
            float grade = Float.valueOf(tokenizer.nextToken());

            Student s = new Student(first, last, grade);
            students.add(s);
        }

        return students;
    }

    // TODO: create a printStuff() method that takes a List of anything and prints it

    public static <E> void printStuff(List <E> stuff)
    {
        for (E element : stuff)
            System.out.println(element);
    }

    // TODO: create a trimStudents() method that takes a LinkedList of Students
    // and a double for the filter amount, which then iterates through the
    // LinkedList of Students with an Iterator and removes any Student with
    // a grade less than 90

    private static LinkedList<Student> trimStudents(double grade)
    {

    }
}
