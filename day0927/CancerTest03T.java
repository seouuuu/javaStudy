// 이름과 출생연도를 입력받아 나이를 계산하고 나이가 40살이상인지 판별하여
// 무료암검진 대상자 인지 결과를 출력하도록 프로그램 수정
// (단, 올해는 2021년)

import java.util.Scanner;
class CancerTest03T{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      String name;
      int age,userYear;
      int thisYear;
      thisYear = 2021;

      System.out.println("이름을 입력하세요==>");
      name = sc.next();
      System.out.println("출생연도를 입력하세요==>");
      userYear = sc.nextInt();
      age = thisYear - userYear;//this year 안하고 2021 해도 됨
      if( age>=40  )
         System.out.println(name +"님, 올해" + age +"세입니다. 무료암검진 대상자 입니다.");
      else
         System.out.println(name +"님, 올해" + age +"세입니다. 무료암검진 대상자가 아닙니다.");
   }
}

