import java.util.Random;
class  StudentRandom
{
	public static void main(String[] args) 
	{
		String []names ={"����","�ٶ�","����","���","����","īŸ","����"};
		for (int i=0; i<100 ;i++ ){
			System.out.print(names[i%names.length]+"\b\b\b");//\b\b\b �� �ȹٲ�� ���ڸ��� �Է�

			try{ //����ó��
				Thread.sleep(100);//���ð�
			} catch (Exception e){ //e�� �����̸�
			}
		}

		Random rand = new Random();
		int n =rand.nextInt();
		n = n >>> 1;
		n = n % 6;
		System.out.println("**��÷**");
		System.out.println(names[n]);
	}
}
