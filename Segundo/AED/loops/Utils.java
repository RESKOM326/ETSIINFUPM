package aed.loops;

import java.util.ArrayList;

public class Utils {

	public static int maxNumRepeated(Integer[] a, Integer elem)  {
		int counter=0;
		int res=0;
		ArrayList<Integer> num=new ArrayList<Integer>();
		int max=0;
		
		for(int i=0;i<a.length;i++){
			if(a[i].equals(elem)){
				res=counter+1;
				counter++;
				num.add(res);
			}
			else{
				counter=0;
			}
		}

		for(int j=0;j<num.size();j++){
			if((Integer) max<num.get(j)){
				max=num.get(j);
			}
		}
		
		
		return (int) max;
		
	}  
}
