import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Settings {


    public static List<String> newDice = new ArrayList<String>(16) {{
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
    public static String woodColorClicked = "-fx-background-color:rgba(40,80,255,1); -fx-opacity:0.9;";
    //green
    public static String woodColorCanClick = "-fx-background-color:rgba(90,255,110,1); -fx-opacity:0.8;";
    //red
    public static String woodColorCantClick = "-fx-background-color:rgba(255,90,90,1); -fx-opacity:0.8;";
    //white
    public static String woodColorEmptySquare = "-fx-background-color: rgba(245,245,245,1); -fx-opacity: 0.8;";
    //Solver words that player missed (red on default theme)
    public static String woodColorAIWords = "-fx-text-fill:rgb(255,0,0)";

    public static String hackerColorClicked = "-fx-text-fill: BLACK; -fx-background-color:rgba(0,255,0,1); -fx-opacity:1;";
    public static String hackerColorCanClick = "-fx-background-color:rgba(255,255,255,1); -fx-opacity:1;";
    public static String hackerColorCantClick = "-fx-background-color:rgba(255,0,0,1); -fx-opacity:1;";
    public static String hackerColorEmptySquare = "-fx-text-fill: rgba(0,245,0,1); -fx-background-color: rgba(150,150,150,1); -fx-opacity: 1;";
//    public static String hackerColorSquareText = "-fx-color:rgba(0,255,0,1); -fx-opacity:1;";
    //Solver words that player missed (red on default theme)
    public static String hackerColorAIWords = "-fx-text-fill:rgb(255,0,0)";

}
