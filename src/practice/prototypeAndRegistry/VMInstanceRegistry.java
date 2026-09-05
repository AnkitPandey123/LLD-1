package practice.prototypeAndRegistry;

import java.util.HashMap;

public class VMInstanceRegistry {

    HashMap<String, VMInstance> vmInstanceRegistry;

    public VMInstanceRegistry() {
        this.vmInstanceRegistry = new HashMap<>();
    }

    public void add(String key, VMInstance vmInstance)
    {
        vmInstanceRegistry.put(key, vmInstance);
    }

    public VMInstance get(String key)
    {
        return vmInstanceRegistry.get(key).clone();
    }
}
