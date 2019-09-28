/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: List
 * Author:   pengzijun
 * Date:     2019/9/26 4:48 下午
 * Description: 线性表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package ADT;
/**
 * 〈一句话功能简述〉<br>
 * 〈线性表〉
 * 顺序储存
 *
 * @author pengzijun
 * @create 2019/9/26
 * @since 1.0.0e
 */
public class List<AnyType> {
    private AnyType[] elements;
    private int size = 20;
    private int count = 0;

    /**
     * 初始化顺序表
     * @param size
     */
    public void initList(int size) {

        this.size = size;
        elements = (AnyType[]) new Object[size];
    }

    /**
     *
     * @return
     */
    public boolean listEmpty() {
        if (count != 0) {
            return false;
        }
        return true;
    }
    public boolean clearList() {
        elements = (AnyType[]) new Object[size];
        count = 0;
        return true;
    }
    public AnyType getElem(int index) {
        if (index > 0 && index < count) {
            return elements[index - 1];
        }
        return null;
    }
    public int locateElem(AnyType element) {
        for (int i = 0; i < count; i++) {
            if (elements[i] == element) {
                return i;
            }
        }
        return -1;
    }
    public boolean listInsert(AnyType element, int index) {
        /**
         * 不存在于线性表中的元素才可以插入
         */
        if (locateElem(element) == -1 && count != size) {
            for (int i = count - 1; i > index - 1; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = element;
            count++;
            return true;
        }
        return false;
    }
    public boolean listDelete(AnyType element) {
        int index = locateElem(element);
        if (index != -1) {
            for (int i = index; i < count - 1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[count - 1] = null;
            count--;
            return true;
        }
        return false;
    }
    public int listLength() {
        return count;
    }
    public void show() {
        for (AnyType element : elements) {
            if (element != null) {
                System.out.println(element);
            }
        }
    }
}