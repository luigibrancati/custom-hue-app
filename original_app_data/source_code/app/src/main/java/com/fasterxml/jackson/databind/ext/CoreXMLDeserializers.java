package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class CoreXMLDeserializers extends Deserializers.Base {
    protected static final int TYPE_DURATION = 1;
    protected static final int TYPE_G_CALENDAR = 2;
    protected static final int TYPE_QNAME = 3;
    static final DatatypeFactory _dataTypeFactory;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Std extends FromStringDeserializer<Object> {
        private static final long serialVersionUID = 1;
        protected final int _kind;

        public Std(Class<?> cls, int i10) {
            super(cls);
            this._kind = i10;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public Object _deserialize(String str, DeserializationContext deserializationContext) {
            int i10 = this._kind;
            if (i10 == 1) {
                return CoreXMLDeserializers._dataTypeFactory.newDuration(str);
            }
            if (i10 == 2) {
                try {
                    return _gregorianFromDate(deserializationContext, _parseDate(str, deserializationContext));
                } catch (JsonMappingException unused) {
                    return CoreXMLDeserializers._dataTypeFactory.newXMLGregorianCalendar(str);
                }
            }
            if (i10 == 3) {
                return QName.valueOf(str);
            }
            throw new IllegalStateException();
        }

        public XMLGregorianCalendar _gregorianFromDate(DeserializationContext deserializationContext, Date date) {
            if (date == null) {
                return null;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(date);
            TimeZone timeZone = deserializationContext.getTimeZone();
            if (timeZone != null) {
                gregorianCalendar.setTimeZone(timeZone);
            }
            return CoreXMLDeserializers._dataTypeFactory.newXMLGregorianCalendar(gregorianCalendar);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return (this._kind == 2 && jsonParser.hasToken(JsonToken.VALUE_NUMBER_INT)) ? _gregorianFromDate(deserializationContext, _parseDate(jsonParser, deserializationContext)) : super.deserialize(jsonParser, deserializationContext);
        }
    }

    static {
        try {
            _dataTypeFactory = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.Deserializers.Base, com.fasterxml.jackson.databind.deser.Deserializers
    public JsonDeserializer<?> findBeanDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass == QName.class) {
            return new Std(rawClass, 3);
        }
        if (rawClass == XMLGregorianCalendar.class) {
            return new Std(rawClass, 2);
        }
        if (rawClass == Duration.class) {
            return new Std(rawClass, 1);
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.deser.Deserializers.Base
    public boolean hasDeserializerFor(DeserializationConfig deserializationConfig, Class<?> cls) {
        return cls == QName.class || cls == XMLGregorianCalendar.class || cls == Duration.class;
    }
}
