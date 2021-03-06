import java.io.*;
import java.util.*;

public class WordMeaning {
    public static void main(String[] args) throws IOException {
        String yn;
        do {
            DictionaryReader dictionaryReader = new DictionaryReader();
            String existingMeaning = dictionaryReader.read();
            Scanner scanner = new Scanner(System.in);

            if (existingMeaning == null) {
                System.out.println("Enter Word: ");
                String fWord = scanner.nextLine();
                System.out.println("Enter Meaning: ");
                String meaning = scanner.nextLine();
                HashMap<String, String> dic = new HashMap<>();
                dic.put(fWord, meaning);
                File file = new File("/home/rabin/Desktop/WordMeaning.ods");
                PrintWriter writer;
                FileOutputStream out = new FileOutputStream(file, true);

                writer = new PrintWriter(out);
                writer.append(fWord + "," + meaning + "\n");
                writer.flush();
                writer.close();
            }

                System.out.println("Do you want to contribute more? Type 'Y' for yes and 'N' for No.");
                yn = scanner.next();
        } while (yn.equals("Y") || yn.equals("y"));
    }
}
