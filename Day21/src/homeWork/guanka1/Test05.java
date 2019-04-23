package homeWork.guanka1;

import java.util.ArrayList;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-01 19:16
 * @description
 * 往ArrayList添加以下元素” igeek”, ” igeek2”, ” igeek3”, ” igeek4”使用增强for遍历ArrayList中的元素
 **/
public class Test05
{
    public static void main(String[] args)
    {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("igeek");
        stringArrayList.add("igeek2");
        stringArrayList.add("igeek3");
        stringArrayList.add("igeek4");
        for (String string:
             stringArrayList)
        {
            System.out.println(string);
        }
    }
}
