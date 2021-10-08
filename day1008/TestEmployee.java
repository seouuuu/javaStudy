import java.util.Scanner;
class Employee
{
	String name;
	String addr;
	int salary;
	String phone;

}

class TestEmployee
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		Employee []e;
		e = new Employee[5];

		for ( int i=0;i<e.length ;i++ ){
			e[i] = new Employee();
			System.out.printf("%d번째 사원의 이름을 입력하세요==>",i+1);
			e[i].name = sc.next();
			System.out.printf("%d번째 사원의 주소를 입력하세요==>",i+1);
			e[i].addr = sc.next();
			System.out.printf("%d번째 사원의 연봉을 입력하세요==>",i+1);
			e[i].salary = sc.nextInt();
			System.out.printf("%d번째 사원의 전화번호를 입력하세요==>",i+1);
			e[i].phone = sc.next();
		}
		System.out.println("이름\t주소\t연봉\t전화번호");  
		for ( int i=0;i<e.length ;i++ ){
		   System.out.printf("%s\t%s\t%d\t%s\n",e[i].name,e[i].addr,e[i].salary,e[i].phone);
		}
	}
}
