//ArithmeticException�� ���� ����ó�� �߰�

class DivTestTryCatch02
{
	public static void main(String[] args) 
	{
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int result = a/b;
			System.out.println("���:"+result);
		}catch( ArrayIndexOutOfBoundsException e ){
			System.out.println("����ÿ� �������� �μ��� �����ϼ���");
		}catch(ArithmeticException a){
			System.out.println("������ ���� 0�� �� �� �����ϴ�.");
		}catch(NumberFormatException n){
			System.out.println("���ڸ� �Է����ּ���");
		}
	}
}