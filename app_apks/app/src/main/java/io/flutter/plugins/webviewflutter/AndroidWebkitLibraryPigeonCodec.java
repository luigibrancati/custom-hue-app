package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonCodec;", "Lio/flutter/plugin/common/StandardMessageCodec;", "<init>", "()V", "", "type", "Ljava/nio/ByteBuffer;", "buffer", "", "readValueOfType", "(BLjava/nio/ByteBuffer;)Ljava/lang/Object;", "Ljava/io/ByteArrayOutputStream;", "stream", "value", "Lfc/H;", "writeValue", "(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V", "webview_flutter_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
class AndroidWebkitLibraryPigeonCodec extends StandardMessageCodec {
    @Override // io.flutter.plugin.common.StandardMessageCodec
    public Object readValueOfType(byte type, ByteBuffer buffer) {
        AbstractC4862t.e(buffer, "buffer");
        if (type == -127) {
            Long l10 = (Long) readValue(buffer);
            if (l10 == null) {
                return null;
            }
            return FileChooserMode.INSTANCE.ofRaw((int) l10.longValue());
        }
        if (type == -126) {
            Long l11 = (Long) readValue(buffer);
            if (l11 == null) {
                return null;
            }
            return ConsoleMessageLevel.INSTANCE.ofRaw((int) l11.longValue());
        }
        if (type == -125) {
            Long l12 = (Long) readValue(buffer);
            if (l12 == null) {
                return null;
            }
            return OverScrollMode.INSTANCE.ofRaw((int) l12.longValue());
        }
        if (type == -124) {
            Long l13 = (Long) readValue(buffer);
            if (l13 == null) {
                return null;
            }
            return SslErrorType.INSTANCE.ofRaw((int) l13.longValue());
        }
        if (type != -123) {
            return super.readValueOfType(type, buffer);
        }
        Long l14 = (Long) readValue(buffer);
        if (l14 == null) {
            return null;
        }
        return MixedContentMode.INSTANCE.ofRaw((int) l14.longValue());
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public void writeValue(ByteArrayOutputStream stream, Object value) {
        AbstractC4862t.e(stream, "stream");
        if (value instanceof FileChooserMode) {
            stream.write(129);
            writeValue(stream, Long.valueOf(((FileChooserMode) value).getRaw()));
            return;
        }
        if (value instanceof ConsoleMessageLevel) {
            stream.write(130);
            writeValue(stream, Long.valueOf(((ConsoleMessageLevel) value).getRaw()));
            return;
        }
        if (value instanceof OverScrollMode) {
            stream.write(131);
            writeValue(stream, Long.valueOf(((OverScrollMode) value).getRaw()));
        } else if (value instanceof SslErrorType) {
            stream.write(132);
            writeValue(stream, Long.valueOf(((SslErrorType) value).getRaw()));
        } else if (!(value instanceof MixedContentMode)) {
            super.writeValue(stream, value);
        } else {
            stream.write(133);
            writeValue(stream, Long.valueOf(((MixedContentMode) value).getRaw()));
        }
    }
}
