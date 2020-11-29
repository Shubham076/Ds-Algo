import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class intersectionOFarray {

	public static void main(String[] args) {

			int[] arr= {5,2,3,4,7};
			int[] arr1= {2,4,3,5,7,10,15};
			
			ArrayList<Integer> list=getintersection(arr,arr);
			System.out.println(list);
	
	}
		public static ArrayList<Integer> getintersection(int[] arr1,int[] arr2)
		{
		HashMap<Integer,Boolean> map=new HashMap<>();
		ArrayList<Integer> list=new ArrayList<>();
		
		for(int i=0;i<arr1.length;i++)
		{
			map.put(arr1[i], false);
		}
		
		for(int j=0;j<arr2.length;j++)
		{
			if(map.containsKey(arr2[j]))
			
			{map.put(arr2[j], true);}
		}
		
		Set<Map.Entry<Integer,Boolean>> entries=map.entrySet();
		for(Map.Entry<Integer,Boolean> entry:entries)
		{
			if(entry.getValue())
			
			{ list.add(entry.getKey());
			
			}
			
		}
		
		return list;
	}
		
	}

