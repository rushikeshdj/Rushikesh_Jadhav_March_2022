class pattern17{
public static void main(String args[]){
	int counter=1;
	for(int i=1;i<=5;i++){
		
						//++counter;

		for (int j=counter; j<counter+i;j++)
			{
				System.out.print((j)+" ");
			}
		
				counter+=i;

		
	System.out.println();

	}
}
}