//이름 생월 생일 입력받아 별자리 출력
//이름==>
//생월==>
//생일==>
//___님의 별자리는 ___자리 입니다.
//잘못된 입력값 나오는거까지(2월 28일까지)
//생월을 잘못 입력하면 생일 입력하지 못하게 만들기
import java.util.Scanner;
class  Star
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int mon,day;
		System.out.print("이름을 입력하세요==>");
		name = sc.next();
		System.out.print("생월을 입력하세요==>");
		mon = sc.nextInt();
		
		if(mon>12 || mon<1)
			{System.out.println("잘못 입력하셨습니다.");
		}
		else  {
			System.out.print("생일을 입력하세요==>");
		    day = sc.nextInt();
				if (mon==1||mon ==3||mon==5||mon==7||mon==8||mon==10||mon==12)
					{if(day>31 || day<1) {
						System.out.println("잘못 입력하셨습니다.");
					}
					}
				else if(mon==4||mon==6||mon==9||mon==11){
						if (day>30 || day<1)
						{
							System.out.println("잘못 입력하셨습니다.");
						}
					}
				else if (mon==2)
					{if (day>28 || day<1)
					{
						System.out.println("잘못 입력하셨습니다.");
					}
					}
						switch(mon){
								case 1: if (day >=20) { System.out.println("물병자리"); } 
											else { System.out.println("염소자리"); } break; 
								case 2: if (day >=19) { System.out.println("물고기자리"); } 
											else { System.out.println("물병자리"); } break; 
								case 3: if (day >=21) { System.out.println("양자리"); } 
										else { System.out.println("물고기자리"); } break; 
								case 4: if (day >=20) { System.out.println("황소자리"); } 
										else { System.out.println("양자리"); } break; 
								case 5: if (day >=21) { System.out.println("쌍둥이자리"); } 
										else { System.out.println("황소자리"); } break; 
								case 6: if (day >=22) { System.out.println("게자리"); } 
										else { System.out.println("쌍둥이자리"); } break; 
								case 7: if (day >=23) { System.out.println("사자자리"); } 
										else { System.out.println("게자리"); } break; 
								case 8: if (day >=23) { System.out.println("처녀자리"); } 
										else { System.out.println("사자자리"); } break; 
								case 9: if (day >=24) { System.out.println("천칭자리"); } 
										else { System.out.println("처녀자리"); } break; 
								case 10: if (day >=23) { System.out.println("전갈자리"); } 
										else { System.out.println("천칭자리"); } break; 
								case 11: if (day >=23) { System.out.println("사수자리"); } 
										else { System.out.println("전갈자리"); } break; 
								case 12: if (day >=25) { System.out.println("염소자리"); } 
										else { System.out.println("사수자리"); } break;
					     }
		}
		}
}
