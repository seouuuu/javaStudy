import java.util.Scanner;
class MaxTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c,max;
		System.out.print("ù��° ���� �Է��ϼ���==>");
		a = sc.nextInt();
		System.out.print("�ι�° ���� �Է��ϼ���==>");
		b = sc.nextInt();
		System.out.print("����° ���� �Է��ϼ���==>");
		c = sc.nextInt();
		
		if (a>b){
			if (a>c){    // ��ø���ù�
				max =a;
		   } else{       // ��ø���ù����� else�� ���� ���� ����� if�� ������
			   max =c;
		   }
		}else {
			if(b>c){
				max =b;
			}else{
				max = c;
			}
		}
		System.out.println("���� ū ���� "+ max +" �Դϴ�.");
	}
}