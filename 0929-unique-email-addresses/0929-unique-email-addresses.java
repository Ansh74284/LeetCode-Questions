class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet <String> set = new HashSet<>();
        for(int i=0; i<emails.length;i++){
            String current = emails[i];
            StringBuilder sb = new StringBuilder();
            int indexOfAt = current.indexOf('@');
            String localName = current.substring(0,indexOfAt);
            String domainName = current.substring(indexOfAt);

            for(int j=0; j<localName.length(); j++){
                if(localName.charAt(j)=='.'){
                    continue;
                }
                if(localName.charAt(j)=='+'){
                    break;
                }
                sb.append(localName.charAt(j));
            }
            sb.append(domainName);
            set.add(sb.toString());
        }
        return set.size();
    }
}