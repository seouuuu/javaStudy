import java.util.Scanner;
class LastDate 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int month, last=31;
		System.out.print("���� �Է��Ͻÿ�==>");
		month = sc.nextInt();
		if(month<1  || month>12 ){
			System.out.println("�Է°��� �߸��Ǿ����ϴ�.");
		}else{
			if(month==2){
				last = 28;
			}else if(month == 4 || month == 6 ||month == 9 || month == 11){
				last = 30;
			}
			System.out.println(month +"����"+ last + "���� �־��!");
		}
	}
}
