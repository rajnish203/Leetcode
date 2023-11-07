import java.util.Arrays;

class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
       int n=dist.length;
       int timeToReach[]=new int[n];
       for(int i=0;i<n;i++){
           timeToReach[i]=(int)Math.ceil((double)dist[i]/speed[i]);
       }
       Arrays.sort(timeToReach);
       int countEliminate=0;
       int timeToChargeWeapon=0;
       for(int i=0;i<n;i++){
            if(timeToChargeWeapon<timeToReach[i]){
                countEliminate++;
                 timeToChargeWeapon++;
            }else{
                break;
            }
       }
       return countEliminate;
    }
}