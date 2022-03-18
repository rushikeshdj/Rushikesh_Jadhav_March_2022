class hollowFullPyramid{
public static void main(String args[]){
	for(int i =1;i<=6;i++){
		for(int k=1;k<=6-i;k++){
			System.out.print("  ");
		}
		for(int j=1;j<=i;j++){
			if(i==3&&(j==2)){
		System.out.print("   ");
continue;
			}
				else if(i==4&&(j==2||j==3)){
		System.out.print("   ");
continue;
			}
				else if(i==5&&(j==2||j==3||j==4)){
		System.out.print("   ");
continue;
			}
			System.out.print("*  ");
		}
					System.out.println();
}}}



