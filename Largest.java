class Largest{
    public static void main(String[] args) {
   int arr[]={20,70,80,35,38};
   int max=arr[0];
   for(int i=1;i<arr.length;i++){
	   if(arr[i]>max){
		   max=arr[i];
	   }
   }
   System.out.println("largest number:"+max);
	}
}