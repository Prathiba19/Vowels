import java.util.Scanner;


public class Vowel {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the char:");
		char ch=sc.nextLine().charAt(0);
		if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
		{
  System.out.println("the given char is a vowel");
	}
		else
		{
			System.out.println("the given char is a constant");
		}

}
}
