package com.cloudwebrtc.webrtc;

import com.cloudwebrtc.webrtc.utils.AnyThreadSink;
import com.cloudwebrtc.webrtc.utils.ConstraintsMap;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.sentry.protocol.FeatureFlag;
import io.sentry.protocol.SentryThread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.webrtc.FrameCryptor;
import org.webrtc.FrameCryptorAlgorithm;
import org.webrtc.FrameCryptorFactory;
import org.webrtc.FrameCryptorKeyProvider;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class FlutterRTCFrameCryptor {
    private static final String TAG = "FlutterRTCFrameCryptor";
    private final StateProvider stateProvider;
    private final Map<String, FrameCryptor> frameCryptos = new HashMap();
    private final Map<String, FrameCryptorStateObserver> frameCryptoObservers = new HashMap();
    private final Map<String, FrameCryptorKeyProvider> keyProviders = new HashMap();

    /* JADX INFO: renamed from: com.cloudwebrtc.webrtc.FlutterRTCFrameCryptor$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$FrameCryptor$FrameCryptionState;

        static {
            int[] iArr = new int[FrameCryptor.FrameCryptionState.values().length];
            $SwitchMap$org$webrtc$FrameCryptor$FrameCryptionState = iArr;
            try {
                iArr[FrameCryptor.FrameCryptionState.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$webrtc$FrameCryptor$FrameCryptionState[FrameCryptor.FrameCryptionState.OK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$webrtc$FrameCryptor$FrameCryptionState[FrameCryptor.FrameCryptionState.DECRYPTIONFAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$webrtc$FrameCryptor$FrameCryptionState[FrameCryptor.FrameCryptionState.ENCRYPTIONFAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$webrtc$FrameCryptor$FrameCryptionState[FrameCryptor.FrameCryptionState.INTERNALERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$webrtc$FrameCryptor$FrameCryptionState[FrameCryptor.FrameCryptionState.KEYRATCHETED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$webrtc$FrameCryptor$FrameCryptionState[FrameCryptor.FrameCryptionState.MISSINGKEY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class FrameCryptorStateObserver implements FrameCryptor.Observer, EventChannel.StreamHandler {
        private final EventChannel eventChannel;
        private final ArrayList eventQueue = new ArrayList();
        private EventChannel.EventSink eventSink;
        private final String frameCryptorId;

        public FrameCryptorStateObserver(BinaryMessenger binaryMessenger, String str) {
            this.frameCryptorId = str;
            EventChannel eventChannel = new EventChannel(binaryMessenger, "FlutterWebRTC/frameCryptorEvent" + str);
            this.eventChannel = eventChannel;
            eventChannel.setStreamHandler(new EventChannel.StreamHandler() { // from class: com.cloudwebrtc.webrtc.FlutterRTCFrameCryptor.FrameCryptorStateObserver.1
                @Override // io.flutter.plugin.common.EventChannel.StreamHandler
                public void onCancel(Object obj) {
                    FrameCryptorStateObserver.this.eventSink = null;
                }

                @Override // io.flutter.plugin.common.EventChannel.StreamHandler
                public void onListen(Object obj, EventChannel.EventSink eventSink) {
                    FrameCryptorStateObserver.this.eventSink = new AnyThreadSink(eventSink);
                    Iterator it = FrameCryptorStateObserver.this.eventQueue.iterator();
                    while (it.hasNext()) {
                        FrameCryptorStateObserver.this.eventSink.success(it.next());
                    }
                    FrameCryptorStateObserver.this.eventQueue.clear();
                }
            });
        }

        private String frameCryptorErrorStateToString(FrameCryptor.FrameCryptionState frameCryptionState) {
            switch (AnonymousClass1.$SwitchMap$org$webrtc$FrameCryptor$FrameCryptionState[frameCryptionState.ordinal()]) {
                case 1:
                    return "new";
                case 2:
                    return "ok";
                case 3:
                    return "decryptionFailed";
                case 4:
                    return "encryptionFailed";
                case 5:
                    return "internalError";
                case 6:
                    return "keyRatcheted";
                case 7:
                    return "missingKey";
                default:
                    throw new IllegalArgumentException("Unknown FrameCryptorErrorState: " + frameCryptionState);
            }
        }

        @Override // io.flutter.plugin.common.EventChannel.StreamHandler
        public void onCancel(Object obj) {
            this.eventSink = null;
        }

        @Override // org.webrtc.FrameCryptor.Observer
        public void onFrameCryptionStateChanged(String str, FrameCryptor.FrameCryptionState frameCryptionState) {
            HashMap map = new HashMap();
            map.put("event", "frameCryptionStateChanged");
            map.put("participantId", str);
            map.put(SentryThread.JsonKeys.STATE, frameCryptorErrorStateToString(frameCryptionState));
            EventChannel.EventSink eventSink = this.eventSink;
            if (eventSink != null) {
                eventSink.success(map);
            } else {
                this.eventQueue.add(map);
            }
        }

        @Override // io.flutter.plugin.common.EventChannel.StreamHandler
        public void onListen(Object obj, EventChannel.EventSink eventSink) {
            this.eventSink = new AnyThreadSink(eventSink);
            Iterator it = this.eventQueue.iterator();
            while (it.hasNext()) {
                this.eventSink.success(it.next());
            }
            this.eventQueue.clear();
        }
    }

    public FlutterRTCFrameCryptor(StateProvider stateProvider) {
        this.stateProvider = stateProvider;
    }

    private void frameCryptorDispose(Map<String, Object> map, MethodChannel.Result result) {
        String str = (String) map.get("frameCryptorId");
        FrameCryptor frameCryptor = this.frameCryptos.get(str);
        if (frameCryptor == null) {
            result.error("frameCryptorDisposeFailed", "frameCryptor not found", null);
            return;
        }
        frameCryptor.dispose();
        this.frameCryptos.remove(str);
        this.frameCryptoObservers.remove(str);
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString(FeatureFlag.JsonKeys.RESULT, "success");
        result.success(constraintsMap.toMap());
    }

    private void frameCryptorFactoryCreateFrameCryptor(Map<String, Object> map, MethodChannel.Result result) {
        FrameCryptorKeyProvider frameCryptorKeyProvider = this.keyProviders.get((String) map.get("keyProviderId"));
        if (frameCryptorKeyProvider == null) {
            result.error("frameCryptorFactoryCreateFrameCryptorFailed", "keyProvider not found", null);
            return;
        }
        PeerConnectionObserver peerConnectionObserver = this.stateProvider.getPeerConnectionObserver((String) map.get("peerConnectionId"));
        if (peerConnectionObserver == null) {
            result.error("frameCryptorFactoryCreateFrameCryptorFailed", "peerConnection not found", null);
            return;
        }
        String str = (String) map.get("participantId");
        String str2 = (String) map.get("type");
        int iIntValue = ((Integer) map.get("algorithm")).intValue();
        String str3 = (String) map.get("rtpSenderId");
        String str4 = (String) map.get("rtpReceiverId");
        if (str2.equals("sender")) {
            FrameCryptor frameCryptorCreateFrameCryptorForRtpSender = FrameCryptorFactory.createFrameCryptorForRtpSender(this.stateProvider.getPeerConnectionFactory(), peerConnectionObserver.getRtpSenderById(str3), str, frameCryptorAlgorithmFromInt(iIntValue), frameCryptorKeyProvider);
            String string = UUID.randomUUID().toString();
            this.frameCryptos.put(string, frameCryptorCreateFrameCryptorForRtpSender);
            FrameCryptorStateObserver frameCryptorStateObserver = new FrameCryptorStateObserver(this.stateProvider.getMessenger(), string);
            frameCryptorCreateFrameCryptorForRtpSender.setObserver(frameCryptorStateObserver);
            this.frameCryptoObservers.put(string, frameCryptorStateObserver);
            ConstraintsMap constraintsMap = new ConstraintsMap();
            constraintsMap.putString("frameCryptorId", string);
            result.success(constraintsMap.toMap());
            return;
        }
        if (!str2.equals("receiver")) {
            result.error("frameCryptorFactoryCreateFrameCryptorFailed", "type must be sender or receiver", null);
            return;
        }
        FrameCryptor frameCryptorCreateFrameCryptorForRtpReceiver = FrameCryptorFactory.createFrameCryptorForRtpReceiver(this.stateProvider.getPeerConnectionFactory(), peerConnectionObserver.getRtpReceiverById(str4), str, frameCryptorAlgorithmFromInt(iIntValue), frameCryptorKeyProvider);
        String string2 = UUID.randomUUID().toString();
        this.frameCryptos.put(string2, frameCryptorCreateFrameCryptorForRtpReceiver);
        FrameCryptorStateObserver frameCryptorStateObserver2 = new FrameCryptorStateObserver(this.stateProvider.getMessenger(), string2);
        frameCryptorCreateFrameCryptorForRtpReceiver.setObserver(frameCryptorStateObserver2);
        this.frameCryptoObservers.put(string2, frameCryptorStateObserver2);
        ConstraintsMap constraintsMap2 = new ConstraintsMap();
        constraintsMap2.putString("frameCryptorId", string2);
        result.success(constraintsMap2.toMap());
    }

    private void frameCryptorFactoryCreateKeyProvider(Map<String, Object> map, MethodChannel.Result result) {
        String string = UUID.randomUUID().toString();
        Map map2 = (Map) map.get("keyProviderOptions");
        boolean zBooleanValue = ((Boolean) map2.get("sharedKey")).booleanValue();
        int iIntValue = ((Integer) map2.get("ratchetWindowSize")).intValue();
        int iIntValue2 = ((Integer) map2.get("failureTolerance")).intValue();
        byte[] bArr = (byte[]) map2.get("ratchetSalt");
        byte[] bArr2 = new byte[0];
        if (map2.containsKey("uncryptedMagicBytes")) {
            bArr2 = (byte[]) map2.get("uncryptedMagicBytes");
        }
        FrameCryptorKeyProvider frameCryptorKeyProviderCreateFrameCryptorKeyProvider = FrameCryptorFactory.createFrameCryptorKeyProvider(zBooleanValue, bArr, iIntValue, bArr2, iIntValue2, ((Integer) map2.get("keyRingSize")).intValue(), ((Boolean) map2.get("discardFrameWhenCryptorNotReady")).booleanValue());
        ConstraintsMap constraintsMap = new ConstraintsMap();
        this.keyProviders.put(string, frameCryptorKeyProviderCreateFrameCryptorKeyProvider);
        constraintsMap.putString("keyProviderId", string);
        result.success(constraintsMap.toMap());
    }

    private void frameCryptorGetEnabled(Map<String, Object> map, MethodChannel.Result result) {
        FrameCryptor frameCryptor = this.frameCryptos.get((String) map.get("frameCryptorId"));
        if (frameCryptor == null) {
            result.error("frameCryptorGetEnabledFailed", "frameCryptor not found", null);
            return;
        }
        boolean zIsEnabled = frameCryptor.isEnabled();
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putBoolean("enabled", zIsEnabled);
        result.success(constraintsMap.toMap());
    }

    private void frameCryptorGetKeyIndex(Map<String, Object> map, MethodChannel.Result result) {
        FrameCryptor frameCryptor = this.frameCryptos.get((String) map.get("frameCryptorId"));
        if (frameCryptor == null) {
            result.error("frameCryptorGetKeyIndexFailed", "frameCryptor not found", null);
            return;
        }
        int keyIndex = frameCryptor.getKeyIndex();
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putInt("keyIndex", keyIndex);
        result.success(constraintsMap.toMap());
    }

    private void frameCryptorSetEnabled(Map<String, Object> map, MethodChannel.Result result) {
        FrameCryptor frameCryptor = this.frameCryptos.get((String) map.get("frameCryptorId"));
        if (frameCryptor == null) {
            result.error("frameCryptorSetEnabledFailed", "frameCryptor not found", null);
            return;
        }
        boolean zBooleanValue = ((Boolean) map.get("enabled")).booleanValue();
        frameCryptor.setEnabled(zBooleanValue);
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putBoolean(FeatureFlag.JsonKeys.RESULT, zBooleanValue);
        result.success(constraintsMap.toMap());
    }

    private void frameCryptorSetKeyIndex(Map<String, Object> map, MethodChannel.Result result) {
        FrameCryptor frameCryptor = this.frameCryptos.get((String) map.get("frameCryptorId"));
        if (frameCryptor == null) {
            result.error("frameCryptorSetKeyIndexFailed", "frameCryptor not found", null);
            return;
        }
        frameCryptor.setKeyIndex(((Integer) map.get("keyIndex")).intValue());
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putBoolean(FeatureFlag.JsonKeys.RESULT, true);
        result.success(constraintsMap.toMap());
    }

    private void keyProviderDispose(Map<String, Object> map, MethodChannel.Result result) {
        String str = (String) map.get("keyProviderId");
        FrameCryptorKeyProvider frameCryptorKeyProvider = this.keyProviders.get(str);
        if (frameCryptorKeyProvider == null) {
            result.error("keyProviderDisposeFailed", "keyProvider not found", null);
            return;
        }
        frameCryptorKeyProvider.dispose();
        this.keyProviders.remove(str);
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString(FeatureFlag.JsonKeys.RESULT, "success");
        result.success(constraintsMap.toMap());
    }

    private void keyProviderExportKey(Map<String, Object> map, MethodChannel.Result result) {
        FrameCryptorKeyProvider frameCryptorKeyProvider = this.keyProviders.get((String) map.get("keyProviderId"));
        if (frameCryptorKeyProvider == null) {
            result.error("keyProviderExportKeyFailed", "keyProvider not found", null);
            return;
        }
        byte[] bArrExportKey = frameCryptorKeyProvider.exportKey((String) map.get("participantId"), ((Integer) map.get("keyIndex")).intValue());
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putByte(FeatureFlag.JsonKeys.RESULT, bArrExportKey);
        result.success(constraintsMap.toMap());
    }

    private void keyProviderExportSharedKey(Map<String, Object> map, MethodChannel.Result result) {
        FrameCryptorKeyProvider frameCryptorKeyProvider = this.keyProviders.get((String) map.get("keyProviderId"));
        if (frameCryptorKeyProvider == null) {
            result.error("keyProviderExportSharedKeyFailed", "keyProvider not found", null);
            return;
        }
        byte[] bArrExportSharedKey = frameCryptorKeyProvider.exportSharedKey(((Integer) map.get("keyIndex")).intValue());
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putByte(FeatureFlag.JsonKeys.RESULT, bArrExportSharedKey);
        result.success(constraintsMap.toMap());
    }

    private void keyProviderRatchetKey(Map<String, Object> map, MethodChannel.Result result) {
        FrameCryptorKeyProvider frameCryptorKeyProvider = this.keyProviders.get((String) map.get("keyProviderId"));
        if (frameCryptorKeyProvider == null) {
            result.error("keyProviderSetKeysFailed", "keyProvider not found", null);
            return;
        }
        byte[] bArrRatchetKey = frameCryptorKeyProvider.ratchetKey((String) map.get("participantId"), ((Integer) map.get("keyIndex")).intValue());
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putByte(FeatureFlag.JsonKeys.RESULT, bArrRatchetKey);
        result.success(constraintsMap.toMap());
    }

    private void keyProviderRatchetSharedKey(Map<String, Object> map, MethodChannel.Result result) {
        FrameCryptorKeyProvider frameCryptorKeyProvider = this.keyProviders.get((String) map.get("keyProviderId"));
        if (frameCryptorKeyProvider == null) {
            result.error("keyProviderRatchetSharedKeyFailed", "keyProvider not found", null);
            return;
        }
        byte[] bArrRatchetSharedKey = frameCryptorKeyProvider.ratchetSharedKey(((Integer) map.get("keyIndex")).intValue());
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putByte(FeatureFlag.JsonKeys.RESULT, bArrRatchetSharedKey);
        result.success(constraintsMap.toMap());
    }

    private void keyProviderSetKey(Map<String, Object> map, MethodChannel.Result result) {
        FrameCryptorKeyProvider frameCryptorKeyProvider = this.keyProviders.get((String) map.get("keyProviderId"));
        if (frameCryptorKeyProvider == null) {
            result.error("keyProviderSetKeyFailed", "keyProvider not found", null);
            return;
        }
        frameCryptorKeyProvider.setKey((String) map.get("participantId"), ((Integer) map.get("keyIndex")).intValue(), (byte[]) map.get("key"));
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putBoolean(FeatureFlag.JsonKeys.RESULT, true);
        result.success(constraintsMap.toMap());
    }

    private void keyProviderSetSharedKey(Map<String, Object> map, MethodChannel.Result result) {
        FrameCryptorKeyProvider frameCryptorKeyProvider = this.keyProviders.get((String) map.get("keyProviderId"));
        if (frameCryptorKeyProvider == null) {
            result.error("keyProviderSetKeySharedFailed", "keyProvider not found", null);
            return;
        }
        frameCryptorKeyProvider.setSharedKey(((Integer) map.get("keyIndex")).intValue(), (byte[]) map.get("key"));
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putBoolean(FeatureFlag.JsonKeys.RESULT, true);
        result.success(constraintsMap.toMap());
    }

    private void keyProviderSetSifTrailer(Map<String, Object> map, MethodChannel.Result result) {
        FrameCryptorKeyProvider frameCryptorKeyProvider = this.keyProviders.get((String) map.get("keyProviderId"));
        if (frameCryptorKeyProvider == null) {
            result.error("keyProviderSetSifTrailerFailed", "keyProvider not found", null);
            return;
        }
        frameCryptorKeyProvider.setSifTrailer((byte[]) map.get("sifTrailer"));
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putBoolean(FeatureFlag.JsonKeys.RESULT, true);
        result.success(constraintsMap.toMap());
    }

    public FrameCryptorAlgorithm frameCryptorAlgorithmFromInt(int i10) {
        return i10 != 0 ? FrameCryptorAlgorithm.AES_GCM : FrameCryptorAlgorithm.AES_GCM;
    }

    public FrameCryptorKeyProvider getKeyProvider(String str) {
        return this.keyProviders.get(str);
    }

    public boolean handleMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        Map<String, Object> map = (Map) methodCall.arguments;
        if (str.equals("frameCryptorFactoryCreateFrameCryptor")) {
            frameCryptorFactoryCreateFrameCryptor(map, result);
            return true;
        }
        if (str.equals("frameCryptorSetKeyIndex")) {
            frameCryptorSetKeyIndex(map, result);
            return true;
        }
        if (str.equals("frameCryptorGetKeyIndex")) {
            frameCryptorGetKeyIndex(map, result);
            return true;
        }
        if (str.equals("frameCryptorSetEnabled")) {
            frameCryptorSetEnabled(map, result);
            return true;
        }
        if (str.equals("frameCryptorGetEnabled")) {
            frameCryptorGetEnabled(map, result);
            return true;
        }
        if (str.equals("frameCryptorDispose")) {
            frameCryptorDispose(map, result);
            return true;
        }
        if (str.equals("frameCryptorFactoryCreateKeyProvider")) {
            frameCryptorFactoryCreateKeyProvider(map, result);
            return true;
        }
        if (str.equals("keyProviderSetSharedKey")) {
            keyProviderSetSharedKey(map, result);
            return true;
        }
        if (str.equals("keyProviderRatchetSharedKey")) {
            keyProviderRatchetSharedKey(map, result);
            return true;
        }
        if (str.equals("keyProviderExportSharedKey")) {
            keyProviderExportKey(map, result);
            return true;
        }
        if (str.equals("keyProviderSetKey")) {
            keyProviderSetKey(map, result);
            return true;
        }
        if (str.equals("keyProviderRatchetKey")) {
            keyProviderRatchetKey(map, result);
            return true;
        }
        if (str.equals("keyProviderExportKey")) {
            keyProviderExportKey(map, result);
            return true;
        }
        if (str.equals("keyProviderSetSifTrailer")) {
            keyProviderSetSifTrailer(map, result);
            return true;
        }
        if (!str.equals("keyProviderDispose")) {
            return false;
        }
        keyProviderDispose(map, result);
        return true;
    }
}
