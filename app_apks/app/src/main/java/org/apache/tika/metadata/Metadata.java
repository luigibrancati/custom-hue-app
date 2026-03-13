package org.apache.tika.metadata;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.TimeZone;
import org.apache.tika.metadata.Property;
import org.apache.tika.metadata.writefilter.MetadataWriteFilter;
import org.apache.tika.utils.DateUtils;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class Metadata implements CreativeCommons, Geographic, HttpHeaders, Message, ClimateForcast, TIFF, TikaMimeKeys, Serializable {
    private static final MetadataWriteFilter ACCEPT_ALL = new MetadataWriteFilter() { // from class: org.apache.tika.metadata.Metadata.1
        private String[] appendValues(String[] strArr, String str) {
            if (str == null) {
                return strArr;
            }
            int length = strArr.length;
            String[] strArr2 = new String[length + 1];
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            strArr2[length] = str;
            return strArr2;
        }

        @Override // org.apache.tika.metadata.writefilter.MetadataWriteFilter
        public void add(String str, String str2, Map<String, String[]> map) {
            String[] strArr = map.get(str);
            if (strArr == null) {
                set(str, str2, map);
            } else {
                map.put(str, appendValues(strArr, str2));
            }
        }

        @Override // org.apache.tika.metadata.writefilter.MetadataWriteFilter
        public void set(String str, String str2, Map<String, String[]> map) {
            if (str2 != null) {
                map.put(str, new String[]{str2});
            } else {
                map.remove(str);
            }
        }

        @Override // org.apache.tika.metadata.writefilter.MetadataWriteFilter
        public void filterExisting(Map<String, String[]> map) {
        }
    };
    private static final DateUtils DATE_UTILS = new DateUtils();
    private static final long serialVersionUID = 5623926545693153182L;
    private Map<String, String[]> metadata;
    private MetadataWriteFilter writeFilter = ACCEPT_ALL;

    public Metadata() {
        this.metadata = null;
        this.metadata = new HashMap();
    }

    private String[] _getValues(String str) {
        String[] strArr = this.metadata.get(str);
        return strArr == null ? new String[0] : strArr;
    }

    private static DateFormat createDateFormat(String str, TimeZone timeZone) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, new DateFormatSymbols(Locale.US));
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        return simpleDateFormat;
    }

    private int getMetadataEntryHashCode(Map.Entry<String, String[]> entry) {
        return Objects.hashCode(entry.getKey()) ^ Arrays.hashCode(entry.getValue());
    }

    private static synchronized Date parseDate(String str) {
        return DATE_UTILS.tryToParse(str);
    }

    public void add(String str, String str2) {
        this.writeFilter.add(str, str2, this.metadata);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Metadata)) {
            return false;
        }
        Metadata metadata = (Metadata) obj;
        if (metadata.size() != size()) {
            return false;
        }
        for (String str : names()) {
            String[] strArr_getValues = metadata._getValues(str);
            String[] strArr_getValues2 = _getValues(str);
            if (strArr_getValues.length != strArr_getValues2.length) {
                return false;
            }
            for (int i10 = 0; i10 < strArr_getValues.length; i10++) {
                if (!strArr_getValues[i10].equals(strArr_getValues2[i10])) {
                    return false;
                }
            }
        }
        return true;
    }

    public String get(String str) {
        String[] strArr = this.metadata.get(str);
        if (strArr == null) {
            return null;
        }
        return strArr[0];
    }

    public Date getDate(Property property) {
        String str;
        if (property.getPrimaryProperty().getPropertyType() == Property.PropertyType.SIMPLE && property.getPrimaryProperty().getValueType() == Property.ValueType.DATE && (str = get(property)) != null) {
            return parseDate(str);
        }
        return null;
    }

    public Integer getInt(Property property) {
        String str;
        if (property.getPrimaryProperty().getPropertyType() != Property.PropertyType.SIMPLE || property.getPrimaryProperty().getValueType() != Property.ValueType.INTEGER || (str = get(property)) == null) {
            return null;
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public int[] getIntValues(Property property) {
        Property.PropertyType propertyType = property.getPrimaryProperty().getPropertyType();
        Property.PropertyType propertyType2 = Property.PropertyType.SEQ;
        if (propertyType != propertyType2) {
            throw new PropertyTypeException(propertyType2, property.getPrimaryProperty().getPropertyType());
        }
        Property.ValueType valueType = property.getPrimaryProperty().getValueType();
        Property.ValueType valueType2 = Property.ValueType.INTEGER;
        if (valueType != valueType2) {
            throw new PropertyTypeException(valueType2, property.getPrimaryProperty().getValueType());
        }
        String[] values = getValues(property);
        int[] iArr = new int[values.length];
        for (int i10 = 0; i10 < values.length; i10++) {
            iArr[i10] = Integer.parseInt(values[i10]);
        }
        return iArr;
    }

    public long[] getLongValues(Property property) {
        Property.PropertyType propertyType = property.getPrimaryProperty().getPropertyType();
        Property.PropertyType propertyType2 = Property.PropertyType.SEQ;
        if (propertyType != propertyType2) {
            throw new PropertyTypeException(propertyType2, property.getPrimaryProperty().getPropertyType());
        }
        Property.ValueType valueType = property.getPrimaryProperty().getValueType();
        Property.ValueType valueType2 = Property.ValueType.REAL;
        if (valueType != valueType2) {
            throw new PropertyTypeException(valueType2, property.getPrimaryProperty().getValueType());
        }
        String[] values = getValues(property);
        long[] jArr = new long[values.length];
        for (int i10 = 0; i10 < values.length; i10++) {
            jArr[i10] = Long.parseLong(values[i10]);
        }
        return jArr;
    }

    public String[] getValues(Property property) {
        return _getValues(property.getName());
    }

    public int hashCode() {
        Iterator<Map.Entry<String, String[]>> it = this.metadata.entrySet().iterator();
        int metadataEntryHashCode = 0;
        while (it.hasNext()) {
            metadataEntryHashCode += getMetadataEntryHashCode(it.next());
        }
        return metadataEntryHashCode;
    }

    public boolean isMultiValued(Property property) {
        return this.metadata.get(property.getName()) != null && this.metadata.get(property.getName()).length > 1;
    }

    public String[] names() {
        return (String[]) this.metadata.keySet().toArray(new String[0]);
    }

    public void remove(String str) {
        this.metadata.remove(str);
    }

    public void set(String str, String str2) {
        this.writeFilter.set(str, str2, this.metadata);
    }

    public void setAll(Properties properties) {
        Enumeration<?> enumerationPropertyNames = properties.propertyNames();
        while (enumerationPropertyNames.hasMoreElements()) {
            String str = (String) enumerationPropertyNames.nextElement();
            this.metadata.put(str, new String[]{properties.getProperty(str)});
        }
    }

    public void setMetadataWriteFilter(MetadataWriteFilter metadataWriteFilter) {
        this.writeFilter = metadataWriteFilter;
        metadataWriteFilter.filterExisting(this.metadata);
    }

    public int size() {
        return this.metadata.size();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (String str : names()) {
            for (String str2 : _getValues(str)) {
                if (sb2.length() > 0) {
                    sb2.append(StringUtils.SPACE);
                }
                sb2.append(str);
                sb2.append("=");
                sb2.append(str2);
            }
        }
        return sb2.toString();
    }

    public void add(String str, String[] strArr) {
        if (this.metadata.get(str) == null) {
            set(str, strArr);
            return;
        }
        for (String str2 : strArr) {
            add(str, str2);
        }
    }

    public String[] getValues(String str) {
        return _getValues(str);
    }

    public void set(String str, String[] strArr) {
        if (strArr == null) {
            this.metadata.remove(str);
            return;
        }
        this.metadata.remove(str);
        for (String str2 : strArr) {
            add(str, str2);
        }
    }

    public String get(Property property) {
        return get(property.getName());
    }

    public boolean isMultiValued(String str) {
        return this.metadata.get(str) != null && this.metadata.get(str).length > 1;
    }

    public void add(Property property, String str) {
        if (property != null) {
            if (property.getPropertyType() == Property.PropertyType.COMPOSITE) {
                add(property.getPrimaryProperty(), str);
                if (property.getSecondaryExtractProperties() != null) {
                    for (Property property2 : property.getSecondaryExtractProperties()) {
                        add(property2, str);
                    }
                    return;
                }
                return;
            }
            if (this.metadata.get(property.getName()) == null) {
                set(property, str);
                return;
            }
            if (property.isMultiValuePermitted()) {
                add(property.getName(), str);
                return;
            }
            throw new PropertyTypeException(property.getName() + " : " + String.valueOf(property.getPropertyType()));
        }
        throw new NullPointerException("property must not be null");
    }

    public void set(Property property, String str) {
        if (property != null) {
            if (property.getPropertyType() == Property.PropertyType.COMPOSITE) {
                set(property.getPrimaryProperty(), str);
                if (property.getSecondaryExtractProperties() != null) {
                    for (Property property2 : property.getSecondaryExtractProperties()) {
                        set(property2, str);
                    }
                    return;
                }
                return;
            }
            set(property.getName(), str);
            return;
        }
        throw new NullPointerException("property must not be null");
    }

    public void set(Property property, String[] strArr) {
        if (property != null) {
            if (property.getPropertyType() == Property.PropertyType.COMPOSITE) {
                set(property.getPrimaryProperty(), strArr);
                if (property.getSecondaryExtractProperties() != null) {
                    for (Property property2 : property.getSecondaryExtractProperties()) {
                        set(property2, strArr);
                    }
                    return;
                }
                return;
            }
            set(property.getName(), strArr);
            return;
        }
        throw new NullPointerException("property must not be null");
    }

    public void add(Property property, int i10) {
        Property.PropertyType propertyType = property.getPrimaryProperty().getPropertyType();
        Property.PropertyType propertyType2 = Property.PropertyType.SEQ;
        if (propertyType == propertyType2) {
            Property.ValueType valueType = property.getPrimaryProperty().getValueType();
            Property.ValueType valueType2 = Property.ValueType.INTEGER;
            if (valueType == valueType2) {
                add(property, Integer.toString(i10));
                return;
            }
            throw new PropertyTypeException(valueType2, property.getPrimaryProperty().getValueType());
        }
        throw new PropertyTypeException(propertyType2, property.getPrimaryProperty().getPropertyType());
    }

    public void set(Property property, int i10) {
        Property.PropertyType propertyType = property.getPrimaryProperty().getPropertyType();
        Property.PropertyType propertyType2 = Property.PropertyType.SIMPLE;
        if (propertyType == propertyType2) {
            Property.ValueType valueType = property.getPrimaryProperty().getValueType();
            Property.ValueType valueType2 = Property.ValueType.INTEGER;
            if (valueType == valueType2) {
                set(property, Integer.toString(i10));
                return;
            }
            throw new PropertyTypeException(valueType2, property.getPrimaryProperty().getValueType());
        }
        throw new PropertyTypeException(propertyType2, property.getPrimaryProperty().getPropertyType());
    }

    public void add(Property property, Calendar calendar) {
        Property.ValueType valueType = property.getPrimaryProperty().getValueType();
        Property.ValueType valueType2 = Property.ValueType.DATE;
        if (valueType == valueType2) {
            add(property, calendar != null ? DateUtils.formatDate(calendar) : null);
            return;
        }
        throw new PropertyTypeException(valueType2, property.getPrimaryProperty().getValueType());
    }

    public void set(Property property, long j10) {
        Property.PropertyType propertyType = property.getPrimaryProperty().getPropertyType();
        Property.PropertyType propertyType2 = Property.PropertyType.SIMPLE;
        if (propertyType == propertyType2) {
            Property.ValueType valueType = property.getPrimaryProperty().getValueType();
            Property.ValueType valueType2 = Property.ValueType.REAL;
            if (valueType == valueType2) {
                set(property, Long.toString(j10));
                return;
            }
            throw new PropertyTypeException(valueType2, property.getPrimaryProperty().getValueType());
        }
        throw new PropertyTypeException(propertyType2, property.getPrimaryProperty().getPropertyType());
    }

    public void set(Property property, boolean z10) {
        Property.PropertyType propertyType = property.getPrimaryProperty().getPropertyType();
        Property.PropertyType propertyType2 = Property.PropertyType.SIMPLE;
        if (propertyType == propertyType2) {
            Property.ValueType valueType = property.getPrimaryProperty().getValueType();
            Property.ValueType valueType2 = Property.ValueType.BOOLEAN;
            if (valueType == valueType2) {
                set(property, Boolean.toString(z10));
                return;
            }
            throw new PropertyTypeException(valueType2, property.getPrimaryProperty().getValueType());
        }
        throw new PropertyTypeException(propertyType2, property.getPrimaryProperty().getPropertyType());
    }

    public void set(Property property, double d10) {
        Property.ValueType valueType = property.getPrimaryProperty().getValueType();
        Property.ValueType valueType2 = Property.ValueType.REAL;
        if (valueType != valueType2 && property.getPrimaryProperty().getValueType() != Property.ValueType.RATIONAL) {
            throw new PropertyTypeException(valueType2, property.getPrimaryProperty().getValueType());
        }
        set(property, Double.toString(d10));
    }

    public void set(Property property, Date date) {
        Property.PropertyType propertyType = property.getPrimaryProperty().getPropertyType();
        Property.PropertyType propertyType2 = Property.PropertyType.SIMPLE;
        if (propertyType == propertyType2) {
            Property.ValueType valueType = property.getPrimaryProperty().getValueType();
            Property.ValueType valueType2 = Property.ValueType.DATE;
            if (valueType == valueType2) {
                set(property, date != null ? DateUtils.formatDate(date) : null);
                return;
            }
            throw new PropertyTypeException(valueType2, property.getPrimaryProperty().getValueType());
        }
        throw new PropertyTypeException(propertyType2, property.getPrimaryProperty().getPropertyType());
    }

    public void set(Property property, Calendar calendar) {
        Property.PropertyType propertyType = property.getPrimaryProperty().getPropertyType();
        Property.PropertyType propertyType2 = Property.PropertyType.SIMPLE;
        if (propertyType == propertyType2) {
            Property.ValueType valueType = property.getPrimaryProperty().getValueType();
            Property.ValueType valueType2 = Property.ValueType.DATE;
            if (valueType == valueType2) {
                set(property, calendar != null ? DateUtils.formatDate(calendar) : null);
                return;
            }
            throw new PropertyTypeException(valueType2, property.getPrimaryProperty().getValueType());
        }
        throw new PropertyTypeException(propertyType2, property.getPrimaryProperty().getPropertyType());
    }
}
