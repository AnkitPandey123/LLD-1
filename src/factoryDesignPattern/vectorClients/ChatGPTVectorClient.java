package factoryDesignPattern.vectorClients;

public class ChatGPTVectorClient implements AIVectorClient{
    @Override
    public void getVectorResponse() {
        System.out.println("CHATGPT KA VECTOR");
    }
}
