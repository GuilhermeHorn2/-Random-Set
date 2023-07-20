package misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class main_misc {
	
	
	public static final int MAX = 1_000_000;
	
	public static void main(String[] args) {
		
	
	List<Integer> list = new ArrayList<>(Arrays.asList(2,1,3,1,5,2,11,90,71,-2));
	System.out.println(ger_set(list,5));
		
		
	}
	
	private static void no_repeat(List<Integer> list) {
		
		HashMap<Integer,Boolean> map = new HashMap<>();
		List<Integer> tmp = new ArrayList<>();
		
		for(int i = 0;i < list.size();i++) {
			
			int x = list.get(i);
			if(!map.containsKey(x)){
				map.put(x,true);
				tmp.add(x);
			}
		}
		list.clear();
		list.addAll(tmp);
		
	}
	
	
	private static List<Integer> ger_set(List<Integer> list,int n){
		
		List<Integer> set = new ArrayList<>();
		
		
		//first we have to get rid of repeated values,to make all probs equal
		no_repeat(list);
		int size = list.size();
		
		int c = 0;
		while(c < n) {
			Random r = new Random();
			int rand_element = list.get(r.nextInt(size)); 
			set.add(rand_element);
			c++;
		}
		
		
		return set;
	}
	
	
	

}
