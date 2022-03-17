class bin25 {
    
    
   public static void main(String[] args) {
      
      
      int a=10,i=0,k=0,re=1;
      int sum=0;
      
       while(true){
            if(a==0){
            break;
            }
            else{
             re=a%10; 
			 k=(int)(re*Math.pow(8, i));
		    i++;
            }
		
		sum=sum+k;
		a=a/10;}
		System.out.print(sum);
		}
}