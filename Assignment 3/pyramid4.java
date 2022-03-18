class pyramid4{
public static void main(String args[]){
	int counter=1;
	for(int i =1;i<=9;i++){
		
		for (int k=10-i; k>1; k--)
			{
				System.out.print("  ");
			}
		
		for (int j=1;j<=i;j++){
			
			System.out.print(j+" ");
		
		}
	for (int j=i-1;j>=1;j--){
			if(i==1){break;}
			System.out.print(j+" ");
		}
	
	
	System.out.println();

	
}
}}