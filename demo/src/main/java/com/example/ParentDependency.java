package com.example;

import com.example1.Dependency1;

public class ParentDependency {
	public ParentDependency() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void sayParent() {
		System.out.println("======com.example==========");
		Dependency1 dependency1 = new Dependency1();
		dependency1.sayHello();
	}
}
