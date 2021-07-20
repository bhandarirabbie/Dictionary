import java.io.*;
import java.util.*;

public class WordMeaning {
    public static void main(String[] args) throws IOException {
        String yn;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Word: ");
            String fWord = scanner.nextLine();
            System.out.println("Enter Meaning: ");
            String meaning = scanner.nextLine();
            HashMap<String, String> dic = new HashMap <>();
            dic.put(fWord, meaning);
            File file = new File("/home/rabin/Desktop/WordMeaning.txt");
            PrintWriter writer;
            FileOutputStream out = new FileOutputStream(file, true);

            writer = new PrintWriter(out);
            writer.append(String.valueOf(dic));
            writer.flush();
            writer.close();

            System.out.println("Do you want to contribute more? Type 'Y' for yes and 'N' for No.");
            yn = scanner.next();
        } while (yn.equals("Y") || yn.equals("y"));
    }
}