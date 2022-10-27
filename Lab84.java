import java.util.ArrayList;
import java.util.Iterator;
public class Lab84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<Integer>();
			numbers.add(23);
			numbers.add(8);
			numbers.add(31);
			numbers.add(45);
			numbers.add(6);
			numbers.add(7);
			numbers.add(19);
			numbers.add(15);
			Iterator<Integer> Iter=numbers.iterator();
			
			while(Iter.hasNext())
			{
				Integer newnumbers=Iter.next();
				if(newnumbers>10 && newnumbers<20)
					Iter.remove();
				
			}
			
			System.out.println("Printing the first item of the arraylist:" +numbers);
	}

}
