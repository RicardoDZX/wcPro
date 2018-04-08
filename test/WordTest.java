package day02_test_homework;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordTest {

    Map<String, Integer> map = new HashMap<>();
    @Test()
    public void process() throws Exception{
        WordAnalysis wordAnalysis = new WordAnalysis();
        // 将所要测试的样本的正确分析结果保存进map以与函数分析结果进行比较
        map.put("i", 1);
        // 比较测试结果的正确性
        assertEquals(map, wordAnalysis.process("temp.txt"));
    }
}
