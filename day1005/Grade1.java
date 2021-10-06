import java.util.Scanner;
class  Grade1
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		String []name =new String[5];
		int []kor = new int[5];
		int []eng = new int[5];
		int []math = new int[5];
		int []tot = new int[5];
		double []avg = new double[5];
		for (int i=0 ;i<name.length ; i++){
			System.out.print((i+1)+" 번째 학생의 이름==>");
			name[i] = sc.next();
			System.out.print((i+1)+" 번째 학생의 국어점수==>");
			kor[i] = sc.nextInt();
			System.out.print((i+1)+" 번째 학생의 영어점수==>");
			eng[i] = sc.nextInt();
			System.out.print((i+1)+" 번째 학생의 수학점수==>");
			math[i] = sc.nextInt();
			tot[i] = kor[i] + eng[i] + math[i];
			avg[i] = (double)tot[i]/3;
		}
		for (int i=0  ;i<avg.length ; i++){
			for (int j=i+1  ; j<avg.length ; j++){
				if ( avg[i]<avg[j]){
					double temp = avg[i];
					String temp2 = name[i];
					avg[i] = avg[j];
					name[i] = name[j];
					avg[j] = temp;
					name[j] = temp2;
				}
			}
		}
		System.out.println("**성적순 정렬**");
		for (int i=0 ; i<avg.length ;i++ ){
			    System.out.println(name[i] + " ");
                System.out.println(avg[i] + " ");
            }
	}
}
