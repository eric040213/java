import java.io.*;
import java.util.*;
import java.net.*;

public class client {
    public static void main(String[] args)throws IOException {
        Socket s = new Socket("localhost",8080);
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter pw = new PrintWriter(new PrintWriter(s.getOutputStream()));
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入帳號: ");
        pw.println(sc.nextLine());
        System.out.println("輸入密碼: ");
        pw.println(sc.nextLine());
        pw.flush();

        String respone = br.readLine();
        System.out.println(respone);
    }
}
