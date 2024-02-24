class Solution {
    public String defangIPaddr(String address) {
        int x = address.length();
        StringBuilder s = new StringBuilder();
        for(int i=0; i<x; i++) {
            if(address.charAt(i)=='.') {
                s.append("[");
                s.append(".");
                s.append("]");
            }
            else{
                s.append(address.charAt(i));
            }
        }
        String str = s.toString();
        return str;
    }
}