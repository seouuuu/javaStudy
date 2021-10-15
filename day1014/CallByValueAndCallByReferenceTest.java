class Goods
{
	private String item;
	private int qty;
	public Goods(String item, int qty){
		this.item = item;
		this.qty = qty;
	}
	public Goods(){
	}
	public void setItem(String item){
		this.item = item;
	}
	public String getItem(){
		return item;
	}
	public void setQty(int qty){
		this.qty = qty;
	}
	public int getQty(){
		return qty;
	}
	public String toString(){
		return "상품명: "+item+", 수량: "+qty;
	}
}
	



class CallByValueAndCallByReferenceTest 
{
	public static void minusOne(int n){
		n = n-1;
		System.out.println(n);
	}

	public static void minusOne(double []arr){
		for (int i=0;i<arr.length ;i++ ){
			arr[i] = arr[i]-1;
		}
		printArray(arr);                            
	}

	public static void printArray(double []arr){
		for(double a:arr){
			System.out.printf("%10.2f",a);
		}
		System.out.println();
	}

	public static void minusOne(Goods g){
		g.setQty(g.getQty()-1);       
	}

	public static void main(String[] args) 
	{
		int n = 100;
		double []arr = {10.3,2.7,9.1};
		Goods g = new Goods("사과",10);
		minusOne(n);             //값에 의한 호출
		minusOne(arr);           //참조에 의한 호출
		minusOne(g);             //참조에 의한 호출
		System.out.println(n);   //100
		printArray(arr);         //9.3  1.7  8.1 
		System.out.println(g);   //사과, 9
	}
}
