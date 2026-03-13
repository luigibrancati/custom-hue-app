package com.cloudwebrtc.webrtc;

import android.util.Log;
import com.cloudwebrtc.webrtc.audio.AudioSwitchManager;
import com.cloudwebrtc.webrtc.utils.AnyThreadSink;
import com.cloudwebrtc.webrtc.utils.ConstraintsArray;
import com.cloudwebrtc.webrtc.utils.ConstraintsMap;
import com.cloudwebrtc.webrtc.utils.Utils;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.analytics.Constants;
import io.sentry.protocol.FeatureFlag;
import io.sentry.protocol.SentryThread;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.webrtc.AudioTrack;
import org.webrtc.CandidatePairChangeEvent;
import org.webrtc.DataChannel;
import org.webrtc.DtmfSender;
import org.webrtc.IceCandidate;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.RTCStats;
import org.webrtc.RTCStatsCollectorCallback;
import org.webrtc.RTCStatsReport;
import org.webrtc.RtpCapabilities;
import org.webrtc.RtpParameters;
import org.webrtc.RtpReceiver;
import org.webrtc.RtpSender;
import org.webrtc.RtpTransceiver;
import org.webrtc.VideoTrack;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
class PeerConnectionObserver implements PeerConnection.Observer, EventChannel.StreamHandler {
    private static final String TAG = "FlutterWebRTCPlugin";
    private final PeerConnection.RTCConfiguration configuration;
    private final EventChannel eventChannel;
    private EventChannel.EventSink eventSink;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f28770id;
    private final BinaryMessenger messenger;
    private PeerConnection peerConnection;
    private final StateProvider stateProvider;
    private final Map<String, DataChannel> dataChannels = new HashMap();
    final Map<String, MediaStream> remoteStreams = new HashMap();
    final Map<String, MediaStreamTrack> remoteTracks = new HashMap();
    final Map<String, RtpTransceiver> transceivers = new HashMap();

    /* JADX INFO: renamed from: com.cloudwebrtc.webrtc.PeerConnectionObserver$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$RtpTransceiver$RtpTransceiverDirection;

        static {
            int[] iArr = new int[RtpTransceiver.RtpTransceiverDirection.values().length];
            $SwitchMap$org$webrtc$RtpTransceiver$RtpTransceiverDirection = iArr;
            try {
                iArr[RtpTransceiver.RtpTransceiverDirection.SEND_RECV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$webrtc$RtpTransceiver$RtpTransceiverDirection[RtpTransceiver.RtpTransceiverDirection.SEND_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$webrtc$RtpTransceiver$RtpTransceiverDirection[RtpTransceiver.RtpTransceiverDirection.RECV_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$webrtc$RtpTransceiver$RtpTransceiverDirection[RtpTransceiver.RtpTransceiverDirection.INACTIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$webrtc$RtpTransceiver$RtpTransceiverDirection[RtpTransceiver.RtpTransceiverDirection.STOPPED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public PeerConnectionObserver(PeerConnection.RTCConfiguration rTCConfiguration, StateProvider stateProvider, BinaryMessenger binaryMessenger, String str) {
        this.configuration = rTCConfiguration;
        this.stateProvider = stateProvider;
        this.messenger = binaryMessenger;
        this.f28770id = str;
        EventChannel eventChannel = new EventChannel(binaryMessenger, "FlutterWebRTC/peerConnectionEvent" + str);
        this.eventChannel = eventChannel;
        eventChannel.setStreamHandler(this);
    }

    private String bitratePriorityToString(double d10) {
        return d10 <= 0.5d ? "very-low" : d10 <= 1.0d ? "low" : d10 <= 2.0d ? "medium" : "high";
    }

    private Map<String, Object> dtmfSenderToMap(DtmfSender dtmfSender, String str) {
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString("dtmfSenderId", str);
        if (dtmfSender != null) {
            constraintsMap.putInt("interToneGap", dtmfSender.interToneGap());
            constraintsMap.putInt("duration", dtmfSender.duration());
        }
        return constraintsMap.toMap();
    }

    private String getUIDForStream(MediaStream mediaStream) {
        for (Map.Entry<String, MediaStream> entry : this.remoteStreams.entrySet()) {
            if (entry.getValue().equals(mediaStream)) {
                return entry.getKey();
            }
        }
        return null;
    }

    private RtpParameters.Encoding mapToEncoding(Map<String, Object> map) {
        RtpParameters.Encoding encoding = new RtpParameters.Encoding((String) map.get("rid"), true, Double.valueOf(1.0d));
        if (map.get("active") != null) {
            encoding.active = ((Boolean) map.get("active")).booleanValue();
        }
        if (map.get("ssrc") != null) {
            encoding.ssrc = Long.valueOf(((Integer) map.get("ssrc")).longValue());
        }
        if (map.get("minBitrate") != null) {
            encoding.minBitrateBps = (Integer) map.get("minBitrate");
        }
        if (map.get("maxBitrate") != null) {
            encoding.maxBitrateBps = (Integer) map.get("maxBitrate");
        }
        if (map.get("maxFramerate") != null) {
            encoding.maxFramerate = (Integer) map.get("maxFramerate");
        }
        if (map.get("numTemporalLayers") != null) {
            encoding.numTemporalLayers = (Integer) map.get("numTemporalLayers");
        }
        if (map.get("scaleResolutionDownBy") != null) {
            encoding.scaleResolutionDownBy = (Double) map.get("scaleResolutionDownBy");
        }
        if (map.get("scalabilityMode") != null) {
            encoding.scalabilityMode = (String) map.get("scalabilityMode");
        }
        if (map.get("priority") != null) {
            encoding.bitratePriority = stringToBitratePriority((String) map.get("priority"));
        }
        if (map.get("networkPriority") != null) {
            encoding.networkPriority = stringToPriority((String) map.get("networkPriority"));
        }
        return encoding;
    }

    private RtpTransceiver.RtpTransceiverInit mapToRtpTransceiverInit(Map<String, Object> map) {
        List arrayList = (List) map.get("streamIds");
        List list = (List) map.get("sendEncodings");
        String str = (String) map.get("direction");
        ArrayList arrayList2 = new ArrayList();
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (str == null) {
            str = "sendrecv";
        }
        if (list == null) {
            return new RtpTransceiver.RtpTransceiverInit(stringToTransceiverDirection(str), arrayList);
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList2.add(mapToEncoding((Map) list.get(i10)));
        }
        return new RtpTransceiver.RtpTransceiverInit(stringToTransceiverDirection(str), arrayList, arrayList2);
    }

    private Map<String, Object> mediaStreamToMap(MediaStream mediaStream) {
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString("streamId", mediaStream.getId());
        constraintsMap.putString("ownerTag", this.f28770id);
        ConstraintsArray constraintsArray = new ConstraintsArray();
        ConstraintsArray constraintsArray2 = new ConstraintsArray();
        Iterator<AudioTrack> it = mediaStream.audioTracks.iterator();
        while (it.hasNext()) {
            constraintsArray.pushMap(new ConstraintsMap(mediaTrackToMap(it.next())));
        }
        Iterator<VideoTrack> it2 = mediaStream.videoTracks.iterator();
        while (it2.hasNext()) {
            constraintsArray2.pushMap(new ConstraintsMap(mediaTrackToMap(it2.next())));
        }
        constraintsMap.putArray("audioTracks", constraintsArray.toArrayList());
        constraintsMap.putArray("videoTracks", constraintsArray2.toArrayList());
        return constraintsMap.toMap();
    }

    private Map<String, Object> mediaTrackToMap(MediaStreamTrack mediaStreamTrack) {
        ConstraintsMap constraintsMap = new ConstraintsMap();
        if (mediaStreamTrack != null) {
            constraintsMap.putString("id", mediaStreamTrack.id());
            constraintsMap.putString("label", mediaStreamTrack.getClass() == VideoTrack.class ? "video" : MediaStreamTrack.AUDIO_TRACK_KIND);
            constraintsMap.putString("kind", mediaStreamTrack.kind());
            constraintsMap.putBoolean("enabled", mediaStreamTrack.enabled());
            constraintsMap.putString("readyState", mediaStreamTrack.state().toString());
        }
        return constraintsMap.toMap();
    }

    private String priorityToString(int i10) {
        return i10 != 0 ? i10 != 2 ? i10 != 3 ? "low" : "high" : "medium" : "very-low";
    }

    private void registerDataChannelObserver(String str, DataChannel dataChannel) {
        dataChannel.registerObserver(new DataChannelObserver(this.messenger, this.f28770id, str, dataChannel));
    }

    private static void resultError(String str, String str2, MethodChannel.Result result) {
        String str3 = str + "(): " + str2;
        result.error(str, str3, null);
        Log.d("FlutterWebRTCPlugin", str3);
    }

    private Map<String, Object> rtpParametersToMap(RtpParameters rtpParameters) {
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString("transactionId", rtpParameters.transactionId);
        RtpParameters.DegradationPreference degradationPreference = rtpParameters.degradationPreference;
        if (degradationPreference != null) {
            constraintsMap.putString("degradationPreference", degradationPreference.name().toLowerCase().replace("_", "-"));
        }
        ConstraintsMap constraintsMap2 = new ConstraintsMap();
        constraintsMap2.putString("cname", rtpParameters.getRtcp().getCname());
        constraintsMap2.putBoolean("reducedSize", rtpParameters.getRtcp().getReducedSize());
        constraintsMap.putMap("rtcp", constraintsMap2.toMap());
        ConstraintsArray constraintsArray = new ConstraintsArray();
        for (RtpParameters.HeaderExtension headerExtension : rtpParameters.getHeaderExtensions()) {
            ConstraintsMap constraintsMap3 = new ConstraintsMap();
            constraintsMap3.putString("uri", headerExtension.getUri());
            constraintsMap3.putInt("id", headerExtension.getId());
            constraintsMap3.putBoolean("encrypted", headerExtension.getEncrypted());
            constraintsArray.pushMap(constraintsMap3);
        }
        constraintsMap.putArray("headerExtensions", constraintsArray.toArrayList());
        ConstraintsArray constraintsArray2 = new ConstraintsArray();
        for (RtpParameters.Encoding encoding : rtpParameters.encodings) {
            ConstraintsMap constraintsMap4 = new ConstraintsMap();
            constraintsMap4.putBoolean("active", encoding.active);
            String str = encoding.rid;
            if (str != null) {
                constraintsMap4.putString("rid", str);
            }
            Integer num = encoding.maxBitrateBps;
            if (num != null) {
                constraintsMap4.putInt("maxBitrate", num.intValue());
            }
            Integer num2 = encoding.minBitrateBps;
            if (num2 != null) {
                constraintsMap4.putInt("minBitrate", num2.intValue());
            }
            Integer num3 = encoding.maxFramerate;
            if (num3 != null) {
                constraintsMap4.putInt("maxFramerate", num3.intValue());
            }
            Integer num4 = encoding.numTemporalLayers;
            if (num4 != null) {
                constraintsMap4.putInt("numTemporalLayers", num4.intValue());
            }
            Double d10 = encoding.scaleResolutionDownBy;
            if (d10 != null) {
                constraintsMap4.putDouble("scaleResolutionDownBy", d10.doubleValue());
            }
            Long l10 = encoding.ssrc;
            if (l10 != null) {
                constraintsMap4.putLong("ssrc", l10.longValue());
            }
            constraintsMap4.putString("priority", bitratePriorityToString(encoding.bitratePriority));
            constraintsMap4.putString("networkPriority", priorityToString(encoding.networkPriority));
            constraintsArray2.pushMap(constraintsMap4);
        }
        constraintsMap.putArray("encodings", constraintsArray2.toArrayList());
        ConstraintsArray constraintsArray3 = new ConstraintsArray();
        for (RtpParameters.Codec codec : rtpParameters.codecs) {
            ConstraintsMap constraintsMap5 = new ConstraintsMap();
            constraintsMap5.putString("name", codec.name);
            constraintsMap5.putInt("payloadType", codec.payloadType);
            constraintsMap5.putInt("clockRate", codec.clockRate.intValue());
            Integer num5 = codec.numChannels;
            if (num5 != null) {
                constraintsMap5.putInt("numChannels", num5.intValue());
            }
            constraintsMap5.putMap(Constants.PARAMETERS, new HashMap(codec.parameters));
            try {
                Field declaredField = codec.getClass().getDeclaredField("kind");
                declaredField.setAccessible(true);
                if (declaredField.get(codec).equals(MediaStreamTrack.MediaType.MEDIA_TYPE_AUDIO)) {
                    constraintsMap5.putString("kind", MediaStreamTrack.AUDIO_TRACK_KIND);
                } else if (declaredField.get(codec).equals(MediaStreamTrack.MediaType.MEDIA_TYPE_VIDEO)) {
                    constraintsMap5.putString("kind", "video");
                }
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (IllegalArgumentException e11) {
                e11.printStackTrace();
            } catch (NoSuchFieldException e12) {
                e12.printStackTrace();
            }
            constraintsArray3.pushMap(constraintsMap5);
        }
        constraintsMap.putArray("codecs", constraintsArray3.toArrayList());
        return constraintsMap.toMap();
    }

    private Map<String, Object> rtpReceiverToMap(RtpReceiver rtpReceiver) {
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString("receiverId", rtpReceiver.id());
        constraintsMap.putMap("rtpParameters", rtpParametersToMap(rtpReceiver.getParameters()));
        constraintsMap.putMap("track", mediaTrackToMap(rtpReceiver.track()));
        return constraintsMap.toMap();
    }

    private Map<String, Object> rtpSenderToMap(RtpSender rtpSender) {
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString("senderId", rtpSender.id());
        constraintsMap.putBoolean("ownsTrack", true);
        constraintsMap.putMap("dtmfSender", dtmfSenderToMap(rtpSender.dtmf(), rtpSender.id()));
        constraintsMap.putMap("rtpParameters", rtpParametersToMap(rtpSender.getParameters()));
        constraintsMap.putMap("track", mediaTrackToMap(rtpSender.track()));
        return constraintsMap.toMap();
    }

    private double stringToBitratePriority(String str) {
        if (str == null) {
            return 1.0d;
        }
        switch (str) {
        }
        return 1.0d;
    }

    private MediaStreamTrack.MediaType stringToMediaType(String str) {
        MediaStreamTrack.MediaType mediaType = MediaStreamTrack.MediaType.MEDIA_TYPE_AUDIO;
        return (!str.equals(MediaStreamTrack.AUDIO_TRACK_KIND) && str.equals("video")) ? MediaStreamTrack.MediaType.MEDIA_TYPE_VIDEO : mediaType;
    }

    private int stringToPriority(String str) {
        if (str == null) {
            return 1;
        }
        switch (str) {
        }
        return 1;
    }

    private RtpTransceiver.RtpTransceiverDirection stringToTransceiverDirection(String str) {
        str.getClass();
        switch (str) {
            case "stopped":
                return RtpTransceiver.RtpTransceiverDirection.STOPPED;
            case "recvonly":
                return RtpTransceiver.RtpTransceiverDirection.RECV_ONLY;
            case "inactive":
                return RtpTransceiver.RtpTransceiverDirection.INACTIVE;
            case "sendonly":
                return RtpTransceiver.RtpTransceiverDirection.SEND_ONLY;
            case "sendrecv":
                return RtpTransceiver.RtpTransceiverDirection.SEND_RECV;
            default:
                return RtpTransceiver.RtpTransceiverDirection.INACTIVE;
        }
    }

    private String transceiverDirectionString(RtpTransceiver.RtpTransceiverDirection rtpTransceiverDirection) {
        int i10 = AnonymousClass1.$SwitchMap$org$webrtc$RtpTransceiver$RtpTransceiverDirection[rtpTransceiverDirection.ordinal()];
        if (i10 == 1) {
            return "sendrecv";
        }
        if (i10 == 2) {
            return "sendonly";
        }
        if (i10 == 3) {
            return "recvonly";
        }
        if (i10 == 4) {
            return "inactive";
        }
        if (i10 != 5) {
            return null;
        }
        return "stopped";
    }

    private RtpParameters updateRtpParameters(RtpParameters rtpParameters, Map<String, Object> map) {
        RtpParameters.Encoding next;
        int iIndexOf;
        List<Map> list = (List) map.get("encodings");
        List<RtpParameters.Encoding> list2 = rtpParameters.encodings;
        String str = (String) map.get("degradationPreference");
        if (str != null) {
            rtpParameters.degradationPreference = RtpParameters.DegradationPreference.valueOf(str.toUpperCase().replace("-", "_"));
        }
        for (Map map2 : list) {
            String str2 = (String) map2.get("rid");
            if (str2 != null) {
                Iterator<RtpParameters.Encoding> it = list2.iterator();
                while (it.hasNext()) {
                    next = it.next();
                    if (str2.equals(next.rid)) {
                        break;
                    }
                }
                next = null;
            } else {
                next = null;
            }
            if (next == null && (iIndexOf = list.indexOf(map2)) < list2.size()) {
                next = list2.get(iIndexOf);
            }
            if (next != null) {
                Boolean bool = (Boolean) map2.get("active");
                if (bool != null) {
                    next.active = bool.booleanValue();
                }
                Integer num = (Integer) map2.get("maxBitrate");
                if (num != null) {
                    next.maxBitrateBps = num;
                }
                Integer num2 = (Integer) map2.get("minBitrate");
                if (num2 != null) {
                    next.minBitrateBps = num2;
                }
                Integer num3 = (Integer) map2.get("maxFramerate");
                if (num3 != null) {
                    next.maxFramerate = num3;
                }
                Integer num4 = (Integer) map2.get("numTemporalLayers");
                if (num4 != null) {
                    next.numTemporalLayers = num4;
                }
                Double d10 = (Double) map2.get("scaleResolutionDownBy");
                if (d10 != null) {
                    next.scaleResolutionDownBy = d10;
                }
                String str3 = (String) map2.get("priority");
                if (str3 != null) {
                    next.bitratePriority = stringToBitratePriority(str3);
                }
                String str4 = (String) map2.get("networkPriority");
                if (str4 != null) {
                    next.networkPriority = stringToPriority(str4);
                }
            }
        }
        return rtpParameters;
    }

    public void addTrack(MediaStreamTrack mediaStreamTrack, List<String> list, MethodChannel.Result result) {
        result.success(rtpSenderToMap(this.peerConnection.addTrack(mediaStreamTrack, list)));
    }

    public void addTransceiver(MediaStreamTrack mediaStreamTrack, Map<String, Object> map, MethodChannel.Result result) {
        RtpTransceiver rtpTransceiverAddTransceiver = map != null ? this.peerConnection.addTransceiver(mediaStreamTrack, mapToRtpTransceiverInit(map)) : this.peerConnection.addTransceiver(mediaStreamTrack);
        String mid = rtpTransceiverAddTransceiver.getMid();
        if (mid == null) {
            mid = this.stateProvider.getNextStreamUUID();
        }
        this.transceivers.put(mid, rtpTransceiverAddTransceiver);
        result.success(transceiverToMap(mid, rtpTransceiverAddTransceiver));
    }

    public void addTransceiverOfType(String str, Map<String, Object> map, MethodChannel.Result result) {
        RtpTransceiver rtpTransceiverAddTransceiver = map != null ? this.peerConnection.addTransceiver(stringToMediaType(str), mapToRtpTransceiverInit(map)) : this.peerConnection.addTransceiver(stringToMediaType(str));
        String mid = rtpTransceiverAddTransceiver.getMid();
        if (mid == null) {
            mid = this.stateProvider.getNextStreamUUID();
        }
        this.transceivers.put(mid, rtpTransceiverAddTransceiver);
        result.success(transceiverToMap(mid, rtpTransceiverAddTransceiver));
    }

    public Map<String, Object> candidateToMap(IceCandidate iceCandidate) {
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putInt("sdpMLineIndex", iceCandidate.sdpMLineIndex);
        constraintsMap.putString("sdpMid", iceCandidate.sdpMid);
        constraintsMap.putString("candidate", iceCandidate.sdp);
        return constraintsMap.toMap();
    }

    public void close() {
        this.peerConnection.close();
        this.remoteStreams.clear();
        this.remoteTracks.clear();
        this.dataChannels.clear();
    }

    public void createDataChannel(String str, ConstraintsMap constraintsMap, MethodChannel.Result result) {
        DataChannel.Init init = new DataChannel.Init();
        if (constraintsMap != null) {
            if (constraintsMap.hasKey("id")) {
                init.f41643id = constraintsMap.getInt("id");
            }
            if (constraintsMap.hasKey("ordered")) {
                init.ordered = constraintsMap.getBoolean("ordered");
            }
            if (constraintsMap.hasKey("maxRetransmits")) {
                init.maxRetransmits = constraintsMap.getInt("maxRetransmits");
            }
            if (constraintsMap.hasKey("protocol")) {
                init.protocol = constraintsMap.getString("protocol");
            }
            if (constraintsMap.hasKey("negotiated")) {
                init.negotiated = constraintsMap.getBoolean("negotiated");
            }
        }
        DataChannel dataChannelCreateDataChannel = this.peerConnection.createDataChannel(str, init);
        String nextDataChannelUUID = getNextDataChannelUUID();
        if (dataChannelCreateDataChannel == null) {
            resultError("createDataChannel", "Can't create data-channel for id: " + init.f41643id, result);
            return;
        }
        this.dataChannels.put(nextDataChannelUUID, dataChannelCreateDataChannel);
        registerDataChannelObserver(nextDataChannelUUID, dataChannelCreateDataChannel);
        ConstraintsMap constraintsMap2 = new ConstraintsMap();
        constraintsMap2.putInt("id", dataChannelCreateDataChannel.id());
        constraintsMap2.putString("label", dataChannelCreateDataChannel.label());
        constraintsMap2.putString("flutterId", nextDataChannelUUID);
        result.success(constraintsMap2.toMap());
    }

    public void dataChannelClose(String str) {
        DataChannel dataChannel = this.dataChannels.get(str);
        if (dataChannel == null) {
            Log.d("FlutterWebRTCPlugin", "dataChannelClose() dataChannel is null");
        } else {
            dataChannel.close();
            this.dataChannels.remove(str);
        }
    }

    public void dataChannelGetBufferedAmount(String str, MethodChannel.Result result) {
        DataChannel dataChannel = this.dataChannels.get(str);
        if (dataChannel == null) {
            Log.d("FlutterWebRTCPlugin", "dataChannelGetBufferedAmount() dataChannel is null");
            resultError("dataChannelGetBufferedAmount", "DataChannel is null", result);
        } else {
            ConstraintsMap constraintsMap = new ConstraintsMap();
            constraintsMap.putLong("bufferedAmount", dataChannel.bufferedAmount());
            result.success(constraintsMap.toMap());
        }
    }

    public void dataChannelSend(String str, ByteBuffer byteBuffer, Boolean bool) {
        DataChannel dataChannel = this.dataChannels.get(str);
        if (dataChannel != null) {
            dataChannel.send(new DataChannel.Buffer(byteBuffer, bool.booleanValue()));
        } else {
            Log.d("FlutterWebRTCPlugin", "dataChannelSend() dataChannel is null");
        }
    }

    public void dispose() {
        close();
        this.peerConnection.dispose();
        this.eventChannel.setStreamHandler(null);
    }

    public String getNextDataChannelUUID() {
        String string;
        do {
            string = UUID.randomUUID().toString();
        } while (this.dataChannels.get(string) != null);
        return string;
    }

    public PeerConnection getPeerConnection() {
        return this.peerConnection;
    }

    public void getReceivers(MethodChannel.Result result) {
        List<RtpReceiver> receivers = this.peerConnection.getReceivers();
        ConstraintsArray constraintsArray = new ConstraintsArray();
        Iterator<RtpReceiver> it = receivers.iterator();
        while (it.hasNext()) {
            constraintsArray.pushMap(new ConstraintsMap(rtpReceiverToMap(it.next())));
        }
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putArray("receivers", constraintsArray.toArrayList());
        result.success(constraintsMap.toMap());
    }

    public RtpReceiver getRtpReceiverById(String str) {
        for (RtpReceiver rtpReceiver : this.peerConnection.getReceivers()) {
            if (str.equals(rtpReceiver.id())) {
                return rtpReceiver;
            }
        }
        return null;
    }

    public RtpSender getRtpSenderById(String str) {
        for (RtpSender rtpSender : this.peerConnection.getSenders()) {
            if (str.equals(rtpSender.id())) {
                return rtpSender;
            }
        }
        return null;
    }

    public RtpTransceiver getRtpTransceiverById(String str) {
        RtpTransceiver rtpTransceiver = this.transceivers.get(str);
        if (rtpTransceiver == null) {
            for (RtpTransceiver rtpTransceiver2 : this.peerConnection.getTransceivers()) {
                if (str.equals(rtpTransceiver2.getMid())) {
                    rtpTransceiver = rtpTransceiver2;
                }
            }
        }
        return rtpTransceiver;
    }

    public void getSenders(MethodChannel.Result result) {
        List<RtpSender> senders = this.peerConnection.getSenders();
        ConstraintsArray constraintsArray = new ConstraintsArray();
        Iterator<RtpSender> it = senders.iterator();
        while (it.hasNext()) {
            constraintsArray.pushMap(new ConstraintsMap(rtpSenderToMap(it.next())));
        }
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putArray("senders", constraintsArray.toArrayList());
        result.success(constraintsMap.toMap());
    }

    public void getStats(final MethodChannel.Result result) {
        this.peerConnection.getStats(new RTCStatsCollectorCallback() { // from class: com.cloudwebrtc.webrtc.l
            @Override // org.webrtc.RTCStatsCollectorCallback
            public final void onStatsDelivered(RTCStatsReport rTCStatsReport) {
                this.f28799a.handleStatsReport(rTCStatsReport, result);
            }
        });
    }

    public void getStatsForTrack(String str, final MethodChannel.Result result) {
        RtpReceiver rtpReceiver;
        RtpSender next;
        if (str == null || str.isEmpty()) {
            resultError("peerConnectionGetStats", "MediaStreamTrack not found for id: " + str, result);
            return;
        }
        Iterator<RtpSender> it = this.peerConnection.getSenders().iterator();
        while (true) {
            rtpReceiver = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.track() != null && str.equals(next.track().id())) {
                break;
            }
        }
        Iterator<RtpReceiver> it2 = this.peerConnection.getReceivers().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            RtpReceiver next2 = it2.next();
            if (next2.track() != null && str.equals(next2.track().id())) {
                rtpReceiver = next2;
                break;
            }
        }
        if (next != null) {
            this.peerConnection.getStats(next, new RTCStatsCollectorCallback() { // from class: com.cloudwebrtc.webrtc.j
                @Override // org.webrtc.RTCStatsCollectorCallback
                public final void onStatsDelivered(RTCStatsReport rTCStatsReport) {
                    this.f28795a.handleStatsReport(rTCStatsReport, result);
                }
            });
            return;
        }
        if (rtpReceiver != null) {
            this.peerConnection.getStats(rtpReceiver, new RTCStatsCollectorCallback() { // from class: com.cloudwebrtc.webrtc.k
                @Override // org.webrtc.RTCStatsCollectorCallback
                public final void onStatsDelivered(RTCStatsReport rTCStatsReport) {
                    this.f28797a.handleStatsReport(rTCStatsReport, result);
                }
            });
            return;
        }
        resultError("peerConnectionGetStats", "MediaStreamTrack not found for id: " + str, result);
    }

    public void getTransceivers(MethodChannel.Result result) {
        List<RtpTransceiver> transceivers = this.peerConnection.getTransceivers();
        ConstraintsArray constraintsArray = new ConstraintsArray();
        for (RtpTransceiver rtpTransceiver : transceivers) {
            String mid = rtpTransceiver.getMid();
            if (mid == null) {
                mid = this.stateProvider.getNextStreamUUID();
                this.transceivers.put(mid, rtpTransceiver);
            }
            constraintsArray.pushMap(new ConstraintsMap(transceiverToMap(mid, rtpTransceiver)));
        }
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putArray("transceivers", constraintsArray.toArrayList());
        result.success(constraintsMap.toMap());
    }

    public MediaStreamTrack getTransceiversTrack(String str) {
        if (this.configuration.sdpSemantics != PeerConnection.SdpSemantics.UNIFIED_PLAN) {
            return null;
        }
        Iterator<RtpTransceiver> it = this.peerConnection.getTransceivers().iterator();
        while (it.hasNext()) {
            RtpReceiver receiver = it.next().getReceiver();
            if (receiver != null && receiver.track() != null && receiver.track().id().equals(str)) {
                return receiver.track();
            }
        }
        return null;
    }

    public void handleStatsReport(RTCStatsReport rTCStatsReport, MethodChannel.Result result) {
        Iterator<RTCStats> it;
        Map<String, Object> map;
        Map<String, Object> map2;
        Map<String, RTCStats> statsMap = rTCStatsReport.getStatsMap();
        ConstraintsMap constraintsMap = new ConstraintsMap();
        ConstraintsArray constraintsArray = new ConstraintsArray();
        Iterator<RTCStats> it2 = statsMap.values().iterator();
        while (it2.hasNext()) {
            RTCStats next = it2.next();
            ConstraintsMap constraintsMap2 = new ConstraintsMap();
            constraintsMap2.putString("id", next.getId());
            constraintsMap2.putString("type", next.getType());
            constraintsMap2.putDouble("timestamp", next.getTimestampUs());
            Map<String, Object> members = next.getMembers();
            ConstraintsMap constraintsMap3 = new ConstraintsMap();
            for (String str : members.keySet()) {
                Object obj = members.get(str);
                if (obj instanceof String) {
                    constraintsMap3.putString(str, (String) obj);
                } else if (obj instanceof String[]) {
                    ConstraintsArray constraintsArray2 = new ConstraintsArray();
                    for (String str2 : (String[]) obj) {
                        constraintsArray2.pushString(str2);
                    }
                    constraintsMap3.putArray(str, constraintsArray2.toArrayList());
                } else if (obj instanceof Integer) {
                    constraintsMap3.putInt(str, ((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    constraintsMap3.putLong(str, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    constraintsMap3.putDouble(str, ((Double) obj).doubleValue());
                } else if (obj instanceof Boolean) {
                    constraintsMap3.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof BigInteger) {
                    constraintsMap3.putLong(str, ((BigInteger) obj).longValue());
                } else {
                    if (obj instanceof LinkedHashMap) {
                        ConstraintsMap constraintsMap4 = new ConstraintsMap();
                        for (Map.Entry entry : ((LinkedHashMap) obj).entrySet()) {
                            Object value = entry.getValue();
                            Iterator<RTCStats> it3 = it2;
                            if (value instanceof String) {
                                constraintsMap4.putString((String) entry.getKey(), (String) value);
                            } else if (value instanceof Integer) {
                                constraintsMap4.putInt((String) entry.getKey(), ((Integer) value).intValue());
                            } else if (value instanceof Long) {
                                constraintsMap4.putLong((String) entry.getKey(), ((Long) value).longValue());
                            } else if (value instanceof Double) {
                                constraintsMap4.putDouble((String) entry.getKey(), ((Double) value).doubleValue());
                            } else if (value instanceof Boolean) {
                                constraintsMap4.putBoolean((String) entry.getKey(), ((Boolean) value).booleanValue());
                            } else if (value instanceof BigInteger) {
                                constraintsMap4.putLong((String) entry.getKey(), ((BigInteger) value).longValue());
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("getStats() unknown type: ");
                                map2 = members;
                                sb2.append(value.getClass().getName());
                                sb2.append(" for [");
                                sb2.append((String) entry.getKey());
                                sb2.append("] value: ");
                                sb2.append(value);
                                Log.d("FlutterWebRTCPlugin", sb2.toString());
                                it2 = it3;
                                members = map2;
                            }
                            map2 = members;
                            it2 = it3;
                            members = map2;
                        }
                        it = it2;
                        map = members;
                        constraintsMap3.putMap(str, constraintsMap4.toMap());
                    } else {
                        it = it2;
                        map = members;
                        Log.d("FlutterWebRTCPlugin", "getStats() unknown type: " + obj.getClass().getName() + " for [" + str + "] value: " + obj);
                    }
                    it2 = it;
                    members = map;
                }
                it = it2;
                map = members;
                it2 = it;
                members = map;
            }
            constraintsMap2.putMap("values", constraintsMap3.toMap());
            constraintsArray.pushMap(constraintsMap2);
            it2 = it2;
        }
        constraintsMap.putArray("stats", constraintsArray.toArrayList());
        result.success(constraintsMap.toMap());
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onAddStream(MediaStream mediaStream) {
        String key;
        String id2 = mediaStream.getId();
        if ("default".equals(id2)) {
            for (Map.Entry<String, MediaStream> entry : this.remoteStreams.entrySet()) {
                if (entry.getValue().equals(mediaStream)) {
                    key = entry.getKey();
                    break;
                }
            }
            key = null;
        } else {
            key = null;
        }
        if (key == null) {
            this.stateProvider.getNextStreamUUID();
            this.remoteStreams.put(id2, mediaStream);
        }
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString("event", "onAddStream");
        constraintsMap.putString("streamId", id2);
        constraintsMap.putString("ownerTag", this.f28770id);
        ConstraintsArray constraintsArray = new ConstraintsArray();
        ConstraintsArray constraintsArray2 = new ConstraintsArray();
        for (int i10 = 0; i10 < mediaStream.videoTracks.size(); i10++) {
            VideoTrack videoTrack = mediaStream.videoTracks.get(i10);
            String strId = videoTrack.id();
            this.remoteTracks.put(strId, videoTrack);
            ConstraintsMap constraintsMap2 = new ConstraintsMap();
            constraintsMap2.putString("id", strId);
            constraintsMap2.putString("label", "Video");
            constraintsMap2.putString("kind", videoTrack.kind());
            constraintsMap2.putBoolean("enabled", videoTrack.enabled());
            constraintsMap2.putString("readyState", videoTrack.state().toString());
            constraintsMap2.putBoolean("remote", true);
            constraintsArray2.pushMap(constraintsMap2);
        }
        for (int i11 = 0; i11 < mediaStream.audioTracks.size(); i11++) {
            AudioTrack audioTrack = mediaStream.audioTracks.get(i11);
            String strId2 = audioTrack.id();
            this.remoteTracks.put(strId2, audioTrack);
            ConstraintsMap constraintsMap3 = new ConstraintsMap();
            constraintsMap3.putString("id", strId2);
            constraintsMap3.putString("label", "Audio");
            constraintsMap3.putString("kind", audioTrack.kind());
            constraintsMap3.putBoolean("enabled", audioTrack.enabled());
            constraintsMap3.putString("readyState", audioTrack.state().toString());
            constraintsMap3.putBoolean("remote", true);
            constraintsArray.pushMap(constraintsMap3);
        }
        constraintsMap.putArray("audioTracks", constraintsArray.toArrayList());
        constraintsMap.putArray("videoTracks", constraintsArray2.toArrayList());
        sendEvent(constraintsMap);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onAddTrack(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr) {
        Log.d("FlutterWebRTCPlugin", "onAddTrack");
        for (MediaStream mediaStream : mediaStreamArr) {
            String id2 = mediaStream.getId();
            MediaStreamTrack mediaStreamTrackTrack = rtpReceiver.track();
            ConstraintsMap constraintsMap = new ConstraintsMap();
            constraintsMap.putString("event", "onAddTrack");
            constraintsMap.putString("streamId", id2);
            constraintsMap.putString("ownerTag", this.f28770id);
            constraintsMap.putString("trackId", mediaStreamTrackTrack.id());
            String strId = mediaStreamTrackTrack.id();
            ConstraintsMap constraintsMap2 = new ConstraintsMap();
            constraintsMap2.putString("id", strId);
            constraintsMap2.putString("label", mediaStreamTrackTrack.kind());
            constraintsMap2.putString("kind", mediaStreamTrackTrack.kind());
            constraintsMap2.putBoolean("enabled", mediaStreamTrackTrack.enabled());
            constraintsMap2.putString("readyState", mediaStreamTrackTrack.state().toString());
            constraintsMap2.putBoolean("remote", true);
            constraintsMap.putMap("track", constraintsMap2.toMap());
            sendEvent(constraintsMap);
            if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(mediaStreamTrackTrack.kind())) {
                AudioSwitchManager.instance.start();
            }
        }
        ConstraintsMap constraintsMap3 = new ConstraintsMap();
        ConstraintsArray constraintsArray = new ConstraintsArray();
        for (MediaStream mediaStream2 : mediaStreamArr) {
            constraintsArray.pushMap(new ConstraintsMap(mediaStreamToMap(mediaStream2)));
        }
        constraintsMap3.putString("event", "onTrack");
        constraintsMap3.putArray("streams", constraintsArray.toArrayList());
        constraintsMap3.putMap("track", mediaTrackToMap(rtpReceiver.track()));
        constraintsMap3.putMap("receiver", rtpReceiverToMap(rtpReceiver));
        if (this.configuration.sdpSemantics == PeerConnection.SdpSemantics.UNIFIED_PLAN) {
            for (RtpTransceiver rtpTransceiver : this.peerConnection.getTransceivers()) {
                if (rtpTransceiver.getReceiver() != null && rtpReceiver.id().equals(rtpTransceiver.getReceiver().id())) {
                    String mid = rtpTransceiver.getMid();
                    if (mid == null) {
                        mid = this.stateProvider.getNextStreamUUID();
                        this.transceivers.put(mid, rtpTransceiver);
                    }
                    constraintsMap3.putMap("transceiver", transceiverToMap(mid, rtpTransceiver));
                }
            }
        }
        sendEvent(constraintsMap3);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        this.eventSink = null;
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onConnectionChange(PeerConnection.PeerConnectionState peerConnectionState) {
        Log.d("FlutterWebRTCPlugin", "onConnectionChange" + peerConnectionState.name());
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString("event", "peerConnectionState");
        constraintsMap.putString(SentryThread.JsonKeys.STATE, Utils.connectionStateString(peerConnectionState));
        sendEvent(constraintsMap);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onDataChannel(DataChannel dataChannel) {
        String nextDataChannelUUID = getNextDataChannelUUID();
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString("event", "didOpenDataChannel");
        constraintsMap.putInt("id", dataChannel.id());
        constraintsMap.putString("label", dataChannel.label());
        constraintsMap.putString("flutterId", nextDataChannelUUID);
        this.dataChannels.put(nextDataChannelUUID, dataChannel);
        registerDataChannelObserver(nextDataChannelUUID, dataChannel);
        sendEvent(constraintsMap);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceCandidate(IceCandidate iceCandidate) {
        Log.d("FlutterWebRTCPlugin", "onIceCandidate");
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString("event", "onCandidate");
        constraintsMap.putMap("candidate", candidateToMap(iceCandidate));
        sendEvent(constraintsMap);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceCandidatesRemoved(IceCandidate[] iceCandidateArr) {
        Log.d("FlutterWebRTCPlugin", "onIceCandidatesRemoved");
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceConnectionChange(PeerConnection.IceConnectionState iceConnectionState) {
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString("event", "iceConnectionState");
        constraintsMap.putString(SentryThread.JsonKeys.STATE, Utils.iceConnectionStateString(iceConnectionState));
        sendEvent(constraintsMap);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceGatheringChange(PeerConnection.IceGatheringState iceGatheringState) {
        Log.d("FlutterWebRTCPlugin", "onIceGatheringChange" + iceGatheringState.name());
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString("event", "iceGatheringState");
        constraintsMap.putString(SentryThread.JsonKeys.STATE, Utils.iceGatheringStateString(iceGatheringState));
        sendEvent(constraintsMap);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.eventSink = new AnyThreadSink(eventSink);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onRemoveStream(MediaStream mediaStream) {
        String id2 = mediaStream.getId();
        Iterator<VideoTrack> it = mediaStream.videoTracks.iterator();
        while (it.hasNext()) {
            this.remoteTracks.remove(it.next().id());
        }
        Iterator<AudioTrack> it2 = mediaStream.audioTracks.iterator();
        while (it2.hasNext()) {
            this.remoteTracks.remove(it2.next().id());
        }
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString("event", "onRemoveStream");
        constraintsMap.putString("streamId", id2);
        sendEvent(constraintsMap);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onRemoveTrack(RtpReceiver rtpReceiver) {
        Log.d("FlutterWebRTCPlugin", "onRemoveTrack");
        MediaStreamTrack mediaStreamTrackTrack = rtpReceiver.track();
        String strId = mediaStreamTrackTrack.id();
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString("id", strId);
        constraintsMap.putString("label", mediaStreamTrackTrack.kind());
        constraintsMap.putString("kind", mediaStreamTrackTrack.kind());
        constraintsMap.putBoolean("enabled", mediaStreamTrackTrack.enabled());
        constraintsMap.putString("readyState", mediaStreamTrackTrack.state().toString());
        constraintsMap.putBoolean("remote", true);
        ConstraintsMap constraintsMap2 = new ConstraintsMap();
        constraintsMap2.putString("event", "onRemoveTrack");
        constraintsMap2.putString("trackId", mediaStreamTrackTrack.id());
        constraintsMap2.putMap("track", constraintsMap.toMap());
        sendEvent(constraintsMap2);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onRenegotiationNeeded() {
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString("event", "onRenegotiationNeeded");
        sendEvent(constraintsMap);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent) {
        Log.d("FlutterWebRTCPlugin", "onSelectedCandidatePairChanged");
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString("event", "onSelectedCandidatePairChanged");
        ConstraintsMap constraintsMap2 = new ConstraintsMap();
        constraintsMap2.putInt("lastDataReceivedMs", candidatePairChangeEvent.lastDataReceivedMs);
        constraintsMap2.putMap("local", candidateToMap(candidatePairChangeEvent.local));
        constraintsMap2.putMap("remote", candidateToMap(candidatePairChangeEvent.remote));
        constraintsMap2.putString("reason", candidatePairChangeEvent.reason);
        constraintsMap.putMap("candidate", constraintsMap2.toMap());
        sendEvent(constraintsMap);
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onSignalingChange(PeerConnection.SignalingState signalingState) {
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString("event", "signalingState");
        constraintsMap.putString(SentryThread.JsonKeys.STATE, Utils.signalingStateString(signalingState));
        sendEvent(constraintsMap);
    }

    public void removeTrack(String str, MethodChannel.Result result) {
        RtpSender rtpSenderById = getRtpSenderById(str);
        if (rtpSenderById == null) {
            resultError("removeTrack", "sender is null", result);
            return;
        }
        boolean zRemoveTrack = this.peerConnection.removeTrack(rtpSenderById);
        HashMap map = new HashMap();
        map.put(FeatureFlag.JsonKeys.RESULT, Boolean.valueOf(zRemoveTrack));
        result.success(map);
    }

    public void restartIce() {
        this.peerConnection.restartIce();
    }

    public void rtpSenderSetParameters(String str, Map<String, Object> map, MethodChannel.Result result) {
        RtpSender rtpSenderById = getRtpSenderById(str);
        if (rtpSenderById == null) {
            resultError("rtpSenderSetParameters", "sender is null", result);
            return;
        }
        boolean parameters = rtpSenderById.setParameters(updateRtpParameters(rtpSenderById.getParameters(), map));
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putBoolean(FeatureFlag.JsonKeys.RESULT, parameters);
        result.success(constraintsMap.toMap());
    }

    public void rtpSenderSetStreams(String str, List<String> list, MethodChannel.Result result) {
        RtpSender rtpSenderById = getRtpSenderById(str);
        if (rtpSenderById == null) {
            resultError("rtpSenderSetStream", "sender is null", result);
        } else {
            rtpSenderById.setStreams(list);
            result.success(null);
        }
    }

    public void rtpSenderSetTrack(String str, MediaStreamTrack mediaStreamTrack, MethodChannel.Result result, boolean z10) {
        RtpSender rtpSenderById = getRtpSenderById(str);
        if (rtpSenderById == null) {
            resultError("rtpSenderSetTrack", "sender is null", result);
        } else {
            rtpSenderById.setTrack(mediaStreamTrack, false);
            result.success(null);
        }
    }

    public void rtpTransceiverGetCurrentDirection(String str, MethodChannel.Result result) {
        RtpTransceiver rtpTransceiverById = getRtpTransceiverById(str);
        if (rtpTransceiverById == null) {
            resultError("rtpTransceiverGetCurrentDirection", "transceiver is null", result);
            return;
        }
        RtpTransceiver.RtpTransceiverDirection currentDirection = rtpTransceiverById.getCurrentDirection();
        if (currentDirection == null) {
            result.success(null);
            return;
        }
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString(FeatureFlag.JsonKeys.RESULT, transceiverDirectionString(currentDirection));
        result.success(constraintsMap.toMap());
    }

    public void rtpTransceiverGetDirection(String str, MethodChannel.Result result) {
        RtpTransceiver rtpTransceiverById = getRtpTransceiverById(str);
        if (rtpTransceiverById == null) {
            resultError("rtpTransceiverGetDirection", "transceiver is null", result);
            return;
        }
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString(FeatureFlag.JsonKeys.RESULT, transceiverDirectionString(rtpTransceiverById.getDirection()));
        result.success(constraintsMap.toMap());
    }

    public void rtpTransceiverSetCodecPreferences(String str, List<Map<String, Object>> list, MethodChannel.Result result) {
        RtpTransceiver rtpTransceiverById = getRtpTransceiverById(str);
        if (rtpTransceiverById == null) {
            resultError("rtpTransceiverSetCodecPreferences", "transceiver is null", result);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Map<String, Object> map : list) {
            RtpCapabilities.CodecCapability codecCapability = new RtpCapabilities.CodecCapability();
            String str2 = (String) map.get("mimeType");
            List listAsList = Arrays.asList(str2.split("/"));
            codecCapability.name = (String) listAsList.get(1);
            codecCapability.kind = stringToMediaType((String) listAsList.get(0));
            codecCapability.mimeType = str2;
            Integer num = (Integer) map.get("clockRate");
            num.intValue();
            codecCapability.clockRate = num;
            if (map.get("numChannels") != null) {
                Integer num2 = (Integer) map.get("numChannels");
                num2.intValue();
                codecCapability.numChannels = num2;
            }
            if (map.get("sdpFmtpLine") == null || map.get("sdpFmtpLine") == "") {
                codecCapability.parameters = new HashMap();
            } else {
                String str3 = (String) map.get("sdpFmtpLine");
                codecCapability.parameters = new HashMap();
                for (String str4 : str3.split(";")) {
                    if (str4.contains("=")) {
                        List listAsList2 = Arrays.asList(str4.split("="));
                        codecCapability.parameters.put((String) listAsList2.get(0), (String) listAsList2.get(1));
                    } else {
                        codecCapability.parameters.put("", str4);
                    }
                }
            }
            arrayList.add(codecCapability);
        }
        rtpTransceiverById.setCodecPreferences(arrayList);
        result.success(null);
    }

    public void rtpTransceiverSetDirection(String str, String str2, MethodChannel.Result result) {
        RtpTransceiver rtpTransceiverById = getRtpTransceiverById(str2);
        if (rtpTransceiverById == null) {
            resultError("rtpTransceiverSetDirection", "transceiver is null", result);
        } else {
            rtpTransceiverById.setDirection(stringToTransceiverDirection(str));
            result.success(null);
        }
    }

    public void rtpTransceiverStop(String str, MethodChannel.Result result) {
        RtpTransceiver rtpTransceiverById = getRtpTransceiverById(str);
        if (rtpTransceiverById == null) {
            resultError("rtpTransceiverStop", "transceiver is null", result);
        } else {
            rtpTransceiverById.stop();
            result.success(null);
        }
    }

    public void sendEvent(ConstraintsMap constraintsMap) {
        EventChannel.EventSink eventSink = this.eventSink;
        if (eventSink != null) {
            eventSink.success(constraintsMap.toMap());
        }
    }

    public void setPeerConnection(PeerConnection peerConnection) {
        this.peerConnection = peerConnection;
    }

    public Map<String, Object> transceiverToMap(String str, RtpTransceiver rtpTransceiver) {
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString("transceiverId", str);
        if (rtpTransceiver.getMid() == null) {
            constraintsMap.putString("mid", "");
        } else {
            constraintsMap.putString("mid", rtpTransceiver.getMid());
        }
        constraintsMap.putString("direction", transceiverDirectionString(rtpTransceiver.getDirection()));
        constraintsMap.putMap("sender", rtpSenderToMap(rtpTransceiver.getSender()));
        constraintsMap.putMap("receiver", rtpReceiverToMap(rtpTransceiver.getReceiver()));
        return constraintsMap.toMap();
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceConnectionReceivingChange(boolean z10) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onStandardizedIceConnectionChange(PeerConnection.IceConnectionState iceConnectionState) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onTrack(RtpTransceiver rtpTransceiver) {
    }
}
