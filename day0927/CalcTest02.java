import java.util.Scanner;
class CalcTest02{
   public static void main(String []args){
      int first, second;
      Scanner sc = new Scanner(System.in); //System.in�� Ű���带 �ǹ�
      System.out.println("ù��° ���� �Է��ϼ���");      
      first = sc.nextInt();
      System.out.println("�ι�° ���� �Է��ϼ���");      
      second = sc.nextInt();
     
      System.out.println("** ��� ��� **");
      System.out.println("���ϱ� :"+(first+second)); 
      System.out.println("���� :"+(first-second)); 
      System.out.println("���ϱ� :"+(first*second)); 
      System.out.println("������ :"+(first/second)); 
  }
}