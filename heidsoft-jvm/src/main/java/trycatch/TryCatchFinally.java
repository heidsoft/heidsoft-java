package trycatch;

/**
 * finally的代码在return之后执行
 * @program: heidsoft-java
 * @description: 测试finally
 * @author: heidsoft
 * @create: 2018-12-24 17:30
 **/
public class TryCatchFinally {
    static int x = 1;
    static int y = 10;
    static int z = 100;

    public static void main(String[] args) {
        int value = finallyReturn();
        System.out.println("value="+value);
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
    }

    public static int finallyReturn(){
        try{
            return ++x;
        }catch (Exception ex){
            return ++y;
        }finally {
            return ++z;
        }
    }
}
