package ScoutlistProject;

import java.util.ArrayList;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Scout> scouts = new ArrayList<Scout>();
		
		Scout s1 = new Scout("Ahmad", 'm', 150);
		Scout s2 = new Scout("Suha", 'w', 65.5f);
		Scout s3 = new Scout("MHD", 'm', 168.5f);
		
		Tool t1 = new Tool("Hammer", 2);
		Tool t2 = new Tool("Bogen", 5.33f);
		Tool t3 = new Tool("Zwille", 3.2f);
		
		s1.getInvent().add(t1);
		s1.addTool(t2);
		s1.addTool(t3);
		
		s2.addTool(t3);
		s2.addTool(t1);
		
		s3.addTool(t2);
		s3.addTool(t3);
		
		scouts.add(s1);
		scouts.add(s2);
		scouts.add(s3);
		System.out.println(scouts);
		
		
		// lambda I did not understand
		Collections.sort(scouts, (a,b) -> {
            return Float.compare(a.calcTollWeight(), b.calcTollWeight());
        });             // 10        -       7  // 3
                
        System.out.println(scouts);
		
		
		
	}

}
