import java.util.Scanner;
class Fortune
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char data;
		int mon,day,i,n;
		char []ani = {'��','��','��','��','��','��','��','��','��','��','��','��'};
		
		int []num = {0,1,2,3,4,5,6,7,8,9,10,11};
		System.out.print("�츦 �Է��ϼ���==>");
		data = sc.next().charAt(0);
		for ( i=0   ; i<12   ; i++   ){
			if ( data== ani[i] ){
				switch(i){
					case 0:System.out.println("õ��");break;
				    case 1:System.out.println("õ��");break;
					case 2:System.out.println("õ��");break;
					case 3:System.out.println("õ��");break;
					case 4:System.out.println("õ��");break;
					case 5:System.out.println("õ��");break;
					case 6:System.out.println("õ��");break;
					case 7:System.out.println("õ��");break;
					case 8:System.out.println("õ��");break;
					case 9:System.out.println("õ��");break;
					case 10:System.out.println("õ��");break;
					case 11:System.out.println("õ��");break;}
				System.out.print("���� ������ �Է��ϼ���==>");
				mon = sc.nextInt();
				if ((i+mon-1)<12){
					switch(i+mon-1){
					case 0:System.out.println("õ��");break;
				    case 1:System.out.println("õ��");break;
					case 2:System.out.println("õ��");break;
					case 3:System.out.println("õ��");break;
					case 4:System.out.println("õ��");break;
					case 5:System.out.println("õ��");break;
					case 6:System.out.println("õ��");break;
					case 7:System.out.println("õ��");break;
					case 8:System.out.println("õ��");break;
					case 9:System.out.println("õ��");break;
					case 10:System.out.println("õ��");break;
					case 11:System.out.println("õ��");break;}
				} else{
					switch(i+mon-13){
					case 0:System.out.println("õ��");break;
				    case 1:System.out.println("õ��");break;
					case 2:System.out.println("õ��");break;
					case 3:System.out.println("õ��");break;
					case 4:System.out.println("õ��");break;
					case 5:System.out.println("õ��");break;
					case 6:System.out.println("õ��");break;
					case 7:System.out.println("õ��");break;
					case 8:System.out.println("õ��");break;
					case 9:System.out.println("õ��");break;
					case 10:System.out.println("õ��");break;
					case 11:System.out.println("õ��");break;}
				}
			  System.out.print("���� ������ �Է��ϼ���==>");
				day = sc.nextInt();
				if ((i+mon+day-2)<12){
					switch(i+mon+day-2){
					case 0:System.out.println("õ��");break;
				    case 1:System.out.println("õ��");break;
					case 2:System.out.println("õ��");break;
					case 3:System.out.println("õ��");break;
					case 4:System.out.println("õ��");break;
					case 5:System.out.println("õ��");break;
					case 6:System.out.println("õ��");break;
					case 7:System.out.println("õ��");break;
					case 8:System.out.println("õ��");break;
					case 9:System.out.println("õ��");break;
					case 10:System.out.println("õ��");break;
					case 11:System.out.println("õ��");break;}
				} else if((i+mon+day-2)>=12&&(i+mon+day-2)<24){
					switch(i+mon+day-14){
					case 0:System.out.println("õ��");break;
				    case 1:System.out.println("õ��");break;
					case 2:System.out.println("õ��");break;
					case 3:System.out.println("õ��");break;
					case 4:System.out.println("õ��");break;
					case 5:System.out.println("õ��");break;
					case 6:System.out.println("õ��");break;
					case 7:System.out.println("õ��");break;
					case 8:System.out.println("õ��");break;
					case 9:System.out.println("õ��");break;
					case 10:System.out.println("õ��");break;
					case 11:System.out.println("õ��");break;}
				} else if ((i+mon+day-2)>=24&&(i+mon+day-2)<36)
				{switch(i+mon+day-26){
					case 0:System.out.println("õ��");break;
				    case 1:System.out.println("õ��");break;
					case 2:System.out.println("õ��");break;
					case 3:System.out.println("õ��");break;
					case 4:System.out.println("õ��");break;
					case 5:System.out.println("õ��");break;
					case 6:System.out.println("õ��");break;
					case 7:System.out.println("õ��");break;
					case 8:System.out.println("õ��");break;
					case 9:System.out.println("õ��");break;
					case 10:System.out.println("õ��");break;
					case 11:System.out.println("õ��");break;}
				} else if ((i+mon+day-2)>=36&&(i+mon+day-2)<48){
					switch(i+mon+day-38){
					case 0:System.out.println("õ��");break;
				    case 1:System.out.println("õ��");break;
					case 2:System.out.println("õ��");break;
					case 3:System.out.println("õ��");break;
					case 4:System.out.println("õ��");break;
					case 5:System.out.println("õ��");break;
					case 6:System.out.println("õ��");break;
					case 7:System.out.println("õ��");break;
					case 8:System.out.println("õ��");break;
					case 9:System.out.println("õ��");break;
					case 10:System.out.println("õ��");break;
					case 11:System.out.println("õ��");break;}
				}else if ((i+mon+day-2)>=48&&(i+mon+day-2)<60){
				   switch(i+mon+day-50){
					case 0:System.out.println("õ��");break;
				    case 1:System.out.println("õ��");break;
					case 2:System.out.println("õ��");break;
					case 3:System.out.println("õ��");break;
					case 4:System.out.println("õ��");break;
					case 5:System.out.println("õ��");break;
					case 6:System.out.println("õ��");break;
					case 7:System.out.println("õ��");break;
					case 8:System.out.println("õ��");break;
					case 9:System.out.println("õ��");break;
					case 10:System.out.println("õ��");break;
					case 11:System.out.println("õ��");break;}
				} else{
					switch(i+mon+day-62){
					case 0:System.out.println("õ��");break;
				    case 1:System.out.println("õ��");break;
					case 2:System.out.println("õ��");break;
					case 3:System.out.println("õ��");break;
					case 4:System.out.println("õ��");break;
					case 5:System.out.println("õ��");break;
					case 6:System.out.println("õ��");break;
					case 7:System.out.println("õ��");break;
					case 8:System.out.println("õ��");break;
					case 9:System.out.println("õ��");break;
					case 10:System.out.println("õ��");break;
					case 11:System.out.println("õ��");break;}
					}
			}
		}
		}
	}

