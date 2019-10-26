package cn.tedu.Arraysdemo;

import java.util.Arrays;

public class Test3_Score {
    public static void main(String[] args) {
        int[] scores = {100, 95, 99, 98, 96};

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("总成绩：" + sum);

        int avg = sum/scores.length;
        System.out.println("平均分："+ avg);

        Arrays.sort(scores);
        System.out.println("从低分到高分排序："+Arrays.toString(scores));

        System.out.println("最高分是："+ scores[scores.length-1]);
        System.out.println("最低分是："+ scores[0]);
    }
}
