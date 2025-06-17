package telran.photoSelector.tools;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhotoSelector {
    // TODO -> StringBuilder (methods: append and toString().split)



    public static String selectPictures(String[] pictures, String regex) {


        StringBuilder res = new StringBuilder();

        for (int i = 0; i < pictures.length; i++) {
            if (pictures[i].matches(regex)) {
                res.append(pictures[i] );
            }

        }


        return res.toString();

    }

    public static String selectGOTYPics(String[] pictures, String regex ){
        Pattern pattern = Pattern.compile(regex);

        StringBuilder res = new StringBuilder();

        int count = 0;
        for (int i = 0; i < pictures.length; i++) {
            Matcher matcher = pattern.matcher(pictures[i]);
            if (matcher.find()){
                res.append(pictures[i] );
            }

        }
        return res.toString();
    }

}


// Pattern and Matcher find reset compile matcher
    //StringBuilder


