class Solution {
    public int findComplement(int num) {
        int bl=32-Integer.numberOfLeadingZeros(num);
        int bm=(1<<bl)-1;
        return num^bm;
    }
}