//���ο����� �ų� 40�� �̻��� ����鿡�� ����ϰ����� �ǽ� ��
//�̸��� ���̸� �Է¹޾� ����ϰ��� ��������� �Ǻ� ���α׷� �ۼ�

import java.util.Scanner;
class CancerTest{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      String name;
      int age;
      System.out.println("�̸��� �����Դϱ�?");
      name = sc.next();
      System.out.println("���̰� � �Դϱ�?");
      age = sc.nextInt();
      if(age>=40)
        System.out.println("���� �ϰ��� ������Դϴ�");
      else
        System.out.println("���� �ϰ��� ����ڰ� �ƴմϴ�");
   }
}