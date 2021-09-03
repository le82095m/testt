package com.le.tomcat.http;

import org.junit.Test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;

public class HttpRequestParserTest {

    @Test
    public void parse() throws IOException, ClassNotFoundException {
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket socket = serverSocket.accept();
        HttpRequestParser httpRequestParser = new HttpRequestParser();
        Request request = httpRequestParser.parse(socket.getInputStream());
        System.out.println(request.getMethod());
        System.out.println(request.getRequestURI());
        Map<String, String> headers = request.getHeaders();
        for(String header : headers.keySet()){
            System.out.print(header+" : ");
            System.out.print(headers.get(header));
            System.out.println();
        }
    }
}