import java.util.Scanner;
import java.util.Date;
class  Cancer
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		String name;
		int userYear,age;
		int thisYear = today.getYear()+1900;
		System.out.print("이름을 입력하세요==>");
		name = sc.next();
		System.out.print("출생연도를 입력하세요==>");
		userYear = sc.nextInt();
		age = thisYear - userYear;
		if ( age >= 40 && thisYear%2==userYear%2)
		{if ( age>=40 && age<50)
		{
			System.out.println(name +"님은 무료암검진 대상자 입니다.항목은 위암,간암입니다.");
		}
		else if ( age >=50){
			System.out.println(name +"님은 무료암검진 대상자 입니다.항목은 위암,간암,대장암입니다.");
		}
		
		}
         else
			System.out.println(name +"님은 무료암검진 대상자가 아닙니다.");


	}
}
