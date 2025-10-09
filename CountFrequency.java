
public class CountFrequency{

public static void main(String args[])
{
	String str ="Nishant";
	str=str.toLowerCase();
	int[] Freq=new int[26];
	
	for(int i=0;i<str.length();i++)
	{
		char ch =str.charAt(i);
		
		if(ch>='a' && ch<= 'z' )
		{
			Freq[ch-'a']++;
		}
	}
	
	for(int i=0;i<26;i++)
	{
		if(Freq[i]>0)
		{
			System.out.println((char)(i+'a')+ ":"+ Freq[i]);
		}
	}
}
}
