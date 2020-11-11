package Day23_NestedLoop;

public class CatDog {
    public static void main(String[] args) {

        String sentence = "dog dog Dog Dog dog dog cat cat";
        String temp = sentence.toLowerCase();



        int countDog = 0;
        String word = "dog";
        while(temp.contains(word)){
            temp = temp.replaceFirst(word, "");
            countDog++;
        }

        System.out.println("number of dogs: " + countDog);

        int countCat = 0;
        String word2 = "cat";
        while(temp.contains(word2)){
            temp.replaceFirst(word, "");
            countCat++;
        }

        System.out.println("Num of Cats: "+ countCat);








    }
}
