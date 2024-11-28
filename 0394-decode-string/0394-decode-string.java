class Solution {
    public String decodeString(String s) {
        Stack<Integer> numberStack = new Stack<>();
        Stack<String> mainStack = new Stack<>();

        for(int i=0;i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>= '0' && ch<='9'){  // identify if it is a number or not 
                int num =0;

                while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--; // to maintain the loop veriable
                numberStack.push(num);

            }else if(ch != ']'){
                mainStack.push(ch+ "");
            }else{  // if the loop found ']'
                String str= "";

                while(!mainStack.peek().equals("[")){
                str = mainStack.pop() + str;
                }
                mainStack.pop();

                int repetationNumber =numberStack.pop();

                StringBuilder sb = new StringBuilder("");

                while(repetationNumber>0){
                    sb.append(str);
                    repetationNumber--;

                }
                mainStack.push(sb.toString());
            }

        }

        StringBuilder ans = new StringBuilder("");
        while(mainStack.size()> 0){
            ans.insert(0, mainStack.pop());
        }
        return ans.toString();
    }
}