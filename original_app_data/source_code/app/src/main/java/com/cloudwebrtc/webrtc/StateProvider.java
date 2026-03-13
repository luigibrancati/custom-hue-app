package com.cloudwebrtc.webrtc;

import android.app.Activity;
import android.content.Context;
import io.flutter.plugin.common.BinaryMessenger;
import org.webrtc.MediaStream;
import org.webrtc.PeerConnectionFactory;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface StateProvider {
    Activity getActivity();

    Context getApplicationContext();

    LocalTrack getLocalTrack(String str);

    BinaryMessenger getMessenger();

    String getNextStreamUUID();

    String getNextTrackUUID();

    PeerConnectionFactory getPeerConnectionFactory();

    PeerConnectionObserver getPeerConnectionObserver(String str);

    boolean putLocalStream(String str, MediaStream mediaStream);

    boolean putLocalTrack(String str, LocalTrack localTrack);
}
