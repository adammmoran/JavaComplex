import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Saver<E> {
    public void save(File file, E e) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println(e);
        printWriter.close();
    }
}
