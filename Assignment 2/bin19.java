class bin19{

public static void main(String args[])
	{
int d=5,r=0;
String a="";
		
while(d>0){
	r=d%2;
	a=a+r;
	d=d/2;
}
for(int k = a.length()-1;k>=0;k--)
{
	System.out.print(a.charAt(k));
}
}}