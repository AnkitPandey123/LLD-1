package prototypeandregistry;

public class GPUInstance extends VMInstance{

    private String gpu;

    public GPUInstance(String os, String runTime, String ip, String hostname, String monitoringAgent, String gpu) {
        super(os, runTime, ip, hostname, monitoringAgent);
        this.gpu = gpu;
    }

    public GPUInstance(GPUInstance other) {
        this(other.getOs(), other.getRunTime(), other.getIp(), other.getHostname(), other.getMonitoringAgent(), other.gpu);

    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    @Override
    public GPUInstance clone()
    {
        return new GPUInstance(this);
    }
}
