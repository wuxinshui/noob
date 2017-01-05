package org.noob.codewars.train.learn.prac2017.prac170105;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

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

/**
 * Created by wuxinshui on 2017/1/5.
 */
public class EvaluatorTest {

    @Test
    public void test1() throws Exception {
        Evaluator eval = new Evaluator();
        assertEquals(10, eval.evaluate("2 3 9 4 / + *"));
        assertEquals(70, eval.evaluate("25 45 +"));
    }

    @Test
    public void test2() throws Exception {
        BestPractice eval = new BestPractice();
        assertEquals(10, eval.evaluator("2 3 9 4 / + *"));
        assertEquals(70, eval.evaluator("25 45 +"));
    }
}
