/*
 * Activity 4.9.7
 */ 
public class StudentRunner
{ 
  public static void main(String args[]) 
  { 
    Student s = new Student("Rayn", 123, 11); 
    Student t = new Student("Junhe", 456, 11);
    Student r = new Student("Chittresh", 123, 11);

    // Below two statements are equivalent 
    System.out.println(s.equals(t)); //correct, printed false
    System.out.println(s.equals(r)); //correct, printed true

    //toString
    System.out.println(s.toString()); // Output: Name: Rayn ID#: 123 Grade Level: 11
    System.out.println(t.toString()); // Output: Name: Junhe ID#: 456 Grade Level: 11
    System.out.println(r.toString()); // Output: Name: Chittresh ID#: 123 Grade Level: 11

    
  } 
} 