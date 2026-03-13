package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class BeanPropertyMap implements Iterable<SettableBeanProperty>, Serializable {
    private static final long serialVersionUID = 2;
    private final Map<String, List<PropertyName>> _aliasDefs;
    private final Map<String, String> _aliasMapping;
    protected final boolean _caseInsensitive;
    private Object[] _hashArea;
    private int _hashMask;
    private final Locale _locale;
    private final SettableBeanProperty[] _propsInOrder;
    private int _size;
    private int _spillCount;

    public BeanPropertyMap(boolean z10, Collection<SettableBeanProperty> collection, Map<String, List<PropertyName>> map, Locale locale) {
        this._caseInsensitive = z10;
        this._propsInOrder = (SettableBeanProperty[]) collection.toArray(new SettableBeanProperty[collection.size()]);
        this._aliasDefs = map;
        this._locale = locale;
        this._aliasMapping = _buildAliasMapping(map, z10, locale);
        init(collection);
    }

    private Map<String, String> _buildAliasMapping(Map<String, List<PropertyName>> map, boolean z10, Locale locale) {
        if (map == null || map.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry<String, List<PropertyName>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (z10) {
                key = key.toLowerCase(locale);
            }
            Iterator<PropertyName> it = entry.getValue().iterator();
            while (it.hasNext()) {
                String simpleName = it.next().getSimpleName();
                if (z10) {
                    simpleName = simpleName.toLowerCase(locale);
                }
                map2.put(simpleName, key);
            }
        }
        return map2;
    }

    private final SettableBeanProperty _find2(String str, int i10, Object obj) {
        if (obj == null) {
            return _findWithAlias(this._aliasMapping.get(str));
        }
        int i11 = this._hashMask + 1;
        int i12 = ((i10 >> 1) + i11) << 1;
        Object obj2 = this._hashArea[i12];
        if (str.equals(obj2)) {
            return (SettableBeanProperty) this._hashArea[i12 + 1];
        }
        if (obj2 != null) {
            int i13 = (i11 + (i11 >> 1)) << 1;
            int i14 = this._spillCount + i13;
            while (i13 < i14) {
                Object obj3 = this._hashArea[i13];
                if (obj3 == str || str.equals(obj3)) {
                    return (SettableBeanProperty) this._hashArea[i13 + 1];
                }
                i13 += 2;
            }
        }
        return _findWithAlias(this._aliasMapping.get(str));
    }

    private SettableBeanProperty _find2ViaAlias(String str, int i10, Object obj) {
        int i11 = this._hashMask + 1;
        int i12 = ((i10 >> 1) + i11) << 1;
        Object obj2 = this._hashArea[i12];
        if (str.equals(obj2)) {
            return (SettableBeanProperty) this._hashArea[i12 + 1];
        }
        if (obj2 == null) {
            return null;
        }
        int i13 = (i11 + (i11 >> 1)) << 1;
        int i14 = this._spillCount + i13;
        while (i13 < i14) {
            Object obj3 = this._hashArea[i13];
            if (obj3 == str || str.equals(obj3)) {
                return (SettableBeanProperty) this._hashArea[i13 + 1];
            }
            i13 += 2;
        }
        return null;
    }

    private final int _findFromOrdered(SettableBeanProperty settableBeanProperty) {
        int length = this._propsInOrder.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this._propsInOrder[i10] == settableBeanProperty) {
                return i10;
            }
        }
        throw new IllegalStateException("Illegal state: property '" + settableBeanProperty.getName() + "' missing from _propsInOrder");
    }

    private final int _findIndexInHash(String str) {
        int i_hashCode = _hashCode(str);
        int i10 = i_hashCode << 1;
        if (str.equals(this._hashArea[i10])) {
            return i10 + 1;
        }
        int i11 = this._hashMask + 1;
        int i12 = ((i_hashCode >> 1) + i11) << 1;
        if (str.equals(this._hashArea[i12])) {
            return i12 + 1;
        }
        int i13 = (i11 + (i11 >> 1)) << 1;
        int i14 = this._spillCount + i13;
        while (i13 < i14) {
            if (str.equals(this._hashArea[i13])) {
                return i13 + 1;
            }
            i13 += 2;
        }
        return -1;
    }

    private SettableBeanProperty _findWithAlias(String str) {
        if (str == null) {
            return null;
        }
        int i_hashCode = _hashCode(str);
        int i10 = i_hashCode << 1;
        Object obj = this._hashArea[i10];
        if (str.equals(obj)) {
            return (SettableBeanProperty) this._hashArea[i10 + 1];
        }
        if (obj == null) {
            return null;
        }
        return _find2ViaAlias(str, i_hashCode, obj);
    }

    private final int _hashCode(String str) {
        return this._hashMask & str.hashCode();
    }

    private List<SettableBeanProperty> _properties() {
        ArrayList arrayList = new ArrayList(this._size);
        int length = this._hashArea.length;
        for (int i10 = 1; i10 < length; i10 += 2) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) this._hashArea[i10];
            if (settableBeanProperty != null) {
                arrayList.add(settableBeanProperty);
            }
        }
        return arrayList;
    }

    public static BeanPropertyMap construct(MapperConfig<?> mapperConfig, Collection<SettableBeanProperty> collection, Map<String, List<PropertyName>> map) {
        return new BeanPropertyMap(mapperConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES), collection, map, mapperConfig.getLocale());
    }

    private static final int findSize(int i10) {
        if (i10 <= 5) {
            return 8;
        }
        if (i10 <= 12) {
            return 16;
        }
        int i11 = 32;
        while (i11 < i10 + (i10 >> 2)) {
            i11 += i11;
        }
        return i11;
    }

    public SettableBeanProperty _rename(SettableBeanProperty settableBeanProperty, NameTransformer nameTransformer) {
        JsonDeserializer<Object> jsonDeserializerUnwrappingDeserializer;
        if (settableBeanProperty == null) {
            return settableBeanProperty;
        }
        SettableBeanProperty settableBeanPropertyWithSimpleName = settableBeanProperty.withSimpleName(nameTransformer.transform(settableBeanProperty.getName()));
        JsonDeserializer<Object> valueDeserializer = settableBeanPropertyWithSimpleName.getValueDeserializer();
        return (valueDeserializer == null || (jsonDeserializerUnwrappingDeserializer = valueDeserializer.unwrappingDeserializer(nameTransformer)) == valueDeserializer) ? settableBeanPropertyWithSimpleName : settableBeanPropertyWithSimpleName.withValueDeserializer(jsonDeserializerUnwrappingDeserializer);
    }

    public BeanPropertyMap assignIndexes() {
        int length = this._hashArea.length;
        int i10 = 0;
        for (int i11 = 1; i11 < length; i11 += 2) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) this._hashArea[i11];
            if (settableBeanProperty != null) {
                settableBeanProperty.assignIndex(i10);
                i10++;
            }
        }
        return this;
    }

    public SettableBeanProperty find(int i10) {
        int length = this._hashArea.length;
        for (int i11 = 1; i11 < length; i11 += 2) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) this._hashArea[i11];
            if (settableBeanProperty != null && i10 == settableBeanProperty.getPropertyIndex()) {
                return settableBeanProperty;
            }
        }
        return null;
    }

    public boolean findDeserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        SettableBeanProperty settableBeanPropertyFind = find(str);
        if (settableBeanPropertyFind == null) {
            return false;
        }
        try {
            settableBeanPropertyFind.deserializeAndSet(jsonParser, deserializationContext, obj);
            return true;
        } catch (Exception e10) {
            wrapAndThrow(e10, obj, str, deserializationContext);
            return true;
        }
    }

    public SettableBeanProperty[] getPropertiesInInsertionOrder() {
        return this._propsInOrder;
    }

    public final String getPropertyName(SettableBeanProperty settableBeanProperty) {
        return this._caseInsensitive ? settableBeanProperty.getName().toLowerCase(this._locale) : settableBeanProperty.getName();
    }

    public boolean hasAliases() {
        return !this._aliasDefs.isEmpty();
    }

    public void init(Collection<SettableBeanProperty> collection) {
        int size = collection.size();
        this._size = size;
        int iFindSize = findSize(size);
        this._hashMask = iFindSize - 1;
        int i10 = (iFindSize >> 1) + iFindSize;
        Object[] objArrCopyOf = new Object[i10 * 2];
        int i11 = 0;
        for (SettableBeanProperty settableBeanProperty : collection) {
            if (settableBeanProperty != null) {
                String propertyName = getPropertyName(settableBeanProperty);
                int i_hashCode = _hashCode(propertyName);
                int i12 = i_hashCode << 1;
                if (objArrCopyOf[i12] != null) {
                    i12 = ((i_hashCode >> 1) + iFindSize) << 1;
                    if (objArrCopyOf[i12] != null) {
                        i12 = (i10 << 1) + i11;
                        i11 += 2;
                        if (i12 >= objArrCopyOf.length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length + 4);
                        }
                    }
                }
                objArrCopyOf[i12] = propertyName;
                objArrCopyOf[i12 + 1] = settableBeanProperty;
            }
        }
        this._hashArea = objArrCopyOf;
        this._spillCount = i11;
    }

    public boolean isCaseInsensitive() {
        return this._caseInsensitive;
    }

    @Override // java.lang.Iterable
    public Iterator<SettableBeanProperty> iterator() {
        return _properties().iterator();
    }

    public void remove(SettableBeanProperty settableBeanProperty) {
        ArrayList arrayList = new ArrayList(this._size);
        String propertyName = getPropertyName(settableBeanProperty);
        int length = this._hashArea.length;
        boolean zEquals = false;
        for (int i10 = 1; i10 < length; i10 += 2) {
            Object[] objArr = this._hashArea;
            SettableBeanProperty settableBeanProperty2 = (SettableBeanProperty) objArr[i10];
            if (settableBeanProperty2 != null) {
                if (zEquals || !(zEquals = propertyName.equals(objArr[i10 - 1]))) {
                    arrayList.add(settableBeanProperty2);
                } else {
                    this._propsInOrder[_findFromOrdered(settableBeanProperty2)] = null;
                }
            }
        }
        if (zEquals) {
            init(arrayList);
            return;
        }
        throw new NoSuchElementException("No entry '" + settableBeanProperty.getName() + "' found, can't remove");
    }

    public BeanPropertyMap renameAll(NameTransformer nameTransformer) {
        if (nameTransformer == null || nameTransformer == NameTransformer.NOP) {
            return this;
        }
        int length = this._propsInOrder.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            SettableBeanProperty settableBeanProperty = this._propsInOrder[i10];
            if (settableBeanProperty == null) {
                arrayList.add(settableBeanProperty);
            } else {
                arrayList.add(_rename(settableBeanProperty, nameTransformer));
            }
        }
        return new BeanPropertyMap(this._caseInsensitive, arrayList, this._aliasDefs);
    }

    @Deprecated
    public void replace(SettableBeanProperty settableBeanProperty) {
        String propertyName = getPropertyName(settableBeanProperty);
        int i_findIndexInHash = _findIndexInHash(propertyName);
        if (i_findIndexInHash >= 0) {
            Object[] objArr = this._hashArea;
            SettableBeanProperty settableBeanProperty2 = (SettableBeanProperty) objArr[i_findIndexInHash];
            objArr[i_findIndexInHash] = settableBeanProperty;
            this._propsInOrder[_findFromOrdered(settableBeanProperty2)] = settableBeanProperty;
            return;
        }
        throw new NoSuchElementException("No entry '" + propertyName + "' found, can't replace");
    }

    public int size() {
        return this._size;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Properties=[");
        int i10 = 0;
        for (SettableBeanProperty settableBeanProperty : this) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(settableBeanProperty.getName());
            sb2.append('(');
            sb2.append(settableBeanProperty.getType());
            sb2.append(')');
            i10 = i11;
        }
        sb2.append(']');
        if (!this._aliasDefs.isEmpty()) {
            sb2.append("(aliases: ");
            sb2.append(this._aliasDefs);
            sb2.append(")");
        }
        return sb2.toString();
    }

    public BeanPropertyMap withCaseInsensitivity(boolean z10) {
        return this._caseInsensitive == z10 ? this : new BeanPropertyMap(this, z10);
    }

    public BeanPropertyMap withProperty(SettableBeanProperty settableBeanProperty) {
        String propertyName = getPropertyName(settableBeanProperty);
        int length = this._hashArea.length;
        for (int i10 = 1; i10 < length; i10 += 2) {
            SettableBeanProperty settableBeanProperty2 = (SettableBeanProperty) this._hashArea[i10];
            if (settableBeanProperty2 != null && settableBeanProperty2.getName().equals(propertyName)) {
                return new BeanPropertyMap(this, settableBeanProperty, i10, _findFromOrdered(settableBeanProperty2));
            }
        }
        return new BeanPropertyMap(this, settableBeanProperty, propertyName, _hashCode(propertyName));
    }

    public BeanPropertyMap withoutProperties(Collection<String> collection) {
        if (collection.isEmpty()) {
            return this;
        }
        int length = this._propsInOrder.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            SettableBeanProperty settableBeanProperty = this._propsInOrder[i10];
            if (settableBeanProperty != null && !collection.contains(settableBeanProperty.getName())) {
                arrayList.add(settableBeanProperty);
            }
        }
        return new BeanPropertyMap(this._caseInsensitive, arrayList, this._aliasDefs);
    }

    public void wrapAndThrow(Throwable th, Object obj, String str, DeserializationContext deserializationContext) throws IOException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        ClassUtil.throwIfError(th);
        boolean z10 = deserializationContext == null || deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS);
        if (th instanceof IOException) {
            if (!z10 || !(th instanceof JsonProcessingException)) {
                throw ((IOException) th);
            }
        } else if (!z10) {
            ClassUtil.throwIfRTE(th);
        }
        throw JsonMappingException.wrapWithPath(th, obj, str);
    }

    @Deprecated
    public static BeanPropertyMap construct(Collection<SettableBeanProperty> collection, boolean z10, Map<String, List<PropertyName>> map) {
        return new BeanPropertyMap(z10, collection, map);
    }

    @Deprecated
    public static BeanPropertyMap construct(Collection<SettableBeanProperty> collection, boolean z10) {
        return construct(collection, z10, (Map<String, List<PropertyName>>) Collections.EMPTY_MAP);
    }

    public SettableBeanProperty find(String str) {
        if (str != null) {
            if (this._caseInsensitive) {
                str = str.toLowerCase(this._locale);
            }
            int iHashCode = str.hashCode() & this._hashMask;
            int i10 = iHashCode << 1;
            Object obj = this._hashArea[i10];
            if (obj != str && !str.equals(obj)) {
                return _find2(str, iHashCode, obj);
            }
            return (SettableBeanProperty) this._hashArea[i10 + 1];
        }
        throw new IllegalArgumentException("Cannot pass null property name");
    }

    public void replace(SettableBeanProperty settableBeanProperty, SettableBeanProperty settableBeanProperty2) {
        int length = this._hashArea.length;
        for (int i10 = 1; i10 <= length; i10 += 2) {
            Object[] objArr = this._hashArea;
            if (objArr[i10] == settableBeanProperty) {
                objArr[i10] = settableBeanProperty2;
                this._propsInOrder[_findFromOrdered(settableBeanProperty)] = settableBeanProperty2;
                return;
            }
        }
        throw new NoSuchElementException("No entry '" + settableBeanProperty.getName() + "' found, can't replace");
    }

    @Deprecated
    public BeanPropertyMap(boolean z10, Collection<SettableBeanProperty> collection, Map<String, List<PropertyName>> map) {
        this(z10, collection, map, Locale.getDefault());
    }

    private BeanPropertyMap(BeanPropertyMap beanPropertyMap, SettableBeanProperty settableBeanProperty, int i10, int i11) {
        this._caseInsensitive = beanPropertyMap._caseInsensitive;
        this._locale = beanPropertyMap._locale;
        this._hashMask = beanPropertyMap._hashMask;
        this._size = beanPropertyMap._size;
        this._spillCount = beanPropertyMap._spillCount;
        this._aliasDefs = beanPropertyMap._aliasDefs;
        this._aliasMapping = beanPropertyMap._aliasMapping;
        Object[] objArr = beanPropertyMap._hashArea;
        this._hashArea = Arrays.copyOf(objArr, objArr.length);
        SettableBeanProperty[] settableBeanPropertyArr = beanPropertyMap._propsInOrder;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, settableBeanPropertyArr.length);
        this._propsInOrder = settableBeanPropertyArr2;
        this._hashArea[i10] = settableBeanProperty;
        settableBeanPropertyArr2[i11] = settableBeanProperty;
    }

    private BeanPropertyMap(BeanPropertyMap beanPropertyMap, SettableBeanProperty settableBeanProperty, String str, int i10) {
        this._caseInsensitive = beanPropertyMap._caseInsensitive;
        this._locale = beanPropertyMap._locale;
        this._hashMask = beanPropertyMap._hashMask;
        this._size = beanPropertyMap._size;
        this._spillCount = beanPropertyMap._spillCount;
        this._aliasDefs = beanPropertyMap._aliasDefs;
        this._aliasMapping = beanPropertyMap._aliasMapping;
        Object[] objArr = beanPropertyMap._hashArea;
        this._hashArea = Arrays.copyOf(objArr, objArr.length);
        SettableBeanProperty[] settableBeanPropertyArr = beanPropertyMap._propsInOrder;
        int length = settableBeanPropertyArr.length;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, length + 1);
        this._propsInOrder = settableBeanPropertyArr2;
        settableBeanPropertyArr2[length] = settableBeanProperty;
        int i11 = this._hashMask + 1;
        int i12 = i10 << 1;
        Object[] objArr2 = this._hashArea;
        if (objArr2[i12] != null) {
            i12 = ((i10 >> 1) + i11) << 1;
            if (objArr2[i12] != null) {
                int i13 = this._spillCount;
                i12 = ((i11 + (i11 >> 1)) << 1) + i13;
                this._spillCount = i13 + 2;
                if (i12 >= objArr2.length) {
                    this._hashArea = Arrays.copyOf(objArr2, objArr2.length + 4);
                }
            }
        }
        Object[] objArr3 = this._hashArea;
        objArr3[i12] = str;
        objArr3[i12 + 1] = settableBeanProperty;
    }

    @Deprecated
    public BeanPropertyMap(boolean z10, Collection<SettableBeanProperty> collection) {
        this(z10, collection, (Map<String, List<PropertyName>>) Collections.EMPTY_MAP, Locale.getDefault());
    }

    public BeanPropertyMap(BeanPropertyMap beanPropertyMap, boolean z10) {
        this._caseInsensitive = z10;
        this._locale = beanPropertyMap._locale;
        this._aliasDefs = beanPropertyMap._aliasDefs;
        this._aliasMapping = beanPropertyMap._aliasMapping;
        SettableBeanProperty[] settableBeanPropertyArr = beanPropertyMap._propsInOrder;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, settableBeanPropertyArr.length);
        this._propsInOrder = settableBeanPropertyArr2;
        init(Arrays.asList(settableBeanPropertyArr2));
    }
}
