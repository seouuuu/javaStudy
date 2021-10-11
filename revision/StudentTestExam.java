import java.util.Scanner;
class Student
{
	String name;
	int kor;
	int eng;
	int math;
	int tot;
	double avg;
}

class StudentTestExam 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Student []s = new Student[3];
		for (int i=0;i<s.length ;i++ ){
			s[i] = new Student();
			System.out.printf("%s번째 학생의 이름==>",i+1);
			s[i].name = sc.next();
			System.out.printf("%d번째 학생의 국어점수==>",i+1);
			s[i].kor = sc.nextInt();
			System.out.printf("%d번째 학생의 영어점수==>",i+1);
			s[i].eng = sc.nextInt();
			System.out.printf("%d번째 학생의 수학점수==>",i+1);
			s[i].math = sc.nextInt();
			s[i].tot = s[i].kor + s[i].eng +s[i].math;
			s[i].avg = s[i].tot/3.0;
		}
		for (int i=0; i<s.length ;i++ ){
			for (int j =i+1;j<s.length ;j++ ){
				if (s[j].avg>s[i].avg){
					Student temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for (int i = 0;i<s.length ;i++ ){
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\n",s[i].name,s[i].kor,s[i].eng,s[i].math,s[i].tot,s[i].avg);
		}
	}
}
