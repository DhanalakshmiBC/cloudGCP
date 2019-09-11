package baseJ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(3);
		arr.add(4);
		arr.add(1);
		arr.add(3);
		
		System.out.println(arr.toString());
		
		
		
		Set<Integer> set=new HashSet<>(arr);
		System.out.println(set.toString());
		
		
		for(Integer dis:set)
			
			System.out.println(dis);
		
		
		
		String str="hello world";
		
		System.out.println(str.replaceAll("e", "p"));
		
		String chan=str.replaceAll("e", "p");
		
		for(int i=chan.length()-1;i>0;i--)
			
			System.out.println(chan.charAt(i));
		
		
		
		
		
		
		
		
		
		
	}

}
