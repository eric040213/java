import java.net.*;
import java.io.*;
import java.util.*;

public class client1 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost",8080);
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
        System.out.println("請輸入指令:");
        String command = sc.nextLine();
        pw.println(command);
        pw.flush();
    }
}
