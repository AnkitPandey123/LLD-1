package adapterDesignPattern;

import adapterDesignPattern.bankAdapter.IciciBankAdapter;
import adapterDesignPattern.bankAdapter.YesBankAdapter;

public class Client {

    public static void main(String[] args) {

        Phonepe yesBankPhonePay = new Phonepe(new YesBankAdapter());
        yesBankPhonePay.depositMoney("ankit123", 500);

        Phonepe iciciBankPhonepe = new Phonepe(new IciciBankAdapter());
        iciciBankPhonepe.depositMoney("abhi535", 500000);
    }
}
