class Solution {
    public String getHint(String secret, String guess) {
        int bulls=0,cows=0;
        int[] secretCount1=new int[10];
        int[] guessCount1=new int[10];

        for(int i=0;i<secret.length();i++){
            char s=secret.charAt(i);
            char g=guess.charAt(i);

            if(s==g){
                bulls++;
            }
            else{
                secretCount1[s-'0']++;
                guessCount1[g-'0']++;
            }
        }
          for(int i = 0; i < 10; i++){
            cows += Math.min(secretCount1[i], guessCount1[i]);
        }
        return bulls + "A" + cows + "B";
    }
}
public class Q299 {
    
}
