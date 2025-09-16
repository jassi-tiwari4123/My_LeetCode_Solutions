class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] newTxt=text.split(" ");
        String[] newBr=brokenLetters.split("");
        int count=0;
        if(brokenLetters.isEmpty()){
            return newTxt.length;
        }
        for(int i=0;i<newTxt.length;i++){
            boolean isbroken=false;
            for(int j=0;j<newBr.length;j++){
                if(newTxt[i].contains(newBr[j])){
                    isbroken=true;
                    break;
                }
            }
            if(isbroken==false){
                count++;
            }
        }
        return count;
    }
}