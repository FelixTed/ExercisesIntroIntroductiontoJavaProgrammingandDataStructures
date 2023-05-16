package ex20_11;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter file name: ");
		String fileName = sc.next();
		
		try {
			System.out.println(checkGrouping(fileName));
		}catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}

	}
	public static boolean checkGrouping(String fileName) throws IOException{
		Stack<Character> grouping = new Stack<>();
		File file = new File(fileName+".txt");
		Scanner input = new Scanner(file);
		input.useDelimiter("");
		
		while(input.hasNext()) {
			char character = input.next().charAt(0);
			if(character == '['|| character == '{'|| character == '(')
				grouping.push(character);
			if(character == ']' || character == '}' || character == ')') {
				char character2 = grouping.pop();
				if((int)character2 + 1 != (int)character && (int)character2 + 2 != (int)character)
					return false;
			}
				
		}
		input.close();
		if(grouping.empty())
			return true;
		else 
			return false;
	}

}
