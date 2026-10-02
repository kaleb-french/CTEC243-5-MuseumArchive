public class Main {
    static void main() {
        LinkedCollection<Artifact> collection = new LinkedCollection<>();
        collection.add(new Artifact("A101", "", ""));
        collection.add(new Artifact("B205", "", ""));
        collection.add(new Artifact("C309", "", ""));
        collection.add(new Artifact("XYZ997", "Xfactor", "X"));
        collection.add(new Artifact("G8671", "G-Fuel", "Yesterday"));

        Artifact searchKey = new Artifact("G8671", "", "");

        System.out.println(collection.contains(searchKey));

        Artifact item = collection.get(searchKey);
        System.out.println(item.toString());
        collection.remove(searchKey);
        System.out.println(collection.size());
    }
}
