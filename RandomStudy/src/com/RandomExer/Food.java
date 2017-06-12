package com.RandomExer;

public class Food extends FoodFactory{

public static void main(String args[])
{

	FoodFactory mfoods = new FoodFactory();
	
	Food food1 =  mfoods.setName("fastfood");
	Food food2 = mfoods.setName("fruit");
	System.out.println("Class Name : " + food1.getClass().getSimpleName());
	System.out.println("Class Name : " + food2.getClass().getSimpleName());
	System.out.println("The Super Class name is : "+ food1.getClass().getSuperclass().getSimpleName());
	food1.printName();
	food2.printName(); 
	
	
	
}


}
