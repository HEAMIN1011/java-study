package study.practice.practice17;

public class Person {

	String name;
	String gender;
	int age;
	double height;
	double weight;
	String job;
	String blood;
	String ConditionType;
	boolean isSleeping;
	
	Person(String name, String gender, int age, double height, double weight,
			String job, String blood, String ConditionType, boolean isSleeping){
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.height=height;
		this.weight=weight; 
		this.job=job;
		this.blood=blood;
		this.ConditionType=ConditionType;
		this.isSleeping=isSleeping;
	}
	
	void printPersonInfo() {
		System.out.printf("이름:%s 성별:%s 나이:%d살 키:%.1f 몸무게:%.1f 직업:%s 혈액형:%s 건강상태:%s 수면중여부:%b\n",
				name, gender, age, height, weight, job, blood, ConditionType, isSleeping);
	}

	

	
}
