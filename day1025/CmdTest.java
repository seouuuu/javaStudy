interface SistAction
{
	public void pro();
}

class CmdTest 
{
	public static void main(String[] args) 
	{
		public static void insertBoard(){
		System.out.println("게시물을 등록하였습니다.");	
	}

	public static void listBoard(){
		System.out.println("게시물 목록입니다.");
	}

	public static void updateBoard(){
		System.out.println("게시물을 수정하였습니다.");
	}

	public static void main(String[] args) 
	{
		
		String url = arg[0];
		String cmd = url.substring(url.lastIndexOf("/")+1);
		

	}
}
