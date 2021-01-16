package recursion;

public class quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {15,5,20,35,40,25,10};
		quicksort(arr,0,arr.length-1);
		for(int val:arr)
		{
			System.out.print(val+" ");
		}

	}
  public static void quicksort(int[] arr,int fi,int li)
  { ///partioning     fi is first index li is last index
	  if(fi>=li)
	  { return;
	 
	  }
	  int mid=(fi+li)/2;
	  int pivot=arr[mid];
	  
	  int left=fi;
	  int right=li;
	  
	  while(left<=right)
	  {
		  while(arr[left]<pivot)
		  { left++;
	  
		  }
	
	  
		  while(arr[right]>pivot)
		  {  
			  right--;
		  }
	  
	  
	  if(left<=right)
	  {
		  int temp=arr[left];
		  arr[left]=arr[right];
		  arr[right]=temp;
		  left++;
		  right--;
	  }
	  }
	  ///recursoion
	  quicksort(arr,fi,right);
	  quicksort(arr,left,li);
  }
}
