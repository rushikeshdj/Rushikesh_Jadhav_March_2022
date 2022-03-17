class bin24 {
    
    
   public static void main(String[] args) {
      
      
      int a=111,i=0,k=0,re=1;
      int sum=0;
      
       while(true){
            if(a==0){
            break;
            }
            else{
             re=a%10; 
			 k=(int)(re*Math.pow(2, i));
		    i++;
            }
		
		sum=sum+k;
		a=a/10;}
           
    String h="";
    char l[]={'0','1','2','3','4','5','6','7'};
    while(sum>0){
        int r=sum%8; 
        h=l[r]+h;
        sum=sum/8;
        }
   
        System.out.print(h);
        
        
    }
}
