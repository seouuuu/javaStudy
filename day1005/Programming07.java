import java.util.Scanner;
class Programming07 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c,min;
		System.out.print("ù��° ���� �Է��ϼ���==>");
		a = sc.nextInt();
		System.out.print("�ι�° ���� �Է��ϼ���==>");
		b = sc.nextInt();
		System.out.print("����° ���� �Է��ϼ���==>");
		c = sc.nextInt();
		if (a<b && a<c){
			min=a;
		}else if (b<a && b<c){
			min = b;
		}else{
			min =c;
		}
		
		
		/*if (a>b){
			if (b>c){
				min=c;
			}else{
				min=b;
			}
		}else{
			if ( a>c){
               min =c;
			}else{
				min = a;
			}
		}
		*/
		/*if (a<b){
			if (a<c){
				min = a;
			}else{
				min = c;
			}
		}else{
			if (b<c){
				min = b;
			}else{
				min = c;
			}
		}
		*/
		System.out.println("���� ���� ���� "+min+"�Դϴ�.");
	}
}
