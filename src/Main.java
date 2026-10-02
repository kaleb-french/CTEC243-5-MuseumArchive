public class Main {
    static void main() {
        ArrayCollection<Artifact> collection = new ArrayCollection<>();
        collection.add(new Artifact("A101", "", ""));
        collection.add(new Artifact("B205", "", ""));
        collection.add(new Artifact("C309", "", ""));

        Artifact searchKey = new Artifact("B205", "", "");

        System.out.println(collection.contains(searchKey));

        Artifact item = collection.get(searchKey);
        System.out.println(item.toString());
        collection.remove(searchKey);
        System.out.println(collection.size());
    }
}
