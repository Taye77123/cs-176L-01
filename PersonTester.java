/**
 * Implement a superclass Person. 
 * Make two classes, Student and Instructor, that inherit from Person. 
 * A person has a name and a year of birth.
 * A student has a major, and an instructor has a salary.
 * Write the class declarations and the constructors for all classes
 * 
 * This class tests the Person, Student, and Instructor classes.
*/
public class PersonTester {
   public static void main(String[] args) {
      Person p1 = new Person("John", 1965);
      Person p2 = new Person("Mary Ann", 1970);
      Student s1 = new Student("Ann", 1982, "Computer Science");
      Student s2 = new Student("Thomas", 1986, "Biology");
      Instroctor i1 = new Instroctor("Joseph", 1954, 65000);
      
      System.out.println(p1.toString());
      System.out.println("Expected: Person[name=John,birthYear=1965]");
      System.out.println("");
      
      System.out.println(p2.toString());
      System.out.println("Expected: Person[name=Mary Ann,birthYear=1970]");
      System.out.println("");
      
      System.out.println(s1.toString());
      System.out.println("Expected: Student[super=Person[name=Ann,birthYear=1982],major=Computer Science]");
      System.out.println("");
      
      System.out.println(s2.toString());
      System.out.println("Expected: Student[super=Person[name=Thomas,birthYear=1986],major=Biology]");
      System.out.println("");
      
      System.out.println(i1.toString());
      System.out.println("Expected: Instructor[super=Person[name=Joseph,birthYear=1954],salary=65000.0]");
   }
}


