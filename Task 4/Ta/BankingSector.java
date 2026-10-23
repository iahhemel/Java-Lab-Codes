class BankingSector{
	String secName;
	Bank bank;
	public BankingSector(){}
	public BankingSector(String secName, Bank bank){
		this.secName=secName;
		this.bank=bank;
	}
	public void setSector(Bank b){
		this.bank=b;
	}
	public Bank getSector(){
		return bank;
	}
	public void all(){
		System.out.println("Banking Sector is : "+secName);
		if(bank !=null){
			bank.info();
		}
	}
}