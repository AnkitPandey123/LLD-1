package factoryDesignPattern.factory.abstractFactory;

import factoryDesignPattern.chatClients.AIChatClient;
import factoryDesignPattern.chatClients.ClaudeClient;
import factoryDesignPattern.vectorClients.AIVectorClient;
import factoryDesignPattern.vectorClients.ClaudeVectorClient;

public class ClaudeFactory implements AIFactory{
    @Override
    public AIChatClient getChatClient() {
        return new ClaudeClient();
    }

    @Override
    public AIVectorClient getVectorClient() {
        return new ClaudeVectorClient();
    }
}
