import java.io.FileWriter;
import java.time.LocalDate;

public class WriteDate {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("date.txt");
            fw.write("Today's Date: " + LocalDate.now());
            fw.close();

            System.out.println("Date written to file");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}