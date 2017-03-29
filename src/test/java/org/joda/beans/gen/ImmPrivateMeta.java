/*
 *  Copyright 2001-present Stephen Colebourne
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
import java.util.NoSuchElementException;

import org.joda.beans.Bean;
import org.joda.beans.BeanDefinition;
import org.joda.beans.ImmutableBean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectFieldsBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

/**
 * Mock address JavaBean, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition(metaScope = "private")
public final class ImmPrivateMeta implements ImmutableBean {

    /**
     * The number.
     */
    @PropertyDefinition
    private final int number;
    /**
     * The street.
     */
    @PropertyDefinition(validate = "notNull")
    private final String street;
    /**
     * The city.
     */
    @PropertyDefinition(validate = "notNull")
    private final String city;
    /**
     * The owner.
     */
    @PropertyDefinition(validate = "notNull")
    private final ImmPerson owner;

    //------------------------- AUTOGENERATED START -------------------------
    /**
     * The meta-bean for {@code ImmPrivateMeta}.
     * @return the meta-bean, not null
     */
    public static MetaBean meta() {
        return ImmPrivateMeta.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(ImmPrivateMeta.Meta.INSTANCE);
    }

    /**
     * Returns a builder used to create an instance of the bean.
     * @return the builder, not null
     */
    public static ImmPrivateMeta.Builder builder() {
        return new ImmPrivateMeta.Builder();
    }

    private ImmPrivateMeta(
            int number,
            String street,
            String city,
            ImmPerson owner) {
        JodaBeanUtils.notNull(street, "street");
        JodaBeanUtils.notNull(city, "city");
        JodaBeanUtils.notNull(owner, "owner");
        this.number = number;
        this.street = street;
        this.city = city;
        this.owner = owner;
    }

    @Override
    public MetaBean metaBean() {
        return ImmPrivateMeta.Meta.INSTANCE;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the number.
     * @return the value of the property
     */
    public int getNumber() {
        return number;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the street.
     * @return the value of the property, not null
     */
    public String getStreet() {
        return street;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the city.
     * @return the value of the property, not null
     */
    public String getCity() {
        return city;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the owner.
     * @return the value of the property, not null
     */
    public ImmPerson getOwner() {
        return owner;
    }

    //-----------------------------------------------------------------------
    /**
     * Returns a builder that allows this bean to be mutated.
     * @return the mutable builder, not null
     */
    public Builder toBuilder() {
        return new Builder(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            ImmPrivateMeta other = (ImmPrivateMeta) obj;
            return (number == other.number) &&
                    JodaBeanUtils.equal(street, other.street) &&
                    JodaBeanUtils.equal(city, other.city) &&
                    JodaBeanUtils.equal(owner, other.owner);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(number);
        hash = hash * 31 + JodaBeanUtils.hashCode(street);
        hash = hash * 31 + JodaBeanUtils.hashCode(city);
        hash = hash * 31 + JodaBeanUtils.hashCode(owner);
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(160);
        buf.append("ImmPrivateMeta{");
        buf.append("number").append('=').append(number).append(',').append(' ');
        buf.append("street").append('=').append(street).append(',').append(' ');
        buf.append("city").append('=').append(city).append(',').append(' ');
        buf.append("owner").append('=').append(JodaBeanUtils.toString(owner));
        buf.append('}');
        return buf.toString();
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code ImmPrivateMeta}.
     */
    private static final class Meta extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code number} property.
         */
        private final MetaProperty<Integer> number = DirectMetaProperty.ofImmutable(
                this, "number", ImmPrivateMeta.class, Integer.TYPE);
        /**
         * The meta-property for the {@code street} property.
         */
        private final MetaProperty<String> street = DirectMetaProperty.ofImmutable(
                this, "street", ImmPrivateMeta.class, String.class);
        /**
         * The meta-property for the {@code city} property.
         */
        private final MetaProperty<String> city = DirectMetaProperty.ofImmutable(
                this, "city", ImmPrivateMeta.class, String.class);
        /**
         * The meta-property for the {@code owner} property.
         */
        private final MetaProperty<ImmPerson> owner = DirectMetaProperty.ofImmutable(
                this, "owner", ImmPrivateMeta.class, ImmPerson.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "number",
                "street",
                "city",
                "owner");

        /**
         * Restricted constructor.
         */
        private Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case -1034364087:  // number
                    return number;
                case -891990013:  // street
                    return street;
                case 3053931:  // city
                    return city;
                case 106164915:  // owner
                    return owner;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public ImmPrivateMeta.Builder builder() {
            return new ImmPrivateMeta.Builder();
        }

        @Override
        public Class<? extends ImmPrivateMeta> beanType() {
            return ImmPrivateMeta.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case -1034364087:  // number
                    return ((ImmPrivateMeta) bean).getNumber();
                case -891990013:  // street
                    return ((ImmPrivateMeta) bean).getStreet();
                case 3053931:  // city
                    return ((ImmPrivateMeta) bean).getCity();
                case 106164915:  // owner
                    return ((ImmPrivateMeta) bean).getOwner();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            metaProperty(propertyName);
            if (quiet) {
                return;
            }
            throw new UnsupportedOperationException("Property cannot be written: " + propertyName);
        }

    }

    //-----------------------------------------------------------------------
    /**
     * The bean-builder for {@code ImmPrivateMeta}.
     */
    public static final class Builder extends DirectFieldsBeanBuilder<ImmPrivateMeta> {

        private int number;
        private String street;
        private String city;
        private ImmPerson owner;

        /**
         * Restricted constructor.
         */
        private Builder() {
        }

        /**
         * Restricted copy constructor.
         * @param beanToCopy  the bean to copy from, not null
         */
        private Builder(ImmPrivateMeta beanToCopy) {
            this.number = beanToCopy.getNumber();
            this.street = beanToCopy.getStreet();
            this.city = beanToCopy.getCity();
            this.owner = beanToCopy.getOwner();
        }

        //-----------------------------------------------------------------------
        @Override
        public Object get(String propertyName) {
            switch (propertyName.hashCode()) {
                case -1034364087:  // number
                    return number;
                case -891990013:  // street
                    return street;
                case 3053931:  // city
                    return city;
                case 106164915:  // owner
                    return owner;
                default:
                    throw new NoSuchElementException("Unknown property: " + propertyName);
            }
        }

        @Override
        public Builder set(String propertyName, Object newValue) {
            switch (propertyName.hashCode()) {
                case -1034364087:  // number
                    this.number = (Integer) newValue;
                    break;
                case -891990013:  // street
                    this.street = (String) newValue;
                    break;
                case 3053931:  // city
                    this.city = (String) newValue;
                    break;
                case 106164915:  // owner
                    this.owner = (ImmPerson) newValue;
                    break;
                default:
                    throw new NoSuchElementException("Unknown property: " + propertyName);
            }
            return this;
        }

        @Override
        public Builder set(MetaProperty<?> property, Object value) {
            super.set(property, value);
            return this;
        }

        /**
         * @deprecated Use Joda-Convert in application code
         */
        @Override
        @Deprecated
        public Builder setString(String propertyName, String value) {
            setString(ImmPrivateMeta.Meta.INSTANCE.metaProperty(propertyName), value);
            return this;
        }

        /**
         * @deprecated Use Joda-Convert in application code
         */
        @Override
        @Deprecated
        public Builder setString(MetaProperty<?> property, String value) {
            super.setString(property, value);
            return this;
        }

        /**
         * @deprecated Loop in application code
         */
        @Override
        @Deprecated
        public Builder setAll(Map<String, ? extends Object> propertyValueMap) {
            super.setAll(propertyValueMap);
            return this;
        }

        @Override
        public ImmPrivateMeta build() {
            return new ImmPrivateMeta(
                    number,
                    street,
                    city,
                    owner);
        }

        //-----------------------------------------------------------------------
        /**
         * Sets the number.
         * @param number  the new value
         * @return this, for chaining, not null
         */
        public Builder number(int number) {
            this.number = number;
            return this;
        }

        /**
         * Sets the street.
         * @param street  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder street(String street) {
            JodaBeanUtils.notNull(street, "street");
            this.street = street;
            return this;
        }

        /**
         * Sets the city.
         * @param city  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder city(String city) {
            JodaBeanUtils.notNull(city, "city");
            this.city = city;
            return this;
        }

        /**
         * Sets the owner.
         * @param owner  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder owner(ImmPerson owner) {
            JodaBeanUtils.notNull(owner, "owner");
            this.owner = owner;
            return this;
        }

        //-----------------------------------------------------------------------
        @Override
        public String toString() {
            StringBuilder buf = new StringBuilder(160);
            buf.append("ImmPrivateMeta.Builder{");
            buf.append("number").append('=').append(JodaBeanUtils.toString(number)).append(',').append(' ');
            buf.append("street").append('=').append(JodaBeanUtils.toString(street)).append(',').append(' ');
            buf.append("city").append('=').append(JodaBeanUtils.toString(city)).append(',').append(' ');
            buf.append("owner").append('=').append(JodaBeanUtils.toString(owner));
            buf.append('}');
            return buf.toString();
        }

    }

    //-------------------------- AUTOGENERATED END --------------------------
}
