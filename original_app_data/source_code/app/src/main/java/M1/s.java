package M1;

import D1.C0744b;
import D1.C0745c;
import G1.InterfaceC0860h;
import L1.B0;
import android.media.AudioDeviceInfo;
import java.nio.ByteBuffer;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface s {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f9148c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f9149d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f9150e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f9151f;

        public a(int i10, int i11, int i12, boolean z10, boolean z11, int i13) {
            this.f9146a = i10;
            this.f9147b = i11;
            this.f9148c = i12;
            this.f9149d = z10;
            this.f9150e = z11;
            this.f9151f = i13;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface d {
        void a(Exception exc);

        void b(a aVar);

        void c(a aVar);

        void d(long j10);

        void e();

        void f();

        void g(int i10, long j10, long j11);

        void h();

        void i();

        void j();

        void onAudioSessionIdChanged(int i10);

        void onSkipSilenceEnabledChanged(boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f9156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f9157b;

        public e(long j10, long j11) {
            super("Unexpected audio track timestamp discontinuity: expected " + j11 + ", got " + j10);
            this.f9156a = j10;
            this.f9157b = j11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f9159b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final D1.o f9160c;

        public f(int i10, D1.o oVar, boolean z10) {
            super("AudioTrack write failed: " + i10);
            this.f9159b = z10;
            this.f9158a = i10;
            this.f9160c = oVar;
        }
    }

    boolean a(D1.o oVar);

    boolean b();

    void c(C0745c c0745c);

    void d(D1.y yVar);

    D1.y e();

    boolean f();

    void flush();

    void g(int i10);

    long h();

    int i(D1.o oVar);

    void j(int i10);

    void k();

    void l(D1.o oVar, int i10, int[] iArr);

    void m(B0 b02);

    C1201d n(D1.o oVar);

    boolean o(ByteBuffer byteBuffer, long j10, int i10);

    void p();

    void pause();

    void play();

    void q(C0744b c0744b);

    void r(int i10, int i11);

    void release();

    void reset();

    long s(boolean z10);

    void setPreferredDevice(AudioDeviceInfo audioDeviceInfo);

    void t(InterfaceC0860h interfaceC0860h);

    void v(float f10);

    void w();

    void x();

    void y(d dVar);

    void z(boolean z10);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final D1.o f9152a;

        public b(Throwable th, D1.o oVar) {
            super(th);
            this.f9152a = oVar;
        }

        public b(String str, D1.o oVar) {
            super(str);
            this.f9152a = oVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f9154b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final D1.o f9155c;

        public c(String str, int i10, D1.o oVar, boolean z10, Throwable th) {
            super(str, th);
            this.f9153a = i10;
            this.f9154b = z10;
            this.f9155c = oVar;
        }

        public c(int i10, int i11, int i12, int i13, int i14, D1.o oVar, boolean z10, Exception exc) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AudioTrack init failed ");
            sb2.append(i10);
            sb2.append(StringUtils.SPACE);
            sb2.append("Config(");
            sb2.append(i11);
            sb2.append(", ");
            sb2.append(i12);
            sb2.append(", ");
            sb2.append(i13);
            sb2.append(", ");
            sb2.append(i14);
            sb2.append(")");
            sb2.append(StringUtils.SPACE);
            sb2.append(oVar);
            sb2.append(z10 ? " (recoverable)" : "");
            this(sb2.toString(), i10, oVar, z10, exc);
        }
    }

    default void u(long j10) {
    }
}
