package defpackage;

import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class i extends StandardMessageCodec {
    @Override // io.flutter.plugin.common.StandardMessageCodec
    public Object readValueOfType(byte b10, ByteBuffer buffer) {
        AbstractC4862t.e(buffer, "buffer");
        if (b10 == -127) {
            Object value = readValue(buffer);
            List list = value instanceof List ? (List) value : null;
            if (list != null) {
                return d.f32711b.a(list);
            }
            return null;
        }
        if (b10 != -126) {
            return super.readValueOfType(b10, buffer);
        }
        Object value2 = readValue(buffer);
        List list2 = value2 instanceof List ? (List) value2 : null;
        if (list2 != null) {
            return c.f25516b.a(list2);
        }
        return null;
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public void writeValue(ByteArrayOutputStream stream, Object obj) {
        AbstractC4862t.e(stream, "stream");
        if (obj instanceof d) {
            stream.write(129);
            writeValue(stream, ((d) obj).b());
        } else if (!(obj instanceof c)) {
            super.writeValue(stream, obj);
        } else {
            stream.write(130);
            writeValue(stream, ((c) obj).a());
        }
    }
}
