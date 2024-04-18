class BankAccount{

    String BankAccountNo;
    int Balance;

    BankAccount(String accountNo){
        this.BankAccountNo = accountNo;
    }

    public void checkBalance(){
        System.out.println("Remaining Balance:"+" "+Balance);
    }
    
}
