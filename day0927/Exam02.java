import java.util.Scanner;
class Exam02{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      double x;
      System.out.println("�Ǽ�x�� �Է��ϼ���");
      x = sc.nextDouble();
    // double r = 3*x*x*x - 7*x*x + 9;
     double r = 3*Math.pow(x,3) - 7*Math.pow(x,2) + 9; 
      System.out.println("���:" + r); 
   }
}