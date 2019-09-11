package baseJ;

public class Demo {

	public static void stringRev(String str) {

		String[] strarr=str.split(" ");
		String rev="";
		
		System.out.println(strarr.length);
		for(int i=0;i<strarr.length;i++)
		{
			
			for(int j=strarr[i].length()-1;j>=0;j--)
			{
				 rev=rev+strarr[i].charAt(j);
				
			}
			 System.out.println(rev);
			 rev="";
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo.stringRev("hello world");
		
		System.out.println("hello world");
	
	}

}
