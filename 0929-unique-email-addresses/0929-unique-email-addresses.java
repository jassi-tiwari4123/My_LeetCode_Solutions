class Solution {
    public int numUniqueEmails(String[] emails) {
        int n=emails.length;
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<n;i++){
            String s=emails[i];
            String[] parts=s.split("@");
            String local=parts[0];
            String domain=parts[1];
            local=local.replace(".","");
            int indOfPlus=local.indexOf("+");
            if(indOfPlus!=-1){
                local=local.substring(0,indOfPlus);
            }
            String m=local+"@"+domain;
            hs.add(m);
        }
        return hs.size();
    }
}