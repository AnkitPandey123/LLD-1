package factoryDesignPattern;

import factoryDesignPattern.chatClients.AIChatClient;
import factoryDesignPattern.factory.abstractFactory.AIClientFactory;
import factoryDesignPattern.factory.abstractFactory.AIFactory;
import factoryDesignPattern.factory.simpleFactory.AIChatClientFactory;
import factoryDesignPattern.factory.simpleFactory.AIVectorClientFactory;
import factoryDesignPattern.vectorClients.AIVectorClient;

public class ChatService {

        private AIChatClient _aiChatClient;
        private AIVectorClient _aiVectorClient;
        private AIFactory _aiClientFactory;

        ChatService(String provider)
        {
            _aiClientFactory = AIClientFactory.getAIFactory(provider);
            _aiChatClient = _aiClientFactory.getChatClient();
            _aiVectorClient = _aiClientFactory.getVectorClient();
        }

        public void chat(String prompt)
        {
            _aiChatClient.getResponse(prompt);
            _aiVectorClient.getVectorResponse();
        }
}
