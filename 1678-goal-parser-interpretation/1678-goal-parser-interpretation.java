class Solution {
    public String interpret(String command) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while(i < command.length()){
            switch(command.charAt(i)){
                case 'G' :{
                    sb.append("G");
                    i++;
                    break;
                }
                case '(' :{
                    if(command.charAt(i+1)==')'){
                        i+=2;
                        sb.append("o");
                    }
                    else{
                        i+=4;
                        sb.append("al");
                    }
                }
            }
        }
        return sb.toString();
    }
}