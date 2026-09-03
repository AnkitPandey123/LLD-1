package factoryDesignPattern;

import factoryDesignPattern.chatClients.AIChatClient;
import factoryDesignPattern.chatClients.ChatGPTClient;
import factoryDesignPattern.chatClients.ClaudeClient;

public class Client {

    public static void main(String[] args) {


        ChatService chat = new ChatService("chatgptgh");
        chat.chat("LLD");
    }
}
