package net.hfutonline.pattern.builder;

public class ConcreteBuilder extends Builder {
	private Product product = new Product();
	@Override
	public void setPart() {
		//逻辑处理的代码
		product.setPart();
	}

	@Override
	public Product buildProduct() {
		//构建product的部件
		return product;
	}

}
