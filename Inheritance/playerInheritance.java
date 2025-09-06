package Inheritance;

class Player
{
	String name;
	int age;
	int jerseyNo;
	
	
	Player(String name, int age, int jerseyNo)
	{
		this.name = name;
		this.age = age;
		this.jerseyNo = jerseyNo;
	}
	
	Player()
	{
		this.name ="not given";
		this.age = 35;
		this.jerseyNo = 46;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	int getJerseyNo() {
		return jerseyNo;
	}

	void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}
	
	void display()
	{
		System.out.println("NAME:"+name);
		System.out.println("AGE:"+age);
		System.out.println("JERSERNO:"+jerseyNo);
	}
	
}	
	
	class CricketPlayer extends Player
	{
		int runs;
		int wicket;
	
		
		
		 CricketPlayer(String name, int age, int jerseyNo, int runs, int wicket) 
		{
			 super(name,jerseyNo,age);
			this.runs = runs;
			this.wicket = wicket;

		}
		 
		 CricketPlayer()
		{
			 super();
			this.runs=12345;
			this.wicket=45;
		
		}

		int getRuns() {
			return runs;
		}

		void setRuns(int runs) {
			this.runs = runs;
		}

		int getWicket() {
			return wicket;
		}

		void setWicket(int wicket) {
			this.wicket = wicket;
		}

		
		 void display()
		 {
			 System.out.println("----Cricket Player-----");
			 super.display();
			 System.out.println("RUNS:"+runs);
			 System.out.println("WICKET:"+wicket);
		 }
		
		
	}
	
class FootballPlayer extends Player
{
	int goals;
	int penalty;
	
	FootballPlayer(String name, int age, int jerseyNo, int goals, int penalty)
	{
		super(name, age, jerseyNo);
		this.goals = goals;
		this.penalty = penalty;
	}
	
	FootballPlayer()
	{
		this.goals=456;
		this.penalty=678;
	}

	int getGoals() {
		return goals;
	}

	void setGoals(int goals) {
		this.goals = goals;
	}

	int getPenalty() {
		return penalty;
	}

	void setPenalty(int penalty) {
		this.penalty = penalty;
	}
	
	void display()
	{
		System.out.println("---Football Details-----");
		super.display();
		System.out.println("GOALS:"+goals);
		System.out.println("PENALTY:"+penalty);
	}
	
	
}
	


public class playerInheritance {

	public static void main(String[] args) {
		
		CricketPlayer c1=new CricketPlayer();
		
		c1.setName("Virat");
		c1.setJerseyNo(18);
		c1.setAge(35);
		c1.setRuns(23456);
		c1.setWicket(24);
		c1.display();
		
		
		FootballPlayer f1=new FootballPlayer();
		
		f1.setName("Ronaldo");
		f1.setAge(38);
		f1.setJerseyNo(45);
		f1.setGoals(567);
		f1.setPenalty(234);
		f1.display();
	}

}
