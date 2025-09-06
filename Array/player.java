package Array;


class Player1
{
	String name;
	int age;
	int jerseyNo;
	
	
	Player1(String name, int age, int jerseyNo)
	{
		this.name = name;
		this.age = age;
		this.jerseyNo = jerseyNo;
	}
	
	Player1()
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
	
	class CricketPlayer extends Player1
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
	
class FootballPlayer extends Player1
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
	

public class player {

	public static void main(String[] args) {
		Player1[] arrp;
		arrp=new Player1[2];
		
		arrp[0]=new CricketPlayer("ROHIT",36,18,23456,234);
		arrp[1]=new FootballPlayer("MESSI",36,45,543,234);
		
		
		for(int i=0;i< arrp.length;i++)
		{
			arrp[i].display();
			System.out.println();
		}
	}

}
