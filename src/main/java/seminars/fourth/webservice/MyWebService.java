package seminars.fourth.webservice;

public class MyWebService {
    MyHttpClient myHttpClient;

    public MyWebService(MyHttpClient myHttpClient) {
        this.myHttpClient = myHttpClient;
    }

    public String sendRequest(String url) {
        return myHttpClient.get(url);
    }
}
