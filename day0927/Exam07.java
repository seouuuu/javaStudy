//21.09.27 ���� - 7��

import java.util.Scanner;
class Exam07{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      double com,c,eng,math,avg;
      System.out.println("��ǻ�� ���� ������ ������ �Է��Ͻÿ�:");
      com = sc.nextDouble();
      System.out.println("C��� ���α׷��� ������ ������ �Է��Ͻÿ�:");
      c = sc.nextDouble();
      System.out.println("���� ������ ������ �Է��Ͻÿ�:");
      eng = sc.nextDouble();
      System.out.println("�Ϲ� ���� ������ ������ �Է��Ͻÿ�:");
      math = sc.nextDouble();
      avg = ( com + c + eng + math) / 4;
      System.out.println("��� ������ " + avg+"���Դϴ�.");
  }
}