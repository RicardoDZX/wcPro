package day02_test_homework;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordTest {


    @Test()
    public void test001() throws Exception{
        WordAnalysis wordAnalysis = new WordAnalysis();
        // 将所要测试的样本的正确分析结果保存进map以与函数分析结果进行比较
        int counter = 47;
        // 比较测试结果的正确性
        assertEquals(counter, wordAnalysis.longProcess("winterOfWorld/1.txt"));
    }

    @Test()
    public void test002() throws Exception{
        WordAnalysis wordAnalysis = new WordAnalysis();
        // 将所要测试的样本的正确分析结果保存进map以与函数分析结果进行比较
        int counter = 106;
        // 比较测试结果的正确性
        assertEquals(counter, wordAnalysis.longProcess("winterOfWorld/2.txt"));
    }

    @Test()
    public void test003() throws Exception{
        WordAnalysis wordAnalysis = new WordAnalysis();
        // 将所要测试的样本的正确分析结果保存进map以与函数分析结果进行比较
        int counter = 32;
        // 比较测试结果的正确性
        assertEquals(counter, wordAnalysis.longProcess("winterOfWorld/3.txt"));
    }

    @Test()
    public void test004() throws Exception{
        WordAnalysis wordAnalysis = new WordAnalysis();
        // 将所要测试的样本的正确分析结果保存进map以与函数分析结果进行比较
        int counter = 65;
        // 比较测试结果的正确性
        assertEquals(counter, wordAnalysis.longProcess("winterOfWorld/4.txt"));
    }

    @Test()
    public void test005() throws Exception{
        WordAnalysis wordAnalysis = new WordAnalysis();
        // 将所要测试的样本的正确分析结果保存进map以与函数分析结果进行比较
        int counter = 21;
        // 比较测试结果的正确性
        assertEquals(counter, wordAnalysis.longProcess("winterOfWorld/5.txt"));
    }

    @Test()
    public void test006() throws Exception{
        WordAnalysis wordAnalysis = new WordAnalysis();
        // 将所要测试的样本的正确分析结果保存进map以与函数分析结果进行比较
        int counter = 76;
        // 比较测试结果的正确性
        assertEquals(counter, wordAnalysis.longProcess("winterOfWorld/6.txt"));
    }

    @Test()
    public void test007() throws Exception{
        WordAnalysis wordAnalysis = new WordAnalysis();
        // 将所要测试的样本的正确分析结果保存进map以与函数分析结果进行比较
        int counter = 54;
        // 比较测试结果的正确性
        assertEquals(counter, wordAnalysis.longProcess("winterOfWorld/7.txt"));
    }

    @Test()
    public void test008() throws Exception{
        WordAnalysis wordAnalysis = new WordAnalysis();
        // 将所要测试的样本的正确分析结果保存进map以与函数分析结果进行比较
        int counter = 61;
        // 比较测试结果的正确性
        assertEquals(counter, wordAnalysis.longProcess("winterOfWorld/8.txt"));
    }

    @Test()
    public void test009() throws Exception{
        WordAnalysis wordAnalysis = new WordAnalysis();
        // 将所要测试的样本的正确分析结果保存进map以与函数分析结果进行比较
        int counter = 20;
        // 比较测试结果的正确性
        assertEquals(counter, wordAnalysis.longProcess("winterOfWorld/9.txt"));
    }

    @Test()
    public void test010() throws Exception{
        WordAnalysis wordAnalysis = new WordAnalysis();
        // 将所要测试的样本的正确分析结果保存进map以与函数分析结果进行比较
        int counter = 45;
        // 比较测试结果的正确性
        assertEquals(counter, wordAnalysis.longProcess("winterOfWorld/10.txt"));
    }

    @Test()
    public void test011() throws Exception{
        WordAnalysis wordAnalysis = new WordAnalysis();
        // 将所要测试的样本的正确分析结果保存进map以与函数分析结果进行比较
        int counter = 48;
        // 比较测试结果的正确性
        assertEquals(counter, wordAnalysis.longProcess("winterOfWorld/11.txt"));
    }

    @Test()
    public void test012() throws Exception{
        WordAnalysis wordAnalysis = new WordAnalysis();
        // 将所要测试的样本的正确分析结果保存进map以与函数分析结果进行比较
        int counter = 54;
        // 比较测试结果的正确性
        assertEquals(counter, wordAnalysis.longProcess("winterOfWorld/12.txt"));
    }

    @Test()
    public void test013() throws Exception{
        WordAnalysis wordAnalysis = new WordAnalysis();
        // 将所要测试的样本的正确分析结果保存进map以与函数分析结果进行比较
        int counter = 37;
        // 比较测试结果的正确性
        assertEquals(counter, wordAnalysis.longProcess("winterOfWorld/13.txt"));
    }

    @Test()
    public void test014() throws Exception{
        WordAnalysis wordAnalysis = new WordAnalysis();
        // 将所要测试的样本的正确分析结果保存进map以与函数分析结果进行比较
        int counter = 5;
        // 比较测试结果的正确性
        assertEquals(counter, wordAnalysis.longProcess("winterOfWorld/14.txt"));
    }

    @Test()
    public void test015() throws Exception{
        WordAnalysis wordAnalysis = new WordAnalysis();
        // 将所要测试的样本的正确分析结果保存进map以与函数分析结果进行比较
        int counter = 9;
        // 比较测试结果的正确性
        assertEquals(counter, wordAnalysis.longProcess("winterOfWorld/15.txt"));
    }


    @Test()
    public void test016() throws Exception{
        Map<String, Integer> map = new HashMap<>();
        WordAnalysis wordAnalysis = new WordAnalysis();
        // 将所要测试的样本的正确分析结果保存进map以与函数分析结果进行比较
        map.put("let", 1);
        map.put("s", 1);
        // 比较测试结果的正确性
        assertEquals(map, wordAnalysis.process("winterOfWorld/exam_1.txt"));
    }

    @Test()
    public void test017() throws Exception{
        Map<String, Integer> map = new HashMap<>();
        WordAnalysis wordAnalysis = new WordAnalysis();
        // 将所要测试的样本的正确分析结果保存进map以与函数分析结果进行比较
        map.put("content-based", 1);
        // 比较测试结果的正确性
        assertEquals(map, wordAnalysis.process("winterOfWorld/exam_2.txt"));
    }

    @Test()
    public void test018() throws Exception{
        Map<String, Integer> map = new HashMap<>();
        WordAnalysis wordAnalysis = new WordAnalysis();
        // 将所要测试的样本的正确分析结果保存进map以与函数分析结果进行比较
        map.put("i", 1);
        // 比较测试结果的正确性
        assertEquals(map, wordAnalysis.process("winterOfWorld/exam_3.txt"));
    }

    @Test()
    public void test019() throws Exception{
        Map<String, Integer> map = new HashMap<>();
        WordAnalysis wordAnalysis = new WordAnalysis();
        // 将所要测试的样本的正确分析结果保存进map以与函数分析结果进行比较
        map.put("table", 1);
        // 比较测试结果的正确性
        assertEquals(map, wordAnalysis.process("winterOfWorld/exam_4.txt"));
    }

    @Test()
    public void test020() throws Exception{
        Map<String, Integer> map = new HashMap<>();
        WordAnalysis wordAnalysis = new WordAnalysis();
        // 将所要测试的样本的正确分析结果保存进map以与函数分析结果进行比较
        map.put("see", 1);
        map.put("box", 1);
        map.put("d", 1);
        map.put("c", 1);
        // 比较测试结果的正确性
        assertEquals(map, wordAnalysis.process("winterOfWorld/exam_5.txt"));
    }


}
