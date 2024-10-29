package study.practice.practice18;

public class TV {
	
	String brand;
	int year;
	int inch;
	
	TV(String brand, int year, int inch) {
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	
	
	void show() {
		System.out.printf("%s제품 %d년형 %d인치\n", brand, year, inch);
	}


	

}
