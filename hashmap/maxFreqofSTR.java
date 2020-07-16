package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class maxFreqofSTR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aabaaacdda";
		System.out.println(maxFreq(str));
	}
	public static char maxFreq(String str)
	{
	
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
			char cc=str.charAt(0);
			if(map.containsKey(cc))
			{
				int ov=map.get(cc);   //ov=old value
				int nv=ov+1;
				map.put(cc,nv);
				
			}else
			{
				map.put(cc,1);			}
		}
		
		char maxchar='\0';
		int max=0;
		
		Set<Map.Entry<Character,Integer>> entries=map.entrySet();
		for(Map.Entry<Character,Integer> entry:entries)
		{
			if(entry.getValue()>max)
			{
				max=entry.getValue();
				maxchar=entry.getKey();
				
				
			}
		}
		return maxchar;
				
	}
}
