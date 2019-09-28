/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Test
 * Author:   pengzijun
 * Date:     2019/9/28 4:43 下午
 * Description: 测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package ADT;

/**
 * 〈一句话功能简述〉<br>
 * 〈测试〉
 *
 * @author pengzijun
 * @create 2019/9/28
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        List list = new List();
        list.initList(3);
        System.out.println("isempty: "+list.listEmpty());
        list.listInsert("fuck", 0);
        list.listInsert("you", 1);
        list.listInsert("mother", 1);
        System.out.println(list.listInsert("father", 1));
        System.out.println(list.locateElem("fuck"));
        System.out.println(list.locateElem("fu"));

        list.listDelete("fuck");
        System.out.println("isEmpty: " + list.listEmpty());
        list.show();
        System.out.println(list.listLength());


    }
}