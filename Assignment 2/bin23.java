class bin23 {
    
    
   public static void main(String[] args) {
      
      
      int a=1101,i=0,k=0,r=1;
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
        
		
    String h="";
    char l[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    while(sum>0){
        int q=sum%16; 
        h=l[q]+h;
        sum=sum/16;
        }
   
        System.out.print(h);
    }
   
  
}