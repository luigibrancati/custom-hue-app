package com.cloudwebrtc.webrtc.utils;

import org.webrtc.PeerConnection;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class Utils {

    /* JADX INFO: renamed from: com.cloudwebrtc.webrtc.utils.Utils$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$PeerConnection$IceConnectionState;
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$PeerConnection$IceGatheringState;
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$PeerConnection$PeerConnectionState;
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$PeerConnection$SignalingState;

        static {
            int[] iArr = new int[PeerConnection.PeerConnectionState.values().length];
            $SwitchMap$org$webrtc$PeerConnection$PeerConnectionState = iArr;
            try {
                iArr[PeerConnection.PeerConnectionState.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$webrtc$PeerConnection$PeerConnectionState[PeerConnection.PeerConnectionState.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$webrtc$PeerConnection$PeerConnectionState[PeerConnection.PeerConnectionState.CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$webrtc$PeerConnection$PeerConnectionState[PeerConnection.PeerConnectionState.DISCONNECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$webrtc$PeerConnection$PeerConnectionState[PeerConnection.PeerConnectionState.FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$webrtc$PeerConnection$PeerConnectionState[PeerConnection.PeerConnectionState.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[PeerConnection.SignalingState.values().length];
            $SwitchMap$org$webrtc$PeerConnection$SignalingState = iArr2;
            try {
                iArr2[PeerConnection.SignalingState.STABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$webrtc$PeerConnection$SignalingState[PeerConnection.SignalingState.HAVE_LOCAL_OFFER.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$webrtc$PeerConnection$SignalingState[PeerConnection.SignalingState.HAVE_LOCAL_PRANSWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$webrtc$PeerConnection$SignalingState[PeerConnection.SignalingState.HAVE_REMOTE_OFFER.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$webrtc$PeerConnection$SignalingState[PeerConnection.SignalingState.HAVE_REMOTE_PRANSWER.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$webrtc$PeerConnection$SignalingState[PeerConnection.SignalingState.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr3 = new int[PeerConnection.IceGatheringState.values().length];
            $SwitchMap$org$webrtc$PeerConnection$IceGatheringState = iArr3;
            try {
                iArr3[PeerConnection.IceGatheringState.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$org$webrtc$PeerConnection$IceGatheringState[PeerConnection.IceGatheringState.GATHERING.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$org$webrtc$PeerConnection$IceGatheringState[PeerConnection.IceGatheringState.COMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr4 = new int[PeerConnection.IceConnectionState.values().length];
            $SwitchMap$org$webrtc$PeerConnection$IceConnectionState = iArr4;
            try {
                iArr4[PeerConnection.IceConnectionState.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$org$webrtc$PeerConnection$IceConnectionState[PeerConnection.IceConnectionState.CHECKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$org$webrtc$PeerConnection$IceConnectionState[PeerConnection.IceConnectionState.CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$org$webrtc$PeerConnection$IceConnectionState[PeerConnection.IceConnectionState.COMPLETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$org$webrtc$PeerConnection$IceConnectionState[PeerConnection.IceConnectionState.FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$org$webrtc$PeerConnection$IceConnectionState[PeerConnection.IceConnectionState.DISCONNECTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$org$webrtc$PeerConnection$IceConnectionState[PeerConnection.IceConnectionState.CLOSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    public static String connectionStateString(PeerConnection.PeerConnectionState peerConnectionState) {
        switch (AnonymousClass1.$SwitchMap$org$webrtc$PeerConnection$PeerConnectionState[peerConnectionState.ordinal()]) {
            case 1:
                return "new";
            case 2:
                return "connecting";
            case 3:
                return "connected";
            case 4:
                return "disconnected";
            case 5:
                return "failed";
            case 6:
                return "closed";
            default:
                return null;
        }
    }

    public static String iceConnectionStateString(PeerConnection.IceConnectionState iceConnectionState) {
        switch (AnonymousClass1.$SwitchMap$org$webrtc$PeerConnection$IceConnectionState[iceConnectionState.ordinal()]) {
            case 1:
                return "new";
            case 2:
                return "checking";
            case 3:
                return "connected";
            case 4:
                return "completed";
            case 5:
                return "failed";
            case 6:
                return "disconnected";
            case 7:
                return "closed";
            default:
                return null;
        }
    }

    public static String iceGatheringStateString(PeerConnection.IceGatheringState iceGatheringState) {
        int i10 = AnonymousClass1.$SwitchMap$org$webrtc$PeerConnection$IceGatheringState[iceGatheringState.ordinal()];
        if (i10 == 1) {
            return "new";
        }
        if (i10 == 2) {
            return "gathering";
        }
        if (i10 != 3) {
            return null;
        }
        return "complete";
    }

    public static String signalingStateString(PeerConnection.SignalingState signalingState) {
        switch (AnonymousClass1.$SwitchMap$org$webrtc$PeerConnection$SignalingState[signalingState.ordinal()]) {
            case 1:
                return "stable";
            case 2:
                return "have-local-offer";
            case 3:
                return "have-local-pranswer";
            case 4:
                return "have-remote-offer";
            case 5:
                return "have-remote-pranswer";
            case 6:
                return "closed";
            default:
                return null;
        }
    }
}
