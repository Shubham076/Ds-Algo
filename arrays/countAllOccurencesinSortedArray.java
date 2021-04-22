class countAllOccurencesinSortedArray{

	public static int binarySearch(int n, int[] arr){
		int lo = 0;
		int hi = arr.length - 1;

		while(lo <= hi){
			int mid = lo + (hi - lo) / 2;
			if(arr[mid] == n){
				return mid;
			}
			else if(arr[mid] > n){
				hi = mid - 1;
			}
			else{
				lo = mid + 1;
			}
		}

		return -1;
	}
	public static void main(String[] args){
		int[] arr = {0, 1, 1, 2, 2, 2, 2, 2, 4, 6, 6, 9};
		int target = 6;
		int idx = binarySearch(target, arr);
		int cnt = 0;
		if(idx == -1){
			System.out.println("No not found");
		}
		else{
			cnt += 1;
			for(int i = idx - 1; i >= 0; i--){
				if(arr[i] == target){
					cnt++;
				}
			}

			for(int i = idx + 1; i < arr.length; i++){
				if(arr[i] == target){
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}