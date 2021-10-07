import java.util.Scanner;
class Pass
{
	boolean isPassed (char []a,char []b){
		int sum =0;
		boolean flag =true;
		for ( int i=0;i<a.length ;i++ ){
			if (a[i]==b[i]){
				sum++;
			}
		}
		if (sum<7){
			flag = false;
		}
		return flag;
	}
}
class Ans
{
	int correctAnswers(char []c,char []d){
		int sum=0;
		for (int i=0;i<c.length ;i++ ){
			if (c[i]==d[i]){
				sum++;
			}
		}
		return sum;
	}
}
class InAns
{
	int incorrectAnswers(char []e,char []f){
		int sum=0;
		for (int i=0;i<e.length ;i++ ){
			if (e[i]!=f[i]){
				sum++;
			}
		}
		return sum;
	}
}


class Exam 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char []answer ={'a','d','d','c','a','b','a','c','d','a'};
		char []user =new char[10];
		for (int i=0;i<user.length ;i++ ){
			while(user[i]!='a'&& user[i]!='b'&&user[i]!='c'&&user[i]!='d'){
				System.out.printf("%d번의 답을 입력하세요(a,b,c,d)==>",i+1);
				user[i]=sc.next().charAt(0);
			}
		}
		boolean result;
		int num,num2;

		Pass data= new Pass();
		result = data.isPassed(answer,user);
		if (result ==true){
			System.out.println("시험에 통과하였습니다.");
		} else
			System.out.println("시험에 통과하지 못하였습니다.");

		Ans add = new Ans();
		num = add.correctAnswers(answer,user);
		System.out.println("정답 개수 : "+num);

		InAns sub = new InAns();
		num2=sub.incorrectAnswers(answer,user);
		System.out.println("오답 개수: "+num2);

	}
}

