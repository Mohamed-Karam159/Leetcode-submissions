class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // [1,0,1,0,0,1]
        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 1  && i+1 < flowerbed.length && flowerbed[i+1] == 0){
                i++; // i = 2;
                continue;
            }
         else if ( (flowerbed[i] == 0 && i-1 >= 0 && flowerbed[i-1] == 0 && (i == flowerbed.length - 1 || flowerbed[i+1] == 0)) || ( i == 0 && flowerbed[i] == 0 && (i + 1 == flowerbed.length || flowerbed[i+1] == 0))) {

                flowerbed[i] = 1;
                n--; // n = 1
                i++;

            }
        }
        if(n <= 0)
            return true;
        else
            return false;
    }
}