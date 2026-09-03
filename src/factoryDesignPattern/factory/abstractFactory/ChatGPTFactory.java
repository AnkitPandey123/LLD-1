package factoryDesignPattern.factory.abstractFactory;

import factoryDesignPattern.chatClients.AIChatClient;
import factoryDesignPattern.chatClients.ChatGPTClient;
import factoryDesignPattern.vectorClients.AIVectorClient;
import factoryDesignPattern.vectorClients.ChatGPTVectorClient;

public class ChatGPTFactory implements AIFactory{
    @Override
    public AIChatClient getChatClient() {
        return new ChatGPTClient();
    }

    @Override
    public AIVectorClient getVectorClient() {
        return new ChatGPTVectorClient();
    }
}
