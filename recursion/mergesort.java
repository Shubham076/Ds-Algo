package recursion;

public class mergesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr1= {10,20,30,40,50};
//		int[] arr2= {5,15,30,45,60,70,80};
//		int[] ans=merged2sortedarrays(arr1,arr2);
//		for(int val:ans)
//		{
//			System.out.print(val+" ");
//		}
		
		int[] arr= {5,25,30,15,10,40,35,8,4,9};
		int[] ans=mergesort(arr,0,9);
		for(int val:ans)
		{
			System.out.print(val+" ");
		}

	}
	public static int[] merged2sortedarrays(int[] arr1,int[] arr2)
	{
		int[] merged=new int[arr1.length+arr2.length];
		int i=0,j=0,k=0;
		while(i<arr1.length&&j<arr2.length)
		{
			if(arr1[i]<=arr2[j])
			{
				merged[k]=arr1[i];
				i++;
				k++;
			}
			else
			{
				merged[k]=arr2[j];
				j++; k++;
			}
		}
		
		if(i==arr1.length)
		{
			while(j<arr2.length)
			{merged[k]=arr2[j];
			j++; k++;
			}
		}
		if(j==arr2.length)
		{	while(i<arr1.length)
			{merged[k]=arr1[i];
			i++; k++;
			}
		}
		return merged;
	}
	public static int[] mergesort(int[] arr,int fi,int li)  ///fi=first index li=second
	{
		if(fi==li)
		{
			int[] br=new int[1];
			br[0]=arr[fi];
			return br;
		}
		
		int mid=(fi+li)/2;
		int[] fh=mergesort(arr,fi,mid);
		int[] sh=mergesort(arr,mid+1,li);
		int[] merge=merged2sortedarrays(fh,sh);   //fh=first half //sh=second half
		
		return merge;
	}
}
