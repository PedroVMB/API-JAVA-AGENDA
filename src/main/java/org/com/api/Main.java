package org.com.api;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
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
