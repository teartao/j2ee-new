package com.tao;


/**
 * Created by taolei on 2017/5/19.
 * 暴力破解算法
 */
public class CrackTest {
    public static void main(String[] args)
    {
        Console.write(System.currentTimeMillis());//开始时间

        int maxLength = 10; //设置可能最长的密码长度
        CrackPass(maxLength);

        Console.write(System.currentTimeMillis());//结束时间
        Console.Read();

    }
    //密码可能会包含的字符集合
    static char[] charSource = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n',  'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
    static int sLength = charSource.length; //字符集长度
    //得到长度为len所有的密码组合，在字符集charSource中
    //递归表达式：fn(n)=fn(n-1)*sLenght; 大致是这个意思吧
    private static void Crack(char[] list, int len)
    {
        if (len == 0)
        {  //递归出口，list char[] 转换为字符串，并打印
            Console.write(ArrayToString(list));
        }
        else
        {
            for (int i = 0; i < sLength; i++)
            {
                list[len - 1] = charSource[i];
                Crack(list, len - 1);
            }
        }
    }
    //list char[] 转换为字符串
    private static String ArrayToString(char[] list)
    {
        if (list == null||list.length == 0)
            return "";
        StringBuilder buider = new StringBuilder(list.length*2);
        for (int i = 0; i < list.length; i++)
        {
            buider.append(list[i]);
        }
        return buider.toString();

    }
    //得到密码长度从 1到maxLength的所有不同长的密码集合
    public static void CrackPass(int maxLength)
    {
        for (int i = 0; i < maxLength; i++)
        {
            char[] list =new char[i];
            Crack(list, i);
        }

    }
}