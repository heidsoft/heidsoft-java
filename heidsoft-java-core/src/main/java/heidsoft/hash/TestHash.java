package heidsoft.hash;

/**
 * @author heidsoft
 * hash 计算，按进制返回指定字符串的整数
 */
public class TestHash {

    //Wang/Jenkins hash算法
    //http://d0evi1.cn/wang-jenkins-hash/
    private static int hash(int h) {
        h += (h << 15) ^ 0xffffcd7d;
        h ^= (h >>> 10);
        h += (h << 3);
        h ^= (h >>> 6);
        h += (h << 2) + (h << 14);
        return h ^ (h >>> 16);
    }

    public static void main(String[] args) {
        System.out.println(Integer.parseInt("00011111", 2) & 15);
        System.out.println(Integer.parseInt("00111111", 2) & 15);
        System.out.println(Integer.parseInt("01111111", 2) & 15);
        System.out.println(Integer.parseInt("11111111", 2) & 15);
        System.out.println(Integer.parseInt("11111111", 2));
        //System.out.println(Integer.parseInt("ffffcd7d",16) );
        System.out.println(hash(1));
    }
}
