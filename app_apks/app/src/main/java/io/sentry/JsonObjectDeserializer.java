package io.sentry;

import io.sentry.vendor.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class JsonObjectDeserializer {
    private final ArrayList<Token> tokens = new ArrayList<>();

    /* JADX INFO: renamed from: io.sentry.JsonObjectDeserializer$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$sentry$vendor$gson$stream$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$io$sentry$vendor$gson$stream$JsonToken = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.END_DOCUMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface NextValue {
        Object nextValue();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface Token {
        Object getValue();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class TokenName implements Token {
        final String value;

        public TokenName(String str) {
            this.value = str;
        }

        @Override // io.sentry.JsonObjectDeserializer.Token
        public Object getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class TokenPrimitive implements Token {
        final Object value;

        public TokenPrimitive(Object obj) {
            this.value = obj;
        }

        @Override // io.sentry.JsonObjectDeserializer.Token
        public Object getValue() {
            return this.value;
        }
    }

    public static /* synthetic */ Object a() {
        return null;
    }

    private Token getCurrentToken() {
        if (this.tokens.isEmpty()) {
            return null;
        }
        return this.tokens.get(r1.size() - 1);
    }

    private boolean handleArrayOrMapEnd() {
        if (hasOneToken()) {
            return true;
        }
        Token currentToken = getCurrentToken();
        popCurrentToken();
        if (!(getCurrentToken() instanceof TokenName)) {
            if (!(getCurrentToken() instanceof TokenArray)) {
                return false;
            }
            TokenArray tokenArray = (TokenArray) getCurrentToken();
            if (currentToken == null || tokenArray == null) {
                return false;
            }
            tokenArray.value.add(currentToken.getValue());
            return false;
        }
        TokenName tokenName = (TokenName) getCurrentToken();
        popCurrentToken();
        TokenMap tokenMap = (TokenMap) getCurrentToken();
        if (tokenName == null || currentToken == null || tokenMap == null) {
            return false;
        }
        tokenMap.value.put(tokenName.value, currentToken.getValue());
        return false;
    }

    private boolean handlePrimitive(NextValue nextValue) {
        Object objNextValue = nextValue.nextValue();
        if (getCurrentToken() == null && objNextValue != null) {
            pushCurrentToken(new TokenPrimitive(objNextValue));
            return true;
        }
        if (getCurrentToken() instanceof TokenName) {
            TokenName tokenName = (TokenName) getCurrentToken();
            popCurrentToken();
            ((TokenMap) getCurrentToken()).value.put(tokenName.value, objNextValue);
            return false;
        }
        if (!(getCurrentToken() instanceof TokenArray)) {
            return false;
        }
        ((TokenArray) getCurrentToken()).value.add(objNextValue);
        return false;
    }

    private boolean hasOneToken() {
        return this.tokens.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object nextNumber(JsonObjectReader jsonObjectReader) {
        try {
            try {
                return Integer.valueOf(jsonObjectReader.nextInt());
            } catch (Exception unused) {
                return Long.valueOf(jsonObjectReader.nextLong());
            }
        } catch (Exception unused2) {
            return Double.valueOf(jsonObjectReader.nextDouble());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void parse(final JsonObjectReader jsonObjectReader) {
        boolean zHandleArrayOrMapEnd;
        AnonymousClass1 anonymousClass1 = null;
        switch (AnonymousClass1.$SwitchMap$io$sentry$vendor$gson$stream$JsonToken[jsonObjectReader.peek().ordinal()]) {
            case 1:
                jsonObjectReader.beginArray();
                pushCurrentToken(new TokenArray(anonymousClass1));
                zHandleArrayOrMapEnd = false;
                break;
            case 2:
                jsonObjectReader.endArray();
                zHandleArrayOrMapEnd = handleArrayOrMapEnd();
                break;
            case 3:
                jsonObjectReader.beginObject();
                pushCurrentToken(new TokenMap(anonymousClass1));
                zHandleArrayOrMapEnd = false;
                break;
            case 4:
                jsonObjectReader.endObject();
                zHandleArrayOrMapEnd = handleArrayOrMapEnd();
                break;
            case 5:
                pushCurrentToken(new TokenName(jsonObjectReader.nextName()));
                zHandleArrayOrMapEnd = false;
                break;
            case 6:
                zHandleArrayOrMapEnd = handlePrimitive(new NextValue() { // from class: io.sentry.g
                    @Override // io.sentry.JsonObjectDeserializer.NextValue
                    public final Object nextValue() {
                        return jsonObjectReader.nextString();
                    }
                });
                break;
            case 7:
                zHandleArrayOrMapEnd = handlePrimitive(new NextValue() { // from class: io.sentry.h
                    @Override // io.sentry.JsonObjectDeserializer.NextValue
                    public final Object nextValue() {
                        return this.f38746a.nextNumber(jsonObjectReader);
                    }
                });
                break;
            case 8:
                zHandleArrayOrMapEnd = handlePrimitive(new NextValue() { // from class: io.sentry.i
                    @Override // io.sentry.JsonObjectDeserializer.NextValue
                    public final Object nextValue() {
                        return Boolean.valueOf(jsonObjectReader.nextBoolean());
                    }
                });
                break;
            case 9:
                jsonObjectReader.nextNull();
                zHandleArrayOrMapEnd = handlePrimitive(new NextValue() { // from class: io.sentry.j
                    @Override // io.sentry.JsonObjectDeserializer.NextValue
                    public final Object nextValue() {
                        return JsonObjectDeserializer.a();
                    }
                });
                break;
            case 10:
                zHandleArrayOrMapEnd = true;
                break;
            default:
                zHandleArrayOrMapEnd = false;
                break;
        }
        if (zHandleArrayOrMapEnd) {
            return;
        }
        parse(jsonObjectReader);
    }

    private void popCurrentToken() {
        if (this.tokens.isEmpty()) {
            return;
        }
        this.tokens.remove(r1.size() - 1);
    }

    private void pushCurrentToken(Token token) {
        this.tokens.add(token);
    }

    public Object deserialize(JsonObjectReader jsonObjectReader) {
        parse(jsonObjectReader);
        Token currentToken = getCurrentToken();
        if (currentToken != null) {
            return currentToken.getValue();
        }
        return null;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class TokenArray implements Token {
        final ArrayList<Object> value;

        private TokenArray() {
            this.value = new ArrayList<>();
        }

        @Override // io.sentry.JsonObjectDeserializer.Token
        public Object getValue() {
            return this.value;
        }

        public /* synthetic */ TokenArray(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class TokenMap implements Token {
        final HashMap<String, Object> value;

        private TokenMap() {
            this.value = new HashMap<>();
        }

        @Override // io.sentry.JsonObjectDeserializer.Token
        public Object getValue() {
            return this.value;
        }

        public /* synthetic */ TokenMap(AnonymousClass1 anonymousClass1) {
            this();
        }
    }
}
