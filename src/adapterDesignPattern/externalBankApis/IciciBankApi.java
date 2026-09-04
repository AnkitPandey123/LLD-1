package adapterDesignPattern.externalBankApis;

public class IciciBankApi {

    public void depositInAccount(String accountNo, int money)
    {
        System.out.println("ICICI BANK MONEY DEPOSITED AMOUNT : " + money + " IN ACCOUNT : " + accountNo);
    }
}
