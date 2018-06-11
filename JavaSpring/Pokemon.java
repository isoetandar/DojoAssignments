public class Pokemon {

    private String name;
    private int health;
    private String type;
    private static int count=0;

    public Pokemon (String name, int health, String type) {
        this.name = name;
        this.health = health;
        this.type = type;
        count++;
    }

    // public void getCount(){
    //     System.out.println("Total Pokemons: "+ Integer.toString(count));
    // }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getHealth(){
        return this.health;
    }

    public int setHealth(int health){
        return this.health = health;
    }

    public String getType(){
        return this.type;
    }

    public String setType(String type){
        return this.type = type;
    }
}