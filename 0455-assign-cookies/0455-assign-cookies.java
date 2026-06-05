class Solution {
    public int findContentChildren(int[] Student, int[] Cookie) {
        int l = 0; // to track Student
        int r = 0; //  to track cookie
        int m = Student.length;
        int n = Cookie.length; 
        Arrays.sort(Student);
        Arrays.sort(Cookie);
        while(l < m && r < n){
            if(Student[l] <= Cookie[r]){
                l++;
            }
            r++;
        }
        return l;
    }
}