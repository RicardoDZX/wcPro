package test.wcpro;

import org.junit.After;

import org.junit.Before;
import org.junit.Test;

import wcpro.Sort;
import static org.junit.Assert.assertEquals;
import java.util.*;



/**
 * Sort Tester.
 *
 * @author <Authors name>
 * @since <pre> 2, 2018</pre>
 * @version 1.0
 */

public class SortTest {


    private Sort mSort=new Sort();

    //public List<List<Map.Entry<String,Integer>>> testList=new ArrayList<>();


    //public  List<List<Map.Entry<String,Integer>>> getParams() {
    // List<List<Map.Entry<String,Integer>>> testList=new ArrayList<>();


    //}





    @Before
    public void before() throws Exception {
        //mSort.clear();
    }

    @After
    public void after() throws Exception {
        // mSort.clear();
    }

    /**
     *
     * Method: mySort(Map<String,Integer> map)
     *
     */
    @Test
    public void testMySort1() throws Exception {
//TODO: Test goes here...
        Map<String,Integer> map1=new HashMap<>();
        map1.put("bbb",100);
        map1.put("abb",100);
        List<Map<String, Integer>> list=new ArrayList<>();

        Map<String,Integer> temp=new HashMap<>();
        temp.clear();
        temp.put("abb",100);
        list.add(temp);


        Map<String,Integer> temp2=new HashMap<>();
        temp2.clear();
        temp2.put("bbb",100);
        list.add(temp2);
        List<Map.Entry<String,Integer>> p=mSort.mySort(map1);
        List<Map<String,Integer>> res=mSort.trans(p);
        assertEquals("WRONG",list,res);

    }


    @Test
    public void testMySort2() throws Exception {
//TODO: Test goes here...
        Map<String,Integer> map1=new HashMap<>();
        map1.put("bbb",100);
        map1.put("aaa",99);
        List<Map<String, Integer>> list=new ArrayList<>();

        Map<String,Integer> temp=new HashMap<>();
        temp.clear();
        temp.put("bbb",100);
        list.add(temp);


        Map<String,Integer> temp2=new HashMap<>();
        temp2.clear();
        temp2.put("aaa",99);
        list.add(temp2);
        List<Map.Entry<String,Integer>> p=mSort.mySort(map1);
        List<Map<String,Integer>> res=mSort.trans(p);
        assertEquals("WRONG",list,res);

    }

    @Test
    public void testMySort3() throws Exception {
//TODO: Test goes here...
        Map<String,Integer> map1=new HashMap<>();
        map1.put("bbb",100);
        List<Map<String, Integer>> list=new ArrayList<>();

        Map<String,Integer> temp=new HashMap<>();
        temp.clear();
        temp.put("bbb",100);
        list.add(temp);


        List<Map.Entry<String,Integer>> p=mSort.mySort(map1);
        List<Map<String,Integer>> res=mSort.trans(p);
        assertEquals("WRONG",list,res);

    }

    @Test
    public void testMySort4() throws Exception {
//TODO: Test goes here...
        Map<String,Integer> map1=new HashMap<>();
        map1.put("abb",100);
        map1.put("acb",100);
        List<Map<String, Integer>> list=new ArrayList<>();

        Map<String,Integer> temp=new HashMap<>();
        temp.clear();
        temp.put("abb",100);
        list.add(temp);


        Map<String,Integer> temp2=new HashMap<>();
        temp2.clear();
        temp2.put("acb",100);
        list.add(temp2);
        List<Map.Entry<String,Integer>> p=mSort.mySort(map1);
        List<Map<String,Integer>> res=mSort.trans(p);
        assertEquals("WRONG",list,res);

    }

    @Test
    public void testMySort5() throws Exception {
//TODO: Test goes here...
        Map<String,Integer> map1=new HashMap<>();
        map1.put("abb",100);
        map1.put("abc",100);
        List<Map<String, Integer>> list=new ArrayList<>();

        Map<String,Integer> temp=new HashMap<>();
        temp.clear();
        temp.put("abb",100);
        list.add(temp);


        Map<String,Integer> temp2=new HashMap<>();
        temp2.clear();
        temp2.put("abc",100);
        list.add(temp2);
        List<Map.Entry<String,Integer>> p=mSort.mySort(map1);
        List<Map<String,Integer>> res=mSort.trans(p);
        assertEquals("WRONG",list,res);

    }

    @Test
    public void testMySort6() throws Exception {
//TODO: Test goes here...
        Map<String,Integer> map1=new HashMap<>();
        map1.put("abbe",100);
        map1.put("abbd",100);
        List<Map<String, Integer>> list=new ArrayList<>();

        Map<String,Integer> temp=new HashMap<>();
        temp.clear();
        temp.put("abbd",100);
        list.add(temp);


        Map<String,Integer> temp2=new HashMap<>();
        temp2.clear();
        temp2.put("abbe",100);
        list.add(temp2);
        List<Map.Entry<String,Integer>> p=mSort.mySort(map1);
        List<Map<String,Integer>> res=mSort.trans(p);
        assertEquals("WRONG",list,res);

    }

    @Test
    public void testMySort7() throws Exception {
//TODO: Test goes here...
        Map<String,Integer> map1=new HashMap<>();
        map1.put("a",100);
        map1.put("b",101);
        map1.put("c",102);
        List<Map<String, Integer>> list=new ArrayList<>();

        Map<String,Integer> temp=new HashMap<>();
        temp.clear();
        temp.put("c",102);
        list.add(temp);
        Map<String,Integer> temp2=new HashMap<>();
        temp2.clear();
        temp2.put("b",101);
        list.add(temp2);
        Map<String,Integer> temp3=new HashMap<>();
        temp3.clear();
        temp3.put("a",100);
        list.add(temp3);
        List<Map.Entry<String,Integer>> p=mSort.mySort(map1);
        List<Map<String,Integer>> res=mSort.trans(p);
        assertEquals("WRONG",list,res);

    }

    @Test
    public void testMySort8() throws Exception {
//TODO: Test goes here...
        Map<String,Integer> map1=new HashMap<>();
        map1.put("a",100);
        map1.put("ab",101);
        map1.put("bc",102);
        List<Map<String, Integer>> list=new ArrayList<>();

        Map<String,Integer> temp=new HashMap<>();
        temp.clear();
        temp.put("bc",102);
        list.add(temp);
        Map<String,Integer> temp2=new HashMap<>();
        temp2.clear();
        temp2.put("ab",101);
        list.add(temp2);
        Map<String,Integer> temp3=new HashMap<>();
        temp3.clear();
        temp3.put("a",100);
        list.add(temp3);
        List<Map.Entry<String,Integer>> p=mSort.mySort(map1);
        List<Map<String,Integer>> res=mSort.trans(p);
        assertEquals("WRONG",list,res);

    }

    @Test
    public void testMySort9() throws Exception {
//TODO: Test goes here...
        Map<String,Integer> map1=new HashMap<>();
        map1.put("a",100);
        map1.put("ab",100);
        map1.put("bc",102);
        List<Map<String, Integer>> list=new ArrayList<>();

        Map<String,Integer> temp=new HashMap<>();
        temp.clear();
        temp.put("bc",102);
        list.add(temp);
        Map<String,Integer> temp2=new HashMap<>();
        temp2.clear();
        temp2.put("a",100);
        list.add(temp2);
        Map<String,Integer> temp3=new HashMap<>();
        temp3.clear();
        temp3.put("ab",100);
        list.add(temp3);
        List<Map.Entry<String,Integer>> p=mSort.mySort(map1);
        List<Map<String,Integer>> res=mSort.trans(p);
        assertEquals("WRONG",list,res);

    }

    @Test
    public void testMySort10() throws Exception {
//TODO: Test goes here...
        Map<String,Integer> map1=new HashMap<>();
        map1.put("aaaa",100);
        map1.put("aaa",100);
        List<Map<String, Integer>> list=new ArrayList<>();
        Map<String,Integer> temp=new HashMap<>();
        temp.clear();
        temp.put("aaa",100);
        list.add(temp);
        Map<String,Integer> temp2=new HashMap<>();
        temp2.clear();
        temp2.put("aaaa",100);
        list.add(temp2);
        List<Map.Entry<String,Integer>> p=mSort.mySort(map1);
        List<Map<String,Integer>> res=mSort.trans(p);
        assertEquals("WRONG",list,res);

    }

    @Test
    public void testMySort11() throws Exception {
//TODO: Test goes here...
        Map<String,Integer> map1=new HashMap<>();
        map1.clear();
        List<Map<String, Integer>> list=new ArrayList<>();

        List<Map.Entry<String,Integer>> p=mSort.mySort(map1);
        List<Map<String,Integer>> res=mSort.trans(p);
        assertEquals("WRONG",list,res);

    }

    @Test
    public void testMySort12() throws Exception {
//TODO: Test goes here...
        Map<String,Integer> map1=new HashMap<>();
        map1.put("aaa",1);
        map1.put("bbb",2);
        map1.put("ccc",3);
        map1.put("ddd",4);
        List<Map<String, Integer>> list=new ArrayList<>();

        Map<String,Integer> temp=new HashMap<>();
        temp.clear();
        temp.put("ddd",4);
        list.add(temp);
        Map<String,Integer> temp2=new HashMap<>();
        temp2.clear();
        temp2.put("ccc",3);
        list.add(temp2);
        Map<String,Integer> temp3=new HashMap<>();
        temp3.clear();
        temp3.put("bbb",2);
        list.add(temp3);
        Map<String,Integer> temp4=new HashMap<>();
        temp4.clear();
        temp4.put("aaa",1);
        list.add(temp4);
        List<Map.Entry<String,Integer>> p=mSort.mySort(map1);
        List<Map<String,Integer>> res=mSort.trans(p);
        assertEquals("WRONG",list,res);

    }

    @Test
    public void testMySort13() throws Exception {
//TODO: Test goes here...
        Map<String,Integer> map1=new HashMap<>();
        map1.put("aaa",1);
        map1.put("abb",2);
        map1.put("acc",1);
        map1.put("add",4);
        List<Map<String, Integer>> list=new ArrayList<>();

        Map<String,Integer> temp=new HashMap<>();
        temp.clear();
        temp.put("add",4);
        list.add(temp);
        Map<String,Integer> temp2=new HashMap<>();
        temp2.clear();
        temp2.put("abb",2);
        list.add(temp2);
        Map<String,Integer> temp3=new HashMap<>();
        temp3.clear();
        temp3.put("aaa",1);
        list.add(temp3);
        Map<String,Integer> temp4=new HashMap<>();
        temp4.clear();
        temp4.put("acc",1);
        list.add(temp4);
        List<Map.Entry<String,Integer>> p=mSort.mySort(map1);
        List<Map<String,Integer>> res=mSort.trans(p);
        assertEquals("WRONG",list,res);

    }

//注意：为了验证排序的正确性，不应该按照正确的顺序输入测试用例。应先打乱，以测试排序功能是否正常。
}
