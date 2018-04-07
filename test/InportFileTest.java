package test.wcpro;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import wcpro.InportFile;

public class InportFileTest {

	@Before
	public void setUp() throws Exception {
		//�����嵥�е�1��2��3��4��6��7��8��9��11��13��14Ϊ�ֲ����ԣ��ɴ���ֱ���ڿ���̨�����������޷����е�Ԫ����
		//�ڴ˶�����8����������5��10��12��15��16��17��18��19��20���е�Ԫ���ԣ�����
	}

	@Test
	public void test5() {
		String[] argv = {};
		InportFile.readFile(argv);
		String[] str=InportFile.getOutput();
		assertEquals("please input the right cmd!",str[0]);
	}

	@Test
	public void test10() {
		String[] argv = {"wcPro.exe"};
		InportFile.readFile(argv);
		String[] str=InportFile.getOutput();
		assertEquals("please input the right cmd!",str[0]);
	}
	
	@Test
	public void test12() {
		String[] argv = {"wcPro.exe","file.c"};
		InportFile.readFile(argv);
		String[] str=InportFile.getOutput();
		assertEquals("filetype error input!",str[0]);
	}
	
	@Test
	public void test15() {
		String[] argv = {"wcPro.exe","file123.txt"};
		InportFile.readFile(argv);
		String[] str=InportFile.getOutput();
		assertEquals("error filepath or filename!",str[0]);
	}
	
	@Test
	public void test16() {
		String[] argv = {"wcPro.exe","C:\\Users\\Sher\\123456\\file.txt"};
		InportFile.readFile(argv);
		String[] str=InportFile.getOutput();
		assertEquals("error filepath or filename!",str[0]);
	}
	
	@Test
	public void test17() {
		String[] argv = {"wcPro.exe","file.txt"};
		InportFile.readFile(argv);
		String[] str=InportFile.getOutput();
		assertEquals("every thing is right!",str[0]);
	}
	
	@Test
	public void test18() {
		String[] argv = {"wcPro.exe","C:\\Users\\Sher\\Desktop\\file.txt"};
		InportFile.readFile(argv);
		String[] str=InportFile.getOutput();
		assertEquals("every thing is right!",str[0]);
	}
	
	@Test
	public void test19() {
		String[] argv = {"wc.exe","file.c"};
		InportFile.readFile(argv);
		String[] str=InportFile.getOutput();
		assertEquals("wcPro.exe error input!",str[0]);
	}
	
	@Test
	public void test20() {
		String[] argv = {"wcPro.exe","file"};
		InportFile.readFile(argv);
		String[] str=InportFile.getOutput();
		assertEquals("file error input!",str[0]);
	}
	
	@Test
	public void test21() {
		String[] argv = {"wcPro.exe","file.txt","cmd.txt"};
		InportFile.readFile(argv);
		String[] str=InportFile.getOutput();
		assertEquals("please input the right cmd!",str[0]);
	}
}
