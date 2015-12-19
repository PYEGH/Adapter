package com.epam.adapter;

/**
 * The interface describe base operation for any list
 * @author Pavel
 *
 */
public interface BaseList {
	/**
	 * Appends a given object to the end of list
	 */
	void push(final Object object);
	
	/**
	 * Pulls last item from the list
	 * @return
	 */
	Object pop();
}
