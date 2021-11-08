class Data 
{
	private String name;
	private Test score;
	
	class Test
	{
		private int english;
		private int math;
		
		public Test(int eng,int m)
		{
			english=eng;
			math=m;
		}
	}
	public Data(String na,int eng,int ma)
	{
		name=na;
		score=new Test(eng,ma);
	}
	public double avg()
	{
		return (score.english+score.math)/2.0;
	}
	public void show()
	{
		System.out.println("name:"+name);
		System.out.println("english:"+score.english);
		System.out.println("math:"+score.math);
		System.out.println("avg:"+avg());
	}
}
public class Class03 
{
	public static void main(String args[])
	{
		Data stu=new Data("Annie",85,92);
		stu.show();
		Data stu2=new Data("Brian",77,56);
		stu2.show();
	}

}
