	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Scanner;
		
	class SumUpAndFindCombination {
		       static void sum_up(ArrayList<Integer> numbers, int target, ArrayList<Integer> partial) {
		    	int s = 0;
		       for (int x: partial) s += x;
		 //      System.out.println("s = " + s);
		       if (s == target)
		            System.out.println("sum("+Arrays.toString(partial.toArray())+")="+target);
		       for(int i = 0; i < numbers.size();i++) {
		             ArrayList<Integer> remaining = new ArrayList<Integer>();
		             int n = numbers.get(i);
		             for (int j=i+1; j<numbers.size();j++) 
		            	 remaining.add(numbers.get(j));
		  //           displayList("remaining" , remaining);
		             ArrayList<Integer> partial_rec = new ArrayList<Integer>(partial);
		             partial_rec.add(n);
		  //           displayList("partial_rec" , partial_rec);
		             sum_up(remaining,target,partial_rec);
		       }
		    }
		    
		    static void displayList(String listName, ArrayList<Integer> list){
		    	System.out.println(listName + " = " + list.toString());
		    }
		
		    public static void main(String args[]) {
		    	Integer[] numbers = {1,2,4,5,-2,-1};
		    	System.out.println("Please Enter Target Value");
		        Scanner input = new Scanner(System.in);
		        int target = input.nextInt();
		        sum_up(new ArrayList<Integer>(Arrays.asList(numbers)),target,new ArrayList<Integer>());
		    }
		}

