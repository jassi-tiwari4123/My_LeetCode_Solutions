class Solution {
    // static String map[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    // public List<String> letterCombinations(String digits) {
    //     List<String> list=new ArrayList<>();
    //     if(digits.length()==0){
    //         return list;
    //     }
    //     combination(digits,list,"");
    //     return list;
    // }
    // public static void combination(String str, List<String> list, String ans){
    //     if(str.length()==0){
    //         list.add(ans);
    //         return;
    //     }
    //     char ch=str.charAt(0);
    //     int num=ch-'0';
    //     String press=map[num];
    //     for(int i=0;i<press.length();i++){
    //         combination(str.substring(1),list,ans+press.charAt(i));
    //     }
    // }

    static String[] maps={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits){
        int n=digits.length();
        List<String> res=new ArrayList<>();
        if(n==0){
            return res;
        }
        combination(digits,res,"");
        return res;
    }
    public void combination(String digits,List<String> res,String ans){
        if(digits.length()==0){
            res.add(ans);
            return;
        }
        char ch=digits.charAt(0);
        int ind=ch-'0';
        String x=maps[ind];
        for(int i=0;i<x.length();i++){
            combination(digits.substring(1),res,ans+x.charAt(i));
        }

    }
}