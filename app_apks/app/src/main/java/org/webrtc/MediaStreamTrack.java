package org.webrtc;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class MediaStreamTrack {
    public static final String AUDIO_TRACK_KIND = "audio";
    public static final String VIDEO_TRACK_KIND = "video";
    private long nativeTrack;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum MediaType {
        MEDIA_TYPE_AUDIO(0),
        MEDIA_TYPE_VIDEO(1);

        private final int nativeIndex;

        MediaType(int i10) {
            this.nativeIndex = i10;
        }

        @CalledByNative("MediaType")
        public static MediaType fromNativeIndex(int i10) {
            for (MediaType mediaType : values()) {
                if (mediaType.getNative() == i10) {
                    return mediaType;
                }
            }
            throw new IllegalArgumentException("Unknown native media type: " + i10);
        }

        @CalledByNative("MediaType")
        public int getNative() {
            return this.nativeIndex;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum State {
        LIVE,
        ENDED;

        @CalledByNative("State")
        public static State fromNativeIndex(int i10) {
            return values()[i10];
        }
    }

    public MediaStreamTrack(long j10) {
        if (j10 == 0) {
            throw new IllegalArgumentException("nativeTrack may not be null");
        }
        this.nativeTrack = j10;
    }

    private void checkMediaStreamTrackExists() {
        if (this.nativeTrack == 0) {
            throw new IllegalStateException("MediaStreamTrack has been disposed.");
        }
    }

    public static MediaStreamTrack createMediaStreamTrack(long j10) {
        if (j10 == 0) {
            return null;
        }
        String strNativeGetKind = nativeGetKind(j10);
        if (strNativeGetKind.equals(AUDIO_TRACK_KIND)) {
            return new AudioTrack(j10);
        }
        if (strNativeGetKind.equals("video")) {
            return new VideoTrack(j10);
        }
        return null;
    }

    private static native boolean nativeGetEnabled(long j10);

    private static native String nativeGetId(long j10);

    private static native String nativeGetKind(long j10);

    private static native State nativeGetState(long j10);

    private static native boolean nativeSetEnabled(long j10, boolean z10);

    public void dispose() {
        checkMediaStreamTrackExists();
        JniCommon.nativeReleaseRef(this.nativeTrack);
        this.nativeTrack = 0L;
    }

    public boolean enabled() {
        checkMediaStreamTrackExists();
        return nativeGetEnabled(this.nativeTrack);
    }

    public long getNativeMediaStreamTrack() {
        checkMediaStreamTrackExists();
        return this.nativeTrack;
    }

    public String id() {
        checkMediaStreamTrackExists();
        return nativeGetId(this.nativeTrack);
    }

    public boolean isDisposed() {
        return this.nativeTrack == 0;
    }

    public String kind() {
        checkMediaStreamTrackExists();
        return nativeGetKind(this.nativeTrack);
    }

    public boolean setEnabled(boolean z10) {
        checkMediaStreamTrackExists();
        return nativeSetEnabled(this.nativeTrack, z10);
    }

    public State state() {
        checkMediaStreamTrackExists();
        return nativeGetState(this.nativeTrack);
    }
}
