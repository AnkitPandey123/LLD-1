package factoryDesignPattern.factory.simpleFactory;

import factoryDesignPattern.chatClients.AIChatClient;
import factoryDesignPattern.chatClients.ChatGPTClient;
import factoryDesignPattern.chatClients.ClaudeClient;

public class AIChatClientFactory {

    public static AIChatClient getClient(String provider)
    {
        if(provider.equals("chatgpt"))
        {
            return new ChatGPTClient();
        }
        else
        {
            return new ClaudeClient();
        }
    }
}
