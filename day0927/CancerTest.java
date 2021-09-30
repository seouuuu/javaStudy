//정부에서는 매년 40세 이상인 사람들에게 무료암검진을 실시 함
//이름과 나이를 입력받아 무료암검진 대상자인지 판별 프로그램 작성

import java.util.Scanner;
class CancerTest{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      String name;
      int age;
      System.out.println("이름이 무엇입니까?");
      name = sc.next();
      System.out.println("나이가 몇세 입니까?");
      age = sc.nextInt();
      if(age>=40)
        System.out.println("무료 암검진 대상자입니다");
      else
        System.out.println("무료 암검진 대상자가 아닙니다");
   }
}