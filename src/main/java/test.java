import java.util.Random;

/**
 * Project name(项目名称)：第二次实验 实验2
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/24
 * Time(创建时间)： 22:24
 * Version(版本): 1.0
 * Description(描述)： 方法的重载
 * 编写一个Java应用程序Test类，实现成员方法max(a,b)的重载。具体要求如下：
 * a)编写void max(int a,int b)成员方法，对两个整数进行大小的比较，输出打印较大的那个整数。
 * b)编写void max(float a,float b)成员方法，对两个float数进行大小的比较，输出打印较大的那个float数。
 * c)编写void max(double a,double b)成员方法，对两个double数进行大小的比较，输出打印较大的那个double数。
 */

public class test
{
    public test()
    {

    }

    public void max(int a, int b)
    {
        if (a > b)
        {
            System.out.println("max is " + a);
        }
        else if (b > a)
        {
            System.out.println("max is " + b);
        }
        else
        {
            System.out.println("equal " + a);
        }
    }

    public void max(float a, float b)
    {
        if (a > b)
        {
            System.out.println("max is " + a);
        }
        else if (b > a)
        {
            System.out.println("max is " + b);
        }
        else
        {
            System.out.println("equal " + a);
        }
    }

    public void max(double a, double b)
    {
        if (a > b)
        {
            System.out.println("max is " + a);
        }
        else if (b > a)
        {
            System.out.println("max is " + b);
        }
        else
        {
            System.out.println("equal " + a);
        }
    }

    public static void main(String[] args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        test t = new test();
        t.max(1, 6);
        t.max(6.1f, 9.7f);
        t.max(9.57, 2.698);
        Random ra = new Random();
        t.max(ra.nextInt(5000), ra.nextInt(5000));
        t.max(ra.nextFloat(), ra.nextFloat());
        t.max(ra.nextDouble(), ra.nextDouble());
        System.out.println();
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        Runtime r = Runtime.getRuntime();
        float memory;
        memory = r.totalMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("JVM总内存：%.3fMB\n", memory);
        memory = r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf(" 空闲内存：%.3fMB\n", memory);
        memory = r.totalMemory() - r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("已使用的内存：%.4fMB\n", memory);
        //------------------------------------------------------
    }
}
