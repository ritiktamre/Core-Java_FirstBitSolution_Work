package tostring;

public class Ritik {

	public static void main(String[] args) {
		
	String str = "I Am Ritik Tamre";
	String result="";
	
	for(int i =0 ;i<str.length();i++)
	{
		char ch = str.charAt(i);
		if(ch =='a' || ch=='i' || ch=='o' || ch=='e' || ch=='u'
				|| ch=='A' || ch=='I' || ch=='E' || ch=='O' || ch=='U')
		{
			continue;
		}
		result =result +ch;
	}
	System.out.println(result);
	}

}
