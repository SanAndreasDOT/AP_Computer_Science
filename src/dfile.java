import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class dfile {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner (new File("folder/file.dat"));
            while (input.hasNext()) {

            }

        } catch (IOException e) {
            System.out.println("can't find data file!");
        }
    }
}
