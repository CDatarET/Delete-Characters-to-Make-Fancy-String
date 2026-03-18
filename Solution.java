class Solution {
    public String makeFancyString(String s) {
        if(s.length() < 3){
            return(s);
        }

        StringBuilder sb = new StringBuilder(s.substring(0, 2));
        for(int i = 2; i < s.length(); i++){
            if(s.charAt(i - 2) == s.charAt(i - 1) && s.charAt(i - 1) == s.charAt(i)){
                continue;
            }

            sb.append(s.charAt(i));
        }

        return(sb.toString());
    }
}
