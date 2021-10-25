//����ÿ� url�� ���޹޾� �ش� �޼ҵ带 �����Ű�� ���α׷�
import java.util.HashMap;
interface SistAction
{
	public void pro();
}

class InsertBoard implements SistAction{
	public void pro(){
		System.out.println("�Խù��� ����Ͽ����ϴ�.");
	}
}

class ListBoard implements SistAction{
	public void pro(){
		System.out.println("�Խù� ����Դϴ�.");
	}
}

class UpdateBoard implements SistAction
{
	public void pro(){
		System.out.println("�Խù��� �����Ͽ����ϴ�.");
	}
}


class CmdTest02
{
	public static void main(String[] args) 
	{
		HashMap<String,SistAction> map = new HashMap<String,SistAction>();

		map.put("insert.do",new InsertBoard());
		map.put("list.do",new ListBoard());
		map.put("update.do",new UpdateBoard());
		
		String url = args[0];
		String cmd = url.substring(url.lastIndexOf("/")+1);
		
		SistAction action = map.get(cmd);
		action.pro();


	}
}
