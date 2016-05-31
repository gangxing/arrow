/*
 * Copyright 2014 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.pinpoint.profiler.util.bindvalue;

import com.navercorp.pinpoint.profiler.util.bindvalue.Types;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Map;

public class TypesTest {

    @Test
    public void testInverse() throws Exception {
        Map<Integer, String> inverse = Types.inverse();
        Field[] fields = java.sql.Types.class.getFields();
        Assert.assertEquals(inverse.size(), fields.length);
    }
}
