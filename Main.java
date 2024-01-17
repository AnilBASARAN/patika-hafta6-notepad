import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir metin girin:  ");
        String userInput = input.nextLine();


        File file = new File("text.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        // yaz dosyaya
        FileWriter fWriter = new FileWriter(file,false);
        BufferedWriter buff = new BufferedWriter(fWriter);
        buff.write(userInput);
        buff.close();
        // oku dosyadan
        FileReader fReader = new FileReader(file);
        BufferedReader buffR = new BufferedReader(fReader);
        String readMe = buffR.readLine();

        // yazdır ekrana
        System.out.println("Dosyanın içine yazılanlar : "+readMe);
        buffR.close();
    }
}
