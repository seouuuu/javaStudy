//����) ȫ�뿡 �ִ� �ֿ�Ŭ�������� �������� ���Ͽ� �̸�, ���̿� Ű�� �Է¹޾� ���������� ��
//���̰� 20�� �̻��̰� Ű�� 160�����̸� ���尡��, �׷��� ������ ����Ұ����� ����ϴ� ���α׷� �ۼ�

import java.util.Scanner;
class ClubTest{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      String name;
      int age, height;
      System.out.println("�̸��� �Է��ϼ���==>");
      name = sc.next();
      System.out.println("���̸� �Է��ϼ���==>");
      age = sc.nextInt();
      System.out.println("Ű�� �Է��ϼ���==>");
      height = sc.nextInt();
      if( age>=20 && height<=160)
         System.out.println("���尡��");
      else
         System.out.println("����Ұ���");
   }
}