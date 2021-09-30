// 이름과 출생연도를 입력받아 나이를 계산하고 나이가 40살이상인지 판별하여
// 무료암검진 대상자 인지 결과를 출력하도록 프로그램 수정
// (단, 올해는 2021년)

import java.util.Scanner;
class CancerTest03{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      String name;
      int year,age;
      System.out.println("이름을 입력하세요==>");
      name = sc.next();
      System.out.println("출생연도를 입력하세요==>");
      year = sc.nextInt();
      age = 2021 - year;
      if( age>=40  )
         System.out.println(name +"님, 무료암검진 대상자 입니다.");
      else
         System.out.println(name +"님, 무료암검진 대상자가 아닙니다.");
   }
}