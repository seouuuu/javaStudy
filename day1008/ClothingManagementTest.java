import java.util.Scanner;
class ClothingManagement //의류관리기
{
	String name;
	String company;
	boolean power;
	String clothes;
	boolean water;
	String mode;
	
	void act(){
		if (power){ //전원
			System.out.printf("%s의 %s의 전원을 켭니다.\n",company,name);
			System.out.printf("%s에 %s를(을) 넣습니다.\n",name,clothes);

			if (water){ //물보충
				System.out.printf("%s의 물보충이 필요합니다.\n",name);
			} else{
				System.out.printf("%s모드를 시작합니다.\n",mode);
			}

		} else{
			System.out.printf("%s의 %s의 전원을 끕니다.\n",company,name);
		}
	}
}

class  ClothingManagementTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ClothingManagement c = new ClothingManagement();

		System.out.print("의류관리기의 모델명을 입력하세요==>");
		c.name = sc.next();
		System.out.printf("%s의 제조회사를 입력하세요==>",c.name);
		c.company = sc.next();
		System.out.print("관리할 제품을 입력하세요==>");
		c.clothes=sc.next();

		char user_power=' '; //전원
		while(user_power !='y' && user_power !='n'){
			System.out.printf("%s의 전원을 켜시겠습니까?(y/n)==>",c.name);
			user_power = sc.next().charAt(0);
			if(user_power=='y'){
				c.power = true;
			} else if(user_power=='n'){
				c.power = false;
			  }
		}
		char user_water=' '; //물보충
		while(user_water !='y' && user_water!='n'){
			System.out.printf("%s의 물보충이 필요합니까?(y/n)==>",c.name);
			user_water = sc.next().charAt(0);
			if (user_water=='y'){
				c.water = true;
			} else if(user_water=='n'){
				c.water = false; //물보충이 필요없을 때 케어모드 설정
				System.out.print("케어모드를 선택하세요(표준/급속/건조/조용히)==>");
				c.mode = sc.next();
			}
		}
		c.act();
	}
}
