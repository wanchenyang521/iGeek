package Collect;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-02 14:10
 * @description
 **/

public class CopyArrayList<E> {

    private Object[] elementData;
    private int size;

    private static final int DEFAULT_CAPACITY = 10;

    public CopyArrayList() {
        super();
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public CopyArrayList(int initialCapacity) {
        super();
        if(initialCapacity <0) {
            throw new IllegalArgumentException("Illegal Capacity");
        }
        else if(initialCapacity ==0) {
            elementData = new Object[DEFAULT_CAPACITY];
        } else {
            elementData = new Object[initialCapacity];
        }
    }

    //添加
    public void add(E e) {
        //什么时候扩容？
        if(size == elementData.length) {
            Object[] newArray = new Object[elementData.length + (elementData.length >> 1)];
            //拷贝
            System.arraycopy(elementData, 0, newArray, 0, elementData.length);
            elementData = newArray;
        }
        elementData[size++] = e;
    }

    //获取元素
    public E get(int index) {
        checkRange(index);
        return (E)elementData[index];
    }

    //设值
    public void set(E element,int index) {
        checkRange(index);
        elementData[index] = element;
    }

    //检查
    public void checkRange(int index) {
        //判断索引是否合法 [0,size-1]
        if(index<0 || index >size-1) {
            throw new RuntimeException("索引异常:"+index);
        }
    }

    //删除元素
    public void remove(E element) {

        //element ,将它和集合中的所有元素依次挨个比较，获得第一个比较为true的话
        for(int i = 0; i<size; i++) {
            if(element.equals(get(i))) {
                //将该元素删除
                remove(i);
            }
        }
    }

    //删除元素（index）
    public void remove(int index) {
        //a,b,c,d,e,f,g,h
        //a,b,c,e,f,g,h,h
        int numMoved = elementData.length - index - 1;
        if(numMoved > 0) {
            System.arraycopy(elementData, index+1, elementData, index, numMoved);
        }
        elementData[--size] = null; // clear to let GC do its work
    }

    //返回元素个数
    public int size() {
        return size;
    }

    //判断为空
    public boolean isEmpty() {
        return size == 0 ;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        //[hello,java]
        sb.append("[");
        for(int i = 0; i < size ; i++) {
            sb.append(elementData[i]+",");
        }
        sb.setCharAt(sb.length()-1, ']');

        return sb.toString();
    }

    public static void main(String[] args) {
        CopyArrayList<Integer> arrayList = new CopyArrayList<Integer>();
        for(int i=0;i<40;i++) {
            arrayList.add(i+1);
        }
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        arrayList.remove(3);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());

    }



}
