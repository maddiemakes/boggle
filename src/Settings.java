import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Settings {

    public static List<String> dice = new ArrayList<String>(16) {{
        add("AAEEGN"); add("ABBJOO"); add("ACHOPS");
        add("AFFKPS"); add("AOOTTW"); add("CIMOTU");
        add("DEILRX"); add("DELRVY"); add("DISTTY");
        add("EEGHNW"); add("EEINSU"); add("EHRTVW");
        add("EIOSST"); add("ELRTTY"); add("HIMNUQ");
        add("HLNNRZ");
    }};

    //TODO
//    public static InputStream dictFile = getClass().getResourceAsStream("/dictionaries/bogwords.txt");

    //Colors
    //blue
    public static String colorClicked = "-fx-background-color:rgba(40,80,255,1); -fx-opacity:0.9;";
    //green
    public static String colorCanClick = "-fx-background-color:rgba(90,255,110,1); -fx-opacity:0.8;";
    //red
    public static String colorCantClick = "-fx-background-color:rgba(255,90,90,1); -fx-opacity:0.8;";
    //white
    public static String colorEmptySquare = "-fx-background-color: rgba(245,245,245,1); -fx-opacity: 0.8;";
    //Solver words that player missed (red on default theme)
    public static String colorAIWords = "-fx-text-fill:rgb(255,0,0)";

}
