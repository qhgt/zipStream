import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class test3 {
    public static void main(String[] args) {

        String s="你·.2242";
        String s2="2.2242";
        String[] split = s.split("\\.");
        String[] split2 = s2.split("\\.");
        TreeMap<Integer ,String> treeMap=new TreeMap();
        treeMap.put(Integer.parseInt(split[0]),split[1]);
        treeMap.put(Integer.parseInt(split2[0]),split2[1]);
        Set<Map.Entry<Integer, String>> entries = treeMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {

        }
    }
}
