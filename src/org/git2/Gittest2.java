package org.git2;

public class Gittest2 {
	
	public void usingLogic() {
		String name = "pravin";
		char[] namearray = name.toCharArray();
		System.out.println(namearray);
		
		String reversed = "";
		for(int i=namearray.length-1;i>=0;i--) {
			reversed = reversed+namearray[i];
			
		}
		System.out.println(reversed);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
