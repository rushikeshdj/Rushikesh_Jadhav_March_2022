class pattern9{
public static void main(String args[]){
	
	for(int i =1;i<=5;i++){
		
		for (int k=6-i; k>1; k--)
			{
				System.out.print(" ");
			}
		
		for (int j=0;j<i;j++){
			
			System.out.print((char)(j+65)+" ");
		
		}
	System.out.println();

	}
}
}