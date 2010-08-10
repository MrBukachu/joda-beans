/*
 *  Copyright 2001-2010 Stephen Colebourne
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

import java.util.ArrayList;
import java.util.List;

import org.joda.beans.PropertyReadWrite;

/**
 * A bean that can be generated.
 * 
 * @author Stephen Colebourne
 */
class GeneratableProperty {

    /** Owning bean. */
    private final GeneratableBean bean;
    /** Property name. */
    private String propertyName;
    /** Field name. */
    private String fieldName;
    /** Upper property name. */
    private String upperName;
    /** Property type. */
    private String type;
    /** Whether the field is declared final. */
    private boolean isFinal;
//    /** The getter style. */
//    private String getStyle;
//    /** The setter style. */
//    private String setStyle;
    /** Read-write type. */
    private PropertyReadWrite readWrite;
    /** Deprecated flag. */
    private boolean deprecated;
    /** First comment about the property. */
    private String firstComment;
    /** Other comments about the property. */
    private final List<String> comments = new ArrayList<String>();

    /**
     * Constructor.
     */
    GeneratableProperty(GeneratableBean bean) {
        this.bean = bean;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the bean.
     * @return the bean, not null
     */
    public GeneratableBean getBean() {
        return bean;
    }

    /**
     * Gets the property name.
     * @return the property name
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * Sets the property name.
     * @param propertyName  the property name to set
     */
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    /**
     * Gets the field name.
     * @return the field name
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the field name.
     * @param fieldName  the field name to set
     */
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * Gets the upper property name.
     * @return the upper name
     */
    public String getUpperName() {
        return upperName;
    }

    /**
     * Sets the upper property name.
     * @param upperName  the upper name to set
     */
    public void setUpperName(String upperName) {
        this.upperName = upperName;
    }

    /**
     * Gets the type.
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type.
     * @param type  the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets whether the field is declared final.
     * @return the type
     */
    public boolean isFinal() {
        return isFinal;
    }

    /**
     * Sets whether the field is declared final.
     * @param type  the field is final flag
     */
    public void setFinal(boolean isFinal) {
        this.isFinal = isFinal;
    }

    /**
     * Gets the read-write flag.
     * @return the read write
     */
    public PropertyReadWrite getReadWrite() {
        return readWrite;
    }

    /**
     * Sets the read-write flag.
     * @param readWrite  the read write to set
     */
    public void setReadWrite(PropertyReadWrite readWrite) {
        this.readWrite = readWrite;
    }

    /**
     * Checks if the property is deprecated.
     * @return the deprecated flag
     */
    public boolean isDeprecated() {
        return deprecated;
    }

    /**
     * Sets if the property is deprecated.
     * @param deprecated  the deprecated to set
     */
    public void setDeprecated(boolean deprecated) {
        this.deprecated = deprecated;
    }

    /**
     * Gets the first comment line.
     * @return the first comment
     */
    public String getFirstComment() {
        return firstComment;
    }

    /**
     * Sets the first comment line.
     * @param firstComment  the first comment to set
     */
    public void setFirstComment(String firstComment) {
        this.firstComment = firstComment;
    }

    /**
     * Gets the remaining comments.
     * @return the remaining comments, not null
     */
    public List<String> getComments() {
        return comments;
    }

    //-----------------------------------------------------------------------
    /**
     * Checks if the property is parameterized with generics.
     * @return true if generified
     */
    public boolean isGenericParamType() {
        return type.indexOf("<") >= 0;
    }

    /**
     * Gets the parameterization of the property.
     * @return the generic type, or a blank string if not generic, not null
     */
    public String getGenericParamType() {
        int pos = type.indexOf("<");
        if (pos < 0) {
            return "";
        }
        return type.substring(pos + 1, type.length() - 1);
    }

    /**
     * Gets the raw type of the property without generics.
     * @return the raw type, not null
     */
    public String getRawType() {
        int pos = type.indexOf("<");
        return (pos < 0 ? type : type.substring(0, pos));
    }

    /**
     * Checks if the type is the generic type of the bean.
     * For example, if the property is of type T in a bean of Foo[T].
     * @return true if matches
     */
    public boolean isBeanGenericType() {
        return type.equals(bean.getGenericParamType());
    }

    /**
     * Checks if the property is generic in some way.
     * @return true if generic
     */
    public boolean isGeneric() {
        return isGenericParamType() || isBeanGenericType();
    }

}