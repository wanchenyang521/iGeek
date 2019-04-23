package homeWork.guanka3;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-02 09:32
 * @description
 * 统计101-200之间有多少个素数，并输出所有素数。
 * 素数又叫质数，就是除了1和它本身之外，再也没有整数能被它整除的数
 **/
public class Test03
{
    public static void main(String[] args){

        int count = 0;
        //统计素数个数
        for(int i=101;i<=200;i++)
        {
            if(isPrime(i))
            {
                count++;
                System.out.print(i+" ");
                if(count%10==0)
                {
                    System.out.println();
                }
            }
        }
        System.out.println();
        System.out.println("共有"+count+"个素数");
    }
    //判断素数
    private static boolean isPrime(int n){
        boolean flag = true;
        if(n==1)
            flag = false;
        else
        {
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if((n%i)==0 || n==1)
                {
                    flag = false;
                    break;
                }
                else
                    flag = true;
            }
        }
        return flag;
    }

}
