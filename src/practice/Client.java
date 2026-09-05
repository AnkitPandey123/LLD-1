package practice;

import practice.prototypeAndRegistry.VMInstance;
import practice.prototypeAndRegistry.VMInstanceRegistry;

public class Client {

    public static void main(String[] args) {

//        AutoProectStatus aps = AutoProectStatus.PENDING;
//        System.out.println(aps.name());
//        ClaimStatus cs = ClaimStatus.valueOf(aps.name());

        VMInstance vm1 = new VMInstance("linux", "1.1.1.1", "ankit.com");

        VMInstanceRegistry vmInstanceRegistry = new VMInstanceRegistry();
        vmInstanceRegistry.add("linuxVM", vm1);

        VMInstance vm2 = vmInstanceRegistry.get("linuxVM");

        System.out.println("debug");
    }
}
