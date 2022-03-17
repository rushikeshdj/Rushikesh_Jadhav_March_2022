class bin18{
public static void main(String args[]){
	long b1=10,b2=11;
		int i = 0, carry = 0;
			int[] mul = new int[10];
	while (b1 != 0 || b2 != 0) 
	{
		mul[i++] = (int)((((b1 % 10) * (b2 % 10)) + carry) % 2);
		carry = (int)((b1 % 10) * (b2 % 10));
		b1 = b1 / 10;
		b2 = b2 / 10;
	}
	
	--i;
	System.out.print("Output: ");
	System.out.print(carry);
	while (i >= 0) {
		
		System.out.print(mul[i--]);
	}
	
}
}