package StackNeetCode;

import java.util.Stack;

public class DailyTemp {


    public int[] dailyTemperatures(int[] temperatures) {

        int[] answer = new int[temperatures.length];

        Stack<Integer> tempStack = new Stack<>();

        for(int i = 0 ; i < temperatures.length ; i++){
            while(!tempStack.isEmpty() && temperatures[i] > temperatures[tempStack.peek()]){
                int previndex = tempStack.pop();
                answer[previndex] = i - previndex;
                tempStack.pop();
            }

            tempStack.push(i);
        }
return answer;

    }
    }

