import java.util.Scanner;
class MyUtil
{
	void printArray(int []a,int[]b){
		if (a.length !=b.length){
			System.out.println("�迭�� ������ ��ġ���� �ʽ��ϴ�.");
			return; 
		}
		else{
			boolean flag =true;
			for (int i=0; i<a.length; i++){
				if (a[i] !=b[i]){
					flag =false;
					break;
				}
			}
			if (flag){
				System.out.println("�迭�� ������ ��ġ�մϴ�.");
			} else{
				System.out.println("�迭�� ������ ��ġ���� �ʽ��ϴ�.");
			}
		}
	}
}

class  MethodTest05
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int []c = new int [5];
		int []d = new int [5];
		for (int i=0;i<c.length ; i++){
			System.out.print("ù��° �迭�� ������ ���ʴ�� �Է��ϼ���==>");
			c[i] = sc.nextInt();
		}
		for (int i=0;i<c.length ; i++){
			System.out.print("�ι�° �迭�� ������ ���ʴ�� �Է��ϼ���==>");
			d[i] = sc.nextInt();
		}
		MyUtil util = new MyUtil();
		util.printArray(c,d);
	}
}
