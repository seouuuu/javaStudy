import java.util.Scanner;
class Programming02 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double area=0, width, height, radius;
		char type;
		System.out.print("도형의 종류를 입력하세요.R:사각형,T:삼각형,C:원 ==>");
		type = sc.next().charAt(0);
		if (type =='R'){
			System.out.print("사각형의 가로길이를 입력하세요==>");
			width = sc.nextDouble();
			System.out.print("사각형의 세로길이를 입력하세요==>");
			height = sc.nextDouble();
			area = width * height;
			System.out.print("사각형의 면적은");
		}else if (type == 'T'){
			System.out.print("삼각형의 밑변의 길이를 입력하세요==>");
			width = sc.nextDouble();
			System.out.print("삼각형의 높이를 입력하세요==>");
			height = sc.nextDouble();
			area = width * height /2;
			System.out.print("삼각형의 면적은 ");
		}else if (type == 'C'){
			System.out.print("원의 반지름의 길이를 입력하세요==>");
			radius = sc.nextDouble();
			area = 3.14*radius*radius;
		    System.out.print("원의 면적은 ");
		}else{
		    System.out.println("도형의 종류를 잘못 선택하였습니다.");
			return; // 여기서 main 메소드를 종료
		}
		System.out.println(area + "입니다.");
	}
}
