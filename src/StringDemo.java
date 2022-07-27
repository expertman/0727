
public class StringDemo {
	public static void main(String[] args) {
//		String name;   //선언, declaration
//		name = "한지민";    //할당, Assignment
//		System.out.printf("이름 = %s\n", name);
		
		String name = new String("한지민");
		//System.out.printf("이름 = %s\n", name);
		//String name = "한지민";   //초기화, initialization
		
		Student jimin;   //declaration
		jimin = new Student();  //Assignment
		jimin.name = "한지민";  //한지민번지
		jimin.age = 26;
		
		Student chulsu = new Student();
		chulsu.name = "김철수";   //김철수번지
		chulsu.age = 36;
		
		Student younghee = new Student();
		younghee.name = "이영희";  //이영희번지
		younghee.age = 46;
		
		System.out.println("한지민 학생 정보");
		System.out.printf("이름 = %s, 나이 = %d\n",  jimin.name, jimin.age);
		
		System.out.println("김철수 학생 정보");
		System.out.printf("이름 = %s, 나이 = %d\n",  chulsu.name, chulsu.age);
		
		System.out.println("이영희 학생 정보");
		System.out.printf("이름 = %s, 나이 = %d\n",  younghee.name, younghee.age);
		
		
	}
}
