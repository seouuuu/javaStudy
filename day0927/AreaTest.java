import java.util.Scanner;
class AreaTest{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int width, height, area;
      System.out.println("�簢���� ���α��̸� �Է��Ͻÿ�==>");
      width = sc.nextInt();
      System.out.println("�簢���� ���α��̸� �Է��Ͻÿ�==>");
      height = sc.nextInt();
      area = width * height;
      System.out.println("�簢���� ������" + area + "�Դϴ�.");
   }
}