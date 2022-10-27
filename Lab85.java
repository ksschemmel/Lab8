import java.util.*;
public class Lab85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> Colors = new ArrayList<String>();
		Colors.add("Red");
		Colors.add("Orange");
		Colors.add("Yellow");
		Colors.add("Green");
		Colors.add("Blue");
		Colors.add("Purple");
		if (Colors.contains("Red")) {
			System.out.println("Found the Element");
		}
		else
		{
			System.out.println("There is no such element");
		}
		
	}

}
