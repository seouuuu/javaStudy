import java.util.Scanner;
class Programming1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String []month = {"1월","2월","3월","4월","5월","6월","7월","8월","9월","10월","11월","12월",};
		double []charge = new double[12]; 
		double sum =0,avg=0;
		double max=charge[0];
		String max2 = month[0];
		double min =charge[0];
		String min2 = month[0];

		for (int i=0;i<12 ;i++){
			do{
			System.out.printf("%d월의 카드요금을 입력하세요==>",i+1);
			charge[i] = sc.nextInt();
			if ( charge[i]>=0){
				break;
			} 
			}while(true);
			sum += charge[i];
		avg = sum/12;
		for (int j=0;j<charge.length ;j++ ){
			if (charge[j]>max){
				max = charge[j];
			    max2 = month[j];
			}
		   if (charge[j]<min){
			   min =charge[j];
			   min2 =month[j];
		   }
		 }
		}
		System.out.println("**결과 출력**");
		System.out.println("1년 동안의 전체 사용 금액: "+sum+"원");
		System.out.println("월별 평균 사용 금액: "+ avg+"원");
		System.out.println("가장 지출이 많았던 월: "+max2);
		System.out.println("가장 지출이 적었던 월: "+min2);
	}
}

