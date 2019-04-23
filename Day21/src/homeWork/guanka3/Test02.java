package homeWork.guanka3;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-02 09:29
 * @description
 **/
public class Test02
{
    public static void main(String[] args) {
        System.out.println(sum(52.0, 521));
    }


    public static <T extends Number> double sum(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

}
