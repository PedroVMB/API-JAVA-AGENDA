package org.com.api;

import com.sun.net.httpserver.HttpServer;
import org.com.api.handler.tests.MyHandler;
import org.com.api.handler.tests.SecondHandler;

import java.io.IOException;
import java.net.InetSocketAddress;
public class Main {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(3001), 0);
        server.createContext("/api", new MyHandler());
        server.createContext("/api/teste", new SecondHandler());
        server.setExecutor(null); // Use o executor padrão
        server.start();
    }
}
