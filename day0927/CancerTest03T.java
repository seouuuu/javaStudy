// �̸��� ��������� �Է¹޾� ���̸� ����ϰ� ���̰� 40���̻����� �Ǻ��Ͽ�
// ����ϰ��� ����� ���� ����� ����ϵ��� ���α׷� ����
// (��, ���ش� 2021��)

import java.util.Scanner;
class CancerTest03T{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      String name;
      int age,userYear;
      int thisYear;
      thisYear = 2021;

      System.out.println("�̸��� �Է��ϼ���==>");
      name = sc.next();
      System.out.println("��������� �Է��ϼ���==>");
      userYear = sc.nextInt();
      age = thisYear - userYear;//this year ���ϰ� 2021 �ص� ��
      if( age>=40  )
         System.out.println(name +"��, ����" + age +"���Դϴ�. ����ϰ��� ����� �Դϴ�.");
      else
         System.out.println(name +"��, ����" + age +"���Դϴ�. ����ϰ��� ����ڰ� �ƴմϴ�.");
   }
}

