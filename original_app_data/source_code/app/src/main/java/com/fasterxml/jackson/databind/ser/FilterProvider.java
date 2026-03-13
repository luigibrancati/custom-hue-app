package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class FilterProvider {
    @Deprecated
    public abstract BeanPropertyFilter findFilter(Object obj);

    public PropertyFilter findPropertyFilter(Object obj, Object obj2) {
        BeanPropertyFilter beanPropertyFilterFindFilter = findFilter(obj);
        if (beanPropertyFilterFindFilter == null) {
            return null;
        }
        return SimpleBeanPropertyFilter.from(beanPropertyFilterFindFilter);
    }
}
