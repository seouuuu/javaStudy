class  ForEachArray
{
	public static void main(String[] args) 
	{
		int []data ={1,2,3,4,5};
		for (int i:data ){ //for-each 반복문에서 i는 배열의 요소(인덱스x)를 하나씩 가져옴
			//System.out.println(i);
			System.out.println(data[i]); //i자체가 배열의 값을 가져오는데 그것을 인덱스로 사용
		}


		/*
		for (int i=0;i<data.length ;i++ ){
			System.out.println(data[i]);
		}
			*/
		}
	}

