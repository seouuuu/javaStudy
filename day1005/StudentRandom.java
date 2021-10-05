import java.util.Random;
class  StudentRandom
{
	public static void main(String[] args) 
	{
		String []names ={"가나","다라","마바","사아","자차","카타","파하"};
		for (int i=0; i<100 ;i++ ){
			System.out.print(names[i%names.length]+"\b\b\b");//\b\b\b 줄 안바뀌고 그자리에 입력

			try{ //예외처리
				Thread.sleep(100);//대기시간
			} catch (Exception e){ //e는 변수이름
			}
		}

		Random rand = new Random();
		int n =rand.nextInt();
		n = n >>> 1;
		n = n % 6;
		System.out.println("**당첨**");
		System.out.println(names[n]);
	}
}
