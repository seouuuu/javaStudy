import java.util.Scanner;
class Programming1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String []month = {"1��","2��","3��","4��","5��","6��","7��","8��","9��","10��","11��","12��",};
		double []charge = new double[12]; 
		double sum =0,avg=0;
		double max=charge[0];
		String max2 = month[0];
		double min =charge[0];
		String min2 = month[0];

		for (int i=0;i<12 ;i++){
			do{
			System.out.printf("%d���� ī������ �Է��ϼ���==>",i+1);
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
		System.out.println("**��� ���**");
		System.out.println("1�� ������ ��ü ��� �ݾ�: "+sum+"��");
		System.out.println("���� ��� ��� �ݾ�: "+ avg+"��");
		System.out.println("���� ������ ���Ҵ� ��: "+max2);
		System.out.println("���� ������ ������ ��: "+min2);
	}
}

