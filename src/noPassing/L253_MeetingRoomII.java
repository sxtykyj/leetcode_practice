package noPassing;

import java.util.*;

/**
 * @Author: yk
 * 未完成
 * @Date: 2019/9/6 20:50
 */
public class L253_MeetingRoomII {

//    public static void main(String[] args) {
//        int[][] tmp = {{9, 10}, {4, 9}, {4, 17}};
//        System.out.println(minMeetingRooms(tmp));
//    }
//
//    public static int minMeetingRooms(int[][] intervals) {
//        if (intervals == null || intervals.length == 0) {
//            return 0;
//        }
//        if (intervals.length == 1) {
//            return 1;
//        }
//        int res = 0;
//        Queue<Integer> pq = new PriorityQueue<>(intervals.length, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        });
//
//        for (int i = 0; i < intervals.length; i++) {
//            if (tmp.contains(intervals[i][1]) || tmp.peek() <= intervals[i][0]) {
//                if (!tmp.empty()) {
//                    tmp.pop();
//                }
//            } else {
//                tmp.pop();
//                res++;
//            }
//            tmp.push(intervals[i][1]);
//        }
//        if (!tmp.empty()) {
//            res++;
//        }
//        return res;
//    }
}
