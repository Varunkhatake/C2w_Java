class Pro3{
	public static void main(String s[]){
		int num = 'Z'+32;

		System.out.println(num);

		if(num>'Z'){
			num/=2;
			num-=30;
			System.out.println(~num);
		}
		System.out.println(num);
	}
}

