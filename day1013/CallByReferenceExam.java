class CallByReferenceExam
{
  public static void printArray(int []arr){
      for (int i=0; i<arr.length;i++ ){
          System.out.printf("%5d",arr[i]);
      }
      System.out.println();
  }
  public static void mul(int []arr){
      for(int i=0;i<arr.length;i++){
          arr[i] = arr[i] * arr[i];
      }
  }
  public static void main(String[] args) 
  {
      int []arr = {1,2,3,4};                       
      printArray(arr);
      mul(arr);
      printArray(arr);
  }
}