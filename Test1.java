class Test1{
	public static void main(String... args){
		System.out.println("The fact of 5 is "+fact(5));

	}
	public static int fact(int n){
		if(n== 1)
			return n;
		else
			return n*fact(n-1);
	}

}
