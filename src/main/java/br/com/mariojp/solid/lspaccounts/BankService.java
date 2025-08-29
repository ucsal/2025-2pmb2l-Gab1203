package br.com.mariojp.solid.lspaccounts;

public class BankService {
    public void processWithdrawal(Account acc, double amount){

        if(acc instanceof Withdrawable withdrawableAccount){
            withdrawableAccount.withdraw(amount);

        }else{
            System.out.println("A conta não aceita saques!");
        }
    }
}