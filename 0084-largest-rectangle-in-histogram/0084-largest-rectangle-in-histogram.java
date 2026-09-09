class Solution {
    public int largestRectangleArea(int[] height) {
        
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] height = new int[n];
        // for (int i = 0; i < n; i++) {
        //     height[i] = sc.nextInt();
        // }
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = height.length;

        for (int i = 0; i <= n; i++) {
            // imaginary bar of height 0 at end
            int currentHeight = (i == n) ? 0 : height[i];

            while (!stack.isEmpty() &&
                    currentHeight < height[stack.peek()]) {

                int ht = height[stack.pop()];
                int width;

                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }
                int area =  ht * width;
                maxArea = Math.max(maxArea, area);
            }
            stack.push(i);
        }
      return maxArea;
        // int n = heights.length ;
        // int[] stack = new int[n + 1] ;
        // int top = -1 ;
        // int res = 0 ;
        // for(int i = 0 ; i <= n ; i ++)
        // {
        //     while(top >= 0 && (i == n || heights[stack[top]] > heights[i]))
        //     {
        //         int height = heights[stack[top--]] ;

        //         int left = top < 0 ? -1 : stack[top] ;

        //         res = Math.max(res, height * (i - left - 1)) ;
        //     }
        //     stack[++ top] = i ;
        // }
        // return res ;
        
    }
}
// class Solution {
//     public int largestRectangleArea(int[] heights) {
//         int n= heights.length;
//         Stack<Integer> st1= new Stack<>(); // putting indexes instead of element 
        
//         int nse[]= new int[n];
//         nse[n-1]= n;
//         st1.push(n-1);
//         for(int i=n-2;i>=0;i--){
//             while(st1.size()>0 && heights[st1.peek()] >= heights[i]) st1.pop();
//             if(st1.size()== 0) nse[i]= n;
//             else nse[i]= st1.peek();
//             st1.push(i);
//         }
//         // clearing the stack for pse 
//         while(st1.size()>0){ 
//             st1.pop();
//         }

//         int pse[]= new int[n];
//         pse[0]=-1;
//         st1.push(0);
//         for(int i=1;i<n;i++){
//             while(st1.size()>0 && heights[st1.peek()] >= heights[i]) st1.pop();
//             if(st1.size()==0) pse[i]=-1;
//             else pse[i]= st1.peek();
//             st1.push(i);
//         }

//         int maxArea= 0;
//         for(int i=0;i<n;i++){
//             int area= heights[i]* (nse[i]-pse[i]-1);
//             maxArea= Math.max(area, maxArea);
//         }
//         return maxArea;

//     }
// }