import java.util.TreeMap;
import javax.swing.JOptionPane;

/**
 * ����������
 * C:\info.txt
 * 
 * ע�⣺
 * 1.���Ҫͳ��Ƶ�ʣ���ע��������ַ���
 * 2.���Ҫ�����Ĳ����ַ����Ǵ��顣����emmm��Ұ����
 * 3.����ļ��ܴ󣬣���GB��String�����ˣ�զ����(��ܰ��ʾ��RandomAccessFile)
 */
public class Main {
    public static void main(String[] args) {
        String srcFileName = JOptionPane.showInputDialog("��������Դ�ļ�·��");
        String destFileName = srcFileName + "_stat.txt";
        try {
            byte[] data = FileLoader.getData(srcFileName);
            TreeMap <Character, Integer> treeMap = CharacterStatistics.statistics(data);
            FileSaver.save(treeMap, destFileName);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "�����쳣");
            System.exit(1);
        }
        JOptionPane.showMessageDialog(null, "�������");
    }
}
