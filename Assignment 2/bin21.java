class bin21 {
    public static void main(String[] args) {
    int a=15;
    String h="";
    char l[]={'0','1','2','3','4','5','6','7'};
    while(a>0){
        int r=a%8; 
        h=l[r]+h;
        a=a/8;
        }
   
        System.out.print(h);
        
        
    }
}