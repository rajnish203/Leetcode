class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
    int minCell=Math.max(Math.abs(fx-sx), Math.abs(fy-sy));

    if(minCell==0){
        return t!=1;
    }
    return minCell<=t;
    }
}