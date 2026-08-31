package singleton;

import java.util.ArrayList;
import java.util.List;

public class DbConnectionPool {

    private String url;
    private String password;
    private List<String> connections;
    private int maxPoolSize;

    public static volatile DbConnectionPool instance;

    private DbConnectionPool(String url, String password, int maxPoolSize)
    {
        this.url = url;
        this.password = password;
        this.maxPoolSize = maxPoolSize;
        this.connections = new ArrayList<>(maxPoolSize);
    }

    public static DbConnectionPool getInstance()
    {
        if(instance == null)
        {
            synchronized (DbConnectionPool.class)
            {
                if(instance == null)
                    return instance = new DbConnectionPool("hi", "fi", 5);
            }

        }
        return instance;
    }
}
