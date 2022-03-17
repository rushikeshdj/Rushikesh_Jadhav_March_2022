class bin23 {
    
    
   public static void main(String[] args) {
      
      
      int a=100,i=0,k=0,r=1;
      int sum=0;
      
       while(true){
            if(a==0){
            break;
            }
            else{
             r=a%10; 
			 k=(int)(r*Math.pow(2, i));
		    i++;
            }
		
		sum=sum+k;
		a=a/10;}
        
        System.out.print(sum);
		
  
   }
  
}