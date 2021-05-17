package com.nicebin.blank.test;

/**
 * @author SerenaChen
 * @Description:
 * @date 2021/5/1719:39
 */
public class JVMHeadTest {

    public final static int OUTOFMEMORY = 200000000;

    private String oom;

    private int length;

    StringBuffer tempOOM = new StringBuffer();

    public JVMHeadTest(int leng) {
        this.length = leng;

        int i = 0;
        // 写个死循环进行监控
        boolean isLoop = i == leng ? true : i < leng;
        
        while (isLoop) {
            i++;
            try {
                tempOOM.append("a");
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
                break;
            }
        }
        this.oom = tempOOM.toString();

    }

    public String getOom() {
        return oom;
    }

    public int getLength() {
        return length;
    }

    public static void main(String[] args) {
        JVMHeadTest javaHeapTest = new JVMHeadTest(OUTOFMEMORY);
        System.out.println(javaHeapTest.getOom().length());
    }
}
