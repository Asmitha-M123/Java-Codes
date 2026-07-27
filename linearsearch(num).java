import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int[]marks={50,80,87,98,88};
	    int num=sc.nextInt();
	    for(int i=0;i<marks.length;i++)
	    {
	        if(marks[i]==num)
	    {
		System.out.println("Number found");
		return;
	}
	System.out.println("Number not found");
}
}
}
