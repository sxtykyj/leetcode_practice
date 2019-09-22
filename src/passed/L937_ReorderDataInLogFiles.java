package passed;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: yk
 * @Date: 2019/9/6 19:10
 */
public class L937_ReorderDataInLogFiles {
    public String[] reorderLogFiles(String[] logs) {
        if (logs == null || logs.length == 0) {
            return logs;
        }
        Arrays.sort(logs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2)) {
                    return 0;
                }
                int index1 = o1.indexOf(' ');
                int index2 = o2.indexOf(' ');
                //都是数字日志则位置不变
                if (o1.charAt(index1 + 1) >= '0' && o1.charAt(index1 + 1) <= '9' && o2.charAt(index2 + 1) >= '0' && o2.charAt(index2 + 1) <= '9') {
                    return 0;
                }
                //o1是数字日志，o2是字母日志，则o1要排在o2后面
                if (o1.charAt(index1 + 1) >= '0' && o1.charAt(index1 + 1) <= '9') {
                    return 1;
                }
                //o1是字母日志，o2是数字日志，则o2要排在o1后面
                if (o2.charAt(index2 + 1) >= '0' && o2.charAt(index2 + 1) <= '9') {
                    return -1;
                }
                //两个都是字母日志时，则比较去掉标识符的字串
                int cmp = o1.substring(index1 + 1).compareTo(o2.substring(index2 + 1));
                if (cmp == 0) {
                    //如果去掉标识符的两个字符串相等，则比较标识符
                    int cmpIndex = o1.substring(0, index1 - 1).compareTo(o2.substring(0, index2 - 1));
                    if (cmpIndex == 0) {
                        return 0;
                    }
                    if (cmpIndex < 0) {
                        return -1;
                    }
                    return 1;
                }
                if (cmp < 0) {
                    return -1;
                }
                return 1;
            }
        });
        return logs;
    }
}
