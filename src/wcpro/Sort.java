package wcpro;

import java.util.*;

public class Sort {
    //我的分析：
    //方法1：先将map进行排序，然后取前一百个元素。 代价：O(lgn)+O(100)
    List<Map.Entry<String,Integer>> mList=new ArrayList<Map.Entry<String,Integer>>();

    public List<Map.Entry<String,Integer>> mySort(Map<String,Integer> map){
        List<Map.Entry<String,Integer>> res=new ArrayList<Map.Entry<String,Integer>>();
        //如果map中存在单词的频率信息数据。
        //进行排序。
        //否则，返回空list。
        if(map.size()!=0) {
            mList = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
            Collections.sort(mList, new Comparator<Map.Entry<String, Integer>>() {
                public int compare(Map.Entry<String, Integer> o1,
                                   Map.Entry<String, Integer> o2) {

                        return o2.getValue()-o1.getValue();

                }
            });


            int size_t;

            if (map.size() <= 100) {
                size_t = map.size();
            } else {
                size_t = 100;
            }
            for (int i = 0; i < size_t; i++) {
                res.add(mList.get(i));
            }


            //接下来还要考虑一下，在词频相同的情况，按字母序输出。
            //由于已经得出了100大小的list->res
            //所以不必遍历所有的信息（mList），只需要在（res）中进行处理即可，这样可以节省空间和时间。

            List<Map.Entry<String, Integer>> temp = new ArrayList<Map.Entry<String, Integer>>();
            //记录不同的value（词频）
            int value_diff = res.get(0).getValue();
            int count = 0;
            //int beg=0;
            int size_r = 0;
            if (res.size() <= 100) {
                size_r = res.size();
            } else {
                size_r = 100;
            }
            while (count < size_r) {
                //如果value值相同
                if (value_diff == res.get(count).getValue()) {
                    //存入temp中
                    temp.add(res.get(count));
                } else {
                    //如果只有一个元素（没有重复的情况），就不需要排序了，说不定还会出bug
                    if (temp.size() != 1) {
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
                    value_diff = res.get(count).getValue();
                    //这里要添加第一个元素，不然下一个循环就是count+1，当前的count没有处理。
                    temp.add(res.get(count));

                }
                //到现在为止，还没有处理，count=size-1的情况（最后几个value相等，但是还没处理就跳出了while循环）
                //前面无论是，if还是else的路径，都会add当前的count对应的元素。
                if (count == size_r - 1) {
                    if (temp.size() != 1) {
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
            }
        }


        return res;
    }

    public List<Map.Entry<String,Integer>> clear(){
        mList.clear();
        return mList;
    }

    public  List<Map<String,Integer>> trans(List<Map.Entry<String,Integer>> list){
        List<Map<String,Integer>> tempList=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            Map<String,Integer> temp=new HashMap<>();
            temp.put(list.get(i).getKey(),list.get(i).getValue());
            tempList.add(i,temp);
        }
    return tempList;
    }



}
