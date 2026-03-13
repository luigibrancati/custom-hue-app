package com.cloudwebrtc.webrtc;

import android.app.Activity;
import android.content.Context;
import android.hardware.Camera;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.LongSparseArray;
import com.cloudwebrtc.webrtc.GetUserMediaImpl;
import com.cloudwebrtc.webrtc.audio.AudioDeviceKind;
import com.cloudwebrtc.webrtc.audio.AudioProcessingController;
import com.cloudwebrtc.webrtc.audio.AudioSwitchManager;
import com.cloudwebrtc.webrtc.audio.AudioUtils;
import com.cloudwebrtc.webrtc.audio.PlaybackSamplesReadyCallbackAdapter;
import com.cloudwebrtc.webrtc.audio.RecordSamplesReadyCallbackAdapter;
import com.cloudwebrtc.webrtc.utils.AnyThreadResult;
import com.cloudwebrtc.webrtc.utils.Callback;
import com.cloudwebrtc.webrtc.utils.ConstraintsArray;
import com.cloudwebrtc.webrtc.utils.ConstraintsMap;
import com.cloudwebrtc.webrtc.utils.MediaConstraintsUtils;
import com.cloudwebrtc.webrtc.utils.ObjectType;
import com.cloudwebrtc.webrtc.utils.PermissionUtils;
import com.cloudwebrtc.webrtc.video.LocalVideoTrack;
import com.cloudwebrtc.webrtc.video.camera.CameraUtils;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.view.TextureRegistry;
import io.sentry.MeasurementUnit;
import io.sentry.SentryReplayEvent;
import io.sentry.protocol.User;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.webrtc.AudioTrack;
import org.webrtc.CryptoOptions;
import org.webrtc.IceCandidate;
import org.webrtc.Loggable;
import org.webrtc.Logging;
import org.webrtc.MediaConstraints;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.RtpCapabilities;
import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;
import org.webrtc.VideoTrack;
import org.webrtc.audio.JavaAudioDeviceModule;
import org.webrtc.video.CustomVideoDecoderFactory;
import org.webrtc.video.CustomVideoEncoderFactory;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class MethodCallHandlerImpl implements MethodChannel.MethodCallHandler, StateProvider {
    public static final String TAG = "FlutterWebRTCPlugin";
    public static LogSink logSink = new LogSink();
    private Activity activity;
    private JavaAudioDeviceModule audioDeviceModule;
    public AudioProcessingController audioProcessingController;
    private CameraUtils cameraUtils;
    private final Context context;
    private FlutterDataPacketCryptor dataPacketCryptor;
    private FlutterRTCFrameCryptor frameCryptor;
    private GetUserMediaImpl getUserMediaImpl;
    private PeerConnectionFactory mFactory;
    private final BinaryMessenger messenger;
    public PlaybackSamplesReadyCallbackAdapter playbackSamplesReadyCallbackAdapter;
    public RecordSamplesReadyCallbackAdapter recordSamplesReadyCallbackAdapter;
    private final TextureRegistry textures;
    private CustomVideoDecoderFactory videoDecoderFactory;
    private CustomVideoEncoderFactory videoEncoderFactory;
    private final Map<String, PeerConnectionObserver> mPeerConnectionObservers = new HashMap();
    private final Map<String, MediaStream> localStreams = new HashMap();
    private final Map<String, LocalTrack> localTracks = new HashMap();
    private final LongSparseArray<FlutterRTCVideoRenderer> renders = new LongSparseArray<>();
    ExecutorService executor = Executors.newSingleThreadExecutor();
    Handler mainHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.cloudwebrtc.webrtc.MethodCallHandlerImpl$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] $SwitchMap$com$cloudwebrtc$webrtc$utils$ObjectType;

        static {
            int[] iArr = new int[ObjectType.values().length];
            $SwitchMap$com$cloudwebrtc$webrtc$utils$ObjectType = iArr;
            try {
                iArr[ObjectType.String.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$cloudwebrtc$webrtc$utils$ObjectType[ObjectType.Array.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class LogSink implements Loggable {
        @Override // org.webrtc.Loggable
        public void onLogMessage(String str, Logging.Severity severity, String str2) {
            ConstraintsMap constraintsMap = new ConstraintsMap();
            constraintsMap.putString("event", "onLogData");
            constraintsMap.putString("data", str);
            FlutterWebRTCPlugin.sharedSingleton.sendEvent(constraintsMap.toMap());
        }
    }

    public MethodCallHandlerImpl(Context context, BinaryMessenger binaryMessenger, TextureRegistry textureRegistry) {
        this.context = context;
        this.textures = textureRegistry;
        this.messenger = binaryMessenger;
    }

    public static /* synthetic */ void a(ArrayList arrayList, Callback callback, Callback callback2, String[] strArr, int[] iArr) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str = strArr[i10];
            if (iArr[i10] == 0) {
                arrayList2.add(str);
            } else {
                arrayList3.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!arrayList2.contains((String) it.next())) {
                callback.invoke(arrayList3);
                return;
            }
        }
        callback2.invoke(arrayList2);
    }

    public static /* synthetic */ void c(MethodCallHandlerImpl methodCallHandlerImpl, final AnyThreadResult anyThreadResult) {
        methodCallHandlerImpl.audioDeviceModule.prewarmRecording();
        methodCallHandlerImpl.mainHandler.post(new Runnable() { // from class: com.cloudwebrtc.webrtc.d
            @Override // java.lang.Runnable
            public final void run() {
                anyThreadResult.success(null);
            }
        });
    }

    private ConstraintsMap capabilitiestoMap(RtpCapabilities rtpCapabilities) {
        ConstraintsMap constraintsMap = new ConstraintsMap();
        ConstraintsArray constraintsArray = new ConstraintsArray();
        for (RtpCapabilities.CodecCapability codecCapability : rtpCapabilities.codecs) {
            ConstraintsMap constraintsMap2 = new ConstraintsMap();
            constraintsMap2.putString("mimeType", codecCapability.mimeType);
            constraintsMap2.putInt("clockRate", codecCapability.clockRate.intValue());
            Integer num = codecCapability.numChannels;
            if (num != null) {
                constraintsMap2.putInt("channels", num.intValue());
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, String> entry : codecCapability.parameters.entrySet()) {
                if (entry.getKey().length() > 0) {
                    arrayList.add(entry.getKey() + "=" + entry.getValue());
                } else {
                    arrayList.add(entry.getValue());
                }
            }
            if (arrayList.size() > 0) {
                constraintsMap2.putString("sdpFmtpLine", String.join(";", arrayList));
            }
            constraintsArray.pushMap(constraintsMap2);
        }
        ConstraintsArray constraintsArray2 = new ConstraintsArray();
        for (RtpCapabilities.HeaderExtensionCapability headerExtensionCapability : rtpCapabilities.headerExtensions) {
            ConstraintsMap constraintsMap3 = new ConstraintsMap();
            constraintsMap3.putString("uri", headerExtensionCapability.getUri());
            constraintsMap3.putInt("id", headerExtensionCapability.getPreferredId());
            constraintsMap3.putBoolean("encrypted", headerExtensionCapability.getPreferredEncrypted());
            constraintsArray2.pushMap(constraintsMap3);
        }
        constraintsMap.putArray("codecs", constraintsArray.toArrayList());
        constraintsMap.putArray("headerExtensions", constraintsArray2.toArrayList());
        constraintsMap.putArray("fecMechanisms", new ConstraintsArray().toArrayList());
        return constraintsMap;
    }

    private List<PeerConnection.IceServer> createIceServers(ConstraintsArray constraintsArray) {
        int size = constraintsArray == null ? 0 : constraintsArray.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintsMap map = constraintsArray.getMap(i10);
            boolean z10 = map.hasKey(User.JsonKeys.USERNAME) && map.hasKey("credential");
            if (map.hasKey("url")) {
                if (z10) {
                    arrayList.add(PeerConnection.IceServer.builder(map.getString("url")).setUsername(map.getString(User.JsonKeys.USERNAME)).setPassword(map.getString("credential")).createIceServer());
                } else {
                    arrayList.add(PeerConnection.IceServer.builder(map.getString("url")).createIceServer());
                }
            } else if (map.hasKey(SentryReplayEvent.JsonKeys.URLS)) {
                int i11 = AnonymousClass7.$SwitchMap$com$cloudwebrtc$webrtc$utils$ObjectType[map.getType(SentryReplayEvent.JsonKeys.URLS).ordinal()];
                if (i11 != 1) {
                    if (i11 == 2) {
                        ConstraintsArray array = map.getArray(SentryReplayEvent.JsonKeys.URLS);
                        ArrayList arrayList2 = new ArrayList();
                        for (int i12 = 0; i12 < array.size(); i12++) {
                            arrayList2.add(array.getString(i12));
                        }
                        PeerConnection.IceServer.Builder builder = PeerConnection.IceServer.builder(arrayList2);
                        if (z10) {
                            builder.setUsername(map.getString(User.JsonKeys.USERNAME)).setPassword(map.getString("credential"));
                        }
                        arrayList.add(builder.createIceServer());
                    }
                } else if (z10) {
                    arrayList.add(PeerConnection.IceServer.builder(map.getString(SentryReplayEvent.JsonKeys.URLS)).setUsername(map.getString(User.JsonKeys.USERNAME)).setPassword(map.getString("credential")).createIceServer());
                } else {
                    arrayList.add(PeerConnection.IceServer.builder(map.getString(SentryReplayEvent.JsonKeys.URLS)).createIceServer());
                }
            }
        }
        return arrayList;
    }

    private void createLocalMediaStream(MethodChannel.Result result) {
        String nextStreamUUID = getNextStreamUUID();
        MediaStream mediaStreamCreateLocalMediaStream = this.mFactory.createLocalMediaStream(nextStreamUUID);
        this.localStreams.put(nextStreamUUID, mediaStreamCreateLocalMediaStream);
        if (mediaStreamCreateLocalMediaStream == null) {
            resultError("createLocalMediaStream", "Failed to create new media stream", result);
            return;
        }
        HashMap map = new HashMap();
        map.put("streamId", mediaStreamCreateLocalMediaStream.getId());
        result.success(map);
    }

    private MediaConstraints defaultConstraints() {
        MediaConstraints mediaConstraints = new MediaConstraints();
        mediaConstraints.mandatory.add(new MediaConstraints.KeyValuePair("OfferToReceiveAudio", "true"));
        mediaConstraints.mandatory.add(new MediaConstraints.KeyValuePair("OfferToReceiveVideo", "true"));
        mediaConstraints.optional.add(new MediaConstraints.KeyValuePair("DtlsSrtpKeyAgreement", "true"));
        return mediaConstraints;
    }

    public static /* synthetic */ void f(MethodCallHandlerImpl methodCallHandlerImpl, final AnyThreadResult anyThreadResult) {
        methodCallHandlerImpl.audioDeviceModule.requestStopRecording();
        methodCallHandlerImpl.mainHandler.post(new Runnable() { // from class: com.cloudwebrtc.webrtc.e
            @Override // java.lang.Runnable
            public final void run() {
                anyThreadResult.success(null);
            }
        });
    }

    private PeerConnection getPeerConnection(String str) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null) {
            return null;
        }
        return peerConnectionObserver.getPeerConnection();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void initialize(boolean r6, int r7, boolean r8, java.util.List<java.lang.String> r9, com.cloudwebrtc.webrtc.utils.ConstraintsMap r10, org.webrtc.Logging.Severity r11, java.lang.Integer r12, java.lang.Integer r13) {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudwebrtc.webrtc.MethodCallHandlerImpl.initialize(boolean, int, boolean, java.util.List, com.cloudwebrtc.webrtc.utils.ConstraintsMap, org.webrtc.Logging$Severity, java.lang.Integer, java.lang.Integer):void");
    }

    private PeerConnection.RTCConfiguration parseRTCConfiguration(ConstraintsMap constraintsMap) {
        int i10;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        int i11;
        String string6;
        String string7;
        String string8;
        PeerConnection.RTCConfiguration rTCConfiguration = new PeerConnection.RTCConfiguration(createIceServers(constraintsMap != null ? constraintsMap.getArray("iceServers") : null));
        if (constraintsMap != null) {
            boolean z10 = false;
            if (constraintsMap.hasKey("iceTransportPolicy") && constraintsMap.getType("iceTransportPolicy") == ObjectType.String && (string8 = constraintsMap.getString("iceTransportPolicy")) != null) {
                switch (string8) {
                    case "nohost":
                        rTCConfiguration.iceTransportsType = PeerConnection.IceTransportsType.NOHOST;
                        break;
                    case "all":
                        rTCConfiguration.iceTransportsType = PeerConnection.IceTransportsType.ALL;
                        break;
                    case "none":
                        rTCConfiguration.iceTransportsType = PeerConnection.IceTransportsType.NONE;
                        break;
                    case "relay":
                        rTCConfiguration.iceTransportsType = PeerConnection.IceTransportsType.RELAY;
                        break;
                }
            }
            if (constraintsMap.hasKey("bundlePolicy") && constraintsMap.getType("bundlePolicy") == ObjectType.String && (string7 = constraintsMap.getString("bundlePolicy")) != null) {
                switch (string7) {
                    case "balanced":
                        rTCConfiguration.bundlePolicy = PeerConnection.BundlePolicy.BALANCED;
                        break;
                    case "max-bundle":
                        rTCConfiguration.bundlePolicy = PeerConnection.BundlePolicy.MAXBUNDLE;
                        break;
                    case "max-compat":
                        rTCConfiguration.bundlePolicy = PeerConnection.BundlePolicy.MAXCOMPAT;
                        break;
                }
            }
            if (constraintsMap.hasKey("rtcpMuxPolicy") && constraintsMap.getType("rtcpMuxPolicy") == ObjectType.String && (string6 = constraintsMap.getString("rtcpMuxPolicy")) != null) {
                if (string6.equals("negotiate")) {
                    rTCConfiguration.rtcpMuxPolicy = PeerConnection.RtcpMuxPolicy.NEGOTIATE;
                } else if (string6.equals("require")) {
                    rTCConfiguration.rtcpMuxPolicy = PeerConnection.RtcpMuxPolicy.REQUIRE;
                }
            }
            if (constraintsMap.hasKey("iceCandidatePoolSize") && constraintsMap.getType("iceCandidatePoolSize") == ObjectType.Number && (i11 = constraintsMap.getInt("iceCandidatePoolSize")) > 0) {
                rTCConfiguration.iceCandidatePoolSize = i11;
            }
            if (constraintsMap.hasKey("sdpSemantics") && constraintsMap.getType("sdpSemantics") == ObjectType.String && (string5 = constraintsMap.getString("sdpSemantics")) != null) {
                if (string5.equals("plan-b")) {
                    rTCConfiguration.sdpSemantics = PeerConnection.SdpSemantics.PLAN_B;
                } else if (string5.equals("unified-plan")) {
                    rTCConfiguration.sdpSemantics = PeerConnection.SdpSemantics.UNIFIED_PLAN;
                }
            }
            if (constraintsMap.hasKey("enableDscp") && constraintsMap.getType("enableDscp") == ObjectType.Boolean) {
                rTCConfiguration.enableDscp = constraintsMap.getBoolean("enableDscp");
            }
            if (constraintsMap.hasKey("maxIPv6Networks") && constraintsMap.getType("maxIPv6Networks") == ObjectType.Number) {
                rTCConfiguration.maxIPv6Networks = constraintsMap.getInt("maxIPv6Networks");
            }
            if (constraintsMap.hasKey("tcpCandidatePolicy") && constraintsMap.getType("tcpCandidatePolicy") == ObjectType.String && (string4 = constraintsMap.getString("tcpCandidatePolicy")) != null) {
                if (string4.equals("enabled")) {
                    rTCConfiguration.tcpCandidatePolicy = PeerConnection.TcpCandidatePolicy.ENABLED;
                } else if (string4.equals("disabled")) {
                    rTCConfiguration.tcpCandidatePolicy = PeerConnection.TcpCandidatePolicy.DISABLED;
                }
            }
            if (constraintsMap.hasKey("candidateNetworkPolicy") && constraintsMap.getType("candidateNetworkPolicy") == ObjectType.String && (string3 = constraintsMap.getString("candidateNetworkPolicy")) != null) {
                if (string3.equals("low_cost")) {
                    rTCConfiguration.candidateNetworkPolicy = PeerConnection.CandidateNetworkPolicy.LOW_COST;
                } else if (string3.equals("all")) {
                    rTCConfiguration.candidateNetworkPolicy = PeerConnection.CandidateNetworkPolicy.ALL;
                }
            }
            if (constraintsMap.hasKey("keyType") && constraintsMap.getType("keyType") == ObjectType.String && (string2 = constraintsMap.getString("keyType")) != null) {
                if (string2.equals("RSA")) {
                    rTCConfiguration.keyType = PeerConnection.KeyType.RSA;
                } else if (string2.equals("ECDSA")) {
                    rTCConfiguration.keyType = PeerConnection.KeyType.ECDSA;
                }
            }
            if (constraintsMap.hasKey("continualGatheringPolicy") && constraintsMap.getType("continualGatheringPolicy") == ObjectType.String && (string = constraintsMap.getString("continualGatheringPolicy")) != null) {
                if (string.equals("gather_once")) {
                    rTCConfiguration.continualGatheringPolicy = PeerConnection.ContinualGatheringPolicy.GATHER_ONCE;
                } else if (string.equals("gather_continually")) {
                    rTCConfiguration.continualGatheringPolicy = PeerConnection.ContinualGatheringPolicy.GATHER_CONTINUALLY;
                }
            }
            if (constraintsMap.hasKey("audioJitterBufferMaxPackets") && constraintsMap.getType("audioJitterBufferMaxPackets") == ObjectType.Number && (i10 = constraintsMap.getInt("audioJitterBufferMaxPackets")) > 0) {
                rTCConfiguration.audioJitterBufferMaxPackets = i10;
            }
            if (constraintsMap.hasKey("iceConnectionReceivingTimeout") && constraintsMap.getType("iceConnectionReceivingTimeout") == ObjectType.Number) {
                rTCConfiguration.iceConnectionReceivingTimeout = constraintsMap.getInt("iceConnectionReceivingTimeout");
            }
            if (constraintsMap.hasKey("iceBackupCandidatePairPingInterval") && constraintsMap.getType("iceBackupCandidatePairPingInterval") == ObjectType.Number) {
                rTCConfiguration.iceBackupCandidatePairPingInterval = constraintsMap.getInt("iceBackupCandidatePairPingInterval");
            }
            if (constraintsMap.hasKey("audioJitterBufferFastAccelerate") && constraintsMap.getType("audioJitterBufferFastAccelerate") == ObjectType.Boolean) {
                rTCConfiguration.audioJitterBufferFastAccelerate = constraintsMap.getBoolean("audioJitterBufferFastAccelerate");
            }
            if (constraintsMap.hasKey("pruneTurnPorts") && constraintsMap.getType("pruneTurnPorts") == ObjectType.Boolean) {
                rTCConfiguration.pruneTurnPorts = constraintsMap.getBoolean("pruneTurnPorts");
            }
            if (constraintsMap.hasKey("presumeWritableWhenFullyRelayed") && constraintsMap.getType("presumeWritableWhenFullyRelayed") == ObjectType.Boolean) {
                rTCConfiguration.presumeWritableWhenFullyRelayed = constraintsMap.getBoolean("presumeWritableWhenFullyRelayed");
            }
            if (constraintsMap.hasKey("cryptoOptions") && constraintsMap.getType("cryptoOptions") == ObjectType.Map) {
                ConstraintsMap map = constraintsMap.getMap("cryptoOptions");
                CryptoOptions.Builder enableEncryptedRtpHeaderExtensions = CryptoOptions.builder().setEnableGcmCryptoSuites(map.hasKey("enableGcmCryptoSuites") && map.getBoolean("enableGcmCryptoSuites")).setRequireFrameEncryption(map.hasKey("requireFrameEncryption") && map.getBoolean("requireFrameEncryption")).setEnableEncryptedRtpHeaderExtensions(map.hasKey("enableEncryptedRtpHeaderExtensions") && map.getBoolean("enableEncryptedRtpHeaderExtensions"));
                if (map.hasKey("enableAes128Sha1_32CryptoCipher") && map.getBoolean("enableAes128Sha1_32CryptoCipher")) {
                    z10 = true;
                }
                rTCConfiguration.cryptoOptions = enableEncryptedRtpHeaderExtensions.setEnableAes128Sha1_32CryptoCipher(z10).createCryptoOptions();
            }
            if (constraintsMap.hasKey("enableCpuOveruseDetection") && constraintsMap.getType("enableCpuOveruseDetection") == ObjectType.Boolean) {
                rTCConfiguration.enableCpuOveruseDetection = constraintsMap.getBoolean("enableCpuOveruseDetection");
            }
        }
        return rTCConfiguration;
    }

    private void removeStreamForRendererById(String str) {
        for (int i10 = 0; i10 < this.renders.size(); i10++) {
            FlutterRTCVideoRenderer flutterRTCVideoRendererValueAt = this.renders.valueAt(i10);
            if (flutterRTCVideoRendererValueAt.checkMediaStream(str, "local")) {
                flutterRTCVideoRendererValueAt.setStream(null, "");
            }
        }
    }

    private void removeTrackForRendererById(String str) {
        for (int i10 = 0; i10 < this.renders.size(); i10++) {
            FlutterRTCVideoRenderer flutterRTCVideoRendererValueAt = this.renders.valueAt(i10);
            if (flutterRTCVideoRendererValueAt.checkVideoTrack(str, "local")) {
                flutterRTCVideoRendererValueAt.setStream(null, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void resultError(String str, String str2, MethodChannel.Result result) {
        String str3 = str + "(): " + str2;
        result.error(str, str3, null);
        Log.d("FlutterWebRTCPlugin", str3);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private Logging.Severity str2LogSeverity(String str) {
        switch (str.hashCode()) {
            case 3237038:
                if (str.equals("info")) {
                    return Logging.Severity.LS_INFO;
                }
                break;
            case 3387192:
                str.equals(MeasurementUnit.NONE);
                break;
            case 96784904:
                if (str.equals("error")) {
                    return Logging.Severity.LS_ERROR;
                }
                break;
            case 351107458:
                if (str.equals("verbose")) {
                    return Logging.Severity.LS_VERBOSE;
                }
                break;
            case 1124446108:
                if (str.equals("warning")) {
                    return Logging.Severity.LS_WARNING;
                }
                break;
        }
        return Logging.Severity.LS_NONE;
    }

    public void addTrack(String str, String str2, List<String> list, MethodChannel.Result result) {
        LocalTrack localTrack;
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        synchronized (this.localTracks) {
            localTrack = this.localTracks.get(str2);
        }
        if (localTrack == null) {
            resultError("addTrack", "track is null", result);
        } else if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            resultError("addTrack", "peerConnection is null", result);
        } else {
            peerConnectionObserver.addTrack(localTrack.track, list, result);
        }
    }

    public void addTransceiver(String str, String str2, Map<String, Object> map, MethodChannel.Result result) {
        LocalTrack localTrack;
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        synchronized (this.localTracks) {
            localTrack = this.localTracks.get(str2);
        }
        if (localTrack == null) {
            resultError("addTransceiver", "track is null", result);
        } else if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            resultError("addTransceiver", "peerConnection is null", result);
        } else {
            peerConnectionObserver.addTransceiver(localTrack.track, map, result);
        }
    }

    public void addTransceiverOfType(String str, String str2, Map<String, Object> map, MethodChannel.Result result) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            resultError("addTransceiverOfType", "peerConnection is null", result);
        } else {
            peerConnectionObserver.addTransceiverOfType(str2, map, result);
        }
    }

    public void createDataChannel(String str, String str2, ConstraintsMap constraintsMap, MethodChannel.Result result) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            Log.d("FlutterWebRTCPlugin", "createDataChannel() peerConnection is null");
        } else {
            peerConnectionObserver.createDataChannel(str2, constraintsMap, result);
        }
    }

    public void dataChannelClose(String str, String str2) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            Log.d("FlutterWebRTCPlugin", "dataChannelClose() peerConnection is null");
        } else {
            peerConnectionObserver.dataChannelClose(str2);
        }
    }

    public void dataChannelGetBufferedAmount(String str, String str2, MethodChannel.Result result) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver != null && peerConnectionObserver.getPeerConnection() != null) {
            peerConnectionObserver.dataChannelGetBufferedAmount(str2, result);
        } else {
            Log.d("FlutterWebRTCPlugin", "dataChannelGetBufferedAmount() peerConnection is null");
            resultError("dataChannelGetBufferedAmount", "peerConnection is null", result);
        }
    }

    public void dataChannelSend(String str, String str2, ByteBuffer byteBuffer, Boolean bool) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            Log.d("FlutterWebRTCPlugin", "dataChannelSend() peerConnection is null");
        } else {
            peerConnectionObserver.dataChannelSend(str2, byteBuffer, bool);
        }
    }

    public void dispose() {
        for (MediaStream mediaStream : this.localStreams.values()) {
            streamDispose(mediaStream);
            mediaStream.dispose();
        }
        this.localStreams.clear();
        synchronized (this.localTracks) {
            try {
                Iterator<LocalTrack> it = this.localTracks.values().iterator();
                while (it.hasNext()) {
                    it.next().dispose();
                }
                this.localTracks.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator<PeerConnectionObserver> it2 = this.mPeerConnectionObservers.values().iterator();
        while (it2.hasNext()) {
            peerConnectionDispose(it2.next());
        }
        this.mPeerConnectionObservers.clear();
    }

    @Override // com.cloudwebrtc.webrtc.StateProvider
    public Activity getActivity() {
        return this.activity;
    }

    @Override // com.cloudwebrtc.webrtc.StateProvider
    public Context getApplicationContext() {
        return this.context;
    }

    public ConstraintsMap getCameraInfo(int i10) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        try {
            Camera.getCameraInfo(i10, cameraInfo);
            ConstraintsMap constraintsMap = new ConstraintsMap();
            String str = cameraInfo.facing == 1 ? "front" : "back";
            constraintsMap.putString("label", "Camera " + i10 + ", Facing " + str + ", Orientation " + cameraInfo.orientation);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(i10);
            constraintsMap.putString("deviceId", sb2.toString());
            constraintsMap.putString("facing", str);
            constraintsMap.putString("kind", "videoinput");
            constraintsMap.putString("groupId", "camera");
            return constraintsMap;
        } catch (Exception e10) {
            Logging.e("CameraEnumerationAndroid", "getCameraInfo failed on index " + i10, e10);
            return null;
        }
    }

    public void getDisplayMedia(ConstraintsMap constraintsMap, MethodChannel.Result result) {
        MediaStream mediaStreamCreateLocalMediaStream = this.mFactory.createLocalMediaStream(getNextStreamUUID());
        if (mediaStreamCreateLocalMediaStream == null) {
            resultError("getDisplayMedia", "Failed to create new media stream", result);
        } else {
            this.getUserMediaImpl.getDisplayMedia(constraintsMap, result, mediaStreamCreateLocalMediaStream);
        }
    }

    @Override // com.cloudwebrtc.webrtc.StateProvider
    public LocalTrack getLocalTrack(String str) {
        LocalTrack localTrack;
        synchronized (this.localTracks) {
            localTrack = this.localTracks.get(str);
        }
        return localTrack;
    }

    @Override // com.cloudwebrtc.webrtc.StateProvider
    public BinaryMessenger getMessenger() {
        return this.messenger;
    }

    @Override // com.cloudwebrtc.webrtc.StateProvider
    public String getNextStreamUUID() {
        String string;
        do {
            string = UUID.randomUUID().toString();
        } while (getStreamForId(string, "") != null);
        return string;
    }

    @Override // com.cloudwebrtc.webrtc.StateProvider
    public String getNextTrackUUID() {
        String string;
        do {
            string = UUID.randomUUID().toString();
        } while (getTrackForId(string, null) != null);
        return string;
    }

    @Override // com.cloudwebrtc.webrtc.StateProvider
    public PeerConnectionFactory getPeerConnectionFactory() {
        return this.mFactory;
    }

    @Override // com.cloudwebrtc.webrtc.StateProvider
    public PeerConnectionObserver getPeerConnectionObserver(String str) {
        return this.mPeerConnectionObservers.get(str);
    }

    public void getReceivers(String str, MethodChannel.Result result) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            resultError("getReceivers", "peerConnection is null", result);
        } else {
            peerConnectionObserver.getReceivers(result);
        }
    }

    public MediaStreamTrack getRemoteTrack(String str) {
        Iterator<Map.Entry<String, PeerConnectionObserver>> it = this.mPeerConnectionObservers.entrySet().iterator();
        while (it.hasNext()) {
            PeerConnectionObserver value = it.next().getValue();
            MediaStreamTrack transceiversTrack = value.remoteTracks.get(str);
            if (transceiversTrack == null) {
                transceiversTrack = value.getTransceiversTrack(str);
            }
            if (transceiversTrack != null) {
                return transceiversTrack;
            }
        }
        return null;
    }

    public void getSenders(String str, MethodChannel.Result result) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            resultError("getSenders", "peerConnection is null", result);
        } else {
            peerConnectionObserver.getSenders(result);
        }
    }

    public void getSources(MethodChannel.Result result) {
        ConstraintsArray constraintsArray = new ConstraintsArray();
        String[] strArr = new String[Camera.getNumberOfCameras()];
        for (int i10 = 0; i10 < Camera.getNumberOfCameras(); i10++) {
            ConstraintsMap cameraInfo = getCameraInfo(i10);
            if (cameraInfo != null) {
                constraintsArray.pushMap(cameraInfo);
            }
        }
        for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) this.context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)).getDevices(1)) {
            if (audioDeviceInfo.getType() == 15 || audioDeviceInfo.getType() == 7 || audioDeviceInfo.getType() == 3) {
                ConstraintsMap constraintsMap = new ConstraintsMap();
                constraintsMap.putString("label", AudioUtils.getAudioDeviceLabel(audioDeviceInfo));
                constraintsMap.putString("deviceId", AudioUtils.getAudioDeviceId(audioDeviceInfo));
                constraintsMap.putString("groupId", AudioUtils.getAudioGroupId(audioDeviceInfo));
                constraintsMap.putString("kind", "audioinput");
                constraintsArray.pushMap(constraintsMap);
            }
        }
        for (Oa.c cVar : AudioSwitchManager.instance.availableAudioDevices()) {
            ConstraintsMap constraintsMap2 = new ConstraintsMap();
            constraintsMap2.putString("label", cVar.a());
            constraintsMap2.putString("deviceId", AudioDeviceKind.fromAudioDevice(cVar).typeName);
            constraintsMap2.putString("groupId", AudioDeviceKind.fromAudioDevice(cVar).typeName);
            constraintsMap2.putString("kind", "audiooutput");
            constraintsArray.pushMap(constraintsMap2);
        }
        ConstraintsMap constraintsMap3 = new ConstraintsMap();
        constraintsMap3.putArray("sources", constraintsArray.toArrayList());
        result.success(constraintsMap3.toMap());
    }

    public MediaStream getStreamForId(String str, String str2) {
        MediaStream mediaStream = null;
        if (str2.length() > 0) {
            PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str2);
            if (peerConnectionObserver != null) {
                mediaStream = peerConnectionObserver.remoteStreams.get(str);
            }
        } else {
            Iterator<Map.Entry<String, PeerConnectionObserver>> it = this.mPeerConnectionObservers.entrySet().iterator();
            while (it.hasNext() && (mediaStream = it.next().getValue().remoteStreams.get(str)) == null) {
            }
        }
        return mediaStream == null ? this.localStreams.get(str) : mediaStream;
    }

    public MediaStreamTrack getTrackForId(String str, String str2) {
        LocalTrack localTrack;
        synchronized (this.localTracks) {
            localTrack = this.localTracks.get(str);
        }
        if (localTrack != null) {
            return localTrack.track;
        }
        MediaStreamTrack transceiversTrack = null;
        for (Map.Entry<String, PeerConnectionObserver> entry : this.mPeerConnectionObservers.entrySet()) {
            if (str2 == null || entry.getKey().compareTo(str2) == 0) {
                PeerConnectionObserver value = entry.getValue();
                MediaStreamTrack mediaStreamTrack = value.remoteTracks.get(str);
                transceiversTrack = mediaStreamTrack == null ? value.getTransceiversTrack(str) : mediaStreamTrack;
                if (transceiversTrack != null) {
                    break;
                }
            }
        }
        return transceiversTrack;
    }

    public void getTransceivers(String str, MethodChannel.Result result) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            resultError("getTransceivers", "peerConnection is null", result);
        } else {
            peerConnectionObserver.getTransceivers(result);
        }
    }

    public void getUserMedia(ConstraintsMap constraintsMap, MethodChannel.Result result) {
        MediaStream mediaStreamCreateLocalMediaStream = this.mFactory.createLocalMediaStream(getNextStreamUUID());
        if (mediaStreamCreateLocalMediaStream == null) {
            resultError("getUserMediaFailed", "Failed to create new media stream", result);
        } else {
            this.getUserMediaImpl.getUserMedia(constraintsMap, result, mediaStreamCreateLocalMediaStream);
        }
    }

    public void mediaStreamAddTrack(String str, String str2, MethodChannel.Result result) {
        MediaStream mediaStream = this.localStreams.get(str);
        if (mediaStream == null) {
            resultError("mediaStreamAddTrack", "mediaStreamAddTrack() stream [" + str + "] is null", result);
            return;
        }
        MediaStreamTrack trackForId = getTrackForId(str2, null);
        if (trackForId == null) {
            resultError("mediaStreamAddTrack", "mediaStreamAddTrack() track [" + str2 + "] is null", result);
            return;
        }
        String strKind = trackForId.kind();
        if (strKind.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
            mediaStream.addTrack((AudioTrack) trackForId);
            result.success(null);
        } else {
            if (strKind.equals("video")) {
                mediaStream.addTrack((VideoTrack) trackForId);
                result.success(null);
                return;
            }
            resultError("mediaStreamAddTrack", "mediaStreamAddTrack() track [" + str2 + "] has unsupported type: " + strKind, result);
        }
    }

    public void mediaStreamRemoveTrack(String str, String str2, MethodChannel.Result result) {
        LocalTrack localTrack;
        MediaStream mediaStream = this.localStreams.get(str);
        if (mediaStream == null) {
            resultError("mediaStreamRemoveTrack", "mediaStreamRemoveTrack() stream [" + str + "] is null", result);
            return;
        }
        synchronized (this.localTracks) {
            localTrack = this.localTracks.get(str2);
        }
        if (localTrack == null) {
            resultError("mediaStreamRemoveTrack", "mediaStreamRemoveTrack() track [" + str2 + "] is null", result);
            return;
        }
        String strKind = localTrack.kind();
        if (strKind.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
            mediaStream.removeTrack((AudioTrack) localTrack.track);
            result.success(null);
        } else {
            if (strKind.equals("video")) {
                mediaStream.removeTrack((VideoTrack) localTrack.track);
                result.success(null);
                return;
            }
            resultError("mediaStreamRemoveTrack", "mediaStreamRemoveTrack() track [" + str2 + "] has unsupported type: " + strKind, result);
        }
    }

    public void mediaStreamTrackRelease(String str, String str2) {
        LocalTrack localTrack;
        MediaStream mediaStream = this.localStreams.get(str);
        if (mediaStream == null) {
            Log.d("FlutterWebRTCPlugin", "mediaStreamTrackRelease() stream is null");
            return;
        }
        synchronized (this.localTracks) {
            localTrack = this.localTracks.get(str2);
        }
        if (localTrack == null) {
            Log.d("FlutterWebRTCPlugin", "mediaStreamTrackRelease() track is null");
            return;
        }
        localTrack.setEnabled(false);
        synchronized (this.localTracks) {
            this.localTracks.remove(str2);
        }
        if (localTrack.kind().equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
            mediaStream.removeTrack((AudioTrack) localTrack.track);
        } else if (localTrack.kind().equals("video")) {
            mediaStream.removeTrack((VideoTrack) localTrack.track);
            this.getUserMediaImpl.removeVideoCapturer(str2);
        }
    }

    public void mediaStreamTrackSetEnabled(String str, boolean z10, String str2) {
        MediaStreamTrack trackForId = getTrackForId(str, str2);
        if (trackForId == null) {
            Log.d("FlutterWebRTCPlugin", "mediaStreamTrackSetEnabled() track is null");
        } else {
            if (trackForId.enabled() == z10) {
                return;
            }
            trackForId.setEnabled(z10);
        }
    }

    public void mediaStreamTrackSetVolume(String str, double d10, String str2) {
        MediaStreamTrack trackForId = getTrackForId(str, null);
        if (!(trackForId instanceof AudioTrack)) {
            Log.w("FlutterWebRTCPlugin", "setVolume(): track not found: " + str);
            return;
        }
        Log.d("FlutterWebRTCPlugin", "setVolume(): " + str + "," + d10);
        try {
            ((AudioTrack) trackForId).setVolume(d10);
        } catch (Exception e10) {
            Log.e("FlutterWebRTCPlugin", "setVolume(): error", e10);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:697:0x0f82  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMethodCall(io.flutter.plugin.common.MethodCall r18, io.flutter.plugin.common.MethodChannel.Result r19) {
        /*
            Method dump skipped, instruction units count: 4788
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cloudwebrtc.webrtc.MethodCallHandlerImpl.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    public void peerConnectionAddICECandidate(ConstraintsMap constraintsMap, String str, MethodChannel.Result result) {
        PeerConnection peerConnection = getPeerConnection(str);
        boolean zAddIceCandidate = false;
        if (peerConnection != null) {
            zAddIceCandidate = peerConnection.addIceCandidate(new IceCandidate(constraintsMap.getString("sdpMid"), constraintsMap.isNull("sdpMLineIndex") ? 0 : constraintsMap.getInt("sdpMLineIndex"), constraintsMap.getString("candidate")));
        } else {
            resultError("peerConnectionAddICECandidate", "peerConnection is null", result);
        }
        result.success(Boolean.valueOf(zAddIceCandidate));
    }

    public void peerConnectionAddStream(String str, String str2, MethodChannel.Result result) {
        MediaStream mediaStream = this.localStreams.get(str);
        if (mediaStream == null) {
            Log.d("FlutterWebRTCPlugin", "peerConnectionAddStream() mediaStream is null");
            return;
        }
        PeerConnection peerConnection = getPeerConnection(str2);
        if (peerConnection == null) {
            resultError("peerConnectionAddStream", "peerConnection is null", result);
            return;
        }
        boolean zAddStream = peerConnection.addStream(mediaStream);
        Log.d("FlutterWebRTCPlugin", "addStream" + result);
        result.success(Boolean.valueOf(zAddStream));
    }

    public void peerConnectionClose(String str) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            Log.d("FlutterWebRTCPlugin", "peerConnectionClose() peerConnection is null");
        } else {
            peerConnectionObserver.close();
        }
    }

    public void peerConnectionCreateAnswer(String str, ConstraintsMap constraintsMap, final MethodChannel.Result result) {
        PeerConnection peerConnection = getPeerConnection(str);
        if (peerConnection != null) {
            peerConnection.createAnswer(new SdpObserver() { // from class: com.cloudwebrtc.webrtc.MethodCallHandlerImpl.3
                @Override // org.webrtc.SdpObserver
                public void onCreateFailure(String str2) {
                    MethodCallHandlerImpl.resultError("peerConnectionCreateAnswer", "WEBRTC_CREATE_ANSWER_ERROR: " + str2, result);
                }

                @Override // org.webrtc.SdpObserver
                public void onCreateSuccess(SessionDescription sessionDescription) {
                    ConstraintsMap constraintsMap2 = new ConstraintsMap();
                    constraintsMap2.putString("sdp", sessionDescription.description);
                    constraintsMap2.putString("type", sessionDescription.type.canonicalForm());
                    result.success(constraintsMap2.toMap());
                }

                @Override // org.webrtc.SdpObserver
                public void onSetSuccess() {
                }

                @Override // org.webrtc.SdpObserver
                public void onSetFailure(String str2) {
                }
            }, MediaConstraintsUtils.parseMediaConstraints(constraintsMap));
        } else {
            resultError("peerConnectionCreateAnswer", "peerConnection is null", result);
        }
    }

    public void peerConnectionCreateOffer(String str, ConstraintsMap constraintsMap, final MethodChannel.Result result) {
        PeerConnection peerConnection = getPeerConnection(str);
        if (peerConnection != null) {
            peerConnection.createOffer(new SdpObserver() { // from class: com.cloudwebrtc.webrtc.MethodCallHandlerImpl.2
                @Override // org.webrtc.SdpObserver
                public void onCreateFailure(String str2) {
                    MethodCallHandlerImpl.resultError("peerConnectionCreateOffer", "WEBRTC_CREATE_OFFER_ERROR: " + str2, result);
                }

                @Override // org.webrtc.SdpObserver
                public void onCreateSuccess(SessionDescription sessionDescription) {
                    ConstraintsMap constraintsMap2 = new ConstraintsMap();
                    constraintsMap2.putString("sdp", sessionDescription.description);
                    constraintsMap2.putString("type", sessionDescription.type.canonicalForm());
                    result.success(constraintsMap2.toMap());
                }

                @Override // org.webrtc.SdpObserver
                public void onSetSuccess() {
                }

                @Override // org.webrtc.SdpObserver
                public void onSetFailure(String str2) {
                }
            }, MediaConstraintsUtils.parseMediaConstraints(constraintsMap));
        } else {
            resultError("peerConnectionCreateOffer", "WEBRTC_CREATE_OFFER_ERROR", result);
        }
    }

    public void peerConnectionDispose(String str) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null) {
            Log.d("FlutterWebRTCPlugin", "peerConnectionDispose() peerConnectionObserver is null");
        } else if (peerConnectionDispose(peerConnectionObserver)) {
            this.mPeerConnectionObservers.remove(str);
        }
        if (this.mPeerConnectionObservers.size() == 0) {
            AudioSwitchManager.instance.stop();
        }
    }

    public void peerConnectionGetStats(String str, String str2, MethodChannel.Result result) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str2);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            resultError("peerConnectionGetStats", "peerConnection is null", result);
        } else if (str == null || str.isEmpty()) {
            peerConnectionObserver.getStats(result);
        } else {
            peerConnectionObserver.getStatsForTrack(str, result);
        }
    }

    public String peerConnectionInit(ConstraintsMap constraintsMap, ConstraintsMap constraintsMap2) {
        String nextStreamUUID = getNextStreamUUID();
        PeerConnection.RTCConfiguration rTCConfiguration = parseRTCConfiguration(constraintsMap);
        PeerConnectionObserver peerConnectionObserver = new PeerConnectionObserver(rTCConfiguration, this, this.messenger, nextStreamUUID);
        peerConnectionObserver.setPeerConnection(this.mFactory.createPeerConnection(rTCConfiguration, MediaConstraintsUtils.parseMediaConstraints(constraintsMap2), peerConnectionObserver));
        this.mPeerConnectionObservers.put(nextStreamUUID, peerConnectionObserver);
        return nextStreamUUID;
    }

    public void peerConnectionRemoveStream(String str, String str2, MethodChannel.Result result) {
        MediaStream mediaStream = this.localStreams.get(str);
        if (mediaStream == null) {
            Log.d("FlutterWebRTCPlugin", "peerConnectionRemoveStream() mediaStream is null");
            return;
        }
        PeerConnection peerConnection = getPeerConnection(str2);
        if (peerConnection == null) {
            resultError("peerConnectionRemoveStream", "peerConnection is null", result);
        } else {
            peerConnection.removeStream(mediaStream);
            result.success(null);
        }
    }

    public void peerConnectionSetConfiguration(ConstraintsMap constraintsMap, PeerConnection peerConnection) {
        if (peerConnection == null) {
            Log.d("FlutterWebRTCPlugin", "peerConnectionSetConfiguration() peerConnection is null");
        } else {
            peerConnection.setConfiguration(parseRTCConfiguration(constraintsMap));
        }
    }

    public void peerConnectionSetLocalDescription(ConstraintsMap constraintsMap, String str, final MethodChannel.Result result) {
        PeerConnection peerConnection = getPeerConnection(str);
        if (peerConnection == null) {
            resultError("peerConnectionSetLocalDescription", "WEBRTC_SET_LOCAL_DESCRIPTION_ERROR: peerConnection is null", result);
        } else {
            peerConnection.setLocalDescription(new SdpObserver() { // from class: com.cloudwebrtc.webrtc.MethodCallHandlerImpl.4
                @Override // org.webrtc.SdpObserver
                public void onSetFailure(String str2) {
                    MethodCallHandlerImpl.resultError("peerConnectionSetLocalDescription", "WEBRTC_SET_LOCAL_DESCRIPTION_ERROR: " + str2, result);
                }

                @Override // org.webrtc.SdpObserver
                public void onSetSuccess() {
                    result.success(null);
                }

                @Override // org.webrtc.SdpObserver
                public void onCreateFailure(String str2) {
                }

                @Override // org.webrtc.SdpObserver
                public void onCreateSuccess(SessionDescription sessionDescription) {
                }
            }, new SessionDescription(SessionDescription.Type.fromCanonicalForm(constraintsMap.getString("type")), constraintsMap.getString("sdp")));
        }
    }

    public void peerConnectionSetRemoteDescription(ConstraintsMap constraintsMap, String str, final MethodChannel.Result result) {
        PeerConnection peerConnection = getPeerConnection(str);
        if (peerConnection == null) {
            resultError("peerConnectionSetRemoteDescription", "WEBRTC_SET_REMOTE_DESCRIPTION_ERROR: peerConnection is null", result);
        } else {
            peerConnection.setRemoteDescription(new SdpObserver() { // from class: com.cloudwebrtc.webrtc.MethodCallHandlerImpl.5
                @Override // org.webrtc.SdpObserver
                public void onSetFailure(String str2) {
                    MethodCallHandlerImpl.resultError("peerConnectionSetRemoteDescription", "WEBRTC_SET_REMOTE_DESCRIPTION_ERROR: " + str2, result);
                }

                @Override // org.webrtc.SdpObserver
                public void onSetSuccess() {
                    result.success(null);
                }

                @Override // org.webrtc.SdpObserver
                public void onCreateFailure(String str2) {
                }

                @Override // org.webrtc.SdpObserver
                public void onCreateSuccess(SessionDescription sessionDescription) {
                }
            }, new SessionDescription(SessionDescription.Type.fromCanonicalForm(constraintsMap.getString("type")), constraintsMap.getString("sdp")));
        }
    }

    @Override // com.cloudwebrtc.webrtc.StateProvider
    public boolean putLocalStream(String str, MediaStream mediaStream) {
        this.localStreams.put(str, mediaStream);
        return true;
    }

    @Override // com.cloudwebrtc.webrtc.StateProvider
    public boolean putLocalTrack(String str, LocalTrack localTrack) {
        synchronized (this.localTracks) {
            this.localTracks.put(str, localTrack);
        }
        return true;
    }

    public void reStartCamera() {
        GetUserMediaImpl getUserMediaImpl = this.getUserMediaImpl;
        if (getUserMediaImpl == null) {
            return;
        }
        getUserMediaImpl.reStartCamera(new GetUserMediaImpl.IsCameraEnabled() { // from class: com.cloudwebrtc.webrtc.MethodCallHandlerImpl.6
            @Override // com.cloudwebrtc.webrtc.GetUserMediaImpl.IsCameraEnabled
            public boolean isEnabled(String str) {
                synchronized (MethodCallHandlerImpl.this.localTracks) {
                    try {
                        if (!MethodCallHandlerImpl.this.localTracks.containsKey(str)) {
                            return false;
                        }
                        return ((LocalTrack) MethodCallHandlerImpl.this.localTracks.get(str)).enabled();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    public void removeTrack(String str, String str2, MethodChannel.Result result) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            resultError("removeTrack", "peerConnection is null", result);
        } else {
            peerConnectionObserver.removeTrack(str2, result);
        }
    }

    public void requestPermissions(final ArrayList<String> arrayList, final Callback callback, final Callback callback2) {
        PermissionUtils.Callback callback3 = new PermissionUtils.Callback() { // from class: com.cloudwebrtc.webrtc.i
            @Override // com.cloudwebrtc.webrtc.utils.PermissionUtils.Callback
            public final void invoke(String[] strArr, int[] iArr) {
                MethodCallHandlerImpl.a(arrayList, callback2, callback, strArr, iArr);
            }
        };
        PermissionUtils.requestPermissions(getApplicationContext(), getActivity(), (String[]) arrayList.toArray(new String[arrayList.size()]), callback3);
    }

    public void restartIce(String str) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            Log.d("FlutterWebRTCPlugin", "restartIce() peerConnection is null");
        } else {
            peerConnectionObserver.restartIce();
        }
    }

    public void rtpSenderSetParameters(String str, String str2, Map<String, Object> map, MethodChannel.Result result) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            resultError("rtpSenderSetParameters", "peerConnection is null", result);
        } else {
            peerConnectionObserver.rtpSenderSetParameters(str2, map, result);
        }
    }

    public void rtpSenderSetStreams(String str, String str2, List<String> list, MethodChannel.Result result) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            resultError("rtpSenderSetStreams", "peerConnection is null", result);
        } else {
            peerConnectionObserver.rtpSenderSetStreams(str2, list, result);
        }
    }

    public void rtpSenderSetTrack(String str, String str2, String str3, boolean z10, MethodChannel.Result result) {
        LocalTrack localTrack;
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            resultError("rtpSenderSetTrack", "peerConnection is null", result);
            return;
        }
        synchronized (this.localTracks) {
            localTrack = this.localTracks.get(str3);
        }
        if (str3.length() <= 0 || localTrack != null) {
            peerConnectionObserver.rtpSenderSetTrack(str2, localTrack != null ? localTrack.track : null, result, z10);
        } else {
            resultError("rtpSenderSetTrack", "track is null", result);
        }
    }

    public void rtpTransceiverGetCurrentDirection(String str, String str2, MethodChannel.Result result) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            resultError("rtpTransceiverSetDirection", "peerConnection is null", result);
        } else {
            peerConnectionObserver.rtpTransceiverGetCurrentDirection(str2, result);
        }
    }

    public void rtpTransceiverGetDirection(String str, String str2, MethodChannel.Result result) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            resultError("rtpTransceiverSetDirection", "peerConnection is null", result);
        } else {
            peerConnectionObserver.rtpTransceiverGetDirection(str2, result);
        }
    }

    public void rtpTransceiverSetCodecPreferences(String str, String str2, List<Map<String, Object>> list, MethodChannel.Result result) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            resultError("setCodecPreferences", "peerConnection is null", result);
        } else {
            peerConnectionObserver.rtpTransceiverSetCodecPreferences(str2, list, result);
        }
    }

    public void rtpTransceiverSetDirection(String str, String str2, String str3, MethodChannel.Result result) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            resultError("rtpTransceiverSetDirection", "peerConnection is null", result);
        } else {
            peerConnectionObserver.rtpTransceiverSetDirection(str2, str3, result);
        }
    }

    public void rtpTransceiverStop(String str, String str2, MethodChannel.Result result) {
        PeerConnectionObserver peerConnectionObserver = this.mPeerConnectionObservers.get(str);
        if (peerConnectionObserver == null || peerConnectionObserver.getPeerConnection() == null) {
            resultError("rtpTransceiverStop", "peerConnection is null", result);
        } else {
            peerConnectionObserver.rtpTransceiverStop(str2, result);
        }
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void streamDispose(String str) {
        MediaStream mediaStream = this.localStreams.get(str);
        if (mediaStream == null) {
            Log.d("FlutterWebRTCPlugin", "streamDispose() mediaStream is null");
            return;
        }
        streamDispose(mediaStream);
        this.localStreams.remove(str);
        removeStreamForRendererById(str);
    }

    public void trackDispose(String str) {
        LocalTrack localTrack;
        synchronized (this.localTracks) {
            localTrack = this.localTracks.get(str);
        }
        if (localTrack == null) {
            Log.d("FlutterWebRTCPlugin", "trackDispose() track is null");
            return;
        }
        removeTrackForRendererById(str);
        localTrack.setEnabled(false);
        if (localTrack instanceof LocalVideoTrack) {
            this.getUserMediaImpl.removeVideoCapturer(str);
        }
        synchronized (this.localTracks) {
            this.localTracks.remove(str);
        }
    }

    public void streamDispose(MediaStream mediaStream) {
        for (VideoTrack videoTrack : mediaStream.videoTracks) {
            synchronized (this.localTracks) {
                this.localTracks.remove(videoTrack.id());
            }
            this.getUserMediaImpl.removeVideoCapturer(videoTrack.id());
            mediaStream.removeTrack(videoTrack);
        }
        for (AudioTrack audioTrack : mediaStream.audioTracks) {
            synchronized (this.localTracks) {
                this.localTracks.remove(audioTrack.id());
            }
            mediaStream.removeTrack(audioTrack);
        }
    }

    public boolean peerConnectionDispose(PeerConnectionObserver peerConnectionObserver) {
        if (peerConnectionObserver.getPeerConnection() == null) {
            Log.d("FlutterWebRTCPlugin", "peerConnectionDispose() peerConnection is null");
            return false;
        }
        peerConnectionObserver.dispose();
        return true;
    }
}
