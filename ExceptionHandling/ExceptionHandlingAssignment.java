package ExceptionHandling;


class SoftwareEngineer
{
	String expertise;
	String education;
	int passingYear;
	String language;
	int age;
	int experience;
	
	SoftwareEngineer(String expertise, String education, int passingYear, String language, int age,
			int experience)
	{
		
		this.expertise = expertise;
		this.education = education;
		this.passingYear = passingYear;
		this.language = language;
		this.age = age;
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "the candidate expertise in the skills:"+this.expertise 
				+ "the candidate education is:"+this.education 
				+ "the candidate passing Year is:"+this.passingYear
				+ "the candidate perfer language is:"+this.language
				+ "the candidate age is:"+this.age
				+ "the total experience of candidate is:"+this.experience;
	}
	
}///class SoftwareEngineer ends here

class ExpertiseException extends Exception
{

	@Override
	public String toString() 
	{
		return "Expertise  not match industry requirement:";
	}
	
}//class ExpertiseException ends here

class EducationException extends Exception
{

	@Override
	public String toString() {
		return "Educational background not match industry standard:";
	}
	
}//class EducationException ends here

class PassingYearException extends Exception
{

	@Override
	public String toString() {
		return "passing year betweeen 2013 and 2023 :";
	}
	
}///class passingYear ends year

class LanguageException extends Exception
{

	@Override
	public String toString() {
		return "candidate must know English :";
	}
	
}///class LanguageException ends here

class AgeException extends Exception
{

	@Override
	public String toString() {
		return "candidate must be more than 18 year :";
	}
	
}///class AgeException ends here

class ExperienceException extends Exception
{

	@Override
	public String toString() {
		return "Experience must be more than 5 year :";
	}
	
}
public class ExceptionHandlingAssignment {

	public static void main(String[] args) {
		
	     try
         {
        	 String a = args[0];
        	 String b = args[1];
        	 int c = Integer.parseInt(args[2]);
        	 String d = args[3];
        	 int e = Integer.parseInt(args[4]);
        	 int f = Integer.parseInt(args[5]);
        	 
        	 
        	 if(!(a==("Java Full Stack") || a==("Microservices") || a==("Software Development")))
        	 
        	 {
        		 throw new ExpertiseException();
        	 }
        	 
        	 if(! (b==("BTech") || b==("BE") || b==("BCA") || b==("MCA")))
        	 
        	 {
        		 throw new EducationException();
        	 }
        	 
        	 if( c < 2023 || c > 2013)
        	 {
        		 throw new PassingYearException();
        		 
        	 }
        	 
        	 if(!(d==("English")))
        	 {
        		 throw new LanguageException();
        	 }
        	 
        	 if(e <= 18)
        	 {
        		 throw new AgeException();
        	 }
        	 
        	 if(f < 5 )
        	 {
        		 throw new ExperienceException();
        	 }
        	 
        	 SoftwareEngineer s = new SoftwareEngineer(a,b,c,d,e,f);
        	 System.out.println("Candidate selected");
        	 System.out.println(s);
         }
         
         catch(ExpertiseException ee)
         {
        	 System.out.println(ee);
         }
         
         catch(EducationException ed)
         {
        	 System.out.println(ed);
         }
         
         catch(PassingYearException py)
         {
        	 System.out.println(py);
         }
         
         catch(LanguageException la)
         {
        	 System.out.println(la);
         }
         
         catch(AgeException ae)
         {
        	 System.out.println(ae);
         }
         
         catch(ExperienceException exe)
         {
        	 System.out.println(exe);
         }
         
         catch(Exception e)
         {
        	 System.out.println("Something went wrong :");
         }
	}

}
