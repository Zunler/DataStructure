/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ArrayList
 * Author:   pengzijun
 * Date:     2019/9/28 8:46 下午
 * Description: 动态数组
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package ADT;

/**
 * 〈一句话功能简述〉<br>
 * 〈动态数组〉
 *
 * @author pengzijun
 * @create 2019/9/28
 * @since 1.0.0
 */
public class ArrayList<AnyType> {
    private static final int DEAFAULT_CAPACITY = 4;
    private int thisSize;
    private AnyType[] elements=(AnyType[])new Object[DEAFAULT_CAPACITY];

    /**
     * 改变数组长度，实现动态数组
     * @param newCapacity
     */
    public void controlCapacity(int newCapacity) {
        if (newCapacity <= DEAFAULT_CAPACITY) {
            return;
        } else {
            AnyType[] temp = elements;
            elements = (AnyType[]) new Object[newCapacity];
            for (int i = 0; i < thisSize; i++) {
                elements[i] = temp[i];

            }
        }
    }

    public void clear() {
        thisSize = 0;
        controlCapacity(DEAFAULT_CAPACITY);
    }

    public int size() {
        return thisSize;
    }


    public void add(AnyType element,int index) {
        if(index<0||index>thisSize){
            throw new ArrayIndexOutOfBoundsException();
        }

        if(thisSize==elements.length){
            controlCapacity(2*thisSize+1);
        }
        for (int i = elements.length - 1; i > index; i--) {
            elements[i] = elements[i-1];

        }
        elements[index] = element;
        thisSize++;



    }
    public void add(AnyType element) {


        if(thisSize==elements.length){
            controlCapacity(2*thisSize+1);
        }

        elements[thisSize] = element;
        thisSize++;



    }
    public  void  showAll(){
        for (int i = 0; i <thisSize ; i++) {
            System.out.println(elements[i]);
        }
    }


    public AnyType get(int index) {
        if(index<0||index>thisSize){
            throw new ArrayIndexOutOfBoundsException();
        }

        return elements[index];
    }

    /**
     * 插入
     *
     * @param element
     * @param index
     */
    public AnyType set(AnyType element, int index) {
        if(index<0||index>thisSize){
            throw new ArrayIndexOutOfBoundsException();
        }
        AnyType old =elements[index];
        elements[index]=element;
        return old;



    }

    public boolean isEmpty() {

        return thisSize == 0 ? true : false;
    }

    public AnyType remove(int index) {
        if(index<0||index>thisSize){
            throw new ArrayIndexOutOfBoundsException();
        }

        AnyType removeItem = elements[index];
        for (int i = index; i < elements.length - 1; i++) {
            elements[i] = elements[i + 1];
        }
        thisSize--;
        return removeItem;

    }

    public int find(AnyType element) {
        for (int i = 0; i <thisSize ; i++) {
            if(elements[i]==element){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("my");
        arrayList.add("friend");
        System.out.println(arrayList.size());
        arrayList.add("bitch");
        arrayList.showAll();
        System.out.println(arrayList.find("my"));
        arrayList.remove(2);
        arrayList.showAll();
        arrayList.set("fuck",2);
        System.out.println( arrayList.get(2));
        arrayList.add("suck",2);
        arrayList.showAll();



    }
}