package ws;


import jakarta.xml.ws.Endpoint;

public class ServerWS {
    public static void main(String[] args){
    Endpoint.publish("http://0.0.0.0:9191/", new BanqueService());
    System.out.println("web service deploye sur http://0.0.0.0:9191");
}
}
