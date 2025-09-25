class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        
        StringBuilder sb=new StringBuilder();
        if((numerator>0 && denominator<0) || (numerator<0 && denominator>0)){
            sb.append("-");
        }
        long num=Math.abs((long)numerator);
        long den=Math.abs((long)denominator);
        long res=num/den;
        sb.append(res);
        long rem=num%den;
        if(rem==0){
            return sb.toString();
        }
        sb.append(".");
        HashMap<Long,Integer> hm=new HashMap<>();
        while(rem!=0){
            if(hm.containsKey(rem)){
                int index=hm.get(rem);
                sb.insert(index,"(");
                sb.append(")");
                break;
            }
            hm.put(rem,sb.length());
            rem=rem*10;
            sb.append(rem/den);
            rem=rem%den;
        }
        return sb.toString();

    }
}