class SLLNode<T>{
	private SLLNode<T> next;
	private T data;


	public SLLNode(){
		this.data = null;
		this.next = null;
	}


	public SLLNode(T data){
		this.data = null;
	}


	public SLLNode(T data, SLLNode<T> prevNode){
		this(data);
		prevNode.next = this;
	}


	public static void main(String[] args){
		SLLNode<Integer> n0 = new SLLNode<Integer>(0);
		SLLNode<Integer> n1 = new SLLNode<Integer>(1, n0);
	}

}
