import java.util.Scanner;
class  SeasonName
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int month;
	String name="";
	System.out.print("월을 입력하세요==>");
	month = sc.nextInt();
	if (  month >=3 && month <=5 ){
		name = "봄";
	}else if ( month >=6 && month <= 8)
		{
		name = "여름";
	}else if ( month >=9 && month <= 11)
		{
		name = "가을";
	}else if (month ==1 || month ==2 || month ==12)
	{ name = "겨울";
	}
	System.out.println(month +"월은 "+name+ "입니다.");
	}
}
