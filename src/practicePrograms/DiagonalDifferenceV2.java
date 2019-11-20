package practicePrograms;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DiagonalDifferenceV2{
	public static void main(String[] args){
		List<List<Integer>> arr = new ArrayList<>();
		List<Integer> index = new ArrayList<>();
		index.add(11);
		index.add(2);
		index.add(4);
		
		arr.add(index);
		
		List<Integer> index2 = new ArrayList<>();
		index2.add(4);
		index2.add(5);
		index2.add(6);
		
		arr.add(index2);
		
		List<Integer> index3 = new ArrayList<>();
		index3.add(10);
		index3.add(8);
		index3.add(-12);
		
		arr.add(index3);
		
		System.out.println(arr);
		
		int d1 = 0, d2 = 0; 
		//logic
		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < arr.get(i).size(); j++) {
				// finding sum of primary diagonal 
                if (i == j) 
                	d1 += arr.get(i).get(j);
                
                if (i == arr.size() - j - 1)
                	d2 += arr.get(i).get(j); 
			}
		}
		
		System.out.println("d1 :"+d1);
		System.out.println("d2 :"+d2);
		System.out.println("d1 - d2 :"+(Math.abs(d1 - d2)));
		
		
		//---------------------------------------------------------------
		int arrw[]={1,1,0,-1,-1};
		
		int arrsize=arrw.length;
        int positive=0,negitive=0,zero=0;

        for(int i=0;i<arrsize;i++){
            if(arrw[i]==0){
                zero++;
            }else if(arrw[i]>0){
                positive++;
            }else if(arrw[i]<0){
                negitive++;
            }
        }
        System.out.println("positive :"+positive);
        System.out.println("negitive :"+negitive);
        System.out.println("zero :"+zero);
        /*double r = zero/arrsize;
        double r1 = positive/arrsize;
        double r2 = negitive/arrsize;*/
       /* System.out.println(Math.floor(positive/arrsize));
        System.out.println(r1);
        System.out.println(r2);*/
        
        BigDecimal value1 = BigDecimal.valueOf(positive).divide(BigDecimal.valueOf(arrsize));
        System.out.format("%.6f \n",value1);
        
        BigDecimal value2 = BigDecimal.valueOf(negitive).divide(BigDecimal.valueOf(arrsize));
        System.out.format("%.6f \n",value2);
        
        BigDecimal value3 = BigDecimal.valueOf(zero).divide(BigDecimal.valueOf(arrsize));
        System.out.format("%.6f \n",value3);
		
		
	}
}
