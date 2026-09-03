package factoryDesignPattern.chatClients;

public class ChatGPTClient implements AIChatClient {

    public void getAnswer(String prompt)
    {
        System.out.println("CHATGPT : " + prompt);
    }

    @Override
    public void getResponse(String prompt) {
        getAnswer(prompt);
    }
}
