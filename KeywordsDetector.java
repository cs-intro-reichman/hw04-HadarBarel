public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
      public static boolean contains2(String str1, String str2) {

        for (int i = 0; i <= str1.length() - str2.length(); i ++){       
            int counter1 = 0;
            int index = i;
            for (int j = 0; j < str2.length(); j ++){
          
                if (str1.charAt(index) != str2.charAt(j)){
                    break;
                }
                index ++;
                counter1 ++;
            }
           if (counter1 == str2.length()){
            return true;
           } 
        }
        return false;
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        
        if (sentences != null && keywords != null) {

            for (int i = 0; i < keywords.length; i++) {
                if (keywords[i] != null){
                keywords[i] = keywords[i].toLowerCase();
                }  
            }

            for (int i = 0; i < sentences.length; i++) {
                if (sentences[i] != null){
                sentences[i] = sentences[i].toLowerCase();
                }  

            for (int j = 0; j < keywords.length; j++){
                if (contains2(sentences[i], keywords[j]) == true){
                    System.out.println(sentences[i]);
                }
            }
            }

        }
    

    }
}
