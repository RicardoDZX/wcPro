package wcPro_Output;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OutputFileTest {

    Map<String,Integer> m;
    List<Map.Entry<String,Integer>> res;
    OutputFile test;
    String fileResult = "";
    String supposedResult = "";

    void testTwoResult() throws IOException{
    	res=new ArrayList<Map.Entry<String,Integer>>(m.entrySet());
    	test.outPut(res);
    	InputStream file = new FileInputStream("result.txt");
		int ch = file.read();
		while(ch != -1){
			fileResult += (char)ch;
			ch = file.read();
		}
		file.close();		
		assertEquals(supposedResult,fileResult);
    }
	@Before
	public void setUp() throws Exception {
		m = new LinkedHashMap<String,Integer>();
		test = new OutputFile();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testOutPut1() throws IOException {	
		m.put("as", 1);
		m.put("xiha", 3);
		supposedResult = "as 1\r\nxiha 3";			
		testTwoResult();
		
	}
	@Test 
	public void testOutPut2() throws IOException {
		m.put("as", 1);
		supposedResult = "as 1";
		testTwoResult();
	}
	@Test 
	public void testOutPut3() throws IOException {

		m.put("dog", 24);
		m.put("pp",8);
		m.put("like",2);
		supposedResult = "dog 24\r\npp 8\r\nlike 2";
		testTwoResult();

	}
	@Test 
	public void testOutPut4() throws IOException {
		testTwoResult();

	}
	@Test 
	public void testOutPut5() throws IOException {
		m.put("as", 1);
		m.put("ll",23);
		m.put("we",11);
		m.put("qute",3);
		supposedResult = "as 1\r\nll 23\r\nwe 11\r\nqute 3";
		testTwoResult();
	}
	@Test 
	public void testOutPut6() throws IOException {
		m.put("a", 1);
		m.put("l",23);
		m.put("w",11);
		m.put("q",3);
		supposedResult = "a 1\r\nl 23\r\nw 11\r\nq 3";
		testTwoResult();
	}
	@Test 
	public void testOutPut7() throws IOException {
		m.put("a", 1);
		m.put("l",23);
		m.put("w",11);
		m.put("q",3);
		m.put("ps",12);
		supposedResult = "a 1\r\nl 23\r\nw 11\r\nq 3\r\nps 12";
		testTwoResult();
	}
	@Test 
	public void testOutPut8() throws IOException {
		m.put("dig", 10);
		m.put("look",9);
		m.put("at",7);
		supposedResult = "dig 10\r\nlook 9\r\nat 7";
		testTwoResult();
	}
	@Test 
	public void testOutPut9() throws IOException {
		m.put("a", 10);
		m.put("b",9);
		m.put("c",7);
		supposedResult = "a 10\r\nb 9\r\nc 7";
		testTwoResult();
	}
	@Test 
	public void testOutPut10() throws IOException {
		m.put("aa", 10);
		m.put("bb",9);
		m.put("cc",7);
		supposedResult = "aa 10\r\nbb 9\r\ncc 7";
		testTwoResult();
	}
	@Test 
	public void testOutPut11() throws IOException {
		m.put("cat", 10);
		supposedResult = "cat 10";
		testTwoResult();
	}
	@Test 
	public void testOutPut12() throws IOException {
		m.put("cat", 10);
		m.put("meet", 2);
		supposedResult = "cat 10\r\nmeet 2";
		testTwoResult();
	}
	@Test 
	public void testOutPut13() throws IOException {
		m.put("ssss", 10);
		m.put("ww", 2);
		supposedResult = "ssss 10\r\nww 2";
		testTwoResult();
	}
	@Test 
	public void testOutPut14() throws IOException {
		m.put("cat1", 10);
		m.put("meet2", 2);
		m.put("ssss", 10);
		m.put("ww", 2);
		supposedResult = "cat1 10\r\nmeet2 2\r\nssss 10\r\nww 2";
		testTwoResult();
	}
	@Test 
	public void testOutPut15() throws IOException {
		m.put("q", 100);
		m.put("w", 98);
		m.put("e", 60);
		m.put("r", 10);
		supposedResult = "q 100\r\nw 98\r\ne 60\r\nr 10";
		testTwoResult();
	}
	@Test 
	public void testOutPut16() throws IOException {
		m.put("dog", 100);
		m.put("meet", 98);
		m.put("me", 60);
		m.put("git", 10);
		supposedResult = "dog 100\r\nmeet 98\r\nme 60\r\ngit 10";
		testTwoResult();
	}
	@Test 
	public void testOutPut17() throws IOException {
		testTwoResult();
	}
	@Test 
	public void testOutPut18() throws IOException {
		m.put("key", 1);
		m.put("kite", 1);
		supposedResult = "key 1\r\nkite 1";
		testTwoResult();
	}
	@Test 
	public void testOutPut19() throws IOException {
		m.put("duck", 1000);
		supposedResult = "duck 1000";
		testTwoResult();
	}
	@Test 
	public void testOutPut20() throws IOException {
		m.put("out", 1000);
		m.put("in", 1000);
		supposedResult = "out 1000\r\nin 1000";
		testTwoResult();
	}
}
