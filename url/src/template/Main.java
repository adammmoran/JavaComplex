package template;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<User> users = Arrays.asList(
                new User(1, "Oleh"),
                new User(2, "Nastya"),
                new User(3, "Olha"),
                new User(4, "Dima")
        );

        String templatePath = System.getProperty("user.dir")
                + File.separator
                + "url"
                + File.separator
                + "src"
                + File.separator
                + "template"
                + File.separator
                + "temp.txt";
        File file = new File(templatePath);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(templatePath));
        String line = "";
        String collector = "";
        while((line = bufferedReader.readLine())!= null){
            collector = collector + line;
        }

        System.out.println(collector);
        for (User user : users) {
            String newCollector = collector.replace("${xxx}", user.toString());
            String resultFilePath = System.getProperty("user.dir")
                    + File.separator
                    + "url"
                    + File.separator
                    + "src"
                    + File.separator
                    + "template"
                    + File.separator
                    + "user" + user.getId() + ".html";
            File userFile = new File(resultFilePath);
            PrintWriter printWriter = new PrintWriter(userFile);
            printWriter.println(newCollector);
            printWriter.close();
        }
    }


}
