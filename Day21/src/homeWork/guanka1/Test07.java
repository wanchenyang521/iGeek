package homeWork.guanka1;


/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-01 19:33
 * @description
 **/
public class Test07
{
    public static void main(String[] args)
    {
        MyClassType07<String> myClassType = new MyClassType07<String>();
        myClassType.setMyFiled("wcy");
        String name = myClassType.getMyFiled();
        System.out.println(name);
    }
}
