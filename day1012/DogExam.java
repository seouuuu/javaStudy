class Dog
{
	private String name;
	private String breed;
	private int age;
	
	public void setName(String name){        //setter,getter
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setBreed(String breed){
		this.breed = breed;
	}
	public String getBreed(){
		return breed;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}

	public Dog(String name, int age){    //이름, 나이 초기화
		this.name = name;
		this.age = age;
	}

	public Dog(String name, String breed, int age){   //이름,종류,나이 초기화
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public String toString(){                    //toString
		return "이름: "+name +", 종류 : "+breed +", 나이: "+age; 
	}
}

class DogExam
{
	public static void main(String[] args) 
	{
		Dog d1 = new Dog("구름",3);
		System.out.println(d1);
		Dog d2 = new Dog("또리","푸들",5);
		System.out.println(d2);
	}
}
