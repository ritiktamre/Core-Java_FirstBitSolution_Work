package tostring;


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

	@Override
	public String toString()
	{
		return "name="+name+", age=" + age + ", jerseyNo=" + jerseyNo;
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

		@Override
		public String toString()
		{
			System.out.println("---Cricket Details---");
			return  super.toString()+ ", runs=" + runs + ", wicket=" + wicket;
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

	@Override
	public String toString()
	{
		System.out.println("---Football Details---");
		return super.toString()+ ", goals=" + goals + ", penalty=" + penalty ;
	}
	
	
	
	
}
	

public class Test5 {

	public static void main(String[] args) {
		
	Player p1;
	p1=new CricketPlayer("Rohit",37,45,12345,12);
	System.out.println(p1);
	
	p1=new FootballPlayer("Messi",38,23,234,34);
	System.out.println(p1);

	}

}
