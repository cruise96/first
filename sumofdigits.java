class sumofdigits{
	public static void main(String[] args){
		int x = 167239;
		int sum = 0,rem;
		
		while(x!=0)
		{
			rem=x%10;
			sum+=rem;
			x/=10;	
		}
		System.out.println("sum is : "+sum);
		System.out.println("hello there");
	}
}
