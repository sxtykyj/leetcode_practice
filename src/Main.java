import java.util.*;
//
///**
// * @Author: yk
// * @Date: 2019/9/9 6:46
// */
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//        int size = in.nextInt();
//        int[] num = new int[size];
//        int k = 0;
//        while (in.hasNext()) {
//            num= in.;
//        }
//
//        int[] num = {2, 4, -2, 5, -6};
//        int sum = num[0];
//        int res = num[0];
//        for (int i = 1; i < num.length; i++) {
//            sum += num[i];
//            res = res > sum ? res : sum;
//        }
//        System.out.println(res);
//    }
//}


//import java.util.*;
//
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//        int[] num = new int[201];
//        int k = 0;
//        while (in.hasNext()) {
//            num[k++] = in.nextInt();
//        }
//
//        int sum = num[0];
//        int res = num[0];
//        for (int i = 1; i < num.length; i++) {
//            sum += num[i];
//            res = res > sum ? res : sum;
//        }
//        System.out.println(res);
//    }
//}


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String tmp = in.next();
        for(int k = 0;k<)

        int size1 = tmp1.length();
        int size2 = tmp2.length();
        String res = "True";
        char[] c1 = new char[size1];
        char[] c2 = new char[size2];

        if (size1 != size2) {
            res = "False";
        } else if (size1 > 1) {
            for (int i = 0; i < size1; i++) {
                c1[i] = tmp1.charAt(i);
                c2[i] = tmp2.charAt(i);
            }
            Arrays.sort(c1);
            Arrays.sort(c2);
            for (int j = 1; j < size1; j++) {
                if (c1[j] == c1[j - 1] && c2[j] != c2[j - 1]) {
                    res = "False";
                }
                if (c1[j] != c1[j - 1] && c2[j] == c2[j - 1]) {
                    res = "False";
                }
            }
        }
        System.out.println(res);
    }
}

//    public static void main(String[] args) {
//
//        //String[] num = {"true","false", "and", "false"};
//
//        Scanner in = new Scanner(System.in);
//        String[] num = new String[256];
//        int k = 0;
//        while (in.hasNext()) {
//            num[k++] = in.next();
//        }
//        int j = -1;
//        for (int i = 0; i < num.length; i++) {
//            String[] tmp = num[i].split(" ");
//            judge(tmp);
//        }
//
//    }
//
//    public static void judge(String[] num) {
//        Stack<String> stack = new Stack<>();
//        String res = "error";
//        int label = 0;
//        if (num.length == 0) {
//            label = 1;
//        } else if (num[0] == "or" || num[0] == "and") {
//            label = 1;
//        }
//        stack.push(num[0]);
//        for (int i = 1; i < num.length; i++) {
//            if (label == 1) {
//                break;
//            }
//            stack.push(num[i]);
//            if (num[i - 1].equals("and")) {
//                stack.pop();
//                stack.pop();
//                String tmp = (stack.peek() == "true" && num[i] == "true") ? "true" : "false";
//                stack.pop();
//                stack.push(tmp);
//            }
//        }
//        while (!stack.empty()) {
//            if (label == 1) {
//                break;
//            }
//            if (stack.peek() == "or") {
//                stack.pop();
//            } else {
//                res = stack.peek() == "true" ? "true" : "false";
//                stack.pop();
//            }
//        }
//        System.out.println(res);
//    }
