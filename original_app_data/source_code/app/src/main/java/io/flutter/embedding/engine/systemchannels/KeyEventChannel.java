package io.flutter.embedding.engine.systemchannels;

import android.view.KeyEvent;
import io.flutter.Log;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.JSONMessageCodec;
import io.sentry.ProfileChunk;
import io.sentry.protocol.FeatureFlags;
import io.sentry.protocol.Mechanism;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class KeyEventChannel {
    private static final String TAG = "KeyEventChannel";
    public final BasicMessageChannel<Object> channel;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface EventResponseHandler {
        void onFrameworkResponse(boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class FlutterKeyEvent {
        public final Character complexCharacter;
        public final KeyEvent event;

        public FlutterKeyEvent(KeyEvent keyEvent) {
            this(keyEvent, null);
        }

        public FlutterKeyEvent(KeyEvent keyEvent, Character ch) {
            this.event = keyEvent;
            this.complexCharacter = ch;
        }
    }

    public KeyEventChannel(BinaryMessenger binaryMessenger) {
        this.channel = new BasicMessageChannel<>(binaryMessenger, "flutter/keyevent", JSONMessageCodec.INSTANCE);
    }

    public static /* synthetic */ void a(EventResponseHandler eventResponseHandler, Object obj) {
        boolean z10 = false;
        if (obj != null) {
            try {
                z10 = ((JSONObject) obj).getBoolean(Mechanism.JsonKeys.HANDLED);
            } catch (JSONException e10) {
                Log.e(TAG, "Unable to unpack JSON message: " + e10);
            }
        }
        eventResponseHandler.onFrameworkResponse(z10);
    }

    private static BasicMessageChannel.Reply<Object> createReplyHandler(final EventResponseHandler eventResponseHandler) {
        return new BasicMessageChannel.Reply() { // from class: io.flutter.embedding.engine.systemchannels.a
            @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
            public final void reply(Object obj) {
                KeyEventChannel.a(eventResponseHandler, obj);
            }
        };
    }

    private Map<String, Object> encodeKeyEvent(FlutterKeyEvent flutterKeyEvent, boolean z10) {
        HashMap map = new HashMap();
        map.put("type", z10 ? "keyup" : "keydown");
        map.put("keymap", ProfileChunk.PLATFORM_ANDROID);
        map.put(FeatureFlags.TYPE, Integer.valueOf(flutterKeyEvent.event.getFlags()));
        map.put("plainCodePoint", Integer.valueOf(flutterKeyEvent.event.getUnicodeChar(0)));
        map.put("codePoint", Integer.valueOf(flutterKeyEvent.event.getUnicodeChar()));
        map.put("keyCode", Integer.valueOf(flutterKeyEvent.event.getKeyCode()));
        map.put("scanCode", Integer.valueOf(flutterKeyEvent.event.getScanCode()));
        map.put("metaState", Integer.valueOf(flutterKeyEvent.event.getMetaState()));
        Character ch = flutterKeyEvent.complexCharacter;
        if (ch != null) {
            map.put("character", ch.toString());
        }
        map.put("source", Integer.valueOf(flutterKeyEvent.event.getSource()));
        map.put("deviceId", Integer.valueOf(flutterKeyEvent.event.getDeviceId()));
        map.put("repeatCount", Integer.valueOf(flutterKeyEvent.event.getRepeatCount()));
        return map;
    }

    public void sendFlutterKeyEvent(FlutterKeyEvent flutterKeyEvent, boolean z10, EventResponseHandler eventResponseHandler) {
        this.channel.send(encodeKeyEvent(flutterKeyEvent, z10), createReplyHandler(eventResponseHandler));
    }
}
