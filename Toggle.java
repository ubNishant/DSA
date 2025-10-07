public class Toggle{
	
	public static void main(String args[])
	{
		String str="Aryan Loves SUKUN";
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(Character.isLowerCase(ch))
			{
				sb.append(Character.toUpperCase(ch));
			}
			else if(Character.isUpperCase(ch))
			{
				sb.append(Character.toLowerCase(ch));
			}
			else{
				sb.append(ch);
			}
		}
		System.out.println("Strings before Toggeling is "+""+str);
	    System.out.println("Strings after Toggeling is "+""+sb);
	}
		

}