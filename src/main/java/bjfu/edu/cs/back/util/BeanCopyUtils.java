package bjfu.edu.cs.back.util;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 类拷贝工具类
 *
 * @author 闫好真
 **/
public class BeanCopyUtils {

    private BeanCopyUtils() {

    }

    public static <V> V copyBean(Object source, Class<V> clazz) {
        //创建目标对象
        V result = null;
        try {
            result = clazz.newInstance();
            //实现属性copy
            BeanUtils.copyProperties(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //返回结果
        return result;
    }

    public static <O,V> List<V> copyBeanList(List<O> list, Class<V> clazz) {
        List<V> vList = new ArrayList<>();
        list.forEach(o -> {
            V v = copyBean(o, clazz);
            vList.add(v);
        });
        return vList;
    }

}
