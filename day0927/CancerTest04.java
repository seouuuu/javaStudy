// �̸��� ��������� �Է¹޾� ���̸� ����ϰ� ���̰� 40���̻����� �Ǻ��Ͽ�
// ����ϰ��� ����� ���� ����� ����ϵ��� ���α׷� ����
// (��, ���ش� 2021��)
//���� ��¥ �ҷ�����

import java.util.Scanner;
import java.util.Date;
class CancerTest04{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      Date today = new Date();
      String name;
      int age,userYear;
      int thisYear;
      thisYear = today.getYear()+1900;
      System.out.println("�̸��� �Է��ϼ���==>");
      name = sc.next();
      System.out.println("��������� �Է��ϼ���==>");
      userYear = sc.nextInt();
      age = thisYear - userYear;
      System.out.println("���ش�"+ thisYear +"�⵵�Դϴ�.");
      if( age>=40  )
         System.out.println(name +"��, ����" + age +"���Դϴ�. ����ϰ��� ����� �Դϴ�.");
      else
         System.out.println(name +"��, ����" + age +"���Դϴ�. ����ϰ��� ����ڰ� �ƴմϴ�.");
   }
}

