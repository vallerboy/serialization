import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Lenovo on 17.08.2017.
 */
public class Main {
    public static void main(String[] args) {
       File file = new File("leniwiec.png");
       File fileCopy = new File("leniwiec1.png");


        if(!fileCopy.exists()){
            try {
                fileCopy.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            // Odczyt z pliku
            FileInputStream fileInputStream = new FileInputStream(file);

            int read = 0;
            List<Integer> bytes = new ArrayList<>();

            while (read != -1){
                read = fileInputStream.read();
                bytes.add(read);
            }

            fileInputStream.close();

            // Zapis do pliku
            FileOutputStream fileOutputStream = new FileOutputStream(fileCopy, true);

            for (Integer aByte : bytes) {
                fileOutputStream.write(aByte);
            }

            fileOutputStream.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
