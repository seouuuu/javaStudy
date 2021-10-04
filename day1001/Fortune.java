import java.util.Scanner;
class Fortune
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char data;
		int mon,day,i,n;
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
				if ((i+mon-1)<12){
					switch(i+mon-1){
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
				} else{
					switch(i+mon-13){
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
			  System.out.print("음력 생일을 입력하세요==>");
				day = sc.nextInt();
				if ((i+mon+day-2)<12){
					switch(i+mon+day-2){
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
				} else if((i+mon+day-2)>=12&&(i+mon+day-2)<24){
					switch(i+mon+day-14){
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
				} else if ((i+mon+day-2)>=24&&(i+mon+day-2)<36)
				{switch(i+mon+day-26){
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
				} else if ((i+mon+day-2)>=36&&(i+mon+day-2)<48){
					switch(i+mon+day-38){
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
				}else if ((i+mon+day-2)>=48&&(i+mon+day-2)<60){
				   switch(i+mon+day-50){
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
				} else{
					switch(i+mon+day-62){
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
	}

