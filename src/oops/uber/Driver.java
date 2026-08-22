package oops.uber;

public class Driver {
    private String name;
    private String phoneNo;
    private final int driverId;
    private boolean isOnline;
    private static int totalDrivers = 0;

    public Driver(String name, String phoneNo, boolean isOnline) {
        totalDrivers++;
        this.name = name;
        this.phoneNo = phoneNo;
        this.driverId = totalDrivers;
        this.isOnline = isOnline;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getDriverId() {
        return driverId;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public  static int getTotalDrivers() {
        return totalDrivers;
    }

    public boolean acceptRide()
    {
        return isOnline;
    }
}
