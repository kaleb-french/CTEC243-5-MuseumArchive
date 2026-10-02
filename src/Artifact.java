
public class Artifact {
    //f
    private String id;
    private String name;
    private String era;
    //c
    Artifact(String id, String name, String era){
        this.id = id;
        this.name = name;
        this.era = era;
    }
    //m
    public String getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getEra(){
        return this.era;
    }
    public String toString(){
        return "ID: " + this.id + " Name: " + this.name + "From the " + this.era + " era.";
    }
    public boolean equals(Object o){
        if(this.getClass() == o.getClass()){
            Artifact other = (Artifact)o;
            if(this.id == other.getId()){
                return true;
            } else{
            return false;
            }
        } else{
            return false;
        }
    }
}
