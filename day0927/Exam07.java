//21.09.27 과제 - 7번

import java.util.Scanner;
class Exam07{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      double com,c,eng,math,avg;
      System.out.println("컴퓨터 개론 과목의 점수를 입력하시오:");
      com = sc.nextDouble();
      System.out.println("C언어 프로그래밍 과목의 점수를 입력하시오:");
      c = sc.nextDouble();
      System.out.println("영어 과목의 점수를 입력하시오:");
      eng = sc.nextDouble();
      System.out.println("일반 수학 과목의 점수를 입력하시오:");
      math = sc.nextDouble();
      avg = ( com + c + eng + math) / 4;
      System.out.println("평균 점수는 " + avg+"점입니다.");
  }
}