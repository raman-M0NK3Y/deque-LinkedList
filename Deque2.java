package dequesauce;

public class Deque2<E> implements Deque<E> {
	private DLLNode <E> header;
	private DLLNode <E> trailer;
	private int size;
	
	public Deque2 () {
	      this.header = new DLLNode<E>(null,null,null);
	      this.trailer= new DLLNode<E>(null,this.header,null);
	      this.header.setNext(this.trailer);
	      this.size=0;
	}
	public boolean isEmpty() {
	if(this.size==0) {
	return true;
	}
	return false;
	}
	
	public int size() {
	return this.size;
	}
	
	public void addFirst(E item){
	DLLNode <E>  addfirst = new DLLNode<E>(item,null,null);
	DLLNode <E> save = this.header.getNext();
	addfirst.setPrev(this.header);
	addfirst.setNext(save);
	save.setPrev(addfirst);
	this.size++;
	} 
	
	public void addLast(E item) {
	DLLNode <E> addlast = new DLLNode<E>(item,null,null);
	DLLNode <E> save = this.trailer.getPrev();
	addlast.setNext(this.trailer);
	addlast.setPrev(save);
	save.setNext(addlast);
	this.trailer.setPrev(addlast);
	this.size++;
	}
	
	public E removeFirst() {
	if(this.size ==0) {
	return null;
	}
	DLLNode <E> save = this.header.getNext();
	DLLNode <E> savenext = this.header.getNext().getNext();
	save.setNext(null);
	save.setPrev(null);
	this.header.setNext(savenext);
	savenext.setPrev(this.header);
	E element = (E) save.getElement();
	save = null;
	this.size--;
	return element;
	}
	
	public E removeLast() {
	  DLLNode <E> save = this.trailer.getPrev();
	  DLLNode <E> save1 = this.trailer.getPrev().getPrev();
	  save.setNext(null);
	  save.setPrev(null);
	  save1.setNext(this.trailer);
	  this.trailer.setPrev(save1);
	  E element = (E)save.getElement();
	  save=null;
	  this.size--;
	return element;
	}
	
	public E first() {
	  return (E)this.header.getNext().getElement(); 
	}
	
	public E last() {
	return (E)this.trailer.getPrev().getElement();
	}
	
	public void printOutContent() {
	String x = "";
	
	for(DLLNode<E> save = this.header.getNext(); save !=this.trailer; save = save.getNext()) {

	x = x + (E)save.getElement();
	 
	}
	System.out.println(x);
	}

}
