import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileLoader {
    public static byte[] getData(String srcFileName) throws IOException {
        File srcFile = new File(srcFileName);
        FileInputStream fis = new FileInputStream(srcFile);
        byte[] data = new byte[(int)srcFile.length()];
        fis.read(data);
        fis.close();
        return data;
    }
}
