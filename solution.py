class Solution:
    def makeFancyString(self, s):
        if len(s) < 3:
            return s

        sb = [s[0], s[1]]
        for i in range(2, len(s)):
            if s[i - 2] == s[i - 1] and s[i - 1] == s[i]:
                continue
            
            sb.append(s[i])
        
        return "".join(sb)
