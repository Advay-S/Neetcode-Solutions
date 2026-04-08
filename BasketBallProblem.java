import java.util.Stack;

public class BasketBallProblem {

    public int calPoints(String[] operations) {
        int x = 0  ;

        Stack<Integer> st = new Stack<>();

        for(int i = 0 ; i < operations.length; i++){
            if(operations[i].equals("C")){
                st.pop();
            }
            else if(operations[i].matches("-?\\d+(\\.\\d+)?")){
                st.push(Integer.parseInt(operations[i]));
            }
            else if (operations[i].equals("D")){
                x = st.peek();
                x = x*2;
                st.push(x);
            }
            else if (operations[i].equals("+")) {
                int t = st.pop();      // Temporarily remove the top element
                int y = st.peek();     // Look at the second element
                int c = t + y;         // Calculate the new score
                st.push(t);            // Push the first one back
                st.push(c);            // Push the new sum on top
            }
        }


        int totalSum = 0;
        for (int score : st) {
            totalSum += score;
        }
        return totalSum;


    }
}
