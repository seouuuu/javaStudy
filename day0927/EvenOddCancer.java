//����)���ο����� �ݳ����� 40�� �̻��� ����鿡�� ����ϰ����� �ǽ� ��
//�̸��� ���̸� �Է¹޾� ����ϰ��� ��������� �Ǻ� ���α׷� �ۼ�
//�ϰ��� ����ڴ� 40�� �̻��̰� ���ذ� ¦�������̸� ¦�������� �¾ ���, Ȧ�������̸� Ȧ�������� �¾ ���

import java.util.Scanner;
import java.util.Date;
class EvenOddCancer{
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
      if( age>=40 && thisYear % 2 == 0 && age % 2 ==0 )
         System.out.println(name +"��, ����" + age +"���Դϴ�. ����ϰ��� ����� �Դϴ�.");
      else
         System.out.println(name +"��, ����" + age +"���Դϴ�. ����ϰ��� ����ڰ� �ƴմϴ�.");
   }
}