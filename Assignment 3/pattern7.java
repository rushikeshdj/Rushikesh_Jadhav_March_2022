class pattern7{
public static void main(String args[]){
	
	for(int i =1;i<=5;i++){
		
		for (int k=6-i; k>1; k--)
			{
				System.out.print("-");
			}
		
		for (int j=1;j<=i;j++){
			
			System.out.print(j+" ");
		
		}
	System.out.println();

	}
}
}