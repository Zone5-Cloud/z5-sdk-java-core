package com.zone5cloud.core.search;


public class Order {

	/** The sort direction */
	private com.zone5cloud.core.enums.Order order;
	
	/** The field to sort on */
	private String field;
	
	public Order() { }
	
	public Order(String field, com.zone5cloud.core.enums.Order order) {
		this.field = field;
		this.order = order;
	}
	
	public com.zone5cloud.core.enums.Order getOrder() {
		return order;
	}

	public void setOrder(com.zone5cloud.core.enums.Order order) {
		this.order = order;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
}
