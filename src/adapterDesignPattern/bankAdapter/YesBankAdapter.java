package adapterDesignPattern.bankAdapter;

import adapterDesignPattern.externalBankApis.IciciBankApi;
import adapterDesignPattern.externalBankApis.YesBankApi;

public class YesBankAdapter implements BankApi{

    YesBankApi _yesBankApi;
    public YesBankAdapter()
    {
        _yesBankApi = new YesBankApi();
    }
    @Override
    public void depositMoneyInBank(String accountId, int money) {
        _yesBankApi.moneyDeposit(accountId, money);
    }
}
