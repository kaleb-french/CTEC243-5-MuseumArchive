public class ArrayCollection<T> implements CollectionInterface<T>{
    //f
    private T[] elements;
    private int numElements;
    //c
    @SuppressWarnings("unchecked")
	ArrayCollection(){
        elements = (T[])new Object[100];
        numElements = 0;
    }
    //m
    public int find(T item){
        for(int i = 0; i < numElements; i++){
            if(item != null && elements[i].equals(item)){
                return i;
            }
        }
        return -1;
    }
	@Override
	public boolean add(T item) {
	    int index = numElements;
		elements[index] = item;
		numElements++;
	    return true;
	}
	@Override
	public T get(T item) {
	    int index = this.find(item);
	    return elements[index];
	}
	@Override
	public boolean contains(T item) {
        for(int i = 0; i < numElements; i++){
            if(item != null && elements[i].equals(item)){
                return true;
            }
        }
        return false;
	}
	@Override
	public boolean remove(T item) {
	    int index = find(item);
		if (index == -1) {
            return false;
        }
        elements[index] = elements[numElements - 1];
        elements[numElements - 1] = null;
        numElements--;
        return true;
	}
	@Override
	public boolean isFull() {
	    if(numElements >= 100){
			return true;
		}
		return false;
	}
	@Override
	public boolean isEmpty() {
	    if(numElements <= 0){
			return true;
		}
		return false;
	}
	@Override
	public int size() {
		return numElements;
	}
}
