package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.util.Arrays;
import java.util.UUID;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class UUIDDeserializer extends FromStringDeserializer<UUID> {
    static final int[] HEX_DIGITS;
    private static final long serialVersionUID = 1;

    static {
        int[] iArr = new int[127];
        HEX_DIGITS = iArr;
        Arrays.fill(iArr, -1);
        for (int i10 = 0; i10 < 10; i10++) {
            HEX_DIGITS[i10 + 48] = i10;
        }
        for (int i11 = 0; i11 < 6; i11++) {
            int[] iArr2 = HEX_DIGITS;
            int i12 = i11 + 10;
            iArr2[i11 + 97] = i12;
            iArr2[i11 + 65] = i12;
        }
    }

    public UUIDDeserializer() {
        super(UUID.class);
    }

    private UUID _badFormat(String str, DeserializationContext deserializationContext) {
        return (UUID) deserializationContext.handleWeirdStringValue(handledType(), str, "UUID has to be represented by standard 36-char representation", new Object[0]);
    }

    private UUID _fromBytes(byte[] bArr, DeserializationContext deserializationContext) throws InvalidFormatException {
        if (bArr.length == 16) {
            return new UUID(_long(bArr, 0), _long(bArr, 8));
        }
        throw InvalidFormatException.from(deserializationContext.getParser(), "Can only construct UUIDs from byte[16]; got " + bArr.length + " bytes", bArr, handledType());
    }

    private static int _int(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & ForkServer.ERROR) | (bArr[i10] << 24) | ((bArr[i10 + 1] & ForkServer.ERROR) << 16) | ((bArr[i10 + 2] & ForkServer.ERROR) << 8);
    }

    private static long _long(byte[] bArr, int i10) {
        return ((((long) _int(bArr, i10 + 4)) << 32) >>> 32) | (((long) _int(bArr, i10)) << 32);
    }

    public int _badChar(String str, int i10, DeserializationContext deserializationContext, char c10) throws JsonMappingException {
        throw deserializationContext.weirdStringException(str, handledType(), String.format("Non-hex character '%c' (value 0x%s), not valid for UUID String", Character.valueOf(c10), Integer.toHexString(c10)));
    }

    public int byteFromChars(String str, int i10, DeserializationContext deserializationContext) {
        char cCharAt = str.charAt(i10);
        int i11 = i10 + 1;
        char cCharAt2 = str.charAt(i11);
        if (cCharAt <= 127 && cCharAt2 <= 127) {
            int[] iArr = HEX_DIGITS;
            int i12 = iArr[cCharAt2] | (iArr[cCharAt] << 4);
            if (i12 >= 0) {
                return i12;
            }
        }
        return (cCharAt > 127 || HEX_DIGITS[cCharAt] < 0) ? _badChar(str, i10, deserializationContext, cCharAt) : _badChar(str, i11, deserializationContext, cCharAt2);
    }

    public int intFromChars(String str, int i10, DeserializationContext deserializationContext) {
        return (byteFromChars(str, i10, deserializationContext) << 24) + (byteFromChars(str, i10 + 2, deserializationContext) << 16) + (byteFromChars(str, i10 + 4, deserializationContext) << 8) + byteFromChars(str, i10 + 6, deserializationContext);
    }

    public int shortFromChars(String str, int i10, DeserializationContext deserializationContext) {
        return (byteFromChars(str, i10, deserializationContext) << 8) + byteFromChars(str, i10 + 2, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
    public UUID _deserialize(String str, DeserializationContext deserializationContext) {
        if (str.length() != 36) {
            return str.length() == 24 ? _fromBytes(Base64Variants.getDefaultVariant().decode(str), deserializationContext) : _badFormat(str, deserializationContext);
        }
        if (str.charAt(8) != '-' || str.charAt(13) != '-' || str.charAt(18) != '-' || str.charAt(23) != '-') {
            _badFormat(str, deserializationContext);
        }
        return new UUID((((long) intFromChars(str, 0, deserializationContext)) << 32) + ((((long) shortFromChars(str, 9, deserializationContext)) << 16) | ((long) shortFromChars(str, 14, deserializationContext))), ((((long) intFromChars(str, 28, deserializationContext)) << 32) >>> 32) | (((long) (shortFromChars(str, 24, deserializationContext) | (shortFromChars(str, 19, deserializationContext) << 16))) << 32));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
    public UUID _deserializeEmbedded(Object obj, DeserializationContext deserializationContext) throws MismatchedInputException {
        if (obj instanceof byte[]) {
            return _fromBytes((byte[]) obj, deserializationContext);
        }
        super._deserializeEmbedded(obj, deserializationContext);
        return null;
    }
}
