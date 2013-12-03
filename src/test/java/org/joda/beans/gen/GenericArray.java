/*
 *  Copyright 2001-2013 Stephen Colebourne
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
package org.joda.beans.gen;

import java.util.Map;
import java.util.Set;

import org.joda.beans.Bean;
import org.joda.beans.BeanBuilder;
import org.joda.beans.BeanDefinition;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

/**
 * Mock JavaBean, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition
public class GenericArray<T extends Address> implements Bean {

    /** The name. */
    @PropertyDefinition(validate = "notNull")
    private T[] values;

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code GenericArray}.
     * @return the meta-bean, not null
     */
    @SuppressWarnings("rawtypes")
    public static GenericArray.Meta meta() {
        return GenericArray.Meta.INSTANCE;
    }

    /**
     * The meta-bean for {@code GenericArray}.
     * @param <R>  the bean's generic type
     * @param cls  the bean's generic type
     * @return the meta-bean, not null
     */
    @SuppressWarnings("unchecked")
    public static <R extends Address> GenericArray.Meta<R> metaGenericArray(Class<R> cls) {
        return GenericArray.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(GenericArray.Meta.INSTANCE);
    }

    @SuppressWarnings("unchecked")
    @Override
    public GenericArray.Meta<T> metaBean() {
        return GenericArray.Meta.INSTANCE;
    }

    @Override
    public <R> Property<R> property(String propertyName) {
        return metaBean().<R>metaProperty(propertyName).createProperty(this);
    }

    @Override
    public Set<String> propertyNames() {
        return metaBean().metaPropertyMap().keySet();
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the name.
     * @return the value of the property, not null
     */
    public T[] getValues() {
        return values;
    }

    /**
     * Sets the name.
     * @param values  the new value of the property, not null
     */
    public void setValues(T[] values) {
        JodaBeanUtils.notNull(values, "values");
        this.values = values;
    }

    /**
     * Gets the the {@code values} property.
     * @return the property, not null
     */
    public final Property<T[]> values() {
        return metaBean().values().createProperty(this);
    }

    //-----------------------------------------------------------------------
    @Override
    @SuppressWarnings("unchecked")
    public GenericArray<T> clone() {
        BeanBuilder<?> builder = metaBean().builder();
        for (MetaProperty<?> mp : metaBean().metaPropertyIterable()) {
            if (mp.style().isBuildable()) {
                Object value = mp.get(this);
                if (value instanceof Bean) {
                    value = ((Bean) value).clone();
                }
                builder.set(mp.name(), value);
            }
        }
        return (GenericArray<T>) builder.build();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            GenericArray<?> other = (GenericArray<?>) obj;
            return JodaBeanUtils.equal(getValues(), other.getValues());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash += hash * 31 + JodaBeanUtils.hashCode(getValues());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(64);
        buf.append("GenericArray{");
        int len = buf.length();
        toString(buf);
        if (buf.length() > len) {
            buf.setLength(buf.length() - 2);
        }
        buf.append('}');
        return buf.toString();
    }

    protected void toString(StringBuilder buf) {
        buf.append("values").append('=').append(JodaBeanUtils.toString(getValues())).append(',').append(' ');
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code GenericArray}.
     */
    public static class Meta<T extends Address> extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        @SuppressWarnings("rawtypes")
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code values} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<T[]> values = (DirectMetaProperty) DirectMetaProperty.ofReadWrite(
                this, "values", GenericArray.class, Object[].class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "values");

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case -823812830:  // values
                    return values;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends GenericArray<T>> builder() {
            return new DirectBeanBuilder<GenericArray<T>>(new GenericArray<T>());
        }

        @SuppressWarnings({"unchecked", "rawtypes" })
        @Override
        public Class<? extends GenericArray<T>> beanType() {
            return (Class) GenericArray.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code values} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<T[]> values() {
            return values;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case -823812830:  // values
                    return ((GenericArray<?>) bean).getValues();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @SuppressWarnings("unchecked")
        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case -823812830:  // values
                    ((GenericArray<T>) bean).setValues((T[]) newValue);
                    return;
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

        @Override
        protected void validate(Bean bean) {
            JodaBeanUtils.notNull(((GenericArray<?>) bean).values, "values");
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
