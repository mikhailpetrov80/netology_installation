import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        StringBuilder result = new StringBuilder();
        File srcDir = new File("/Users/vodnik/Documents/Games/src");
        if (srcDir.mkdir()) {
            String src = "Создана директория src в Games";
            result.append(src).append("\n");
        }

        File resDir = new File("/Users/vodnik/Documents/Games/res");
        if (resDir.mkdir()) {
            String res = "Создана директория res в Games";
            result.append(res).append("\n");
        }

        File savegamesDir = new File("/Users/vodnik/Documents/Games/savegames");
        if (savegamesDir.mkdir()) {
            String savegames = "Создана директория savegames в Games";
            result.append(savegames).append("\n");
        }

        File tempDir = new File("/Users/vodnik/Documents/Games/temp");
        if (tempDir.mkdir()) {
            String temp = "Создана директория temp в Games";
            result.append(temp).append("\n");
        }

        File mainSrcDir = new File("/Users/vodnik/Documents/Games/src/main");
        if (mainSrcDir.mkdir()) {
            String main = "Создана директория main в Games/src";
            result.append(main).append("\n");
        }

        File testSrcDir = new File("/Users/vodnik/Documents/Games/src/test");
        if (testSrcDir.mkdir()) {
            String test = "Создана директория test в Games/src";
            result.append(test).append("\n");
        }

        File mainFile = new File(mainSrcDir, "Main.java");
        try {
            if (mainFile.createNewFile()) {
                String main = "Создан файл Main.java в Games/src/main";
                result.append(main).append("\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File utilsFile = new File(mainSrcDir, "Utils.java");
        try {
            if (utilsFile.createNewFile()) {
                String utils = "Создан файл Utils.java в Games/src/main";
                result.append(utils).append("\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File drawablesResDir = new File("/Users/vodnik/Documents/Games/res/drawables");
        if (drawablesResDir.mkdir()) {
            String drawables = "Создана директория drawables в Games/res";
            result.append(drawables).append("\n");
        }

        File vectorsResDir = new File("/Users/vodnik/Documents/Games/res/vectors");
        if (vectorsResDir.mkdir()) {
            String vector = "Создана директория vector в Games/res";
            result.append(vector).append("\n");
        }

        File iconsResDir = new File("/Users/vodnik/Documents/Games/res/icons");
        if (iconsResDir.mkdir()) {
            String icons = "Создана директория icons в Games/src";
            result.append(icons).append("\n");
        }

        File tempFile = new File(tempDir, "temp.txt");
        try {
            if (tempFile.createNewFile()) {
                String temp = "Создан файл temp.txt в Games/temp";
                result.append(temp).append("\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (FileWriter writer = new FileWriter(tempFile, false)) {
            writer.write(String.valueOf(result));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
