import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class FileUtil {
    public FileUtil() {
    }

    public static boolean saveReadersList(List<Reader> readers) {
        try {
            ObjectOutputStream fos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\IdeaProjects\\file.txt"));

            try {
                fos.writeUnshared(readers);
                System.out.println("The file has been written");
            } catch (Throwable var1) {
                try {
                    fos.close();
                } catch (Throwable var2) {
                    var1.addSuppressed(var2);
                }

                throw var1;
            }

            fos.close();
        } catch (IOException var3) {
            var3.printStackTrace();
        }

        return true;
    }

    public static List<Reader> restoreReadersList() {
        try {
            ObjectInputStream fis = new ObjectInputStream(new FileInputStream("C:\\Users\\IdeaProjects\\file.txt"));

            List var4;
            try {
                List<Reader> readers = (List)fis.readObject();
                var4 = readers;
            } catch (Throwable var2) {
                try {
                    fis.close();
                } catch (Throwable var3) {
                    var2.addSuppressed(var3);
                }

                throw var2;
            }

            fis.close();
            return var4;
        } catch (ClassNotFoundException | IOException var1) {
            throw new RuntimeException(var1);
        }
    }
}