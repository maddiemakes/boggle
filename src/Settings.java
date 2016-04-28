import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Settings {


    public static List<String> diceNew = new ArrayList<String>(16) {{
        add("AAEEGN"); add("ABBJOO"); add("ACHOPS");
        add("AFFKPS"); add("AOOTTW"); add("CIMOTU");
        add("DEILRX"); add("DELRVY"); add("DISTTY");
        add("EEGHNW"); add("EEINSU"); add("EHRTVW");
        add("EIOSST"); add("ELRTTY"); add("HIMNUQ");
        add("HLNNRZ");
    }};

    public static List<String> diceClassic = new ArrayList<String>(16) {{
        add("AACIOT"); add("ABILTY"); add("ABJMOQ");
        add("ACDEMP"); add("ACELRS"); add("ADENVZ");
        add("AHMORS"); add("BIFORX"); add("DENOSW");
        add("DKNOTU"); add("EEFHIY"); add("EGKLUY");
        add("EGINTV"); add("EHINPS"); add("ELPSTU");
        add("GILRUW");
    }};

    //Colors
    public static String woodColorClicked = "-fx-background-color:rgba(40,80,255,1); -fx-opacity:0.9;";
    public static String woodColorCanClick = "-fx-background-color:rgba(90,255,110,1); -fx-opacity:0.8;";
    public static String woodColorCantClick = "-fx-background-color:rgba(255,90,90,1); -fx-opacity:0.8;";
    public static String woodColorEmptySquare = "-fx-background-color: rgba(245,245,245,1); -fx-opacity: 0.8;";
    public static String woodNotifications = "-fx-alignment: center; -fx-text-fill: rgb(0,0,0); -fx-background-color: rgb(255,255,255); -fx-border-width: 1; -fx-border-color: rgba(30,30,30,0.9);";
    //Solver words that player missed (red on default theme)
    public static String woodColorAIWords = "-fx-text-fill:rgb(255,0,0)";

    public static String hackerColorClicked = "-fx-text-fill: BLACK; -fx-background-color:rgba(0,255,0,1); -fx-opacity:1;";
    public static String hackerColorCanClick = "-fx-background-color:rgba(255,255,255,1); -fx-opacity:1;";
    public static String hackerColorCantClick = "-fx-background-color:rgba(255,0,0,1); -fx-opacity:1;";
    public static String hackerColorEmptySquare = "-fx-text-fill: rgba(0,245,0,1); -fx-background-color: rgba(80,80,80,1); -fx-opacity: 1;";
    public static String hackerNotifications = "-fx-alignment: center-left; -fx-text-fill: rgb(0,245,0); -fx-background-color: rgb(0,0,0); -fx-border-width: 2; -fx-border-color: rgba(80,80,80,1);";
    //Solver words that player missed (red on default theme)
    public static String hackerColorAIWords = "-fx-text-fill:rgb(255,0,0)";

}
