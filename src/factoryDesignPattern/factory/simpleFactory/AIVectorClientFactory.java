package factoryDesignPattern.factory.simpleFactory;

import factoryDesignPattern.vectorClients.AIVectorClient;
import factoryDesignPattern.vectorClients.ChatGPTVectorClient;
import factoryDesignPattern.vectorClients.ClaudeVectorClient;

public class AIVectorClientFactory {

    public static AIVectorClient getVectorClient(String provider)
    {
        if(provider.equals("chatgpt"))
        {
            return new ChatGPTVectorClient();
        }

        else
        {
            return new ClaudeVectorClient();
        }
    }
}
