package org.noob.codewars.train.learn.prac2017.prac170105;

/**
 * Copyright [2017$] [Wuxinshui]
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.util.Stack;

/**
 * Created by wuxinshui on 2017/1/5.
 */
public class BestPractice {
    public long evaluator(String s) {
        if (0 == s.length()) return 0;
        Stack<Long> stack = new Stack<>();
        for (String s1 : s.split(" ")) {
            switch (s1) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    stack.push(-stack.pop() + stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    Long l = stack.pop();
                    stack.push(stack.pop() / l);
                    break;
                default:
                    stack.push(Long.parseLong(s1));
            }
        }
        return stack.pop();
    }
}
