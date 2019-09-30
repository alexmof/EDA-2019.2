
public class LinkedList {
	
	private Integer data;
	private LinkedList prev;
	private LinkedList next;
	
	public LinkedList() {
		
	}
	
	public LinkedList(int element, LinkedList previous, LinkedList next) {
		this.data = element;
		this.prev = previous;
		this.next = next;        
	}

	// __________Recursivos___________

	public boolean isEmpty() {
		boolean retorno = false;
		
		if (this.data == null) {
			retorno =  true;
		}
		
		return retorno;
	}
	
	public int size() {
		if (!isEmpty()) {
			return 1 + this.getNext().size();
		} else {
			return 0;
		}
	}
	
	public int soma() {
		if (!isEmpty()) {
			return (this.getData() + this.getNext().soma());
		} else {
			return 0;
		}
	}
	
	public boolean isSorted() {
		if (isEmpty()) {
			return true;
		} else {
			if (!this.getNext().isEmpty() && this.getData() < this.getNext().getData()) {
				return (true && this.getNext().isSorted());
			} else {
				return false;
			}
		}
	}
	
	public void addLast(int element) {
		if (isEmpty()) {
			this.setData(element);
			this.setNext(new LinkedList());
		} else {
			this.getNext().addLast(element);
		}
	}
	
	//_____________Iterativos______________
	
	public void add(int index, int element) {
		if (index < size()) {
			if (index == 0) {
				LinkedList newNode = new LinkedList(element, this.getPrev(), this);
				this.getPrev().setNext(newNode);
				this.setPrev(newNode);
			}
		}
	}

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	public LinkedList getPrev() {
		return prev;
	}

	public void setPrev(LinkedList prev) {
		this.prev = prev;
	}

	public LinkedList getNext() {
		return next;
	}

	public void setNext(LinkedList next) {
		this.next = next;
	}
}
