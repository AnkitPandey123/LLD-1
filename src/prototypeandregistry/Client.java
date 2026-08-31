package prototypeandregistry;

import builderpattern.Instructor;

public class Client {

    public static void main(String[] args) {

        VMInstance instance1 = new VMInstance("linux", "dotnet", "1.1.1.1", "ankit.com", "datadog");
        VMInstance instanceCopy = instance1.clone();
        instanceCopy.setIp("2.2.2.2");
        instanceCopy.setHostname("abhishek.com");
        VMInstance gpuInstance = new GPUInstance("mac", "java", "5555", "shivam.com", "dt", "5.0");

        VMInstanceRegistry registry = new VMInstanceRegistry();
        registry.add("vmins1", instance1);
        registry.add("vmcopy", instanceCopy);
        registry.add("gpuins", gpuInstance);

        VMInstance gpuCopy = registry.get("gpuins");



        System.out.println("DEBUG");
    }
}
