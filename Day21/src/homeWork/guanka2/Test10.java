package homeWork.guanka2;

import java.util.ArrayList;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-02 09:26
 * @description
 * 编写一个deleteElements方法，
 * 接收一个ArrayList,ArrayList中存放元素的类型不确定，
 * 在deleteElements方法的删除ArrayList中的第一个和最后一个元素
 **/
public class Test10
{
    public static void main(String[] args)
    {
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("q");
        stringArrayList.add("w");
        stringArrayList.add("e");
        stringArrayList.add("r");
        deleteElements(stringArrayList);
        System.out.println(stringArrayList);

    }
    public static void deleteElements(ArrayList<?> array)
    {
        array.remove(0);
        array.remove(array.size()-1);
    }
}
