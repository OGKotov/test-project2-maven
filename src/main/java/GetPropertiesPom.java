//Класс для Задания3. Читаем pom файл и выводит заданные переменные в pom файле

import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;

import java.io.FileReader;
import java.io.IOException;

public class GetPropertiesPom {
    private MavenProject project;

    //Конструктор читает пом файл и инициализирует объектом pom файла переменную экземпляра
    GetPropertiesPom(String pathPomFile) {
        Model model;
        FileReader reader;
        MavenXpp3Reader mavenreader = new MavenXpp3Reader();
        try {
            reader = new FileReader(pathPomFile);
            model = mavenreader.read(reader);
            project = new MavenProject(model);
        } catch (
                IOException e) {
            e.printStackTrace();
        } catch (
                XmlPullParserException e) {
            e.printStackTrace();

        }
    }

    //Метод возвращает строкой переменные окружения, созданные в pom файле
    String getPomPropertiesInString() {
        String properties;
        properties = project.getProperties().toString();
        return properties;
    }
}
