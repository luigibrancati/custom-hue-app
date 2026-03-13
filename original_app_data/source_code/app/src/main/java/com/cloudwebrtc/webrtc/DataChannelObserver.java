package com.cloudwebrtc.webrtc;

import com.cloudwebrtc.webrtc.utils.AnyThreadSink;
import com.cloudwebrtc.webrtc.utils.ConstraintsMap;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.sentry.protocol.SentryThread;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import org.webrtc.DataChannel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
class DataChannelObserver implements DataChannel.Observer, EventChannel.StreamHandler {
    private final DataChannel dataChannel;
    private final EventChannel eventChannel;
    private final ArrayList eventQueue = new ArrayList();
    private EventChannel.EventSink eventSink;
    private final String flutterId;

    /* JADX INFO: renamed from: com.cloudwebrtc.webrtc.DataChannelObserver$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$DataChannel$State;

        static {
            int[] iArr = new int[DataChannel.State.values().length];
            $SwitchMap$org$webrtc$DataChannel$State = iArr;
            try {
                iArr[DataChannel.State.CONNECTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$webrtc$DataChannel$State[DataChannel.State.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$webrtc$DataChannel$State[DataChannel.State.CLOSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$webrtc$DataChannel$State[DataChannel.State.CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public DataChannelObserver(BinaryMessenger binaryMessenger, String str, String str2, DataChannel dataChannel) {
        this.flutterId = str2;
        this.dataChannel = dataChannel;
        EventChannel eventChannel = new EventChannel(binaryMessenger, "FlutterWebRTC/dataChannelEvent" + str + str2);
        this.eventChannel = eventChannel;
        eventChannel.setStreamHandler(this);
    }

    private String dataChannelStateString(DataChannel.State state) {
        int i10 = AnonymousClass1.$SwitchMap$org$webrtc$DataChannel$State[state.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "" : "closed" : "closing" : "open" : "connecting";
    }

    private void sendEvent(ConstraintsMap constraintsMap) {
        EventChannel.EventSink eventSink = this.eventSink;
        if (eventSink != null) {
            eventSink.success(constraintsMap.toMap());
        } else {
            this.eventQueue.add(constraintsMap.toMap());
        }
    }

    @Override // org.webrtc.DataChannel.Observer
    public void onBufferedAmountChange(long j10) {
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString("event", "dataChannelBufferedAmountChange");
        constraintsMap.putInt("id", this.dataChannel.id());
        constraintsMap.putLong("bufferedAmount", this.dataChannel.bufferedAmount());
        constraintsMap.putLong("changedAmount", j10);
        sendEvent(constraintsMap);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        this.eventSink = null;
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

    @Override // org.webrtc.DataChannel.Observer
    public void onMessage(DataChannel.Buffer buffer) {
        byte[] bArrArray;
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString("event", "dataChannelReceiveMessage");
        constraintsMap.putInt("id", this.dataChannel.id());
        if (buffer.data.hasArray()) {
            bArrArray = buffer.data.array();
        } else {
            bArrArray = new byte[buffer.data.remaining()];
            buffer.data.get(bArrArray);
        }
        if (buffer.binary) {
            constraintsMap.putString("type", "binary");
            constraintsMap.putByte("data", bArrArray);
        } else {
            constraintsMap.putString("type", "text");
            constraintsMap.putString("data", new String(bArrArray, StandardCharsets.UTF_8));
        }
        sendEvent(constraintsMap);
    }

    @Override // org.webrtc.DataChannel.Observer
    public void onStateChange() {
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString("event", "dataChannelStateChanged");
        constraintsMap.putInt("id", this.dataChannel.id());
        constraintsMap.putString(SentryThread.JsonKeys.STATE, dataChannelStateString(this.dataChannel.state()));
        sendEvent(constraintsMap);
    }
}
