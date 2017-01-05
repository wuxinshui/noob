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
public class Evaluator {
    public long evaluate(String s) {
        // write your magic code here
        Stack<Long> stack = new Stack();
        String[] array = s.split(" ");

        for (int i = 0; i < array.length; i++) {
            String string = array[i];
            //识别数字
            if (isNumbers(string)) {
                stack.push(Long.valueOf(string));
            }
            //识别符号
            if (!isNumbers(string)) {
                Long first = stack.pop();
                Long second = stack.pop();
                Long result = null;
                if ("*".equals(string)) {
                    result = second * first;
                } else if ("+".equals(string)) {
                    result = second + first;
                } else if ("-".equals(string)) {
                    result = second - first;
                } else if ("/".equals(string)) {
                    result = second / first;
                }
                stack.push(result);
            }
        }
        return stack.pop();
    }

    private static boolean isNumbers(String s) {
        try {
            Long.valueOf(s);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
