import java.util.ArrayList;
import java.util.Collections;
public class Main {
    static void main() {
        ArrayList<Artifact> collection = new ArrayList<>();
        collection.add(new Artifact("C309", "", ""));
        collection.add(new Artifact("XYZ997", "Xfactor", "X"));
        collection.add(new Artifact("A101", "", ""));
        collection.add(new Artifact("G8671", "G-Fuel", "Yesterday"));
        collection.add(new Artifact("B205", "", ""));

        for(Artifact i: collection){
            System.out.println(i.toString());
        }
        collection.sort(null);
        System.out.println("\n ---SORTED--- \n");
        for(Artifact i: collection){
            System.out.println(i.toString());
        }


    }
}
