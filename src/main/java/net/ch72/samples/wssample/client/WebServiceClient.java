package net.ch72.samples.wssample.client;

/**
 * Created by rasato on 2015/10/21.
 */
public class WebServiceClient {

    public static void main(String[] args) {
        Sample port = new SampleService().getSamplePort();

        final String input = "JAX-WS";
        String output = port.sayHello(input);
        System.out.println(output);
    }
}
