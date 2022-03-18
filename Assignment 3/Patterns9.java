class Patterns9{
public static void main(String args[]){
	for(int i =1;i<=5;i++){
		
		for (int j=1;j<6-i;j++){
			System.out.print(" ");
		}
		
		for (int j=1;j<i+1;j++){
			System.out.print("*");
		}
		
		
	System.out.println();

	}

	for(int k =1;k<=4;k++){

		for (int j=1;j<=k;j++){
			System.out.print(" ");
		}

		for (int j=k;j<=4;j++){
			System.out.print("*");
		}
		

	System.out.println();
}
}}