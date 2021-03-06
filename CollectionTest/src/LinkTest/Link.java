package LinkTest;

public class Link {
	class Node{
		String value;
		Node next;
		public Node(String value){
			this.value = value;
		}
		public void add(Node node){
			if(this.next != null){
				this.next.add(node);
			}else{
				this.next = node;
			}
		}
		public void delete(String value){
			if(this.next == null){
				System.out.println("have not " + value);
				return;
			}
			if(this.next.value.equals(value)){
				this.next = this.next.next;
			}else{
				this.next.delete(value);
			}
		}
		public void print(){
			if(this.next != null){
				System.out.print(this.value + "------>");
				this.next.print();
			}else{
				System.out.println(this.value);
			}
		}
	}
	private Node root;
	public Link(String value){
		this.root = new Node(value);
	}
	public void add(String value){
		Node node = new Node(value);
		if(root != null){
			root.add(node);
		}else{
			root = node;
		}
	}
	public void delete(String value){
		if(root == null){
			System.out.println("Link is null");
			return;
		}
		if(root.value.equals(value)){
			root = root.next;
		}else{
			root.delete(value);
		}
	}
	public void print(){
		if(root == null){
			System.out.println("Link is null");
		}else{
			root.print();
		}
	}
}
