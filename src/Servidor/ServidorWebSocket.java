/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servidor;
import org.java_websocket.server.WebSocketServer;
import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import java.net.InetSocketAddress;
import java.util.Set;
import java.util.Collections;
import java.util.HashSet;


public class ServidorWebSocket extends WebSocketServer {
private static Set<WebSocket> clientes = Collections.synchronizedSet(new HashSet<>());

    public ServidorWebSocket(InetSocketAddress address) {
        super(address);
    }

    @Override
    public void onOpen(WebSocket conn, ClientHandshake handshake) {
        clientes.add(conn);
        System.out.println("Nuevo cliente conectado: " + conn.getRemoteSocketAddress());
    }

    @Override
    public void onClose(WebSocket conn, int code, String reason, boolean remote) {
        clientes.remove(conn);
        System.out.println("Cliente desconectado: " + conn.getRemoteSocketAddress());
    }

    @Override
    public void onMessage(WebSocket conn, String message) {
        // Manejar mensajes recibidos de los clientes si es necesario
    }

    @Override
    public void onError(WebSocket conn, Exception ex) {
        ex.printStackTrace();
    }

    @Override
    public void onStart() {
        System.out.println("Servidor WebSocket iniciado en: " + getAddress());
    }

    public static void notificarClientes(String mensaje) {
        for (WebSocket cliente : clientes) {
            cliente.send(mensaje);
        }
    }

    public static void main(String[] args) {
        InetSocketAddress address = new InetSocketAddress("localhost", 8080);
        ServidorWebSocket servidor = new ServidorWebSocket(address);
        servidor.start();
        System.out.println("Servidor WebSocket escuchando en el puerto 8080");
    } 
    
    
}
