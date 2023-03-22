/**
   An instructor is represented by a name, a birth year, and a salary.
   You must enter the class name, instance variable(s), and constructor below
*/




   /**
      Returns the string represention of the object.
      @return a string representation of the object
   */
public class Instroctor extends Person {
   private double salary;
   
   public Instroctor(String name, int birthYear, double salary) {
      super(name, birthYear);
      this.salary = salary;
   }
   
   public double getSalary() {
      return salary;
   }
   
   public void setSalary(double salary) {
      this.salary = salary;
   }
   
   @Override
   public String toString() {
      return "Instructor[super=" + super.toString() + ",salary=" + salary + "]";
   }
}
