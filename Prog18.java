class Prog18{
	public static void main(String[] args){
		int[] list1 = {1, 2, 3, 4};
		int[] list2 = {100, 150, 200};
		L1: for(int i=0; i < list1.length; i++)
		{
			L2: for(int j=0; j < list2.length; j++){
				if(i % 2 == 0)
				continue L2;
				System.out.println(list1[i] + list2[j]);
			}
		}
	}
}
