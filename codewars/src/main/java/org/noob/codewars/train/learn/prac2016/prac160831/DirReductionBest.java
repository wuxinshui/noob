package org.noob.codewars.train.learn.prac2016.prac160831;

import java.util.*;

/**
 * Created by FujiRen on 2016/8/31.
 */
public class DirReductionBest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String[] arr = new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
        Collections.addAll(stack, arr);
        System.out.println(stack);
        System.out.println(stack.lastElement());
        System.out.println(stack.firstElement());
        System.out.println(stack.get(0));
        System.out.println(".............................");
        stack.clear();
        stack.push("AA");
        stack.push("BB");
        System.out.println("The last element is:" + stack.lastElement());
        System.out.println("The first element is:" + stack.firstElement());
    }

    /**
     * Stack 比较入栈的最后一个元素
     * 如果等于对立方向，则删除入栈的最后一个元素
     * 否则push入栈
     *
     * @param arr
     * @return
     */
    public static String[] dirReduc01(String[] arr) {
        Stack<String> stack = new Stack<>();
        for (String direction : arr) {
            final String lastElement = stack.size() > 0 ? stack.lastElement() : null;
            switch (direction) {
                case "NORTH":
                    if ("SOUTH".equals(lastElement)) {
                        stack.pop();
                    } else {
                        stack.push(direction);
                    }
                    break;
                case "SOUTH":
                    if ("NORTH".equals(lastElement)) {
                        stack.pop();
                    } else {
                        stack.push(direction);
                    }
                    break;
                case "EAST":
                    if ("WEST".equals(lastElement)) {
                        stack.pop();
                    } else {
                        stack.push(direction);
                    }
                    break;
                case "WEST":
                    if ("EAST".equals(lastElement)) {
                        stack.pop();
                    } else {
                        stack.push(direction);
                    }
                    break;
            }

        }
        //栈stack转为String数组
        return stack.toArray(new String[stack.size()]);
    }

    /**
     * NORTHSOUTH,SOUTHNORTH,EASTWEST,WESTEAST四种组合判断
     * 是否包含i,i+1个元素组成的字符串
     * 先删除第i+1个元素，再删除第i个元素
     * <p>
     * 元素删除后返回新的List,下标从0开始。
     *
     * @param arr
     * @return
     */
    public static String[] dirReduc02(String[] arr) {
        List<String> dirs = new ArrayList<>(Arrays.asList(arr));
        for (int i = 0; i < dirs.size() - 1; i++) {
            if ("NORTHSOUTH,SOUTHNORTH,EASTWEST,WESTEAST".contains(dirs.get(i) + dirs.get(i + 1))) {
                dirs.remove(i + 1);
                dirs.remove(i);
                i = -1;
            }
        }
        //list转为String数组
        return dirs.toArray(new String[dirs.size()]);
    }

    /**
     * result.add(0, arr[i]); * 将指定的元素插入此列表中的指定位置。向右移动当前位于该位置的元素（如果有）以及所有后续元素（将其索引加 1）
     * result i-0的位置是最近add的元素
     * @param arr
     * @return
     */
    public static String[] dirReduc03(String[] arr) {
        ArrayList<String> array = new ArrayList();
        array.add("NORTHSOUTH");
        array.add("SOUTHNORTH");
        array.add("EASTWEST");
        array.add("WESTEAST");
        ArrayList<String> result=new ArrayList<>();
        for (int i = arr.length - 1; i > -1; --i) {
            if (!result.isEmpty() && array.contains(arr[i] + result.get(0))) {
                result.remove(0);
            } else {
                result.add(0, arr[i]);
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
