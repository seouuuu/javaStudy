import java.util.Scanner;
class Programming07 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c,min;
		System.out.print("첫번째 수를 입력하세요==>");
		a = sc.nextInt();
		System.out.print("두번째 수를 입력하세요==>");
		b = sc.nextInt();
		System.out.print("세번째 수를 입력하세요==>");
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
		System.out.println("가장 작은 수는 "+min+"입니다.");
	}
}
