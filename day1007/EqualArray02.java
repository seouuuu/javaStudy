class EqualArray02 
{
	public static void main(String[] args) 
	{
		int []a={1,2,3,4,5,6,7,8,9,10};
		int []b={1,2,3,4,5};
		if (a.length !=b.length){
			System.out.println("�迭�� ������ ��ġ���� �ʽ��ϴ�.");
			return; //���߱�
		} else{
			boolean flag =true;
			for (int i=0;i<a.length ;i++) {
					if (a[i]!=b[i]){
						flag = false;
						break;
					}	
			}
				if (flag&&a.length==b.length){
					System.out.println("�迭�� ������ ��ġ�մϴ�.");
				} else{
					System.out.println("�迭�� ������ ��ġ���� �ʽ��ϴ�.");
				}
		}
  }
}