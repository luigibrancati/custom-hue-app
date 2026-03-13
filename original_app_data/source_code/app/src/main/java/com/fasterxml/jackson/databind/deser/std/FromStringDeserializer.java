package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.File;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class FromStringDeserializer<T> extends StdScalarDeserializer<T> {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Std extends FromStringDeserializer<Object> {
        public static final int STD_CHARSET = 9;
        public static final int STD_CLASS = 4;
        public static final int STD_CURRENCY = 6;
        public static final int STD_FILE = 1;
        public static final int STD_INET_ADDRESS = 11;
        public static final int STD_INET_SOCKET_ADDRESS = 12;
        public static final int STD_JAVA_TYPE = 5;
        public static final int STD_LOCALE = 8;
        public static final int STD_PATTERN = 7;
        public static final int STD_STRING_BUILDER = 13;
        public static final int STD_TIME_ZONE = 10;
        public static final int STD_URI = 3;
        public static final int STD_URL = 2;
        private static final long serialVersionUID = 1;
        protected final int _kind;

        public Std(Class<?> cls, int i10) {
            super(cls);
            this._kind = i10;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public Object _deserialize(String str, DeserializationContext deserializationContext) throws InvalidFormatException {
            switch (this._kind) {
                case 1:
                    return new File(str);
                case 2:
                    return new URL(str);
                case 3:
                    return URI.create(str);
                case 4:
                    try {
                        return deserializationContext.findClass(str);
                    } catch (Exception e10) {
                        return deserializationContext.handleInstantiationProblem(this._valueClass, str, ClassUtil.getRootCause(e10));
                    }
                case 5:
                    return deserializationContext.getTypeFactory().constructFromCanonical(str);
                case 6:
                    return Currency.getInstance(str);
                case 7:
                    return Pattern.compile(str);
                case 8:
                    int i_firstHyphenOrUnderscore = _firstHyphenOrUnderscore(str);
                    if (i_firstHyphenOrUnderscore < 0) {
                        return new Locale(str);
                    }
                    String strSubstring = str.substring(0, i_firstHyphenOrUnderscore);
                    String strSubstring2 = str.substring(i_firstHyphenOrUnderscore + 1);
                    int i_firstHyphenOrUnderscore2 = _firstHyphenOrUnderscore(strSubstring2);
                    return i_firstHyphenOrUnderscore2 < 0 ? new Locale(strSubstring, strSubstring2) : new Locale(strSubstring, strSubstring2.substring(0, i_firstHyphenOrUnderscore2), strSubstring2.substring(i_firstHyphenOrUnderscore2 + 1));
                case 9:
                    return Charset.forName(str);
                case 10:
                    return TimeZone.getTimeZone(str);
                case 11:
                    return InetAddress.getByName(str);
                case 12:
                    if (str.startsWith("[")) {
                        int iLastIndexOf = str.lastIndexOf(93);
                        if (iLastIndexOf == -1) {
                            throw new InvalidFormatException(deserializationContext.getParser(), "Bracketed IPv6 address must contain closing bracket", str, (Class<?>) InetSocketAddress.class);
                        }
                        int iIndexOf = str.indexOf(58, iLastIndexOf);
                        return new InetSocketAddress(str.substring(0, iLastIndexOf + 1), iIndexOf > -1 ? Integer.parseInt(str.substring(iIndexOf + 1)) : 0);
                    }
                    int iIndexOf2 = str.indexOf(58);
                    if (iIndexOf2 >= 0) {
                        int i10 = iIndexOf2 + 1;
                        if (str.indexOf(58, i10) < 0) {
                            return new InetSocketAddress(str.substring(0, iIndexOf2), Integer.parseInt(str.substring(i10)));
                        }
                    }
                    return new InetSocketAddress(str, 0);
                case 13:
                    return new StringBuilder(str);
                default:
                    VersionUtil.throwInternal();
                    return null;
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public Object _deserializeFromEmptyString() {
            int i10 = this._kind;
            return i10 == 3 ? URI.create("") : i10 == 8 ? Locale.ROOT : i10 == 13 ? new StringBuilder() : super._deserializeFromEmptyString();
        }

        public int _firstHyphenOrUnderscore(String str) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if (cCharAt == '_' || cCharAt == '-') {
                    return i10;
                }
            }
            return -1;
        }
    }

    public FromStringDeserializer(Class<?> cls) {
        super(cls);
    }

    public static Std findDeserializer(Class<?> cls) {
        int i10;
        if (cls == File.class) {
            i10 = 1;
        } else if (cls == URL.class) {
            i10 = 2;
        } else if (cls == URI.class) {
            i10 = 3;
        } else if (cls == Class.class) {
            i10 = 4;
        } else if (cls == JavaType.class) {
            i10 = 5;
        } else if (cls == Currency.class) {
            i10 = 6;
        } else if (cls == Pattern.class) {
            i10 = 7;
        } else if (cls == Locale.class) {
            i10 = 8;
        } else if (cls == Charset.class) {
            i10 = 9;
        } else if (cls == TimeZone.class) {
            i10 = 10;
        } else if (cls == InetAddress.class) {
            i10 = 11;
        } else if (cls == InetSocketAddress.class) {
            i10 = 12;
        } else {
            if (cls != StringBuilder.class) {
                return null;
            }
            i10 = 13;
        }
        return new Std(cls, i10);
    }

    public static Class<?>[] types() {
        return new Class[]{File.class, URL.class, URI.class, Class.class, JavaType.class, Currency.class, Pattern.class, Locale.class, Charset.class, TimeZone.class, InetAddress.class, InetSocketAddress.class, StringBuilder.class};
    }

    public abstract T _deserialize(String str, DeserializationContext deserializationContext);

    public T _deserializeEmbedded(Object obj, DeserializationContext deserializationContext) throws MismatchedInputException {
        deserializationContext.reportInputMismatch(this, "Don't know how to convert embedded Object of type %s into %s", obj.getClass().getName(), this._valueClass.getName());
        return null;
    }

    public T _deserializeFromEmptyString() {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws JsonMappingException {
        String valueAsString = jsonParser.getValueAsString();
        if (valueAsString == null) {
            JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
            if (jsonTokenCurrentToken == JsonToken.START_ARRAY) {
                return _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (jsonTokenCurrentToken != JsonToken.VALUE_EMBEDDED_OBJECT) {
                return (T) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
            T t10 = (T) jsonParser.getEmbeddedObject();
            if (t10 == null) {
                return null;
            }
            return this._valueClass.isAssignableFrom(t10.getClass()) ? t10 : _deserializeEmbedded(t10, deserializationContext);
        }
        if (valueAsString.length() != 0) {
            String strTrim = valueAsString.trim();
            if (strTrim.length() != 0) {
                try {
                    return _deserialize(strTrim, deserializationContext);
                } catch (IllegalArgumentException | MalformedURLException e10) {
                    String message = e10.getMessage();
                    String str = "not a valid textual representation";
                    if (message != null) {
                        str = "not a valid textual representation, problem: " + message;
                    }
                    JsonMappingException jsonMappingExceptionWeirdStringException = deserializationContext.weirdStringException(strTrim, this._valueClass, str);
                    jsonMappingExceptionWeirdStringException.initCause(e10);
                    throw jsonMappingExceptionWeirdStringException;
                }
            }
        }
        return _deserializeFromEmptyString();
    }
}
