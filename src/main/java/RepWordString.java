//Класс для Задания2. Выводит кол-во символов в строке, и число предопределенных слов в строке

public class RepWordString extends JsonToArrayWords {

    public RepWordString(String pathTaskFile) {
        super.readerFromJSONFiles(pathTaskFile);
    }

    //Метод считает количество знаков препинания, установленных в массиве.
    int countPunctuation(String nameLine) {
        String line=(String)super.getJsonObject().get(nameLine);
        int count=0;
        char[]charPunct={'.',',',':',';','?','!'};
        char[]chArray = line.toCharArray();
        for(int i=0; i<chArray.length; i++) {
            for (int j = 0; j < ConfigClass.Char_Punct.length; j++) {
                if (chArray[i] == ConfigClass.Char_Punct[j]) {
                    count++;
                }
            }
        }
        return count;
    }





    //Метод подсчитывает число слов(ConfigClass.DUPLICATE_WORD), встречающихся в строке.
    int repeatWord(String nameLine){
        String[] arrayWordsLine=super.convertStringToArray(nameLine);
        int count=0;
        for (String words: arrayWordsLine) {
            if(words.toLowerCase().equals(ConfigClass.DUPLICATE_WORD.toLowerCase())) {
                count++;
            }
        }
        return count;

    }

}
