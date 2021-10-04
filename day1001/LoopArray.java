class LoopArray 
{
	public static void main(String[] args) 
	{
		int[]lotto = {4,11,19,26,27,43 };//21
		System.out.println("로또번호");
		//for ( int i=0  ; i<6   ; i++   ){
			for ( int i=0  ; i<lotto.length   ; i++   ){
			System.out.print(lotto[i]+" ");
		}

		/*System.out.print(lotto[0]+" ");
		System.out.print(lotto[1]+" ");
		System.out.print(lotto[2]+" ");
		System.out.print(lotto[3]+" ");
		System.out.print(lotto[4]+" ");
		System.out.print(lotto[5]+" ");//System.out.print(lotto[6]); 은 오류*/
	}
}
