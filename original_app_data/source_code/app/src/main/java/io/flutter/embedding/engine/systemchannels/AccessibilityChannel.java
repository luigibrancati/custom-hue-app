package io.flutter.embedding.engine.systemchannels;

import io.flutter.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.view.AccessibilityBridge;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class AccessibilityChannel {
    private static final String TAG = "AccessibilityChannel";
    public final BasicMessageChannel<Object> channel;
    public final FlutterJNI flutterJNI;
    private AccessibilityMessageHandler handler;
    public final BasicMessageChannel.MessageHandler<Object> parsingMessageHandler;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface AccessibilityMessageHandler extends FlutterJNI.AccessibilityDelegate {
        @Deprecated(since = "Android API level 36")
        void announce(String str);

        void onFocus(int i10);

        void onLongPress(int i10);

        void onTap(int i10);

        void onTooltip(String str);
    }

    public AccessibilityChannel(DartExecutor dartExecutor, FlutterJNI flutterJNI) {
        BasicMessageChannel.MessageHandler<Object> messageHandler = new BasicMessageChannel.MessageHandler<Object>() { // from class: io.flutter.embedding.engine.systemchannels.AccessibilityChannel.1
            @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
            public void onMessage(Object obj, BasicMessageChannel.Reply<Object> reply) {
                HashMap map;
                HashMap map2;
                if (AccessibilityChannel.this.handler == null) {
                    reply.reply(null);
                    return;
                }
                map = (HashMap) obj;
                String str = (String) map.get("type");
                map2 = (HashMap) map.get("data");
                Log.v(AccessibilityChannel.TAG, "Received " + str + " message.");
                str.getClass();
                switch (str) {
                    case "tooltip":
                        String str2 = (String) map2.get("message");
                        if (str2 != null) {
                            AccessibilityChannel.this.handler.onTooltip(str2);
                            break;
                        }
                        break;
                    case "announce":
                        String str3 = (String) map2.get("message");
                        if (str3 != null) {
                            AccessibilityChannel.this.handler.announce(str3);
                            break;
                        }
                        break;
                    case "tap":
                        Integer num = (Integer) map.get("nodeId");
                        if (num != null) {
                            AccessibilityChannel.this.handler.onTap(num.intValue());
                            break;
                        }
                        break;
                    case "focus":
                        Integer num2 = (Integer) map.get("nodeId");
                        if (num2 != null) {
                            AccessibilityChannel.this.handler.onFocus(num2.intValue());
                            break;
                        }
                        break;
                    case "longPress":
                        Integer num3 = (Integer) map.get("nodeId");
                        if (num3 != null) {
                            AccessibilityChannel.this.handler.onLongPress(num3.intValue());
                            break;
                        }
                        break;
                }
                reply.reply(null);
            }
        };
        this.parsingMessageHandler = messageHandler;
        BasicMessageChannel<Object> basicMessageChannel = new BasicMessageChannel<>(dartExecutor, "flutter/accessibility", StandardMessageCodec.INSTANCE);
        this.channel = basicMessageChannel;
        basicMessageChannel.setMessageHandler(messageHandler);
        this.flutterJNI = flutterJNI;
    }

    public void dispatchSemanticsAction(int i10, AccessibilityBridge.Action action) {
        this.flutterJNI.dispatchSemanticsAction(i10, action);
    }

    public void onAndroidAccessibilityDisabled() {
        this.flutterJNI.setSemanticsEnabled(false);
    }

    public void onAndroidAccessibilityEnabled() {
        this.flutterJNI.setSemanticsEnabled(true);
    }

    public void setAccessibilityFeatures(int i10) {
        this.flutterJNI.setAccessibilityFeatures(i10);
    }

    public void setAccessibilityMessageHandler(AccessibilityMessageHandler accessibilityMessageHandler) {
        this.handler = accessibilityMessageHandler;
        this.flutterJNI.setAccessibilityDelegate(accessibilityMessageHandler);
    }

    public void dispatchSemanticsAction(int i10, AccessibilityBridge.Action action, Object obj) {
        this.flutterJNI.dispatchSemanticsAction(i10, action, obj);
    }

    public AccessibilityChannel(BasicMessageChannel<Object> basicMessageChannel, FlutterJNI flutterJNI) {
        this.parsingMessageHandler = new BasicMessageChannel.MessageHandler<Object>() { // from class: io.flutter.embedding.engine.systemchannels.AccessibilityChannel.1
            @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
            public void onMessage(Object obj, BasicMessageChannel.Reply<Object> reply) {
                HashMap map;
                HashMap map2;
                if (AccessibilityChannel.this.handler == null) {
                    reply.reply(null);
                    return;
                }
                map = (HashMap) obj;
                String str = (String) map.get("type");
                map2 = (HashMap) map.get("data");
                Log.v(AccessibilityChannel.TAG, "Received " + str + " message.");
                str.getClass();
                switch (str) {
                    case "tooltip":
                        String str2 = (String) map2.get("message");
                        if (str2 != null) {
                            AccessibilityChannel.this.handler.onTooltip(str2);
                            break;
                        }
                        break;
                    case "announce":
                        String str3 = (String) map2.get("message");
                        if (str3 != null) {
                            AccessibilityChannel.this.handler.announce(str3);
                            break;
                        }
                        break;
                    case "tap":
                        Integer num = (Integer) map.get("nodeId");
                        if (num != null) {
                            AccessibilityChannel.this.handler.onTap(num.intValue());
                            break;
                        }
                        break;
                    case "focus":
                        Integer num2 = (Integer) map.get("nodeId");
                        if (num2 != null) {
                            AccessibilityChannel.this.handler.onFocus(num2.intValue());
                            break;
                        }
                        break;
                    case "longPress":
                        Integer num3 = (Integer) map.get("nodeId");
                        if (num3 != null) {
                            AccessibilityChannel.this.handler.onLongPress(num3.intValue());
                            break;
                        }
                        break;
                }
                reply.reply(null);
            }
        };
        this.channel = basicMessageChannel;
        this.flutterJNI = flutterJNI;
    }
}
