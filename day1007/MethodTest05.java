import java.util.Scanner;
class MyUtil
{
	void printArray(int []a,int[]b){
		if (a.length !=b.length){
			System.out.println("배열의 내용이 일치하지 않습니다.");
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
				System.out.println("배열의 내용이 일치합니다.");
			} else{
				System.out.println("배열의 내용이 일치하지 않습니다.");
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
			System.out.print("첫번째 배열의 정수를 차례대로 입력하세요==>");
			c[i] = sc.nextInt();
		}
		for (int i=0;i<c.length ; i++){
			System.out.print("두번째 배열의 정수를 차례대로 입력하세요==>");
			d[i] = sc.nextInt();
		}
		MyUtil util = new MyUtil();
		util.printArray(c,d);
	}
}
