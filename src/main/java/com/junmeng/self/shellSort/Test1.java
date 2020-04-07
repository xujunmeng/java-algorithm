package com.junmeng.self.shellSort;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

/**
 * @author junmeng.xu
 * @date 2016年7月14日下午2:11:57
 */
public class Test1 {
	public void shellSort(Object[] arr) {
		long begin = System.currentTimeMillis();
		int count = arr.length;
		int inner, outer;
		int temp;

		int h = 1; // find initial value of h
		while (h <= count / 3)
			h = h * 3 + 1; // (1, 4, 13, 40, 121, ...)

		while (h > 0) // decreasing h, until h=1
		{
			// h-sort the file
			for (outer = h; outer < count; outer++) {
				temp = (Integer) arr[outer];
				inner = outer;
				// one subpass (eg 0, 4, 8)
				while (inner > h - 1 && (Integer) arr[inner - h] >= temp) {
					arr[inner] = arr[inner - h];
					inner = inner - h;
				}
				arr[inner] = temp;
			} // end for
			h = (h - 1) / 3; // decrease h
		} // end while(h>0)
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}
	public static void listSort(List<Integer> list){
		long begin = System.currentTimeMillis();
		list.sort((a, b) -> a.compareTo(b));
		long end = System.currentTimeMillis();
		System.out.println(end-begin);
	}
	
	//数量100时，耗时0或1
	@Test
	public void test1() {
		List<Integer> list = Lists.newArrayList();
		java.util.Random r = new java.util.Random();
		for (int i = 0; i < 100; i++) {
			list.add((Integer) r.nextInt());
		}
		shellSort(list.toArray());
	}
	//数量100时，耗时202
	@Test
	public void test2(){
		List<Integer> list = Lists.newArrayList();
		java.util.Random r=new java.util.Random();
		for(int i=0;i<100;i++){
			list.add((Integer)r.nextInt());
		}
		listSort(list);
	}
	
	
//=============================================================================
	
	//数量3000时，耗时5
	@Test
	public void test3() {
		List<Integer> list = Lists.newArrayList();
		java.util.Random r = new java.util.Random();
		for (int i = 0; i < 3000; i++) {
			list.add((Integer) r.nextInt());
		}
		shellSort(list.toArray());
	}
	//数量3000时，耗时151
	@Test
	public void test4(){
		List<Integer> list = Lists.newArrayList();
		java.util.Random r=new java.util.Random();
		for(int i=0;i<3000;i++){
			list.add((Integer)r.nextInt());
		}
		listSort(list);
	}
//=============================================================================
	
	//数量10000时，耗时8
	@Test
	public void test5() {
		List<Integer> list = Lists.newArrayList();
		java.util.Random r = new java.util.Random();
		for (int i = 0; i < 10000; i++) {
			list.add((Integer) r.nextInt());
		}
		shellSort(list.toArray());
	}
	//数量10000时，耗时82
	@Test
	public void test6(){
		List<Integer> list = Lists.newArrayList();
		java.util.Random r=new java.util.Random();
		for(int i=0;i<10000;i++){
			list.add((Integer)r.nextInt());
		}
		listSort(list);
	}
	

}
