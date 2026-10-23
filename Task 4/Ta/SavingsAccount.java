class SavingsAccount extends Bank{
	int accNo;
	public SavingsAccount(){}
	public SavingsAccount(String name,String type, int branchNo,int accNo){
		super(name,type,branchNo);
		this.accNo=accNo;
	}
	public void Info(){
		
        System.out.println("Owner's Name : "+name);
		System.out.println("Account's Type : "+type);
		System.out.println("Branch NO :"+brachNo);
		System.out.println("Account No is : "+accNo);
	}
}