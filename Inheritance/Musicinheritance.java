package Inheritance;

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
	String material;

	 tabla(String color, String name, int weight, int model, String type,String material)
	 {
		super(color, name, weight, model);
		this.type = type;
		this.material=material;
	}
	 
	 tabla()
	 {
		 this.type="not given";
		 this.material="not given";
	 }

	String getType() {
		return type;
	}

	void setType(String type) {
		this.type = type;
	}

	String getMaterial() {
		return material;
	}

	void setMaterial(String material) {
		this.material = material;
	}
	 
	void display()
	{
		System.out.println("---TABLA DETAILS---");
		super.display();
		System.out.println("TYPE:"+type);
		System.out.println("MATERIAL:"+material);

	}
	
	
}

class harmonium extends MusicalInstrument
{
	String wires;
	String metal;
	
	harmonium(String color, String name, int weight, int model, String wires, String metal) 
	{
		super(color, name, weight, model);
		this.wires = wires;
		this.metal = metal;
	}
	
	harmonium()
	{
		super();
		this.wires="not given";
		this.metal="not given";
	}

	String getWires() {
		return wires;
	}

	void setWires(String wires) {
		this.wires = wires;
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
		System.out.println("WIRES:"+wires);
		System.out.println("METAL:"+metal);
	}
	
	
}

public class Musicinheritance {

	public static void main(String[] args) {
		
       tabla t1=new tabla();
       t1.setName("TABLA");
       t1.setColor("brown");
       t1.setModel(2018);
       t1.setWeight(8);
       t1.setType("sharp");
       t1.setMaterial("wooden,leather");
       t1.display();
       
       harmonium h1=new harmonium();
       h1.setName("HARMONIUM");
       h1.setColor("PURPLE");
       h1.setModel(2020);
       h1.setWeight(30);
       h1.setWires("multiplewires");
       h1.setMetal("wooden,keyboard");
       h1.display();
	}

}
