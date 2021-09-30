import java.util.Scanner;
class Student{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int first, second, tot, sub, mul, div;
      System.out.println("첫번째 값 입력");
      first = sc.nextInt();
      System.out.println("두번째 값 입력");
      second = sc.nextInt();
      tot = first + second;
      sub = first - second;
      mul = first * second;
      div = first / second;
      System.out.println("** 결과 출력 **");
      System.out.println("더하기:"+ tot);
      System.out.println("빼기:" + sub);
      System.out.println("곱하기:" + mul);
      System.out.println("나누기:" + div);
   }
}
      
