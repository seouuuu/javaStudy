import java.util.Scanner;
class  Monthlast
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int month;
	String name="";
	System.out.print("월을 입력하세요==>");
	month = sc.nextInt();
	 if (month==1 || month ==3 || month==5 || month==7|| month==8||month==10||month==12){
			System.out.println( month +"월 은 31일 까지 있습니다. ");
		     }
		     else if ( month == 4 || month == 6|| month == 9|| month == 11)
		      {
			System.out.println( month + "월은 30일 까지 있습니다.");
		       }
		     else if ( month == 2)
		      {
			System.out.println( month +"월은 28일까지 있습니다.");
		       }
	}
}
