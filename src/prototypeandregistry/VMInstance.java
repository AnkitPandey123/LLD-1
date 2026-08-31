package prototypeandregistry;

public class VMInstance implements Prototype<VMInstance>{

    private String os;
    private String runTime;
    private String ip;
    private String hostname;
    private String monitoringAgent;

    public VMInstance(String os, String runTime, String ip, String hostname, String monitoringAgent) {
        this.os = os;
        this.runTime = runTime;
        this.ip = ip;
        this.hostname = hostname;
        this.monitoringAgent = monitoringAgent;
    }

    public VMInstance(VMInstance other)
    {
        this(other.os, other.runTime, other.ip, other.hostname, other.monitoringAgent);
    }

    @Override
    public VMInstance clone() {
        return new VMInstance(this);
    }

    public String getOs() {
        return os;
    }

    public String getRunTime() {
        return runTime;
    }

    public String getIp() {
        return ip;
    }

    public String getHostname() {
        return hostname;
    }

    public String getMonitoringAgent() {
        return monitoringAgent;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }
}
