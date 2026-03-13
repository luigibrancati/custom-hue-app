package io.flutter.plugins.firebase.firebaseremoteconfig;

import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/flutter/plugins/firebase/firebaseremoteconfig/GeneratedAndroidFirebaseRemoteConfigPigeonCodec;", "Lio/flutter/plugin/common/StandardMessageCodec;", "<init>", "()V", "", "type", "Ljava/nio/ByteBuffer;", "buffer", "", "readValueOfType", "(BLjava/nio/ByteBuffer;)Ljava/lang/Object;", "Ljava/io/ByteArrayOutputStream;", "stream", "value", "Lfc/H;", "writeValue", "(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V", "firebase_remote_config_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
class GeneratedAndroidFirebaseRemoteConfigPigeonCodec extends StandardMessageCodec {
    @Override // io.flutter.plugin.common.StandardMessageCodec
    public Object readValueOfType(byte type, ByteBuffer buffer) {
        AbstractC4862t.e(buffer, "buffer");
        if (type != -127) {
            return super.readValueOfType(type, buffer);
        }
        Object value = readValue(buffer);
        List<? extends Object> list = value instanceof List ? (List) value : null;
        if (list != null) {
            return RemoteConfigPigeonSettings.INSTANCE.fromList(list);
        }
        return null;
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public void writeValue(ByteArrayOutputStream stream, Object value) {
        AbstractC4862t.e(stream, "stream");
        if (!(value instanceof RemoteConfigPigeonSettings)) {
            super.writeValue(stream, value);
        } else {
            stream.write(129);
            writeValue(stream, ((RemoteConfigPigeonSettings) value).toList());
        }
    }
}
