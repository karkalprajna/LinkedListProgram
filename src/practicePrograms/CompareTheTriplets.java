package practicePrograms;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {
    public static void main(String args[]){
    	List<Integer> a = new ArrayList<>();
    	a.add(5);
    	a.add(6);
    	a.add(7);
    	
    	List<Integer> b = new ArrayList<>();
    	b.add(3);
    	b.add(6);
    	b.add(10);
    	
    	List<Integer> aliceAndBob = new ArrayList<>();
    	Integer alicePoint=0;
    	Integer bobPoint=0;
        for(int i=0;i<a.size();i++){
            if(a.get(i)>b.get(i)){
            	alicePoint++;
            }else 
            if(a.get(i)<b.get(i)){            	
            	bobPoint++;
            }
            else if(a.get(i)== b.get(i)){
            	//do nothing
            }
        }
        aliceAndBob.add(alicePoint);
        aliceAndBob.add(bobPoint);
    }
}
