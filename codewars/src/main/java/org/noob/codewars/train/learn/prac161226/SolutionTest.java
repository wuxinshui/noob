package org.noob.codewars.train.learn.prac161226;

/**
 * Copyright [2016$] [Wuxinshui]
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

import org.junit.Test;
import org.noob.codewars.train.learn.prac160406.SystemOfEq;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by wuxinshui on 2016/12/26.
 */
public class SolutionTest {
    @Test
    public void test() throws InterruptedException {
        long s= System.currentTimeMillis();
        Thread.sleep(11000l);
        assertEquals("[4, 37, 98]", Arrays.toString(Emirps.findEmirp(50)));
        assertEquals("[0, 0, 0]", Arrays.toString(Emirps.findEmirp(10)));
        assertEquals("[8, 97, 418]", Arrays.toString(Emirps.findEmirp(100)));
        long e=System.currentTimeMillis();
        System.out.println("耗时："+(e-s)+"ms");
    }
}
