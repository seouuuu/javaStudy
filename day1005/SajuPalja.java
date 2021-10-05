import java.util.Scanner;
class SajuPalja 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String []result = {"천귀","천액","천권","천파","천인","천문","천복","천고","천역","천간","천수","천명",};
		String name;
		int year;
		int month;
		int date;
		int time;
		System.out.print("이름을 입력하시오==>");
		name = sc.next();
		System.out.println("띠를 입력하세요");
		System.out.print("0:쥐,1:소,2:범,3:토끼,4:용,5:뱀,6:말,7:양,8:원숭이,9:닭,10:개,11:돼지 ==>");
		year = sc.nextInt();
		System.out.print("생월을 입력하세요==>");
		month = sc.nextInt();
		System.out.print("생일을 입력하세요==>");
		date = sc.nextInt();
		System.out.println("생시를 입력하세요");
		System.out.print("0:자,1:축,2:인,3:묘,4:진,5:사,6:오,7:미,8:신,9:유,10:술,11:해==>");
		time = sc.nextInt();
		int n =year;
		System.out.println("**"+name + "님의 사주팔자 풀이**");
		System.out.println("생년의 운명: "+ result[n]);
		n = (n + month-1)%12;
		System.out.println("생월의 운명: "+ result[n]);
		n = (n + date -1)%12;
		System.out.println("생일의 운명: "+ result[n]);
		n = (n + time)%12;
		System.out.println("생시의 운명: "+ result[n]);
	}
}
