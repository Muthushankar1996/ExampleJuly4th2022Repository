package com.sgtesting.parameterisedconstructor;

class  Animal{
	String animalname;
	String animalcolor;
	int noofanimal;
	Animal(String an,String ac,int na)
{
	animalname="an";
	animalcolor="ac";
	noofanimal=na;
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
	Birds(String bn,String bd,int nb)


{
	birdname="bn";
	birdcolor="bd";
	noofbird=nb;
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
    Insects(String in,String ic,int ni)
{
	insectsname="in";
	insectscolor="ic";
	noofinsects=ni;
	System.out.println("insectsname:"+insectsname);
	System.out.println("insectscolor:"+insectscolor);
	System.out.println("noofinsects:"+noofinsects);	
}
}
public class InstanceAnimals{
	public static void main(String[] args) {
	Animal obj1=new Animal("lion","brown",5);
	Animal obj2=new Animal("gorilla","black",4);
	Animal obj3=new Animal("camel","brown",2);
	
	Birds obj4=new Birds("pigeon","grey",2);
	Birds obj5=new Birds("sparrow","grey",5);
	Birds obj6=new Birds("parrot","green",1);
	
	Insects obj7=new Insects("spyder","black",2);
	Insects obj8=new Insects("honeybee","black",7);
	Insects obj9=new Insects("mosquito","grey",8);
	
	}
}
