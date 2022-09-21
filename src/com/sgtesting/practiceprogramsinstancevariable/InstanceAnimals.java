package com.sgtesting.practiceprogramsinstancevariable;

class  Animal{
	String animalname;
	String animalcolor;
	int noofanimal;
}
class Birds
{
	String birdname;
	String birdcolor;
	int noofbird;
}
class Insects
{
	String insectsname;
	String insectscolor;
	int noofinsects;
}
public class InstanceAnimals{
	public static void main(String[] args) {
		Animal obj1=new Animal();
		obj1.animalname="camel";
		obj1.animalcolor="brown";
		obj1.noofanimal=17;
		System.out.println("animalname:"+obj1.animalname);
		System.out.println("animalcolor:"+obj1.animalcolor);
		System.out.println("noofanimal:"+obj1.noofanimal);
		System.out.println("+");
		Birds obj2=new Birds();
		obj2.birdname="pigeon";
		obj2.birdcolor="grey";
		obj2.noofbird=2;
		System.out.println("birdname:"+obj2.birdname);
		System.out.println("birdcolor:"+obj2.birdcolor);
		System.out.println("noofbird:"+obj2.noofbird);
		System.out.println("+");
		Insects obj3=new Insects();
		obj3.insectsname="spider";
		obj3.insectscolor="black";
		obj3.noofinsects=1;
		System.out.println("insectsname:"+obj3.insectsname);
		System.out.println("insectscolor:"+obj3.insectscolor);
		System.out.println("noofinsects:"+obj3.noofinsects);
	}
}
