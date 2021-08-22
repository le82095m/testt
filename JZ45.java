package jz;

import java.util.Arrays;

/**
 *
 * 现在有2副扑克牌，从扑克牌中随机五张扑克牌，我们需要来判断一下是不是顺子。
 * 有如下规则：
 * 1. A为1，J为11，Q为12，K为13，A不能视为14
 * 2. 大、小王为 0，0可以看作任意牌
 * 3. 如果给出的五张牌能组成顺子（即这五张牌是连续的）就输出true，否则就输出false。
 * 例如：给出数据[6,0,2,0,4]
 * 中间的两个0一个看作3，一个看作5 。即：[6,3,2,5,4]
 * 这样这五张牌在[2,6]区间连续，输出true
 * 数据保证每组5个数字，每组最多含有4个零，数组的数取值为 [0, 13]
 *
 */

public class JZ45 {
        public boolean IsContinuous(int [] numbers) {
            Arrays.sort(numbers);
            int joker = 0;
            for (int a : numbers) {
                if (a == 0) {
                    joker++;
                }
            }

            for (int i = joker; i < numbers.length - 1; i++) {
                int num = numbers[i + 1] - numbers[i];
                while (joker > 0 && num != 1) {
                    joker--;
                    num--;
                }
                if (num != 1) {
                    return false;
                }
            }
            return true;
        }
}
