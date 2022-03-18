class pattern18{
public static void main(String args[]){
	
	for(int i=1;i<=5;i++){
		
		
		for (int j=65; j<=70-i;j++)
			{
				System.out.print((char)(j)+" ");
			}
			
		for (int k=0; k<i-1; k++)
			{
				System.out.print(" ");
			}
		
	System.out.println();

	}
}
}