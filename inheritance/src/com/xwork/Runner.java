package com.xwork;

public class Runner {

	public static void main(String[] args) {
		Branch obj=new Branch();
		System.out.println(obj.name);
		System.out.println(obj.grad);
		System.out.println(obj.nameOfCollege);
		System.out.println(obj.NoB);
		System.out.println(obj.brance);
		System.out.println(obj.brance2);
		System.out.println(obj.totalBranch);
		System.out.println("***********");
		obj.UniversityName();
		obj.CollegeName();
		obj.AllBranch();
	}

}
