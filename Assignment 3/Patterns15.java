class Patterns15{
public static void main(String args[]){
	for(int i =1;i<=5;i++){
		for (int j=1;j<=i;j++){
			
		if(i==3&&j==2){
		System.out.print(" ");
		continue;
		}
		if(i==4&&j==3){
		System.out.print(" ");
		continue;
		}
		if(i==4&&j==2){
		System.out.print(" ");
		continue;
		}
			System.out.print("*");
		}
	System.out.println();

	}
}
}