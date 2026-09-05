package practice.prototypeAndRegistry;

public class VMInstance implements Prototype{

    String os;
    String ip;
    String hostname;

    public VMInstance(String os, String ip, String hostname) {
        this.os = os;
        this.ip = ip;
        this.hostname = hostname;
    }

    public VMInstance(VMInstance other)
    {
        this(other.os, other.ip, other.hostname);
    }

    public VMInstance clone()
    {
        return new VMInstance(this);
    }
}
