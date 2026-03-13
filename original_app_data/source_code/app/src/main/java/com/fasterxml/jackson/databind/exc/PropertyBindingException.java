package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class PropertyBindingException extends MismatchedInputException {
    private static final int MAX_DESC_LENGTH = 1000;
    protected transient String _propertiesAsString;
    protected final Collection<Object> _propertyIds;
    protected final String _propertyName;
    protected final Class<?> _referringClass;

    public PropertyBindingException(JsonParser jsonParser, String str, JsonLocation jsonLocation, Class<?> cls, String str2, Collection<Object> collection) {
        super(jsonParser, str, jsonLocation);
        this._referringClass = cls;
        this._propertyName = str2;
        this._propertyIds = collection;
    }

    public Collection<Object> getKnownPropertyIds() {
        Collection<Object> collection = this._propertyIds;
        if (collection == null) {
            return null;
        }
        return Collections.unmodifiableCollection(collection);
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException
    public String getMessageSuffix() {
        String str = this._propertiesAsString;
        if (str != null || this._propertyIds == null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(100);
        int size = this._propertyIds.size();
        if (size != 1) {
            sb2.append(" (");
            sb2.append(size);
            sb2.append(" known properties: ");
            Iterator<Object> it = this._propertyIds.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                sb2.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                sb2.append(String.valueOf(it.next()));
                sb2.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                if (sb2.length() > 1000) {
                    sb2.append(" [truncated]");
                    break;
                }
                if (it.hasNext()) {
                    sb2.append(", ");
                }
            }
        } else {
            sb2.append(" (one known property: \"");
            sb2.append(String.valueOf(this._propertyIds.iterator().next()));
            sb2.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        }
        sb2.append("])");
        String string = sb2.toString();
        this._propertiesAsString = string;
        return string;
    }

    public String getPropertyName() {
        return this._propertyName;
    }

    public Class<?> getReferringClass() {
        return this._referringClass;
    }

    @Deprecated
    public PropertyBindingException(String str, JsonLocation jsonLocation, Class<?> cls, String str2, Collection<Object> collection) {
        this(null, str, jsonLocation, cls, str2, collection);
    }
}
