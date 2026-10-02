public class LinkedCollection<T> implements CollectionInterface<T>{
    //f
    private LLNode<T> head;
    private int numElements;
    //c
    public LinkedCollection(){
          head = null;
          numElements = 0;
    }
    //m
    T find(T item) {

        LLNode<T> location = head;
        LLNode<T> previous = null;

        while (location != null) {

            if (location.getInfo().equals(item)) {
                return location.getInfo();
            }

            previous = location;
            location = location.getLink();
        }

        return null;
    }
	@Override
	public boolean add(T item){
        LLNode<T> newNode = new LLNode<>(item);

        newNode.setLink(head);
        head = newNode;

        numElements++;
        return true;
	}
	@Override
	public T get(T item){
	    LLNode<T> node = this.head;
	    for(int i = 0; i < numElements; i++){
			if(node.getInfo().equals(item)){
			    return node.getInfo();
			} else{
			    node = node.getLink();
			}
		}
		return null;
	}
	@Override
	public boolean contains(T item){
	    LLNode<T> node = this.head;
		for(int i = 0; i < numElements; i++){
		    if(node.getInfo().equals(item)){
				return true;
			} else{
                node = node.getLink();
			}
		}
		return false;
	}
	@Override
	public boolean remove(T item){

    LLNode<T> location = head;
    LLNode<T> previous = null;

    while (location != null) {

        if (location.getInfo().equals(item)) {

            if (location == head) {
                head = head.getLink();
            } else {
                previous.setLink(location.getLink());
            }

            numElements--;
            return true;
        }

        previous = location;
        location = location.getLink();
    }
        return false;
	}
	@Override
	public boolean isFull(){
		return false;
	}
	@Override
	public boolean isEmpty(){
	    if (head == null){
			return true;
		}
		return false;
	}
	@Override
	public int size(){
		return numElements;
	}
}
