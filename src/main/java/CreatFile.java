import java.io.File;
import java.io.IOException;

public class CreatFile {
    public static StringBuilder creatFile(String name, String pathDir) {
        StringBuilder result = new StringBuilder();
        File file = new File(pathDir, name);
        try {
            if (file.createNewFile()) {
                String main = "Создан файл " + name + " в " + pathDir;
                result.append(main).append("\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }
}
