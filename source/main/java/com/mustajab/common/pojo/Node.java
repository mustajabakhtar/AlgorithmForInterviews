/**
 * 
 */
package com.mustajab.common.pojo;

/**
 * @author Mustajab Akhtar
 * @since 1.0
 */
public class Node<T> {

	private T data;
	private Node<T> next̋;

	/**
	 * @param data
	 * @param next̋
	 */
	public Node(T data, Node<T> next̋) {
		super();
		this.data = data;
		this.next̋ = next̋;
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
	 * @return the next̋
	 */
	public Node<T> getNext̋() {
		return next̋;
	}

	/**
	 * @param next̋
	 *            the next̋ to set
	 */
	public void setNext̋(Node<T> next̋) {
		this.next̋ = next̋;
	}

}
