/*
 * Activity 4.9.7
 */ 
public class Student 
{ 
  private String name = "";  
  private int id;
  private int gradeLevel;

  // Constructor 
  Student(String inputName, int idNum, int grade) 
  { 
    name = inputName;
    id = idNum;
    gradeLevel = grade;

  }
  
  public String toString(){
    String output = "Name: " + name + " ID#: " + id + " Grade Level: " + gradeLevel;
    return output;

  }

  public boolean equals(Student s){
    if (this.id == s.id){
      return true;
    }
    return false;
    

    }
  }

 