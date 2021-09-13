import java.util.Arrays;
import java.util.Comparator;

public class Test4 {
    public String[] SortIdNumber (String[] ids) {
        Arrays.sort(ids, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                for(int i = 6; i < 14; i++){
                    if(o1.charAt(i) != o2.charAt(i)) {
                        return o1.charAt(i) - o2.charAt(i);
                    }
                }
                return 0;
            }
        });
        return ids;
    }
}
