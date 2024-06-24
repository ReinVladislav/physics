import org.apache.pdfbox.pdmodel.PDDocument;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadTextFile {
    public static void main(String[] args) {

        String text = String.valueOf(getTextFromFile("task18.txt"));
        ArrayList<String> splitText = splitText(text, "\\)");
        for (String str : splitText){
            System.out.println(str);
            System.out.println("---------------------------------------");
        }

    }

    public static ArrayList<String> convert(){
        String text = String.valueOf(getTextFromFile("task18.txt"));
        return splitText(text, "\\)");
    }

    public static StringBuilder getTextFromFile(String fileName){
        String filePath = "coverter\\src\\main\\resources\\tasks\\"+ fileName;
        StringBuilder content = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка при чтении файла: " + e.getMessage());
        }
        return content;
    }

    public static ArrayList<String> splitText(String text, String reg){
        text = text.replaceAll("Верно/Неверно", "").trim();
        text = text.replaceAll("\n", "");
        text = text.replaceAll("\r", " ");
        String[] splitTextArray  = text.split(reg);
        ArrayList<String> splitText = new ArrayList<>(Arrays.asList(splitTextArray));
        splitText.remove(0);
        for (int i = 0; i < splitText.size(); i++) {
            String str = splitText.get(i);
            splitText.set(i, str.substring(0, str.length() - 2));
        }
        return splitText;
    }
}
