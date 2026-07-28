import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String Str="listen";
		String Str1="silent";
		char[] arr=Str.toCharArray();
		char[] arr1=Str1.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(arr1);
		if(arr.length!=arr1.length)
		{
		    System.out.println("not an anagram");
		    return;
		}
		for(int i=0;i<arr.length;i++){
		    if(arr[i]!=arr1[i])
		    {
		        System.out.println("not an anagram");
		        return;
		    }
		    
		}
				        System.out.println("an anagram");
}
}
