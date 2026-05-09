package poly;

public class Animal {
	String name;
	String sound;
	Animal(){
		this("","");
	}
 Animal(String name, String sound){
	 this.name=name;
	 this.sound=sound;
 }
 void getInfo() {
	 System.out.println("Name="+name);
	 System.out.println("Sound="+sound);
 }
 void getInfo(String name,String sound,int legs) {
	 System.out.println("Name="+name);
	 System.out.println("Sound="+sound);
	 System.out.println("No of Legs="+legs);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ans1=new Animal("Horse","HInggg");
		ans1.getInfo();
		ans1.getInfo("Cat", "Meow", 4);
	}

} 
