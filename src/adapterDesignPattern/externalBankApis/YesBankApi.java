package adapterDesignPattern.externalBankApis;

public class YesBankApi {

    public void moneyDeposit(String accountId, int money)
    {
        System.out.println("YES BANK MONEY DEPOSITIED AMOUNT : " + money +  " IN ACCOUNT : " + accountId );
    }
}
