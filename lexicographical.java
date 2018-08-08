import java.util.*;

import java.lang.*;

//To print elements in lexicogfraphic order



class lexico

{  

   public static void main(String[] args)

   {

        String[] words = { "abc", "a", "cde", "ccd","xyz" };



        for(int i = 0; i < 4; ++i) {

            for (int j = i + 1; j < 5; ++j) {

                if (words[i].compareTo(words[j]) > 0) {



                    // swap words[i] with words[j[

                    String temp = words[i];

                    words[i] = words[j];

                    words[j] = temp;

                }

            }

        }



        System.out.println("In lexicographical order:");

        for(int i = 0; i < 5; i++) {

            System.out.println(words[i]);

        }

    }

}