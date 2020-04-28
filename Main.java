import java.util.TreeMap;
import javax.swing.JOptionPane;

/**
 * 输入样例：
 * C:\info.txt
 * 
 * 注意：
 * 1.如果要统计频率，，注意除以总字符数
 * 2.如果要分析的不是字符而是词组。。。emmm，野鸡了
 * 3.如果文件很大，，几GB，String不够了，咋整？(温馨提示：RandomAccessFile)
 */
public class Main {
    public static void main(String[] args) {
        String srcFileName = JOptionPane.showInputDialog("请您输入源文件路径");
        String destFileName = srcFileName + "_stat.txt";
        try {
            byte[] data = FileLoader.getData(srcFileName);
            TreeMap <Character, Integer> treeMap = CharacterStatistics.statistics(data);
            FileSaver.save(treeMap, destFileName);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "操作异常");
            System.exit(1);
        }
        JOptionPane.showMessageDialog(null, "输入完毕");
    }
}
