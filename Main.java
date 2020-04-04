package nestedloops;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>levels = new ArrayList<String>();
		    levels.add("Basic");
		    levels.add("Advanced");
		ArrayList<String>exam = new ArrayList<String>();
		    exam.add("Oracle");
		    exam.add("Java");
		ArrayList<String>grades =new ArrayList<String>();
		    grades.add("pass");
		    grades.add("fail");
		    
		 ArrayList<ArrayList<String>>elementArray = new ArrayList<ArrayList<String>>();
		 elementArray.add(exam);
		 elementArray.add(grades);
		 elementArray.add(levels);
		 
		 for(ArrayList<String>elementArray1 : elementArray )
			for(String element : elementArray1)
				 System.out.println(element);
				 
		    
		    
	}

}
