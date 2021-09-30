import java.util.Scanner;
class Squarearea{
   public static void main(String []args){
      int width, height;
      Scanner sc = new Scanner(System.in);
      System.out.println("가로를 입력하세요");
      width = sc.nextInt();
      System.out.println("세로를 입력하세요");
      height = sc.nextInt();
      System.out.println("** 결과 출력**");
      System.out.println("사각형의 면적:"+(width*height));
   }
}