import java.util.Scanner;
class Student{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int first, second, tot, sub, mul, div;
      System.out.println("ù��° �� �Է�");
      first = sc.nextInt();
      System.out.println("�ι�° �� �Է�");
      second = sc.nextInt();
      tot = first + second;
      sub = first - second;
      mul = first * second;
      div = first / second;
      System.out.println("** ��� ��� **");
      System.out.println("���ϱ�:"+ tot);
      System.out.println("����:" + sub);
      System.out.println("���ϱ�:" + mul);
      System.out.println("������:" + div);
   }
}
      
