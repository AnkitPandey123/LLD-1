package prototypeandregistry;

import java.util.HashMap;

public class VMInstanceRegistry {

    HashMap<String, VMInstance> vmRegistry;

    VMInstanceRegistry()
    {
        vmRegistry = new HashMap<>();
    }

    public void add(String key, VMInstance instance)
    {
        vmRegistry.put(key, instance);
    }

    public VMInstance get(String key)
    {
        return vmRegistry.get(key).clone();
    }
}
