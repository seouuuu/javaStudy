import java.util.Scanner;
class EnterClub{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      String name;
      int age, height;
      System.out.println("�̸��� �Է��ϼ���===>");
      name = sc.next();
      System.out.println("���̸� �Է��ϼ���===>");
      age = sc.nextInt();
      System.out.println("Ű�� �Է��ϼ���===>");
      height = sc.nextInt();
      if( age>=20 && height<=160  )
        System.out.println(name + "�� ���尡���մϴ�.");
      else
        System.out.println(name + "�� ����Ұ����մϴ�.");
   }
}