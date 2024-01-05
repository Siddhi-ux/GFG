class Solution:
    def findNth(self,N):
        #code here
        t = 1
        res = 0
        base = 9
        while(N>0):
            res = res+(N%base)*t
            N = N//base
            t = t*10
        return res
        
