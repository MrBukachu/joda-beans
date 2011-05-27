/*
 *  Copyright 2001-2011 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.beans;

import java.util.Map;

import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

/**
 * Mock JavaBean, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition
public class PersonDocumentation extends Documentation<Person> {

    /** The name. */
    @PropertyDefinition
    private String name;

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code PersonDocumentation}.
     * @return the meta-bean, not null
     */
    @SuppressWarnings("unchecked")
    public static PersonDocumentation.Meta meta() {
        return PersonDocumentation.Meta.INSTANCE;
    }

    @Override
    public PersonDocumentation.Meta metaBean() {
        return PersonDocumentation.Meta.INSTANCE;
    }

    @Override
    protected Object propertyGet(String propertyName) {
        switch (propertyName.hashCode()) {
            case 3373707:  // name
                return getName();
        }
        return super.propertyGet(propertyName);
    }

    @Override
    protected void propertySet(String propertyName, Object newValue) {
        switch (propertyName.hashCode()) {
            case 3373707:  // name
                setName((String) newValue);
                return;
        }
        super.propertySet(propertyName, newValue);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the name.
     * @return the value of the property
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     * @param name  the new value of the property
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the the {@code name} property.
     * @return the property, not null
     */
    public final Property<String> name() {
        return metaBean().name().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code PersonDocumentation}.
     */
    public static class Meta extends Documentation.Meta<Person> {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code name} property.
         */
        private final MetaProperty<String> name = DirectMetaProperty.ofReadWrite(this, "name", String.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> map = new DirectMetaPropertyMap(
            this, (DirectMetaPropertyMap) super.metaPropertyMap(),
            "name");

        @Override
        public PersonDocumentation createBean() {
            return new PersonDocumentation();
        }

        @Override
        public Class<? extends PersonDocumentation> beanType() {
            return PersonDocumentation.class;
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case 3373707:  // name
                    return name;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return map;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code name} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> name() {
            return name;
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
