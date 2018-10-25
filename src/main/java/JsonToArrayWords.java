
/*Класс Преобразовывает строки из файла в массив таким образом, чтобы в него перебрсывались только отдельные слова, набранные
        с помощью кириллицы или латиницы, выводит оригинальную строку из файла JSON*/

public class JsonToArrayWords extends ReaderJSON {

    //Метод преобразует строку из json файла в массив слов, извлекая только слова состоящие из латинских букв и киррилицы.
    String[] convertStringToArray(String nameLine) {
        String line=(String)super.getJsonObject().get(nameLine);

        String[] words = line.split("([^a-zA-Zа-яА-Я0-9]*[a-zA-Zа-яА-Я]*\\d+[a-zA-Zа-яА-Я]*[^a-zA-Zа-яА-Я0-9]*)|" +
                "([^a-zA-Zа-яА-Я0-9]+(\\d*[^a-zA-Zа-яА-Я0-9]*)*)|(([^a-zA-Zа-яА-Я0-9]*\\d*)*[^a-zA-Zа-яА-Я0-9]+)");
        int i=0;
        for (String word : words) {
            char[] chArray = word.toCharArray();
            if (chArray.length != 0)
                i++;
        }
        String[] arrayWordsOutput=new String[i];
        i=0;
        for (String word : words) {
            char[] chArray = word.toCharArray();
            if (chArray.length != 0)
                arrayWordsOutput[i++]=word;
        }
        return arrayWordsOutput;
    }

    //Метод выводит оригинальную строку из файла JSON
    String returnOriginalString(String nameLine){
        String line=(String)super.getJsonObject().get(nameLine);
        return line;
    }
}