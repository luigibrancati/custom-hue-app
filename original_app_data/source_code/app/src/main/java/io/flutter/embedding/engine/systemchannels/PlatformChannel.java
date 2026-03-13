package io.flutter.embedding.engine.systemchannels;

import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.JSONMethodCodec;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.tika.mime.MimeTypes;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class PlatformChannel {
    private static final String TAG = "PlatformChannel";
    public final MethodChannel channel;
    final MethodChannel.MethodCallHandler parsingMethodCallHandler;
    private PlatformMessageHandler platformMessageHandler;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class AppSwitcherDescription {
        public final int color;
        public final String label;

        public AppSwitcherDescription(int i10, String str) {
            this.color = i10;
            this.label = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum Brightness {
        LIGHT("Brightness.light"),
        DARK("Brightness.dark");

        private String encodedName;

        Brightness(String str) {
            this.encodedName = str;
        }

        public static Brightness fromValue(String str) throws NoSuchFieldException {
            for (Brightness brightness : values()) {
                if (brightness.encodedName.equals(str)) {
                    return brightness;
                }
            }
            throw new NoSuchFieldException("No such Brightness: " + str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum ClipboardContentFormat {
        PLAIN_TEXT(MimeTypes.PLAIN_TEXT);

        private String encodedName;

        ClipboardContentFormat(String str) {
            this.encodedName = str;
        }

        public static ClipboardContentFormat fromValue(String str) throws NoSuchFieldException {
            for (ClipboardContentFormat clipboardContentFormat : values()) {
                if (clipboardContentFormat.encodedName.equals(str)) {
                    return clipboardContentFormat;
                }
            }
            throw new NoSuchFieldException("No such ClipboardContentFormat: " + str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum DeviceOrientation {
        PORTRAIT_UP("DeviceOrientation.portraitUp"),
        PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
        LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
        LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");

        private String encodedName;

        DeviceOrientation(String str) {
            this.encodedName = str;
        }

        public static DeviceOrientation fromValue(String str) throws NoSuchFieldException {
            for (DeviceOrientation deviceOrientation : values()) {
                if (deviceOrientation.encodedName.equals(str)) {
                    return deviceOrientation;
                }
            }
            throw new NoSuchFieldException("No such DeviceOrientation: " + str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum HapticFeedbackType {
        STANDARD(null),
        LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
        MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
        HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
        SELECTION_CLICK("HapticFeedbackType.selectionClick");

        private final String encodedName;

        HapticFeedbackType(String str) {
            this.encodedName = str;
        }

        public static HapticFeedbackType fromValue(String str) throws NoSuchFieldException {
            for (HapticFeedbackType hapticFeedbackType : values()) {
                String str2 = hapticFeedbackType.encodedName;
                if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                    return hapticFeedbackType;
                }
            }
            throw new NoSuchFieldException("No such HapticFeedbackType: " + str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum SoundType {
        CLICK("SystemSoundType.click"),
        TICK("SystemSoundType.tick"),
        ALERT("SystemSoundType.alert");

        private final String encodedName;

        SoundType(String str) {
            this.encodedName = str;
        }

        public static SoundType fromValue(String str) throws NoSuchFieldException {
            for (SoundType soundType : values()) {
                if (soundType.encodedName.equals(str)) {
                    return soundType;
                }
            }
            throw new NoSuchFieldException("No such SoundType: " + str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class SystemChromeStyle {
        public final Integer statusBarColor;
        public final Brightness statusBarIconBrightness;
        public final Integer systemNavigationBarColor;
        public final Boolean systemNavigationBarContrastEnforced;
        public final Integer systemNavigationBarDividerColor;
        public final Brightness systemNavigationBarIconBrightness;
        public final Boolean systemStatusBarContrastEnforced;

        public SystemChromeStyle(Integer num, Brightness brightness, Boolean bool, Integer num2, Brightness brightness2, Integer num3, Boolean bool2) {
            this.statusBarColor = num;
            this.statusBarIconBrightness = brightness;
            this.systemStatusBarContrastEnforced = bool;
            this.systemNavigationBarColor = num2;
            this.systemNavigationBarIconBrightness = brightness2;
            this.systemNavigationBarDividerColor = num3;
            this.systemNavigationBarContrastEnforced = bool2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum SystemUiMode {
        LEAN_BACK("SystemUiMode.leanBack"),
        IMMERSIVE("SystemUiMode.immersive"),
        IMMERSIVE_STICKY("SystemUiMode.immersiveSticky"),
        EDGE_TO_EDGE("SystemUiMode.edgeToEdge");

        private String encodedName;

        SystemUiMode(String str) {
            this.encodedName = str;
        }

        public static SystemUiMode fromValue(String str) throws NoSuchFieldException {
            for (SystemUiMode systemUiMode : values()) {
                if (systemUiMode.encodedName.equals(str)) {
                    return systemUiMode;
                }
            }
            throw new NoSuchFieldException("No such SystemUiMode: " + str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum SystemUiOverlay {
        TOP_OVERLAYS("SystemUiOverlay.top"),
        BOTTOM_OVERLAYS("SystemUiOverlay.bottom");

        private String encodedName;

        SystemUiOverlay(String str) {
            this.encodedName = str;
        }

        public static SystemUiOverlay fromValue(String str) throws NoSuchFieldException {
            for (SystemUiOverlay systemUiOverlay : values()) {
                if (systemUiOverlay.encodedName.equals(str)) {
                    return systemUiOverlay;
                }
            }
            throw new NoSuchFieldException("No such SystemUiOverlay: " + str);
        }
    }

    public PlatformChannel(DartExecutor dartExecutor) {
        MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.PlatformChannel.1
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                ClipboardContentFormat clipboardContentFormatFromValue;
                if (PlatformChannel.this.platformMessageHandler == null) {
                    return;
                }
                String str = methodCall.method;
                Object obj = methodCall.arguments;
                Log.v(PlatformChannel.TAG, "Received '" + str + "' message.");
                try {
                    switch (str.hashCode()) {
                        case -1501580720:
                            if (str.equals("SystemNavigator.setFrameworkHandlesBack")) {
                                PlatformChannel.this.platformMessageHandler.setFrameworkHandlesBack(((Boolean) obj).booleanValue());
                                result.success(null);
                            }
                            result.notImplemented();
                            break;
                        case -931781241:
                            if (str.equals("Share.invoke")) {
                                PlatformChannel.this.platformMessageHandler.share((String) obj);
                                result.success(null);
                            }
                            result.notImplemented();
                            break;
                        case -766342101:
                            if (str.equals("SystemNavigator.pop")) {
                                PlatformChannel.this.platformMessageHandler.popSystemNavigator();
                                result.success(null);
                            }
                            result.notImplemented();
                            break;
                        case -720677196:
                            if (str.equals("Clipboard.setData")) {
                                PlatformChannel.this.platformMessageHandler.setClipboardData(((JSONObject) obj).getString("text"));
                                result.success(null);
                            }
                            result.notImplemented();
                            break;
                        case -577225884:
                            if (str.equals("SystemChrome.setSystemUIChangeListener")) {
                                PlatformChannel.this.platformMessageHandler.setSystemUiChangeListener();
                                result.success(null);
                            }
                            result.notImplemented();
                            break;
                        case -548468504:
                            if (str.equals("SystemChrome.setApplicationSwitcherDescription")) {
                                try {
                                    PlatformChannel.this.platformMessageHandler.setApplicationSwitcherDescription(PlatformChannel.this.decodeAppSwitcherDescription((JSONObject) obj));
                                    result.success(null);
                                } catch (JSONException e10) {
                                    result.error("error", e10.getMessage(), null);
                                    return;
                                }
                            }
                            result.notImplemented();
                            break;
                        case -247230243:
                            if (str.equals("HapticFeedback.vibrate")) {
                                try {
                                    PlatformChannel.this.platformMessageHandler.vibrateHapticFeedback(HapticFeedbackType.fromValue((String) obj));
                                    result.success(null);
                                } catch (NoSuchFieldException e11) {
                                    result.error("error", e11.getMessage(), null);
                                    return;
                                }
                            }
                            result.notImplemented();
                            break;
                        case -215273374:
                            if (str.equals("SystemSound.play")) {
                                try {
                                    PlatformChannel.this.platformMessageHandler.playSystemSound(SoundType.fromValue((String) obj));
                                    result.success(null);
                                } catch (NoSuchFieldException e12) {
                                    result.error("error", e12.getMessage(), null);
                                    return;
                                }
                            }
                            result.notImplemented();
                            break;
                        case 241845679:
                            if (str.equals("SystemChrome.restoreSystemUIOverlays")) {
                                PlatformChannel.this.platformMessageHandler.restoreSystemUiOverlays();
                                result.success(null);
                            }
                            result.notImplemented();
                            break;
                        case 875995648:
                            if (str.equals("Clipboard.hasStrings")) {
                                boolean zClipboardHasStrings = PlatformChannel.this.platformMessageHandler.clipboardHasStrings();
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("value", zClipboardHasStrings);
                                result.success(jSONObject);
                            }
                            result.notImplemented();
                            break;
                        case 1128339786:
                            if (str.equals("SystemChrome.setEnabledSystemUIMode")) {
                                try {
                                    PlatformChannel.this.platformMessageHandler.showSystemUiMode(PlatformChannel.this.decodeSystemUiMode((String) obj));
                                    result.success(null);
                                } catch (NoSuchFieldException | JSONException e13) {
                                    result.error("error", e13.getMessage(), null);
                                    return;
                                }
                            }
                            result.notImplemented();
                            break;
                        case 1390477857:
                            if (str.equals("SystemChrome.setSystemUIOverlayStyle")) {
                                try {
                                    PlatformChannel.this.platformMessageHandler.setSystemUiOverlayStyle(PlatformChannel.this.decodeSystemChromeStyle((JSONObject) obj));
                                    result.success(null);
                                } catch (NoSuchFieldException | JSONException e14) {
                                    result.error("error", e14.getMessage(), null);
                                    return;
                                }
                            }
                            result.notImplemented();
                            break;
                        case 1514180520:
                            if (str.equals("Clipboard.getData")) {
                                String str2 = (String) obj;
                                if (str2 != null) {
                                    try {
                                        clipboardContentFormatFromValue = ClipboardContentFormat.fromValue(str2);
                                    } catch (NoSuchFieldException unused) {
                                        result.error("error", "No such clipboard content format: " + str2, null);
                                        clipboardContentFormatFromValue = null;
                                    }
                                } else {
                                    clipboardContentFormatFromValue = null;
                                }
                                CharSequence clipboardData = PlatformChannel.this.platformMessageHandler.getClipboardData(clipboardContentFormatFromValue);
                                if (clipboardData == null) {
                                    result.success(null);
                                } else {
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("text", clipboardData);
                                    result.success(jSONObject2);
                                }
                            }
                            result.notImplemented();
                            break;
                        case 1674312266:
                            if (str.equals("SystemChrome.setEnabledSystemUIOverlays")) {
                                try {
                                    PlatformChannel.this.platformMessageHandler.showSystemOverlays(PlatformChannel.this.decodeSystemUiOverlays((JSONArray) obj));
                                    result.success(null);
                                } catch (NoSuchFieldException | JSONException e15) {
                                    result.error("error", e15.getMessage(), null);
                                    return;
                                }
                            }
                            result.notImplemented();
                            break;
                        case 2119655719:
                            if (str.equals("SystemChrome.setPreferredOrientations")) {
                                try {
                                    PlatformChannel.this.platformMessageHandler.setPreferredOrientations(PlatformChannel.this.decodeOrientations((JSONArray) obj));
                                    result.success(null);
                                } catch (NoSuchFieldException | JSONException e16) {
                                    result.error("error", e16.getMessage(), null);
                                    return;
                                }
                            }
                            result.notImplemented();
                            break;
                        default:
                            result.notImplemented();
                            break;
                    }
                } catch (JSONException e17) {
                    result.error("error", "JSON error: " + e17.getMessage(), null);
                }
            }
        };
        this.parsingMethodCallHandler = methodCallHandler;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/platform", JSONMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AppSwitcherDescription decodeAppSwitcherDescription(JSONObject jSONObject) throws JSONException {
        int i10 = jSONObject.getInt("primaryColor");
        if (i10 != 0) {
            i10 |= -16777216;
        }
        return new AppSwitcherDescription(i10, jSONObject.getString("label"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0050 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int decodeOrientations(org.json.JSONArray r7) {
        /*
            r6 = this;
            r6 = 0
            r0 = r6
            r1 = r0
            r2 = r1
        L4:
            int r3 = r7.length()
            r4 = 2
            r5 = 1
            if (r0 >= r3) goto L33
            java.lang.String r3 = r7.getString(r0)
            io.flutter.embedding.engine.systemchannels.PlatformChannel$DeviceOrientation r3 = io.flutter.embedding.engine.systemchannels.PlatformChannel.DeviceOrientation.fromValue(r3)
            int r3 = r3.ordinal()
            if (r3 == 0) goto L2b
            if (r3 == r5) goto L28
            if (r3 == r4) goto L25
            r4 = 3
            if (r3 == r4) goto L22
            goto L2d
        L22:
            r1 = r1 | 8
            goto L2d
        L25:
            r1 = r1 | 2
            goto L2d
        L28:
            r1 = r1 | 4
            goto L2d
        L2b:
            r1 = r1 | 1
        L2d:
            if (r2 != 0) goto L30
            r2 = r1
        L30:
            int r0 = r0 + 1
            goto L4
        L33:
            if (r1 == 0) goto L54
            r7 = 9
            r0 = 8
            switch(r1) {
                case 2: goto L53;
                case 3: goto L49;
                case 4: goto L48;
                case 5: goto L45;
                case 6: goto L49;
                case 7: goto L49;
                case 8: goto L44;
                case 9: goto L49;
                case 10: goto L41;
                case 11: goto L40;
                case 12: goto L49;
                case 13: goto L49;
                case 14: goto L49;
                case 15: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L50
        L3d:
            r6 = 13
            return r6
        L40:
            return r4
        L41:
            r6 = 11
            return r6
        L44:
            return r0
        L45:
            r6 = 12
            return r6
        L48:
            return r7
        L49:
            if (r2 == r4) goto L53
            r6 = 4
            if (r2 == r6) goto L52
            if (r2 == r0) goto L51
        L50:
            return r5
        L51:
            return r0
        L52:
            return r7
        L53:
            return r6
        L54:
            r6 = -1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.systemchannels.PlatformChannel.decodeOrientations(org.json.JSONArray):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SystemChromeStyle decodeSystemChromeStyle(JSONObject jSONObject) {
        return new SystemChromeStyle(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? Brightness.fromValue(jSONObject.getString("statusBarIconBrightness")) : null, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? Brightness.fromValue(jSONObject.getString("systemNavigationBarIconBrightness")) : null, !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SystemUiMode decodeSystemUiMode(String str) {
        int iOrdinal = SystemUiMode.fromValue(str).ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? SystemUiMode.EDGE_TO_EDGE : SystemUiMode.EDGE_TO_EDGE : SystemUiMode.IMMERSIVE_STICKY : SystemUiMode.IMMERSIVE : SystemUiMode.LEAN_BACK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<SystemUiOverlay> decodeSystemUiOverlays(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            int iOrdinal = SystemUiOverlay.fromValue(jSONArray.getString(i10)).ordinal();
            if (iOrdinal == 0) {
                arrayList.add(SystemUiOverlay.TOP_OVERLAYS);
            } else if (iOrdinal == 1) {
                arrayList.add(SystemUiOverlay.BOTTOM_OVERLAYS);
            }
        }
        return arrayList;
    }

    public void setPlatformMessageHandler(PlatformMessageHandler platformMessageHandler) {
        this.platformMessageHandler = platformMessageHandler;
    }

    public void systemChromeChanged(boolean z10) {
        Log.v(TAG, "Sending 'systemUIChange' message.");
        this.channel.invokeMethod("SystemChrome.systemUIChange", Arrays.asList(Boolean.valueOf(z10)));
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface PlatformMessageHandler {
        boolean clipboardHasStrings();

        CharSequence getClipboardData(ClipboardContentFormat clipboardContentFormat);

        void playSystemSound(SoundType soundType);

        void popSystemNavigator();

        void restoreSystemUiOverlays();

        void setApplicationSwitcherDescription(AppSwitcherDescription appSwitcherDescription);

        void setClipboardData(String str);

        void setPreferredOrientations(int i10);

        void setSystemUiChangeListener();

        void setSystemUiOverlayStyle(SystemChromeStyle systemChromeStyle);

        void share(String str);

        void showSystemOverlays(List<SystemUiOverlay> list);

        void showSystemUiMode(SystemUiMode systemUiMode);

        void vibrateHapticFeedback(HapticFeedbackType hapticFeedbackType);

        default void setFrameworkHandlesBack(boolean z10) {
        }
    }
}
