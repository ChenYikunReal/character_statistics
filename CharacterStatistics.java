import java.util.TreeMap;

public class CharacterStatistics {
    public static TreeMap <Character, Integer> statistics(byte[] data){
        String dataString = new String(data);
        TreeMap <Character, Integer> treeMap = new TreeMap <Character, Integer>();
        int length = dataString.length();
        for (int i = 0; i < length; i++) {
            char character = dataString.charAt(i);
            Integer time = treeMap.get(character);
            if (time == null) {
                time = 0;
            }
            time++;
            treeMap.put(character,  time);
        }
        return treeMap;
    }
}
