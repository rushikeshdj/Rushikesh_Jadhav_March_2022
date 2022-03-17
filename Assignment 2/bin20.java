class bin20 {
    public static void main(String[] args) {
    int a=15;
    String h="";
    char l[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    while(a>0){
        int r=a%16; 
        h=l[r]+h;
        a=a/16;
        }
   
        System.out.print(h);
        
        
    }
}