import java.io.*;

class Q7{
	public static void main(String s[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter row: ");
		int row = Integer.parseInt(br.readLine());

		for(int i=1; i<=row; i++){
			int num=1;
			for(int j=row; j>=i; j--){
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}
}


