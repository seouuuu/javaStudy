import java.util.Scanner;
class Fortune
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char data;
		int mon,day,i,time;
		char []ani = {'자','축','인','묘','진','사','오','미','신','유','술','해'};
		int []num = {0,1,2,3,4,5,6,7,8,9,10,11};
		System.out.print("띠를 입력하세요==>");
		data = sc.next().charAt(0);
		for ( i=0   ; i<12   ; i++   ){
			if ( data== ani[i] ){
				switch(i){
					case 0:System.out.println("천귀");break;
				    case 1:System.out.println("천액");break;
					case 2:System.out.println("천권");break;
					case 3:System.out.println("천파");break;
					case 4:System.out.println("천인");break;
					case 5:System.out.println("천문");break;
					case 6:System.out.println("천복");break;
					case 7:System.out.println("천고");break;
					case 8:System.out.println("천역");break;
					case 9:System.out.println("천간");break;
					case 10:System.out.println("천수");break;
					case 11:System.out.println("천명");break;}

			System.out.print("음력 생월을 입력하세요==>");
			mon = sc.nextInt();
				switch((i+mon-1)%12){
					case 0:System.out.println("천귀");break;
					case 1:System.out.println("천액");break;
					case 2:System.out.println("천권");break;
					case 3:System.out.println("천파");break;
					case 4:System.out.println("천인");break;
					case 5:System.out.println("천문");break;
					case 6:System.out.println("천복");break;
					case 7:System.out.println("천고");break;
					case 8:System.out.println("천역");break;
					case 9:System.out.println("천간");break;
					case 10:System.out.println("천수");break;
					case 11:System.out.println("천명");break;}
				
		  System.out.print("음력 생일을 입력하세요==>");
		  day = sc.nextInt();
				switch((i+mon+day-2)%12){
					case 0:System.out.println("천귀");break;
					case 1:System.out.println("천액");break;
					case 2:System.out.println("천권");break;
					case 3:System.out.println("천파");break;
					case 4:System.out.println("천인");break;
					case 5:System.out.println("천문");break;
					case 6:System.out.println("천복");break;
					case 7:System.out.println("천고");break;
					case 8:System.out.println("천역");break;
					case 9:System.out.println("천간");break;
					case 10:System.out.println("천수");break;
					case 11:System.out.println("천명");break;}

			System.out.print("태어난 시가 속하는 순서를 입력하세요==>");
			/*
			오후11시-오전1시: 1
			오전1시 -오전3시: 2
			오전3시 -오전5시: 3
			오전5시 -오전7시: 4
			오전7시 -오전9시: 5
			오전9시 -오전11시: 6
			오전11시 -오후1시: 7
			오후1시 -오후3시: 8
			오후3시 -오후5시: 9
			오후5시 -오후7시: 10
			오후7시 -오후9시: 11
			오후9시 -오후11시: 12
			*/
			time = sc.nextInt();
				switch(((i+mon+day+time)-3)%12){
					case 0:System.out.println("천귀");break;
				    case 1:System.out.println("천액");break;
					case 2:System.out.println("천권");break;
					case 3:System.out.println("천파");break;
					case 4:System.out.println("천인");break;
					case 5:System.out.println("천문");break;
					case 6:System.out.println("천복");break;
					case 7:System.out.println("천고");break;
					case 8:System.out.println("천역");break;
					case 9:System.out.println("천간");break;
					case 10:System.out.println("천수");break;
					case 11:System.out.println("천명");break;}
					}
			}
		}
}

