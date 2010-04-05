/*
 * Copyright 2010 Martin Grotzke
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an &quot;AS IS&quot; BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.esotericsoftware.kryo;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

import com.esotericsoftware.kryo.serialize.SimpleSerializer;

/**
 * A kryo {@link Serializer} for {@link Map}s created via {@link Collections#emptyMap()}
 * or that were just assigned the {@link Collections#EMPTY_MAP}.
 * 
 * @author <a href="mailto:martin.grotzke@javakaffee.de">Martin Grotzke</a>
 */
public class CollectionsEmptyMapSerializer extends SimpleSerializer<Map<?, ?>> {

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<?, ?> read( final ByteBuffer buffer ) {
        return Collections.emptyMap();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void write( final ByteBuffer buffer, final Map<?, ?> emptyList ) {
    }

}