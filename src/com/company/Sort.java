package com.company;

import java.util.*;

public class Sort {
    //我的分析：
    //方法1：先将map进行排序，然后取前一百个元素。 代价：O(lgn)+O(100)

    public List<Map.Entry<String,Integer>> mySort(Map<String,Integer> map){
        int edge=100;
        List<Map.Entry<String,Integer>> res=new ArrayList<Map.Entry<String,Integer>>();
        if(map.size()!=0) {
            List<Map.Entry<String, Integer>> mList = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
            Collections.sort(mList, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1,
                                   Map.Entry<String, Integer> o2) {
                    if (!o2.getValue().equals(o1.getValue())) {
                        return o2.getValue() - o1.getValue();
                    } else {
                        return o1.getKey().compareTo(o2.getKey());
                    }
                }
            });


            int sizet;

            if (map.size() <= edge) {
                sizet = map.size();
            } else {
                sizet = edge;
            }
            for (int i = 0; i < sizet; i++) {
                res.add(mList.get(i));
            }
        }


        //接下来还要考虑一下，在词频相同的情况，按字母序输出。
        //由于已经得出了100大小的list->res
        //所以不必遍历所有的信息（mList），只需要在（res）中进行处理即可，这样可以节省空间和时间。

        /*List<Map.Entry<String,Integer>> temp=new ArrayList<Map.Entry<String,Integer>>();
        //记录不同的value（词频）
        int value_diff=res.get(0).getValue();
        int count=0;
        //int beg=0;
        int size_r=0;
        if(res.size()<=100){size_r=res.size();}
        else{size_r=100;}
        while(count<size_r){
            //如果value值相同
            if(value_diff==res.get(count).getValue()){
                //存入temp中    
                temp.add(res.get(count));
            }
            else{
                //如果只有一个元素（没有重复的情况），就不需要排序了，说不定还会出bug
                if(temp.size()!=1) {
                    //对当前的temp进行排序（按key值）
                    Collections.sort(temp, new Comparator<Map.Entry<String, Integer>>() {
                        public int compare(Map.Entry<String, Integer> o1,
                                           Map.Entry<String, Integer> o2) {
                            return o1.getKey().compareTo(o2.getKey());
                        }
                    });
                    //替换temp中的元素到res中

                    //注：之所以这里i的取值和函数最后的i的取值不同（相差1）
                    //是因为，这里当前的count对应的元素是不符合要求的，不在当前的temp里的。
                    //而后面的count是符合要求的，已经添加到temp之中的。
                    for (int i = count - temp.size(); i < count; i++) {
                        //这里temp.get(i)应该是从0下标开始。
                        res.set(i, temp.get(i + temp.size() - count));
                    }
                }
                //清空temp，value_diff改成下一个值
                temp.clear();
                value_diff=res.get(count).getValue();
                //这里要添加第一个元素，不然下一个循环就是count+1，当前的count没有处理。
                temp.add(res.get(count));

            }
            //到现在为止，还没有处理，count=size-1的情况（最后几个value相等，但是还没处理就跳出了while循环）
            //前面无论是，if还是else的路径，都会add当前的count对应的元素。
            if(count==size_r-1){
                if(temp.size()!=1) {
                    Collections.sort(temp, new Comparator<Map.Entry<String, Integer>>() {
                        public int compare(Map.Entry<String, Integer> o1,
                                           Map.Entry<String, Integer> o2) {
                            return o1.getKey().compareTo(o2.getKey());
                        }
                    });
                    //替换temp中的元素到res中
                    //这里i的范围略有不同，因为当前count的元素已经添加
                    for (int i = count - temp.size() + 1; i <= count; i++) {
                        res.set(i, temp.get(i + temp.size() - count - 1));
                    }
                }
            }

            count++;
        }*/

        return res;
    }

    public List<Map.Entry<String,Integer>> mySort2(Map<String,Integer> map) {
        int edge=100;
        List<Map.Entry<String, Integer>> res = new ArrayList<Map.Entry<String, Integer>>();
        if (map.size() != 0) {
            List<Map.Entry<String, Integer>> mList = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
            Collections.sort(mList, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1,
                                   Map.Entry<String, Integer> o2) {

                        return o2.getValue() - o1.getValue();
                }
            });

            //int edge=100;
            int sizet;
            if (map.size() <= edge) {
                sizet = map.size();
            } else if(!mList.get(edge-1).getValue().equals(mList.get(edge).getValue())){
                sizet = 100;
            }else{
                int maxEdge=edge;
                while(mList.get(maxEdge).getValue().equals(mList.get(edge).getValue())){
                    maxEdge++;
                }
                sizet=maxEdge;
            }
            for (int i = 0; i < sizet; i++) {
                res.add(mList.get(i));
            }
        }



        List<Map.Entry<String,Integer>> temp=new ArrayList<Map.Entry<String,Integer>>();
        //记录不同的value（词频）
        int valueDiff=res.get(0).getValue();
        int count=0;
        //int beg=0;
        int sizer=0;
        if(res.size()<=edge){sizer=res.size();}
        else{sizer=res.size();}
        while(count<sizer){
            //如果value值相同
            if(valueDiff==res.get(count).getValue()){
                //存入temp中
                temp.add(res.get(count));
            }
            else{
                //如果只有一个元素（没有重复的情况），就不需要排序了，说不定还会出bug
                if(temp.size()!=1) {
                    //对当前的temp进行排序（按key值）
                    Collections.sort(temp, new Comparator<Map.Entry<String, Integer>>() {
                        @Override
                        public int compare(Map.Entry<String, Integer> o1,
                                           Map.Entry<String, Integer> o2) {
                            return o1.getKey().compareTo(o2.getKey());
                        }
                    });
                    //替换temp中的元素到res中

                    //注：之所以这里i的取值和函数最后的i的取值不同（相差1）
                    //是因为，这里当前的count对应的元素是不符合要求的，不在当前的temp里的。
                    //而后面的count是符合要求的，已经添加到temp之中的。
                    for (int i = count - temp.size(); i < count; i++) {
                        //这里temp.get(i)应该是从0下标开始。
                        res.set(i, temp.get(i + temp.size() - count));
                    }
                }
                //清空temp，value_diff改成下一个值
                temp.clear();
                valueDiff=res.get(count).getValue();
                //这里要添加第一个元素，不然下一个循环就是count+1，当前的count没有处理。
                temp.add(res.get(count));

            }
            //到现在为止，还没有处理，count=size-1的情况（最后几个value相等，但是还没处理就跳出了while循环）
            //前面无论是，if还是else的路径，都会add当前的count对应的元素。
            if(count==sizer-1){
                if(temp.size()!=1) {
                    Collections.sort(temp, new Comparator<Map.Entry<String, Integer>>() {
                        @Override
                        public int compare(Map.Entry<String, Integer> o1,
                                           Map.Entry<String, Integer> o2) {
                            return o1.getKey().compareTo(o2.getKey());
                        }
                    });
                    //替换temp中的元素到res中
                    //这里i的范围略有不同，因为当前count的元素已经添加
                    for (int i = count - temp.size() + 1; i <= count; i++) {
                        res.set(i, temp.get(i + temp.size() - count - 1));
                    }
                }
            }

            count++;
        }
        if(res.size()>edge){
            for(int i=edge;i<res.size();i++){
                res.remove(i);
            }
        }


        return res;

    }
    }



// 1. 任何二目、三目运算符的左右两边都需要加一个空格。
// 2. 大括号的使用约定。
//              如果是大括号内为空，则简洁地写成{}即可，不需要换行；
//              如果是非空代码块则：
//                              1） 左大括号前不换行。
//                              2） 左大括号后换行。
//                              3） 右大括号前换行。
//                              4） 右大括号后还有else等代码则不换行；表示终止的右大括号后必须换行。
// 3. 在函数传参过程中直接传递和定义匿名类好像不太好，具体我没有找到依据。。