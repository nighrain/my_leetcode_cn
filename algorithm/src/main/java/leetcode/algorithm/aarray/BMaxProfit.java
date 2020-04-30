package leetcode.algorithm.aarray;

/**
 *    
 * Title         [title]
 * Author:       [..]
 * CreateDate:   [2020-04-30--16:02]  @_@ ~~
 * Version:      [v1.0]
 * Description:  [买卖股票的最佳时机 II]
 * <p>
 *     给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * </p>
 * <pre>
 * 示例 1:
 * 输入: [7,1,5,3,6,4]
 * 输出: 7
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出,
 *          这笔交易所能获得利润 = 5-1 = 4 。
 *      随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格 = 6）的时候卖出,
 *          这笔交易所能获得利润 = 6-3 = 3 。
 * </pre>
 * <pre>
 * 示例 2:
 * 输入: [1,2,3,4,5]
 * 输出: 4
 * 解释: 在第 1 天（股票价格 = 1）的时候买入，在第 5 天 （股票价格 = 5）的时候卖出,
 *          这笔交易所能获得利润 = 5-1 = 4 。
 *      注意你不能在第 1 天和第 2 天接连购买股票，之后再将它们卖出。
 *      因为这样属于同时参与了多笔交易，你必须在再次购买前出售掉之前的股票。
 * </pre>
 * <pre>
 * 示例 3:
 * 输入: [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 * </pre>
 * <pre>{@code
 *
 *     提示：
 *      1 <= prices.length <= 3 * 10 ^ 4
 *      0 <= prices[i] <= 10 ^ 4
 * }
 * </pre>
 */
public class BMaxProfit {
    public static void main(String[] args) {
//        int[] prices = {7,1,5,3,6,4};
        int[] prices = {1,2,3,4,5};
//        int[] prices = {1,2};
//        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
//    public static int maxProfit(int[] prices){
//        int length = prices.length;
//        int current = 0;
//        int allPrice = 0;
//        //TODO: 当前项a和后一项b比较,若a<b则买入,直到相邻两项是a>b,则卖出;
//        for (int i = 0; i < length-1; i++) {
//            int left = prices[i];
//            if (current == 0 && left < prices[i+1]){
//                //买入
//                current = left;
//                System.out.println("买入:"+left);
//                for (int outDay = i; outDay < length-1; outDay++) {
//                    int outPrice = prices[outDay];
//                    if(outPrice > prices[outDay+1]){
//                        //卖出
//                        System.out.println("卖出:"+ outPrice);
//                        allPrice = allPrice + outPrice - left;
//                        current = 0;
//                        i = outDay;
//                        break;
//                    }
//                    if(outDay + 1 == prices.length - 1){
//                        outPrice = prices[outDay + 1];
//                        System.out.println("卖出:"+ outPrice);
//                        allPrice = allPrice + outPrice - left;
//                        current = 0;
//                        i = outDay + 1;
//                        break;
//                    }
//                }
//            }
//        }
//        return allPrice;
//    }

    //最快解法
    public static int maxProfit(int[] prices){
        int left = prices[0];
        int result = 0;
        for (int price : prices) {
            if (left < price) {
                result += price - left;
            }
            left = price;
        }
        return result;
    }

}
