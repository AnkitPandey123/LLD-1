package factoryDesignPattern.factory.abstractFactory;

import factoryDesignPattern.chatClients.AIChatClient;
import factoryDesignPattern.vectorClients.AIVectorClient;

public interface AIFactory {

    public AIChatClient getChatClient();

    public AIVectorClient  getVectorClient();


}
