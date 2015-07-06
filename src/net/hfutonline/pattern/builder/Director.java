package net.hfutonline.pattern.builder;

public class Director {
	private Builder builder = new ConcreteBuilder();
	
	public Product getProduct(){
		//这里是可以传参的，在entity中实现具体的处理逻辑
		builder.setPart();
		//不同的零件、顺序
		return builder.buildProduct();
	}
}
