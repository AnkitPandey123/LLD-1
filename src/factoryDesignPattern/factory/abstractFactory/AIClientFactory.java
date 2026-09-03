package factoryDesignPattern.factory.abstractFactory;

public class AIClientFactory {

    public static AIFactory getAIFactory(String provider)
    {
        if(provider.equals("chatgpt"))
        {
            return new ChatGPTFactory();
        }
        else
        {
            return new ClaudeFactory();
        }
    }
}
