class  NotDefine
{
	public static void main(String[] args) 
	{
	
		name = "ȫ�浿";
		System.out.println("�̸��� " + name);

	}
}

/*
C:\javaStudy\day0928>javac NotDefine.java
NotDefine.java:6: error: cannot find symbol
                name = "ȫ�浿";
                ^
  symbol:   variable name
  location: class NotDefine
NotDefine.java:7: error: cannot find symbol
                System.out.println("�̸��� " + name);
                                            ^
  symbol:   variable name
  location: class NotDefine
2 errors

*/
