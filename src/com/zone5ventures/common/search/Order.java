package com.zone5ventures.common.search;


public class Order {

	/** The sort direction */
	private com.zone5ventures.common.enums.Order order;
	
	/** The field to sort on */
	private String field;
	
	public Order() { }
	
	public Order(String field, com.zone5ventures.common.enums.Order order) {
		this.field = field;
		this.order = order;
	}
	
	public com.zone5ventures.common.enums.Order getOrder() {
		return order;
	}

	public void setOrder(com.zone5ventures.common.enums.Order order) {
		this.order = order;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
}
