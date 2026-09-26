class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        int n=s.length();
        HashMap<String,String> hm=new HashMap<>();
        for(List<String> res:knowledge){
            hm.put(res.get(0),res.get(1));
        }
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<n){
            char ch=s.charAt(i);
            if(ch=='('){
                int j=i+1;
                while(s.charAt(j)!=')'){
                    j++;
                }
                String sub=s.substring(i+1,j);
                if(hm.containsKey(sub)){
                    sb.append(hm.get(sub));
                }
                else{
                    sb.append('?');
                }
                i=j+1;
            }
            else{
                sb.append(ch);
                i++;
            }
        }
        return sb.toString();
    }
}