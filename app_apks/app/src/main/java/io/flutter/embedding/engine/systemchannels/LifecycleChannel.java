package io.flutter.embedding.engine.systemchannels;

import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.StringCodec;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class LifecycleChannel {
    private static final String CHANNEL_NAME = "flutter/lifecycle";
    private static final String TAG = "LifecycleChannel";
    private final BasicMessageChannel<String> channel;
    private AppLifecycleState lastAndroidState;
    private AppLifecycleState lastFlutterState;
    private boolean lastFocus;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum AppLifecycleState {
        DETACHED,
        RESUMED,
        INACTIVE,
        HIDDEN,
        PAUSED
    }

    public LifecycleChannel(DartExecutor dartExecutor) {
        this((BasicMessageChannel<String>) new BasicMessageChannel(dartExecutor, CHANNEL_NAME, StringCodec.INSTANCE));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void sendState(io.flutter.embedding.engine.systemchannels.LifecycleChannel.AppLifecycleState r3, boolean r4) {
        /*
            r2 = this;
            io.flutter.embedding.engine.systemchannels.LifecycleChannel$AppLifecycleState r0 = r2.lastAndroidState
            if (r0 != r3) goto L9
            boolean r1 = r2.lastFocus
            if (r4 != r1) goto L9
            goto L35
        L9:
            if (r3 != 0) goto L10
            if (r0 != 0) goto L10
            r2.lastFocus = r4
            return
        L10:
            int r0 = r3.ordinal()
            if (r0 == 0) goto L2c
            r1 = 1
            if (r0 == r1) goto L24
            r1 = 2
            if (r0 == r1) goto L2c
            r1 = 3
            if (r0 == r1) goto L2c
            r1 = 4
            if (r0 == r1) goto L2c
            r0 = 0
            goto L2d
        L24:
            if (r4 == 0) goto L29
            io.flutter.embedding.engine.systemchannels.LifecycleChannel$AppLifecycleState r0 = io.flutter.embedding.engine.systemchannels.LifecycleChannel.AppLifecycleState.RESUMED
            goto L2d
        L29:
            io.flutter.embedding.engine.systemchannels.LifecycleChannel$AppLifecycleState r0 = io.flutter.embedding.engine.systemchannels.LifecycleChannel.AppLifecycleState.INACTIVE
            goto L2d
        L2c:
            r0 = r3
        L2d:
            r2.lastAndroidState = r3
            r2.lastFocus = r4
            io.flutter.embedding.engine.systemchannels.LifecycleChannel$AppLifecycleState r3 = r2.lastFlutterState
            if (r0 != r3) goto L36
        L35:
            return
        L36:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "AppLifecycleState."
            r3.append(r4)
            java.lang.String r4 = r0.name()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r1)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "Sending "
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = " message."
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            java.lang.String r1 = "LifecycleChannel"
            io.flutter.Log.v(r1, r4)
            io.flutter.plugin.common.BasicMessageChannel<java.lang.String> r4 = r2.channel
            r4.send(r3)
            r2.lastFlutterState = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.systemchannels.LifecycleChannel.sendState(io.flutter.embedding.engine.systemchannels.LifecycleChannel$AppLifecycleState, boolean):void");
    }

    public void aWindowIsFocused() {
        sendState(this.lastAndroidState, true);
    }

    public void appIsDetached() {
        sendState(AppLifecycleState.DETACHED, this.lastFocus);
    }

    public void appIsInactive() {
        sendState(AppLifecycleState.INACTIVE, this.lastFocus);
    }

    public void appIsPaused() {
        sendState(AppLifecycleState.PAUSED, this.lastFocus);
    }

    public void appIsResumed() {
        sendState(AppLifecycleState.RESUMED, this.lastFocus);
    }

    public void noWindowsAreFocused() {
        sendState(this.lastAndroidState, false);
    }

    public LifecycleChannel(BasicMessageChannel<String> basicMessageChannel) {
        this.lastAndroidState = null;
        this.lastFlutterState = null;
        this.lastFocus = true;
        this.channel = basicMessageChannel;
    }
}
