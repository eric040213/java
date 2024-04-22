import java.io.*;
import java.util.*;
import java.net.*;
public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket svs = new ServerSocket(8080);
        String account = "abc";
        String password = "123";
        while (true) {
            System.out.println("Waiting for connection...");
            Socket s = svs.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter pw = new PrintWriter(new PrintWriter(s.getOutputStream()));
            String usercommand = br.readLine();

            if (usercommand.equals("dir")) {

            }
        }
    }
    public static void dir(PrintWriter pw){
        File file = new File(".");
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                pw.println("["+f.getName()+"];");
            }else{
                pw.println(f.getName());
            }
        }
    }
}