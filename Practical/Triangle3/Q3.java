import java.util.*;

class Q3{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row: ");
		int row = sc.nextInt();
		int num = row*row+row;
		for(int i=1; i<=row; i++){
			for(int j=row; j>=i; j--){
				System.out.print(num + " ");
				num-=2;
			}
			System.out.println();
		}
	}
}
