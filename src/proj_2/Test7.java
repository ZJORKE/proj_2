package proj_2;
public class Test7 {
	public static void main(String[] args) {
		int[]arr= {9,8,3,5,2};
		System.out.println("数组中的每个元素:");
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	for(int i=1; i<arr.length;i++){
	for(int j=0;j<arr.length-i;j++) {
		if(arr[j]>arr[j+1]) {
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
	}	
	}
	}
			for (int xiaoa:arr) {
			System.out.print(xiaoa+"  ");	
			}
		}
	} 
