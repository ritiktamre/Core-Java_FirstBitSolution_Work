package programmer;

public class Person {
   int age;
   
   public Person (int age)
   {
	   this.age = age;
   }
   
   public void allowed() throws workException
   {
	   if( age <= 18)
	   {
		   throw new workException();
	   }
	   else
	   {
		   System.out.println("Person Allowed the Work");
	   }
   }
}
