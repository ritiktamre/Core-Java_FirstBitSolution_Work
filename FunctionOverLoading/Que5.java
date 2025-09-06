package FunctionOverLoading;

class Time
{
	void time(int hr,int min,int sec)
	{
		System.out.printf("%d:%d:%d\n",hr,min,sec);
	}
}


public class Que5 {

	public static void main(String[] args) {
		
		Time t1=new Time();
		
		int hr=6;
		int min=34;
		int sec=23;
		
		t1.time(hr,min,sec);
		
		int hr1=7;
		int min1=23;
		int sec1=56;
		
		t1.time(hr1, min1, sec1);
	}

}
