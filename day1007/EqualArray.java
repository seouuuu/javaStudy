class EqualArray 
{
	public static void main(String[] args) 
	{
		int []a={1,2,3,4,5};
		int []b={1,2,3,4,5};
		boolean flag =true;
		for (int i=0;i<a.length ;i++ ){
			if (a[i]!=b[i]){
				flag = false;
				break;
			}
		}
		if (flag){
			System.out.println("�迭�� ������ ��ġ�մϴ�.");
		} else{
			System.out.println("�迭�� ������ ��ġ���� �ʽ��ϴ�.");
		}
	}
}
