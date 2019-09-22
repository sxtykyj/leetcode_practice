package noPassing;

/**
 * @Author: yk
 * 未完成
 * @Date: 2019/9/6 20:03
 */
public class L273_IntegerToEnglishWords {
    /**
     * 思路：分区间递归求解
     * （1）首先，按千来划分，[0, 999]，[1000, 999999]，[1000000, 999999999]，[1000000000, 2 ^ 31 - 1]。
     * <p>
     * （2）其次，对小于1000的数求得其英文表示，求解过程利用了递归的思想。
     * <p>
     * 时间复杂度和具体数字有关，不好分析。空间复杂度是O(1)。
     */

    private static final String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
            "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
            "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty",
            "Seventy", "Eighty", "Ninety"};
    private static final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};

//    public String numberToWords(int num) {
//        return "";
//    }
}
