package passed;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author: yk
 * @Date: 2019/9/6 16:35
 */
public class L973_KClosestPointsToOrigin {

    //method 1 _31ms
    public int[][] kClosest1(int[][] points, int K) {
        if (points.length < 2) {
            return points;
        }
        int[][] res = new int[K][];
        PriorityQueue<Pair<Double, Integer>> pq = new PriorityQueue<>(K+1, new Comparator<Pair<Double, Integer>>() {
            @Override
            public int compare(Pair<Double, Integer> o1, Pair<Double, Integer> o2) {
                return (int)(o1.getKey() - o2.getKey());
            }
        });

        for (int i = 0; i < points.length; i++) {
            double dis = Math.pow(points[i][0], 2) + Math.pow(points[i][1], 2);
            pq.add(new Pair<>(dis, i));
        }

        for (int j = 0; j < K; j++) {
            res[j] = points[pq.poll().getValue()];
        }
        return res;
    }

    //method 2 _4ms
    public int[][] kClosest2(int[][] points, int K) {
        int len =  points.length, l = 0, r = len - 1;
        while (l <= r) {
            int mid = helper(points, l, r);
            if (mid == K) {break;}
            if (mid < K) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return Arrays.copyOfRange(points, 0, K);
    }

    private int helper(int[][] A, int l, int r) {
        int[] pivot = A[l];
        while (l < r) {
            while (l < r && compare(A[r], pivot) >= 0) r--;
            A[l] = A[r];
            while (l < r && compare(A[l], pivot) <= 0) l++;
            A[r] = A[l];
        }
        A[l] = pivot;
        return l;
    }

    private int compare(int[] p1, int[] p2) {
        return p1[0] * p1[0] + p1[1] * p1[1] - p2[0] * p2[0] - p2[1] * p2[1];
    }

}
