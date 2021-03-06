//ArithmeticException에 대한 예외처리 추가

class DivTestTryCatch02
{
	public static void main(String[] args) 
	{
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int result = a/b;
			System.out.println("결과:"+result);
		}catch( ArrayIndexOutOfBoundsException e ){
			System.out.println("실행시에 나누기할 두수를 전달하세요");
		}catch(ArithmeticException a){
			System.out.println("나누는 수가 0이 될 수 없습니다.");
		}catch(NumberFormatException n){
			System.out.println("숫자를 입력해주세요");
		}
	}
}
