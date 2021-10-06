import java.util.Scanner;
class Star
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.print("이름을 입력하세요==>");
		name = sc.next();
		int mon=0;
		int day=0;//if문 안에 각각 선언하니 switch문 할때 변수선언 안한 것처럼 나와서
		char ans;
		do{
		while (mon<1 || mon>12){
			System.out.print("생월을 입력하세요==>");
			mon = sc.nextInt();
		}

		if(mon==2){
			while (day<1 || day>28){
				System.out.print("생일을 입력하세요==>");
				day = sc.nextInt();
			}
		} else if (mon==1||mon==3||mon==5||mon==7||mon==8||mon==10||mon==12){
			while (day<1 || day>31){
				System.out.print("생일을 입력하세요==>");
				day = sc.nextInt();
				}
		}else if (mon==4||mon==6||mon==9||mon==11){
			while (day<1 || day>31){
				System.out.print("생일을 입력하세요==>");
				day = sc.nextInt();
			}
		}

		String data="";
		switch(mon){
					case 1:if(day>19){data="물병자리";}else{data="염소자리";};break;
					case 2:if(day>18){data="물고기자리";}else{data="물병자리";};break;
					case 3:if(day>20){data="양자리";}else{data="물고기자리";};break;
					case 4:if(day>19){data="황소자리";}else{data="양자리";};break;
					case 5:if(day>20){data="쌍둥이자리";}else{data="황소자리";};break;
					case 6:if(day>21){data="게자리";}else{data="쌍둥이자리";};break;
					case 7:if(day>22){data="사자자리";}else{data="게자리";};break;
					case 8:if(day>22){data="처녀자리";}else{data="사자자리";};break;
					case 9:if(day>23){data="천칭자리";}else{data="처녀자리";};break;
					case 10:if(day>22){data="전갈자리";}else{data="천칭자리";};break;
					case 11:if(day>22){data="사수자리";}else{data="전갈자리";};break;
					case 12:if(day>24){data="염소자리";}else{data="사수자리";};break;
		}
		System.out.printf("%s님의 별자리는 %s입니다.",name,data);
		System.out.println();
		System.out.println("또하시겠어요?(y/n) ==>");
	    ans = sc.next().charAt(0);
		} while(ans=='y');
		
	}
}
