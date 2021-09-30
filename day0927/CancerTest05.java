import java.util.Scanner;
import java.util.Date;
class CancerTest05{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in); //sc는 변경가능
      Date today = new Date(); //today는 변경가능
      String name;
      int userYear;
      int thisYear = today.getYear() + 1900;
      System.out.println("이름을 입력하세요==>");
      name = sc.next();
      System.out.println("출생연도를 입력하세요==>");
      userYear = sc.nextInt();
      int age = thisYear - userYear;
      if(age >= 40  && thisYear % 2 == userYear % 2 )
         System.out.println(name +"님," + thisYear + "년도에 무료 암검진 대상자 입니다.");
      else
         System.out.println(name +"님," + thisYear + "년도에 무료 암검진 대상자가 아닙니다.");      
   }
}