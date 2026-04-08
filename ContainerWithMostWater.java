package TwoPointers;

public class ContainerWithMostWater {

        public int maxArea(int[] height) {


            int size = height.length;

            int p1 = 0 ;
            int p2 = size-1 ;

            int maxArea = 0 ;

            while (p1 < p2 ) {
                int area =  Math.min(height[p1] , height[p2] ) * (p2 - p1);
                maxArea = Math.max(maxArea , area);

                if(height[p1] < height[p2]){
                    p1++;
                }
                else {
                    p2--;
                }




            }





            return maxArea;

        }

    }

