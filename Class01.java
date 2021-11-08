
class Carea
{
	double pi=3.14159;
	double radius;
	int length;
	int width;
	int height;
	
	double volume()
	{
		return 4*pi*radius*radius*radius/3;
	}
	
	int surfaceArea()
	{
		return 2*((length*width)+(width*height)+height*length);
	}
	void showData()
	{
		System.out.println("length="+length);
		System.out.println("width="+width);
		System.out.println("height="+height);
	}
	void showAll()
	{
		showData();
		System.out.println("volume="+volume());
		System.out.println("surface area="+surfaceArea());
	}
	 
}
public class Class01 
{
	public static void main(String args[])
	{
		Carea Cal_area=new Carea();
		Cal_area.radius=10;
		Cal_area.length=4;
		Cal_area.width=5;
		Cal_area.height=6;
		Cal_area.showAll();
	
		
	}

}