package D1;

import D1.m;
import G1.M;
import android.view.Surface;
import android.view.SurfaceView;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface z {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f2122b = new a().e();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f2123c = M.z0(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f2124a;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int[] f2125b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final m.b f2126a = new m.b();

            public a a(int i10) {
                this.f2126a.a(i10);
                return this;
            }

            public a b(b bVar) {
                this.f2126a.b(bVar.f2124a);
                return this;
            }

            public a c(int... iArr) {
                this.f2126a.c(iArr);
                return this;
            }

            public a d(int i10, boolean z10) {
                this.f2126a.d(i10, z10);
                return this;
            }

            public b e() {
                return new b(this.f2126a.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f2124a.equals(((b) obj).f2124a);
            }
            return false;
        }

        public int hashCode() {
            return this.f2124a.hashCode();
        }

        public b(m mVar) {
            this.f2124a = mVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f2127a;

        public c(m mVar) {
            this.f2127a = mVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f2127a.equals(((c) obj).f2127a);
            }
            return false;
        }

        public int hashCode() {
            return this.f2127a.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface d {
        default void onCues(List list) {
        }

        void onIsPlayingChanged(boolean z10);

        void onPlaybackStateChanged(int i10);

        void onPlayerError(x xVar);

        default void onPositionDiscontinuity(int i10) {
        }

        default void onCues(F1.c cVar) {
        }

        default void onPositionDiscontinuity(e eVar, e eVar2, int i10) {
        }

        default void onRenderedFirstFrame() {
        }

        default void onAudioAttributesChanged(C0744b c0744b) {
        }

        default void onAudioSessionIdChanged(int i10) {
        }

        default void onAvailableCommandsChanged(b bVar) {
        }

        default void onDeviceInfoChanged(C0752j c0752j) {
        }

        default void onIsLoadingChanged(boolean z10) {
        }

        default void onLoadingChanged(boolean z10) {
        }

        default void onMaxSeekToPreviousPositionChanged(long j10) {
        }

        default void onMediaMetadataChanged(t tVar) {
        }

        default void onMetadata(u uVar) {
        }

        default void onPlaybackParametersChanged(y yVar) {
        }

        default void onPlaybackSuppressionReasonChanged(int i10) {
        }

        default void onPlayerErrorChanged(x xVar) {
        }

        default void onPlaylistMetadataChanged(t tVar) {
        }

        default void onRepeatModeChanged(int i10) {
        }

        default void onSeekBackIncrementChanged(long j10) {
        }

        default void onSeekForwardIncrementChanged(long j10) {
        }

        default void onShuffleModeEnabledChanged(boolean z10) {
        }

        default void onSkipSilenceEnabledChanged(boolean z10) {
        }

        default void onTrackSelectionParametersChanged(F f10) {
        }

        default void onTracksChanged(G g10) {
        }

        default void onVideoSizeChanged(K k10) {
        }

        default void onVolumeChanged(float f10) {
        }

        default void onDeviceVolumeChanged(int i10, boolean z10) {
        }

        default void onEvents(z zVar, c cVar) {
        }

        default void onMediaItemTransition(r rVar, int i10) {
        }

        default void onPlayWhenReadyChanged(boolean z10, int i10) {
        }

        default void onPlayerStateChanged(boolean z10, int i10) {
        }

        default void onSurfaceSizeChanged(int i10, int i11) {
        }

        default void onTimelineChanged(D d10, int i10) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f2128k = M.z0(0);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f2129l = M.z0(1);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f2130m = M.z0(2);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f2131n = M.z0(3);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f2132o = M.z0(4);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final String f2133p = M.z0(5);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final String f2134q = M.z0(6);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f2135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2136b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f2137c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final r f2138d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f2139e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f2140f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f2141g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f2142h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f2143i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f2144j;

        public e(Object obj, int i10, r rVar, Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f2135a = obj;
            this.f2136b = i10;
            this.f2137c = i10;
            this.f2138d = rVar;
            this.f2139e = obj2;
            this.f2140f = i11;
            this.f2141g = j10;
            this.f2142h = j11;
            this.f2143i = i12;
            this.f2144j = i13;
        }

        public boolean a(e eVar) {
            return this.f2137c == eVar.f2137c && this.f2140f == eVar.f2140f && this.f2141g == eVar.f2141g && this.f2142h == eVar.f2142h && this.f2143i == eVar.f2143i && this.f2144j == eVar.f2144j && Objects.equals(this.f2138d, eVar.f2138d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (a(eVar) && Objects.equals(this.f2135a, eVar.f2135a) && Objects.equals(this.f2139e, eVar.f2139e)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.f2135a, Integer.valueOf(this.f2137c), this.f2138d, this.f2139e, Integer.valueOf(this.f2140f), Long.valueOf(this.f2141g), Long.valueOf(this.f2142h), Integer.valueOf(this.f2143i), Integer.valueOf(this.f2144j));
        }

        public String toString() {
            String str = "mediaItem=" + this.f2137c + ", period=" + this.f2140f + ", pos=" + this.f2141g;
            if (this.f2143i == -1) {
                return str;
            }
            return str + ", contentPos=" + this.f2142h + ", adGroup=" + this.f2143i + ", ad=" + this.f2144j;
        }
    }

    long A0();

    boolean B0();

    void C0(r rVar);

    int D0();

    boolean E0();

    boolean F0();

    int W();

    void d(y yVar);

    void d0(int i10);

    int e0();

    void f0(Surface surface);

    boolean g0();

    long getBufferedPosition();

    long getCurrentPosition();

    long getDuration();

    long h0();

    void i0();

    void j0(List list, boolean z10);

    void k0(SurfaceView surfaceView);

    void l0(d dVar);

    x m0();

    void n0(boolean z10);

    void o0(C0744b c0744b, boolean z10);

    G p0();

    void pause();

    void play();

    boolean q0();

    int r0();

    boolean s0();

    void seekTo(long j10);

    int t0();

    void u();

    D u0();

    void v(float f10);

    boolean v0();

    int w0();

    K x0();

    boolean y0();

    int z0();
}
