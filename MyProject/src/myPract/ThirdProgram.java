package myPract;

public class ThirdProgram 
{
	String k = "My Name Is Akshay";
	String l = "";
	public void akshay()
	{
		char []a = k.toCharArray();
		for(int i=k.length()-1; i>=0; i--)
		{
			l=l+a[i];
		}
		System.out.println("reverse string =" +l);
		if(l.equals(k))
		{
			System.out.println("The Given String Is Pallindrome string");
		}
		else
		{
			System.out.println("The Given String Is Not Pallindrome");
		}
	}
	public static void main(String[] args) 
	{
		ThirdProgram b = new ThirdProgram();
		b.akshay();
	}
}
