import java.io.PrintStream;
import java.util.Set;
import java.util.TreeMap;

public class FileSaver {
    public static void save(TreeMap <Character, Integer> treeMap, String destFileName) throws Exception{
        PrintStream printStream = new PrintStream(destFileName);
        Set <Character> keySet = treeMap.keySet();
        for (char ch : keySet) {
            printStream.println(ch + "\t" + treeMap.get(ch));
        }
        printStream.close();
    }
}
