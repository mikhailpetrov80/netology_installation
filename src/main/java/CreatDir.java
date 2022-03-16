import java.io.File;

public class CreatDir {
    public static StringBuilder creatDir(String name) {
        StringBuilder result = new StringBuilder();
        File dir = new File(name);
        if (dir.mkdir()) {
            String src = "Создана директория " + name;
            result.append(src).append("\n");
        }
        return result;
    }
}
