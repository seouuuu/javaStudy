import java.util.Scanner;
class ArithExam 
{ 
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int a,b;
    System.out. println("첫번째 수를 입력하시오==>");
	a = sc.nextInt();
    System.out. println("두번째 수를 입력하시오==>");
	b = sc.nextInt();
	int add = a + b;
    int sub = a - b;
   int multi = a *b;
   int div = a / b;
 
   System.out.println(a +"+" +b+"="+add );
   System.out.println(a +"-" +b+"="+sub );
   System.out.println(a +"*" +b+"="+multi );
   System.out.println(a +"/" +b+"="+div);
  
	}
}
