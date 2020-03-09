package cn.tju.chp04.s02.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
//	public static void main(String[] args) {
//		List<String> all = new ArrayList<String>();
//		Collections.addAll(all, "Java","Javascript","Python","Go","Ruby");
//		Stream<String> stream = all.stream();
//		List<String> result = stream.filter((ele)->ele.toLowerCase().contains("j")).collect(Collectors.toList());
//		System.out.println(result);
//	}
	
	public static void main(String[] args) throws Exception {
		// 如果要想使用Stream进行分析处理，则一定要将全部要分析的数据保存在集合之中
		List<Order> all = new ArrayList<Order>();
		all.add(new Order("小强娃娃", 9.9, 10));
		all.add(new Order("林弱充气娃娃", 2987.9, 3));
		all.add(new Order("不强牌笔记本电脑", 8987.9, 8));
		all.add(new Order("弱强茶杯", 2.9, 800));
		all.add(new Order("阿强牌煎饼", 0.9, 138));
		// 分析购买商品之中带有“强”的信息数据，并且进行商品单价和数量的处理，随后分析汇总
		DoubleSummaryStatistics stat = all.stream().filter((ele) -> ele.getName().contains("强"))
					.mapToDouble((orderObject) -> orderObject.getPrice() * orderObject.getAmount()).summaryStatistics();
		System.out.println("购买数量：" + stat.getCount());
		System.out.println("购买总价：" + stat.getSum());
		System.out.println("平均花费：" + stat.getAverage());
		System.out.println("最高花费：" + stat.getMax());
		System.out.println("最低花费：" + stat.getMin());
		
	}

}

class Order {	// 订单信息
	private String name ; // 商品名称
	private double price ; // 商品单价
	private int amount ; // 商品数量
	public Order(String name,double price,int amount) {
		this.name = name ;
		this.price = price ;
		this.amount = amount ;
	}
	public int getAmount() {
		return amount;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
}

