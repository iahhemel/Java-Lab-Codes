abstract class Bank{
	String name;
	String type;
	 int brachNo;
	 public Bank(){}
	 public Bank(String name, String type, int brachNo){
		 this.name=name;
		 this.type=type;
		 this.brachNo=brachNo;
	 }
	 abstract void info();
}