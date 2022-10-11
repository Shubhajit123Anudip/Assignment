package com.java;

public class MainTeacher {
	String designation="HOD";
	String collage="DIATM";
	void work() {
		System.out.println("Designation:"+designation+ "Collage:"+collage);
	}
}
class ITTeacher extends MainTeacher{
}
class MathTeacher extends MainTeacher{
}
class MusicTeacher extends MainTeacher{
}
class PhysicsTeacher extends MainTeacher{
}
public class Teacher{
	public static void main(String[] args) {
		ITTeacher it=new ITTeacher();
		it.work();
		MathTeacher mt=new MathTeacher();
		mt.work();
		MusicTeacher mct=new MusicTeacher();
		mct.work();
		PhysicsTeacher pt=new PhysicsTeacher();
		pt.work();
		}

}
