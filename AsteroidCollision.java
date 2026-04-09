import java.util.Stack;

public class AsteroidCollision {

    public int[] asteroidCollision(int[] asteroids) {


        Stack<Integer> st = new Stack<>();

        for (int a : asteroids) {

            while (!st.empty() && a < 0 && st.peek() > 0) {

                int diff = a + st.peek();

                if (diff < 0) {
                    st.pop();
                    continue;
                } else if (diff == 0) {
                    st.pop();
                    a = 0;
                } else {
                    // Stack (+) is bigger: current 'a' explodes
                    a = 0;
                }
                break; // Stop the while loop because 'a' is either equal or smaller
            }

            if (a != 0) {
                st.push(a);
            }


        }


        int[] res = new int[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        return res;
    }

}