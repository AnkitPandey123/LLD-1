package factoryDesignPattern.chatClients;

public class ClaudeClient implements AIChatClient {

    public void getReply(String prompt)
    {
        System.out.println("CLAUDE : " + prompt);
    }

    @Override
    public void getResponse(String prompt) {
        getReply(prompt);
    }
}
