class FixedAccount extends Bank{
	int count;
	public FixedAccount(){
		
	}
	public FixedAccount(String name,String type,int brachNo,int count){
		super(name,type,brachNo);
		this.count=count;
	}
	public void Info(){
		System.out.println("Owner's Name : "+name);
		System.out.println("Account's Type : "+type);
		System.out.println("Branch NO :"+brachNo);
		System.out.println("Count is : "+count);
	}
}