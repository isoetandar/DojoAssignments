import java.util.HashMap;
import java.util.Set;
public class trackList {
    public static void main(String[] args){
        HashMap<String, String> songList = new HashMap<String, String>();
        songList.put("Love Song", "Oh.I love you so much. I sing a song with love");
        songList.put("We are coder", "Amazing coder in Teighmount as well as song writer");
        songList.put("You can said Ninjas", "We all good Ninja, bring peace on earth");
        songList.put("Charisma","Well, well, the charisma you show. Bring all Ninja into good deed");

        System.out.println(songList.get("We are coder"));

        Set<String> tracks = songList.keySet();
        for(String track : tracks) {
            System.out.println(track);
            System.out.println(songList.get(track));
        }
    }
}