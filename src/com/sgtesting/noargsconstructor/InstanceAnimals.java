package com.sgtesting.noargsconstructor;

class  Animal{
	String animalname;
	String animalcolor;
	int noofanimal;

Animal()
{
	animalname="camel";
	animalcolor="brown";
	noofanimal=17;
	System.out.println("animalname:"+animalname);
	System.out.println("animalcolor:"+animalcolor);
	System.out.println("noofanimal:"+noofanimal);
	System.out.println("+");	
}
}
class Birds
{
	String birdname;
	String birdcolor;
	int noofbird;

Birds()
{
	birdname="pigeon";
	birdcolor="grey";
	noofbird=2;
	System.out.println("birdname:"+birdname);
	System.out.println("birdcolor:"+birdcolor);
	System.out.println("noofbird:"+noofbird);
	System.out.println("+");	
}
}
class Insects
{
	String insectsname;
	String insectscolor;
	int noofinsects;

Insects()
{
	insectsname="spider";
	insectscolor="black";
	noofinsects=1;
	System.out.println("insectsname:"+insectsname);
	System.out.println("insectscolor:"+insectscolor);
	System.out.println("noofinsects:"+noofinsects);	
}
}
public class InstanceAnimals{
	public static void main(String[] args) {
	Animal obj1=new Animal();
	Birds obj2=new Birds();
	Insects obj3=new Insects();
	}
}
