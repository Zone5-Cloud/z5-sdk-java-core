package com.zone5ventures.core.enums;

public enum DataAccessRequest {

	/** Can view basic meta-data about this record */
	view1,
	
	/** Can view advanced meta-data about this record */
	view2,
	
	view3,
	
	/** Can insert a new record */
	add,
	
	/** Can update basic meta-data about this record */
	edit1,
	
	/** Can updated advanced meta-data about this record */
	edit2,
	
	edit3,
	
	/** Can delete this record */
	del,
	
	/** A special case permission for limited reporting access */
	rpt,
	
	/** A special case permission for flagging that an object is locked */
	lock;
}
