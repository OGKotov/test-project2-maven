

public class IndexClass {
    public static void main(String args[]) {
        String f;

        SelectDifWords selDifWords = new SelectDifWords(ConfigClass.PATH_JSON_FILE_TASK1);
        RepWordString repWordString=new RepWordString(ConfigClass.PATH_JSON_FILE_TASK2);
        GetPropertiesPom getPropertiesPom=new GetPropertiesPom(ConfigClass.PATH_POM_FILE);
        System.out.println("Задание №1.");
        System.out.println("Слова певрой строки файла JSON: " +selDifWords.returnOriginalString("line1"));
        System.out.println("Слова второй строки файла JSON: " +selDifWords.returnOriginalString("line2"));
        System.out.println("Вывод cлов первой строки, которых нет во второй строке: " +selDifWords.returnUnicString("line1", "line2"));

        System.out.println("\nЗадание №2.");
        System.out.println("Слова строки файла JSON: " +repWordString.returnOriginalString("line"));
        System.out.println("Количество знаков препинания в строке: "+repWordString.countPunctuation("line"));
        System.out.println("Число повторенй слова " +ConfigClass.DUPLICATE_WORD+ ": " +repWordString.repeatWord("line"));

        System.out.println("\nЗадание №3.");
        System.out.println("Переменная  окружения созданная в pom файле имеет значение: " +getPropertiesPom.getPomPropertiesInString());

    }
}