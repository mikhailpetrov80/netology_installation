import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        StringBuilder result = new StringBuilder();

        result.append(CreatDir.creatDir("/Users/vodnik/Documents/Games/src"));
        result.append(CreatDir.creatDir("/Users/vodnik/Documents/Games/res"));
        result.append(CreatDir.creatDir("/Users/vodnik/Documents/Games/savegames"));
        result.append(CreatDir.creatDir("/Users/vodnik/Documents/Games/temp"));
        result.append(CreatDir.creatDir("/Users/vodnik/Documents/Games/src/main"));
        result.append(CreatDir.creatDir("/Users/vodnik/Documents/Games/src/test"));
        result.append(CreatFile.creatFile("Main.java", "/Users/vodnik/Documents/Games/src/main"));
        result.append(CreatFile.creatFile("Utils.java","/Users/vodnik/Documents/Games/src/main"));
        result.append(CreatDir.creatDir("/Users/vodnik/Documents/Games/res/drawables"));
        result.append(CreatDir.creatDir("/Users/vodnik/Documents/Games/res/vectors"));
        result.append(CreatDir.creatDir("/Users/vodnik/Documents/Games/res/icons"));
        result.append(CreatFile.creatFile("temp.txt","/Users/vodnik/Documents/Games/temp"));

        try (FileWriter writer = new FileWriter("/Users/vodnik/Documents/Games/temp/temp.txt", false)) {
            writer.write(String.valueOf(result));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
