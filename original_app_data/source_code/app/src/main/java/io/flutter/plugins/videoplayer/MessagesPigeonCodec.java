package io.flutter.plugins.videoplayer;

import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/flutter/plugins/videoplayer/MessagesPigeonCodec;", "Lio/flutter/plugin/common/StandardMessageCodec;", "<init>", "()V", "", "type", "Ljava/nio/ByteBuffer;", "buffer", "", "readValueOfType", "(BLjava/nio/ByteBuffer;)Ljava/lang/Object;", "Ljava/io/ByteArrayOutputStream;", "stream", "value", "Lfc/H;", "writeValue", "(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V", "video_player_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
class MessagesPigeonCodec extends StandardMessageCodec {
    @Override // io.flutter.plugin.common.StandardMessageCodec
    public Object readValueOfType(byte type, ByteBuffer buffer) {
        AbstractC4862t.e(buffer, "buffer");
        if (type == -127) {
            Long l10 = (Long) readValue(buffer);
            if (l10 != null) {
                return PlatformVideoFormat.INSTANCE.ofRaw((int) l10.longValue());
            }
            return null;
        }
        if (type == -126) {
            Long l11 = (Long) readValue(buffer);
            if (l11 != null) {
                return PlatformPlaybackState.INSTANCE.ofRaw((int) l11.longValue());
            }
            return null;
        }
        if (type == -125) {
            Object value = readValue(buffer);
            List<? extends Object> list = value instanceof List ? (List) value : null;
            if (list != null) {
                return InitializationEvent.INSTANCE.fromList(list);
            }
            return null;
        }
        if (type == -124) {
            Object value2 = readValue(buffer);
            List<? extends Object> list2 = value2 instanceof List ? (List) value2 : null;
            if (list2 != null) {
                return PlaybackStateChangeEvent.INSTANCE.fromList(list2);
            }
            return null;
        }
        if (type == -123) {
            Object value3 = readValue(buffer);
            List<? extends Object> list3 = value3 instanceof List ? (List) value3 : null;
            if (list3 != null) {
                return IsPlayingStateEvent.INSTANCE.fromList(list3);
            }
            return null;
        }
        if (type == -122) {
            Object value4 = readValue(buffer);
            List<? extends Object> list4 = value4 instanceof List ? (List) value4 : null;
            if (list4 != null) {
                return PlatformVideoViewCreationParams.INSTANCE.fromList(list4);
            }
            return null;
        }
        if (type == -121) {
            Object value5 = readValue(buffer);
            List<? extends Object> list5 = value5 instanceof List ? (List) value5 : null;
            if (list5 != null) {
                return CreationOptions.INSTANCE.fromList(list5);
            }
            return null;
        }
        if (type != -120) {
            return super.readValueOfType(type, buffer);
        }
        Object value6 = readValue(buffer);
        List<? extends Object> list6 = value6 instanceof List ? (List) value6 : null;
        if (list6 != null) {
            return TexturePlayerIds.INSTANCE.fromList(list6);
        }
        return null;
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public void writeValue(ByteArrayOutputStream stream, Object value) {
        AbstractC4862t.e(stream, "stream");
        if (value instanceof PlatformVideoFormat) {
            stream.write(129);
            writeValue(stream, Long.valueOf(((PlatformVideoFormat) value).getRaw()));
            return;
        }
        if (value instanceof PlatformPlaybackState) {
            stream.write(130);
            writeValue(stream, Long.valueOf(((PlatformPlaybackState) value).getRaw()));
            return;
        }
        if (value instanceof InitializationEvent) {
            stream.write(131);
            writeValue(stream, ((InitializationEvent) value).toList());
            return;
        }
        if (value instanceof PlaybackStateChangeEvent) {
            stream.write(132);
            writeValue(stream, ((PlaybackStateChangeEvent) value).toList());
            return;
        }
        if (value instanceof IsPlayingStateEvent) {
            stream.write(133);
            writeValue(stream, ((IsPlayingStateEvent) value).toList());
            return;
        }
        if (value instanceof PlatformVideoViewCreationParams) {
            stream.write(134);
            writeValue(stream, ((PlatformVideoViewCreationParams) value).toList());
        } else if (value instanceof CreationOptions) {
            stream.write(135);
            writeValue(stream, ((CreationOptions) value).toList());
        } else if (!(value instanceof TexturePlayerIds)) {
            super.writeValue(stream, value);
        } else {
            stream.write(136);
            writeValue(stream, ((TexturePlayerIds) value).toList());
        }
    }
}
