import java.util.Scanner;
class Programming11 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("0�̻��� ������ �Է��ϼ���==>");
		n = sc.nextInt();
		if (n<0){
			System.out.println("�߸��� �Է��Դϴ�.");
		}else{
			for (int i=0;  i<=n  ;  i++ ){
				if (  i%3 == 0){
					System.out.print(i + " ");
				}
			}
		}
	}
}
