package seminars.fourth.webservice;

import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;

public class WebServiceTest {
    @Test
    void requestGet(){
        MyHttpClient myHttpClient = mock(MyHttpClient.class);
        MyWebService myWebService = new MyWebService(myHttpClient);
        when(myHttpClient.get(anyString())).thenReturn("OK");
        String result = myWebService.sendRequest("url");

        assertThat(result).isEqualTo("OK");
    }
}
