/**
 * 
 */
package com.mustajab.common.pojo;

/**
 * @author Mustajab Akhtar
 * @since 1.0
 */
public class DoubleNode<T> {

	private T data;
	private DoubleNode<T> next;
	private DoubleNode<T> prev;

	/**
	 * @param data
	 * @param next
	 * @param prev
	 */
	public DoubleNode(T data, DoubleNode<T> next, DoubleNode<T> prev) {
		super();
		this.data = data;
		this.next = next;
		this.prev = prev;
	}

	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}

	/**
	 * @return the next
	 */
	public DoubleNode<T> getNext() {
		return next;
	}

	/**
	 * @param next
	 *            the next to set
	 */
	public void setNext(DoubleNode<T> next) {
		this.next = next;
	}

	/**
	 * @return the prev
	 */
	public DoubleNode<T> getPrev() {
		return prev;
	}

	/**
	 * @param prev
	 *            the prev to set
	 */
	public void setPrev(DoubleNode<T> prev) {
		this.prev = prev;
	}

}
