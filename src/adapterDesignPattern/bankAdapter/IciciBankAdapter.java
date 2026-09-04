package adapterDesignPattern.bankAdapter;

import adapterDesignPattern.externalBankApis.IciciBankApi;

public class IciciBankAdapter implements BankApi{

    IciciBankApi _iciciBankApi;

    public IciciBankAdapter() {
        _iciciBankApi = new IciciBankApi();
    }

    @Override
    public void depositMoneyInBank(String accountId, int money) {
        _iciciBankApi.depositInAccount(accountId, money);
    }
}
