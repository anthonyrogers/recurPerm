public class rec {

    public static void permutation(String word){
   permutation("", word);
    }

    public static void permutation(String currentPerm, String restOfWord){

        if(restOfWord.equals("")){
            System.out.println(currentPerm);
        }else{
            for(int i = 0; i < restOfWord.length() ; i++){

                permutation(currentPerm + restOfWord.charAt(i), restOfWord.substring(0,i)+ restOfWord.substring(i+1));
            }
        }
    }


    public static void main(String [] args){
        permutation("and");
    }

}
