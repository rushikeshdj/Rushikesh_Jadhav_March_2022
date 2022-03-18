class pattern15{
public static void main(String args[]){
	
	for(int i=1;i<=5;i++){
		
		
		for (int j=5; j>=i;j--)
			{
				System.out.print((j)+" ");
			}
			
		for (int k=0; k<i-1; k++)
			{
				System.out.print(" ");
			}
		
	System.out.println();

	}
}
}