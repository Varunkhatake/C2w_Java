import java.util.*;

class Q8{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row :");
		int row = sc.nextInt();
		int num = row;
		int ch = row+97;
		

		for(int i=1; i<=row; i++){
			for(int j=1; j<=row; j++){

				if(i%2==1 && j%2==1){
					System.out.print(num*num-1 + " ");
				}
				else{
					
					System.out.print((char)ch +" ");
				}
				num++;
				ch++;
			}
			System.out.println();
		}
	}
}

