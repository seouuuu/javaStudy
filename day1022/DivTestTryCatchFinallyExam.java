class DivTestTryCatchFinallyExam
{
	public static void main(String[] args) 
	{
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int result = a/b;
			System.out.println("결과:"+result);
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(Exception e){
			System.out.println("두번째수가 0이 아닌 두개의 숫자를 전달해주세요");
		}finally{
			System.out.println("나누기 프로그램 진행");
		}
	}
}

