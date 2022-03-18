class pyramid7{
public static void main(String args[]){
	for(int i =1;i<=9;i++){
		
		for (int k=i; k>1; k--)
			{
				System.out.print(" ");
			}
		for(int j=10-i;j>=1;j--)
			{
				System.out.print(10-i+" ");
			}	
			System.out.println();

	}

}
}