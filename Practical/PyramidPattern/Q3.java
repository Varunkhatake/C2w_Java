import java.util.*;

class Q3{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row: ");
		int row = sc.nextInt();
		int num=row;

		for(int i=1; i<=row; i++){
			
			for(int sp=row; sp>i; sp--){
				System.out.print(" "+" " );
			}
			for(int j=1; j<=i*2-1; j++){
				System.out.print(num+" ");
			}
			System.out.println();
			num--;
		}
	}
}

