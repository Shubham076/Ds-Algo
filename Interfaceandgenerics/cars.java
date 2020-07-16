package Interfaceandgenerics;

public class cars implements Comparable<cars>{
	
	int speed;
	String color;
	
	public cars(int speed, String color)
	{
		this.speed=speed;
		this.color=color;
	}
			
	@Override
	public String toString()
	{
		return "P:"+this.speed+","+"C:"+this.color;
	}
	
	@Override
	public int compareTo(cars other)
	{
		return this.speed-other.speed;
	}
}
