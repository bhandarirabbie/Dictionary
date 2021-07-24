import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;

public class DictionaryReader {
    public String read() throws FileNotFoundException, IOException {
        Scanner mainScanner = new Scanner(System.in);

            System.out.println("Enter Your Word: ");
            String word = mainScanner.nextLine();

                FileReader fReader = new FileReader("/home/rabin/Desktop/WordMeaning.ods");
                BufferedReader bReader = new BufferedReader(fReader);

                    String line = null;

                        do {
                            line = bReader.readLine();
                            if (line != null) {
                                String findWord = line.split(",")[0];
                                if (findWord.equals(word)) {
                                    System.out.println("Word: " + line.split(",")[0] + " Meaning: " + line.split(",")[1]);
                                    break;
                                }
                            }
                        }while (line!=null);

                fReader.close();
                bReader.close();
                return line;
        }
    }
