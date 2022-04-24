package com.dragonsoft.designpattern.structure.composite.hashmap;

import java.util.HashMap;

import org.junit.Test;

import com.dragonsoft.designpattern.structure.composite.transparent.abs1.College;
import com.dragonsoft.designpattern.structure.composite.transparent.abs1.Department;
import com.dragonsoft.designpattern.structure.composite.transparent.abs1.University;

public class HashMapTest {

	/**
	 * 测试组合模式composite容器中加入leaf节点
	 */
	@Test
	public void fun1() {
		//创建大学
		University university = new University("西安财经学院");
		//创建学院
		College itCollege = new College("信息学院");
		College langCollege = new College("外语学院");
		//创建系
		Department ecDepartment = new Department("电子商务系");
		Department seDepartment = new Department("软件工程系");
		Department enDepartment = new Department("英语系");
		Department jpDepartment = new Department("日语系");
		
		//给大学添加学院
		university.add(itCollege);
		university.add(langCollege);
		
		//给学院添加系
		itCollege.add(ecDepartment);
		itCollege.add(seDepartment);
		langCollege.add(enDepartment);
		langCollege.add(jpDepartment);
		
		university.show();
		System.out.println(university.getByIndex(1));
		System.out.println("------------------------");
		university.remove(itCollege);
		university.show();
	}
	/**
	 * 测试组合模式composite容器中加入composite容器
	 * HashMap.putAll(Map m)就是composite容器中加入composite容器
	 */
	@Test
	public void fun2() {
		/**
		 * 模拟HashMap.put(k,v),即给容器中添加叶子组件
		 */
		//西安财经大学相关：创建大学
		University universityUFE = new University("西安财经学院");
		//西安财经大学相关：创建学院
		College langCollege = new College("外语学院");
		//西安财经大学相关：创建系
		Department enDepartment = new Department("英语系");
		Department jpDepartment = new Department("日语系");
		//西安财经大学相关：给大学添加学院
		universityUFE.add(langCollege);
		//西安财经大学相关：给学院添加系
		langCollege.add(enDepartment);
		langCollege.add(jpDepartment);
		
		/**
		 * 模拟HashMap.put(k,v),即给容器中添加叶子组件
		 */
		//西安电子科技大学相关：创建大学
		University universityXDU = new University("西安电子科技大学");
		//西安电子科技大学相关：创建学院
		College itCollege = new College("信息学院");
		//西安电子科技大学相关：创建系
		Department ecDepartment = new Department("电子商务系");
		Department seDepartment = new Department("软件工程系");
		//西安电子科技大学相关：给大学添加学院
		universityXDU.add(itCollege);
		//西安电子科技大学相关：给学院添加系
		itCollege.add(ecDepartment);
		itCollege.add(seDepartment);
		
		//西安财经大学相关：打印院系(为了方便查看效果,可以暂时注掉下一行代码)
//		universityUFE.show();
		System.out.println("------------------------");
		//西安电子科技大学相关：打印院系(为了方便查看效果,可以暂时注掉下一行代码)
//		universityXDU.show();
		System.out.println("------------------------");
		
		/**
		 * 模拟HashMap.putAAll(Map m),即给容器中添加容器组件
		 */
		universityUFE.add(universityXDU);
		universityUFE.show();
	}

	/**
	 * abstractComponment:AbstractMap
	 * composite:HashMap
	 * leaf:Node
	 * 比较特殊的是：
	 * 	1.AbstractMap上层有一个接口Map,	abstract class AbstractMap implements Map {}
	 * 	2.Node未继承AbstractMap这个抽象类，但是Node是静态内部类，相当于也实现了AbstractMap这个抽象类
	 */
	@Test
	public void fun3() {
		//创建一个Composite
		HashMap<Integer, String> root = new HashMap<Integer, String>();
		//0 和 "史记" 会在HashMap组装成一个Node,调用put时会先把0 和 "史记"组装成Node，在进行真正的put操作
		root.put(0, "史记");//给root增加一个子节点
		root.put(1, "西游记");//给root增加第二个子节点
		
		HashMap<Integer, String> bookMap = new HashMap<Integer, String>();
		bookMap.put(1, "西游记");
		bookMap.put(1, "水浒传");
		bookMap.put(1, "红楼梦");
		bookMap.put(1, "三国演义");
		root.putAll(bookMap);//compisite组件
	}
}
