import java.util.Scanner;
class CalcTest{
   public static void main(String []args){
      int first, second,add,sub,multi,div;
      Scanner sc = new Scanner(System.in); //System.in�� Ű���带 �ǹ�
      System.out.println("ù��° ���� �Է��ϼ���");      
      first = sc.nextInt();
      System.out.println("�ι�° ���� �Է��ϼ���");      
      second = sc.nextInt();
      add = first + second;
      sub = first - second;
      multi = first * second;
      div = first / second;
      System.out.println("** ��� ��� **");
      System.out.println("���ϱ� :"+add); 
      System.out.println("���� :"+sub); 
      System.out.println("���ϱ� :"+multi); 
      System.out.println("������ :"+div); 
  }
}