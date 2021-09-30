//연습)정부에서는 격년으로 40세 이상인 사람들에게 무료암검진을 실시 함
//이름과 나이를 입력받아 무료암검진 대상자인지 판별 프로그램 작성
//암검진 대상자는 40세 이상이고 올해가 짝수연도이면 짝수연도에 태어난 사람, 홀수연도이면 홀수연도에 태어난 사람

import java.util.Scanner;
import java.util.Date;
class EvenOddCancer{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      Date today = new Date();
      String name;
      int age,userYear;
      int thisYear;
      thisYear = today.getYear()+1900;
      System.out.println("이름을 입력하세요==>");
      name = sc.next();
      System.out.println("출생연도를 입력하세요==>");
      userYear = sc.nextInt();
      age = thisYear - userYear;
      if( age>=40 && thisYear % 2 == 0 && age % 2 ==0 )
         System.out.println(name +"님, 올해" + age +"세입니다. 무료암검진 대상자 입니다.");
      else
         System.out.println(name +"님, 올해" + age +"세입니다. 무료암검진 대상자가 아닙니다.");
   }
}