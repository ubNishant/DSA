class Demo
{
 public static void main (String[] args)
 
 
 {
	 try
	 {
	 Class.forname(ClassName:"sample");
	 }
	 catch(ClassNotFoundException CFE)
	 {
		 CFE.printStackTrace();
	 }
 }
}