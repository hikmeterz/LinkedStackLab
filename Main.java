import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Stack stack = new Stack();
		Scanner key = new Scanner(System.in);
		System.out.println("Rakamlari giriniz:");
		String s = key.nextLine();

		String sayi="";
		int value=0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='-')
				break;
			if(s.charAt(i)!=' ')
				sayi+=s.charAt(i);
			else {
				value=Integer.parseInt(sayi);
				stack.push(value);
				sayi="";
			}
		
		}
	
		stack.maxiBul();
		
		
		
		while(true) {
			
			int d = stack.pop();
			
			if(d != '\0' ) 
				System.out.print(d+ " ");
			else
				break;
		
		}
	}
}	