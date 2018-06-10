import java.util.HashMap;
import java.util.Set;

class Project {
    private String name = "placeholder_name";
    private String description = "placeholder_desc";

    public Project(){
    }

    public Project(String name){
        this.name = name;
    }

    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String projectName() {
        return name;
    }

    public String projectDescription(){
        return description;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public String elevatorPitch(){
        return name +" : " + description;
    }
}