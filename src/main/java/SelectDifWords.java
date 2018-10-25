/*
    Класс для Задания1. Преобразовывает строки из файла в массив таким образом, чтобы в него перебрсывались только отдельные слова,
    набранные кириллицей или латиницей, обрабатывает два массива и генерирует новую строку, в которую входят слова из первой строки,
   отсутствующие во второй
*/


import org.json.simple.JSONObject;

public class SelectDifWords extends JsonToArrayWords{



    public SelectDifWords(String pathTaskFile) {
        super.readerFromJSONFiles(pathTaskFile);

    }

     /*Метод сравнивает две массива слов, преобразованных из первых двух строк json файла и возвращает массив состоящий из слов
    первого массива, которых нет во втором массиве без учета регистра(Выполняет условие задания 1). Принимает название строк*/
       private String[] compareArraysWords(String nameLine1, String nameLine2){
            String[] arrayWordsLine1=super.convertStringToArray(nameLine1);
            String[] arrayWordsLine2=super.convertStringToArray(nameLine2);
            int i=0;
            outer: for (String word1: arrayWordsLine1) {
                    for (String word2: arrayWordsLine2) {
                        if (word1.toLowerCase().equals(word2.toLowerCase()))
                            continue outer;
                }
                    i++;
            }

            String[] arrayWordsOutput=new String[i];
            i=0;
            outer: for (String word1: arrayWordsLine1) {
                for (String word2: arrayWordsLine2) {
                    if (word1.toLowerCase().equals(word2.toLowerCase()))
                        continue outer;
                }
                arrayWordsOutput[i++]=word1;
            }
            return arrayWordsOutput;
        }

    //Метод возвращает строку, содержащую уникальные слова из первой строки json файла
        String returnUnicString(String nameLine1, String nameLine2){
            String line12="";
            String[] words=compareArraysWords(nameLine1, nameLine2);
            for (String word: words) {
                line12=line12+word.toLowerCase()+" ";
            }
            return line12;
        }

}
