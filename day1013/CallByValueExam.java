class CallByValueExam
{
  public static void mul(int n){
      n = n*n;
      System.out.println(n);
  }
  public static void main(String[] args) 
  {
      int data = 50;
      mul(data);
      System.out.println(data);
  }
}
