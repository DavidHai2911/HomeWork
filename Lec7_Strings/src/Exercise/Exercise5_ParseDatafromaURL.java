package Exercise;
import java.util.Scanner;
public class Exercise5_ParseDatafromaURL {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập URL: ");
        String url = sc.nextLine();
        int protocolEnd = url.indexOf("://");
        String protocol = url.substring(0, protocolEnd);
        int domainStart = protocolEnd + 3;
        int domainEnd = url.indexOf("/", domainStart);
        String domain;
        String path;
       
        if (domainEnd == -1) {
            domain = url.substring(domainStart);
            path = "";
        } else {
            domain = url.substring(domainStart, domainEnd);
            path = url.substring(domainEnd);
        }
        System.out.println("Protocol: " + protocol);
        System.out.println("Domain: " + domain);
        System.out.println("Path: " + path);
    }
}
