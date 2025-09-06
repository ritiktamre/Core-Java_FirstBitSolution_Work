package Array;


class MusicalInstrument
{
	String color;
	String name;
	int weight;
	int model;
	MusicalInstrument(String color, String name, int weight, int model) 
	{
		this.color = color;
		this.name = name;
		this.weight = weight;
		this.model = model;
	}
	
	MusicalInstrument()
	{
		this.name="not given";
		this.weight=25;
		this.color="not given";
		this.model=2022;
	}

	String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getWeight() {
		return weight;
	}

	void setWeight(int weight) {
		this.weight = weight;
	}

	int getModel() {
		return model;
	}

	void setModel(int model) {
		this.model = model;
	}
	
	void display()
	{
		System.out.println("NAME:"+name);
		System.out.println("MODEL"+model);
		System.out.println("WEIGHT:"+weight);
		System.out.println("COLOR:"+color);
	}
	
}//class ends here

class tabla extends MusicalInstrument
{
	String type;
	

	 tabla(String color, String name, int weight, int model, String type)
	 {
		super(color, name, weight, model);
		this.type = type;
		
	}
	 
	 tabla()
	 {
		 this.type="not given";
		
	 }

	String getType() {
		return type;
	}

	void setType(String type) {
		this.type = type;
	}


	 
	void display()
	{
		System.out.println("---TABLA DETAILS---");
		super.display();
		System.out.println("TYPE:"+type);
		

	}
	
	
}

class harmonium extends MusicalInstrument
{
	String button;
	String metal;
	
	harmonium(String color, String name, int weight, int model, String button, String metal) 
	{
		super(color, name, weight, model);
		this.button = button;
		this.metal = metal;
	}
	
	harmonium()
	{
		super();
		this.button="not given";
		this.metal="not given";
	}

	String getButton() {
		return button;
	}

	void setButton(String wires) {
		this.button = wires;
	}

	String getMetal() {
		return metal;
	}

	void setMetal(String metal) {
		this.metal = metal;
	}
	
	void display()
	{
		System.out.println("---Harmonium details---");
		super.display();
		System.out.println("Button:"+button);
		System.out.println("METAL:"+metal);
	}
	
	
}
public class Music {

	public static void main(String[] args) {
		MusicalInstrument[] arrM;
		arrM=new MusicalInstrument[2];
		
		arrM[0]=new tabla("black","tablu",8,2021,"wood");
		arrM[1]=new harmonium("brown","harmonum",20,2023,"keyboard","48");
		
		for(int i=0;i<arrM.length;i++)
		{
			arrM[i].display();
			System.out.println();
		}

	}

}
