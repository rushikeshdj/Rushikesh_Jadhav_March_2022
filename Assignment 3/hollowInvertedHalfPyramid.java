class hollowInvertedHalfPyramid{
public static void main(String args[]){
	for(int i =1;i<=6;i++){
		for (int j=7-i;j>=1;j--){
			if(i==2&&(j==4||j==2||j==3)){
	    System.out.print("  ");

			continue;
			}
			else if(i==3&&(j==2||j==3)){
	    System.out.print("  ");

			continue;
			}
			if(i==4&&(j==2)){
	    System.out.print("  ");

			continue;
			}
			System.out.print("* ");
		}
	System.out.println();

	}
}
}