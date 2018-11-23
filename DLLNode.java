package dequesauce;

public class DLLNode<E> {
	
	private DLLNode<E> next;
	private DLLNode<E> prev;
	private E element;
	
	public DLLNode(E element, DLLNode<E> prev, DLLNode<E> next) {
	this.element=element;
	this.prev=prev;
	this.next=next;
	}
	public void setNext(DLLNode<E> next) {
	this.next=next;
	}
	public void setPrev(DLLNode<E> prev) {
	this.prev=prev;
	}

	public void setElement(E element) {
	   this.element=element;
	}
	public E getElement() {
	   return this.element;
	}
	public DLLNode<E> getNext() {
	return this.next;
	}
	public DLLNode<E> getPrev() {
	return this.prev;
	}

}
