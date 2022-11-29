package com.basic.interfaces;

interface manufacturing {
void made();
}

interface Sale {
void sold();
}

class Products implements Sale, manufacturing{
	public static void main(String[] args) {
		Products product=new Products();
		product.made();
		product.sold();
	}

	@Override
	public void made() {
		System.out.println("Product has been made");
		
	}
	
	@Override
	public void sold() {
		System.out.println("Product can be sold");
		
	}
}