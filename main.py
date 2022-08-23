def longestPalindrome(s):
        """
        :type s: str
        :rtype: int
        """
        length = 0
        p = False
        for c in s:
            original = len(s)
            s = s.replace(c, '')
            after = len(s)
            diff = original - after
            length += (diff // 2) * 2
            if p:
                continue
            if diff % 2 == 1:
                p = True
        return length + p