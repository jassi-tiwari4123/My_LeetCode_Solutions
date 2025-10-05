class Solution {
    public int evalRPN(String[] tokens) {
    //     Stack<Integer> st=new Stack<>();
    //     for(int i=0;i<tokens.length;i++){
    //         if(isOperator(tokens[i])){
    //             int op1=st.pop();
    //             int op2=st.pop();
    //             int result=0;
    //             if(tokens[i].equals("+")){
    //                 result= op2+op1;
    //             }
    //             else if(tokens[i].equals("-")){
    //                 result= op2-op1;
    //             }
    //             else if(tokens[i].equals("*")){
    //                 result= op2*op1;
    //             }
    //             else if(tokens[i].equals("/")){
    //                 result= op2/op1;
    //             }
    //             st.push(result);
    //         }
    //         else{
    //             st.push(Integer.parseInt(tokens[i]));
    //         }
    //     }
    //     return st.pop();
    // }
    // public boolean isOperator(String x){
    //     return (x.equals("+") || x.equals("-") || x.equals("/") || x.equals("*"));
    // }


    // using switch case
    Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(isOperator(tokens[i])){
                int op1=st.pop();
                int op2=st.pop();
                int result=0;
                switch(tokens[i]){
                    case "+":
                        result= op2+op1;
                        break;
                    case "-":
                        result= op2-op1;
                        break;
                    case "*":
                        result= op2*op1;
                        break;
                    case "/":
                        result= op2/op1;
                        break;
                }
                st.push(result);
            }
            else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.pop();
    }
    public static boolean isOperator(String x){
        return (x.equals("+") || x.equals("-") || x.equals("/") || x.equals("*"));
    }
}