/*****************************************************************
 *   Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 ****************************************************************/
package org.apache.cayenne.access;

import java.util.Map;

import org.apache.cayenne.Persistent;
import org.apache.cayenne.configuration.RuntimeProperties;
import org.apache.cayenne.di.Inject;
import org.apache.commons.collections.map.AbstractReferenceMap;
import org.apache.commons.collections.map.ReferenceMap;

/**
 * Default implementation of {@link ObjectMapRetainStrategy}.
 * 
 * @since 3.1
 */
public class DefaultObjectMapRetainStrategy implements ObjectMapRetainStrategy {
    
    protected RuntimeProperties runtimeProperties;
    
    public DefaultObjectMapRetainStrategy(@Inject RuntimeProperties runtimeProperties) {
        this.runtimeProperties = runtimeProperties;
    }

    public Map<Object, Persistent> createObjectMap() {
        String retainStrategy = runtimeProperties.get(MAP_RETAIN_STRATEGY_PROPERTY);
        
        if (SOFT_RETAIN_STRATEGY.equals(retainStrategy)) {
            return new ReferenceMap(AbstractReferenceMap.HARD, AbstractReferenceMap.SOFT);
        }
        else if (HARD_RETAIN_STRATEGY.equals(retainStrategy)) {
            return new ReferenceMap(AbstractReferenceMap.HARD, AbstractReferenceMap.HARD);
        }
        else {
            return new ReferenceMap(AbstractReferenceMap.HARD, AbstractReferenceMap.WEAK);
        }
    }
}