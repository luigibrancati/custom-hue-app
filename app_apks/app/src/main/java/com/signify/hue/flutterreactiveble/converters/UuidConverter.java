package com.signify.hue.flutterreactiveble.converters;

import io.sentry.protocol.DebugImage;
import java.nio.ByteBuffer;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005¨\u0006\u000e"}, d2 = {"Lcom/signify/hue/flutterreactiveble/converters/UuidConverter;", "", "<init>", "()V", "uuidFromByteArray", "Ljava/util/UUID;", "bytes", "", "convert16BitToUuid", "convert32BitToUuid", "convert128BitNotationToUuid", "byteArrayFromUuid", DebugImage.JsonKeys.UUID, "Companion", "reactive_ble_mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UuidConverter {
    private static final int byteBufferSize = 16;
    private static final int byteSize16Bit = 2;
    private static final int byteSize32Bit = 4;

    private final UUID convert128BitNotationToUuid(byte[] bytes) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bytes);
        return new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong());
    }

    private final UUID convert16BitToUuid(byte[] bytes) {
        return convert128BitNotationToUuid(new byte[]{0, 0, bytes[0], bytes[1], 0, 0, 16, 0, -128, 0, 0, -128, 95, -101, 52, -5});
    }

    private final UUID convert32BitToUuid(byte[] bytes) {
        return convert128BitNotationToUuid(new byte[]{bytes[0], bytes[1], bytes[2], bytes[3], 0, 0, 16, 0, -128, 0, 0, -128, 95, -101, 52, -5});
    }

    public final byte[] byteArrayFromUuid(UUID uuid) {
        AbstractC4862t.e(uuid, "uuid");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[16]);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        byte[] bArrArray = byteBufferWrap.array();
        AbstractC4862t.d(bArrArray, "array(...)");
        return bArrArray;
    }

    public final UUID uuidFromByteArray(byte[] bytes) {
        AbstractC4862t.e(bytes, "bytes");
        int length = bytes.length;
        return length != 2 ? length != 4 ? convert128BitNotationToUuid(bytes) : convert32BitToUuid(bytes) : convert16BitToUuid(bytes);
    }
}
