class DivTestTryCatchFinallyExam
{
	public static void main(String[] args) 
	{
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int result = a/b;
			System.out.println("���:"+result);
		}catch(ArithmeticException e){
			System.out.println("0���� ���� �� �����ϴ�.");
		}catch(Exception e){
			System.out.println("�ι�°���� 0�� �ƴ� �ΰ��� ���ڸ� �������ּ���");
		}finally{
			System.out.println("������ ���α׷� ����");
		}
	}
}
