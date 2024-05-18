public class Stack {
	private Node head;
	
	public Stack() {
		head = new Node('\0');//headin nexti null.ilk durumda tabiiki
		
	}
	
	public void push(int value) {
		Node temp = new Node(value);
		temp.setNext(head.getNext());
		head.setNext(temp);
	}
	
	public int peek() {
		if(head.getNext() != null)
			return head.getNext().getValue();
		else
			return '\0';
	}
	
	
	public void maxiBul(){
		
		int temp =0;
		
		Node kontrol=head.getNext();
		
		boolean dogru=true;
		Node iterator=head.getNext();
		boolean bitti=true;
		if(head.getNext() != null)
		
			
			while(bitti==true){
				
			
				while(iterator != null) {
					
					temp =kontrol.getNext().getValue();
					
					if(temp < iterator.getValue())
						dogru=false;
					
					iterator=iterator.getNext();
						
				}	
				if(dogru==false)
					head.setNext(iterator.getNext());
			
				kontrol=kontrol.getNext();
				
				if(kontrol==null)
					bitti=false;
				dogru=true;
			
			}	
		else
			return;
			
		
		
	}
	
	public int pop() {
		if(head.getNext() != null) {
			int temp = head.getNext().getValue();
			head.setNext(head.getNext().getNext());
			return temp;
		} else
			return '\0';
	}
}