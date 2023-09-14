package que4;

import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		TreeMap<String,String>t=new TreeMap<String,String>();
		t.put("C1", "Red");
        t.put("C2", "Green");
        t.put("C3", "Black");
        t.put("C4", "White");
        System.out.println(t);
        
       if(t.containsValue("Green"))
    	   System.out.println("The TreeMap contains value green");
       if(t.containsValue("Pink"))
       System.out.println("The TreeMap contains value Pink");
       else
    	   System.out.println("The TreeMap does not contains value green");
        
	}

}
