package ss21_structural_DP.proxy;

public class Client {

    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        try {
            internet.connectTo("w3school.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
