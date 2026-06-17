class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        lst = []
        st = s.rstrip(" ")
        lst = st.split(" ")
        return len(lst[-1])