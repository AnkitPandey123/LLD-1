package adapterDesignPattern;

import adapterDesignPattern.bankAdapter.BankApi;

public class Phonepe {

    private BankApi _bankApi;

    Phonepe(BankApi bankApi)
    {
        this._bankApi = bankApi;
    }

    public void depositMoney(String accountId, int money)
    {
        _bankApi.depositMoneyInBank(accountId, money);
    }


}
