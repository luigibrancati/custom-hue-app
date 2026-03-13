package K1;

import M1.B;
import S1.a;
import S1.b;
import T1.m;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import c2.C2938i;
import c2.InterfaceC2937h;
import g2.k;
import java.util.ArrayList;

/* JADX INFO: renamed from: K1.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C1013o implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T1.j f7280b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7283e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f7286h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7287i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7288j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f7290l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7281c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f7282d = 5000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public T1.u f7284f = T1.u.f16055a;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f7289k = -9223372036854775807L;

    public C1013o(Context context) {
        this.f7279a = context;
        this.f7280b = new T1.j(context);
    }

    @Override // K1.i1
    public e1 a(e1 e1Var, Handler handler, g2.G g10, M1.r rVar, InterfaceC2937h interfaceC2937h, U1.b bVar) {
        if (e1Var.f() == 2) {
            return j(e1Var, this.f7279a, this.f7281c, this.f7284f, this.f7283e, handler, g10, this.f7282d);
        }
        return null;
    }

    @Override // K1.i1
    public e1[] b(Handler handler, g2.G g10, M1.r rVar, InterfaceC2937h interfaceC2937h, U1.b bVar) {
        Handler handler2;
        ArrayList arrayList = new ArrayList();
        l(this.f7279a, this.f7281c, this.f7284f, this.f7283e, handler, g10, this.f7282d, arrayList);
        M1.s sVarD = d(this.f7279a, this.f7285g, this.f7286h);
        if (sVarD != null) {
            handler2 = handler;
            c(this.f7279a, this.f7281c, this.f7284f, this.f7283e, sVarD, handler2, rVar, arrayList);
        } else {
            handler2 = handler;
        }
        k(this.f7279a, interfaceC2937h, handler2.getLooper(), this.f7281c, arrayList);
        h(this.f7279a, bVar, handler2.getLooper(), this.f7281c, arrayList);
        e(this.f7279a, this.f7281c, arrayList);
        f(this.f7279a, arrayList);
        i(this.f7279a, handler2, this.f7281c, arrayList);
        return (e1[]) arrayList.toArray(new e1[0]);
    }

    public void c(Context context, int i10, T1.u uVar, boolean z10, M1.s sVar, Handler handler, M1.r rVar, ArrayList arrayList) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        arrayList.add(new M1.G(context, m(), uVar, z10, handler, rVar, sVar));
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
                try {
                    arrayList.add(size, (e1) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(Context.class, Handler.class, M1.r.class, M1.s.class).newInstance(context, handler, rVar, sVar));
                    G1.t.f("DefaultRenderersFactory", "Loaded MidiRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i11;
                    i11 = size;
                }
            } catch (Exception e10) {
                throw new IllegalStateException("Error instantiating MIDI extension", e10);
            }
        } catch (ClassNotFoundException unused2) {
        }
        try {
            try {
                i12 = i11 + 1;
            } catch (Exception e11) {
                throw new IllegalStateException("Error instantiating Opus extension", e11);
            }
        } catch (ClassNotFoundException unused3) {
        }
        try {
            arrayList.add(i11, (e1) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, M1.r.class, M1.s.class).newInstance(handler, rVar, sVar));
            G1.t.f("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
        } catch (ClassNotFoundException unused4) {
            i11 = i12;
            i12 = i11;
        }
        try {
            try {
                i13 = i12 + 1;
                try {
                    arrayList.add(i12, (e1) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, M1.r.class, M1.s.class).newInstance(handler, rVar, sVar));
                    G1.t.f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                } catch (ClassNotFoundException unused5) {
                    i12 = i13;
                    i13 = i12;
                }
            } catch (Exception e12) {
                throw new IllegalStateException("Error instantiating FLAC extension", e12);
            }
        } catch (ClassNotFoundException unused6) {
        }
        try {
            try {
                i14 = i13 + 1;
            } catch (Exception e13) {
                throw new IllegalStateException("Error instantiating FFmpeg extension", e13);
            }
        } catch (ClassNotFoundException unused7) {
        }
        try {
            arrayList.add(i13, (e1) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, M1.r.class, M1.s.class).newInstance(handler, rVar, sVar));
            G1.t.f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
        } catch (ClassNotFoundException unused8) {
            i13 = i14;
            i14 = i13;
        }
        try {
            try {
                i15 = i14 + 1;
                try {
                    arrayList.add(i14, (e1) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, M1.r.class, M1.s.class).newInstance(context, handler, rVar, sVar));
                    G1.t.f("DefaultRenderersFactory", "Loaded LibiamfAudioRenderer.");
                } catch (ClassNotFoundException unused9) {
                    i14 = i15;
                    i15 = i14;
                }
            } catch (Exception e14) {
                throw new IllegalStateException("Error instantiating IAMF extension", e14);
            }
        } catch (ClassNotFoundException unused10) {
        }
        try {
            arrayList.add(i15, (e1) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, M1.r.class, M1.s.class).newInstance(handler, rVar, sVar));
            G1.t.f("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
        } catch (ClassNotFoundException unused11) {
        } catch (Exception e15) {
            throw new IllegalStateException("Error instantiating MPEG-H extension", e15);
        }
    }

    public M1.s d(Context context, boolean z10, boolean z11) {
        return new B.g(context).m(z10).l(z11).k();
    }

    public void e(Context context, int i10, ArrayList arrayList) {
        arrayList.add(new h2.b());
    }

    public void f(Context context, ArrayList arrayList) {
        g(arrayList);
    }

    public void g(ArrayList arrayList) {
        arrayList.add(new S1.f(n(this.f7279a), null));
    }

    public void h(Context context, U1.b bVar, Looper looper, int i10, ArrayList arrayList) {
        arrayList.add(new U1.c(bVar, looper));
        arrayList.add(new U1.c(bVar, looper));
    }

    public e1 j(e1 e1Var, Context context, int i10, T1.u uVar, boolean z10, Handler handler, g2.G g10, long j10) {
        if (!this.f7287i || e1Var.getClass() != g2.k.class) {
            return null;
        }
        k.d dVarP = new k.d(context).s(m()).x(uVar).r(j10).t(z10).u(handler).v(g10).w(50).q(this.f7288j).p(this.f7289k);
        if (Build.VERSION.SDK_INT >= 34) {
            dVarP = dVarP.o(this.f7290l);
        }
        return dVarP.n();
    }

    public void k(Context context, InterfaceC2937h interfaceC2937h, Looper looper, int i10, ArrayList arrayList) {
        arrayList.add(new C2938i(interfaceC2937h, looper));
    }

    public void l(Context context, int i10, T1.u uVar, boolean z10, Handler handler, g2.G g10, long j10, ArrayList arrayList) {
        int i11;
        int i12;
        Class cls = Integer.TYPE;
        Class cls2 = Long.TYPE;
        k.d dVarP = new k.d(context).s(m()).x(uVar).r(j10).t(z10).u(handler).v(g10).w(50).q(this.f7288j).p(this.f7289k);
        if (Build.VERSION.SDK_INT >= 34) {
            dVarP = dVarP.o(this.f7290l);
        }
        arrayList.add(dVarP.n());
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
            } catch (Exception e10) {
                throw new IllegalStateException("Error instantiating VP9 extension", e10);
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            arrayList.add(size, (e1) Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, g2.G.class, cls).newInstance(Long.valueOf(j10), handler, g10, 50));
            G1.t.f("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
        } catch (ClassNotFoundException unused2) {
            size = i11;
            i11 = size;
        }
        try {
            try {
                i12 = i11 + 1;
                try {
                    arrayList.add(i11, (e1) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(cls2, Handler.class, g2.G.class, cls).newInstance(Long.valueOf(j10), handler, g10, 50));
                    G1.t.f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                } catch (ClassNotFoundException unused3) {
                    i11 = i12;
                    i12 = i11;
                }
            } catch (Exception e11) {
                throw new IllegalStateException("Error instantiating AV1 extension", e11);
            }
        } catch (ClassNotFoundException unused4) {
        }
        try {
            arrayList.add(i12, (e1) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(cls2, Handler.class, g2.G.class, cls).newInstance(Long.valueOf(j10), handler, g10, 50));
            G1.t.f("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
        } catch (ClassNotFoundException unused5) {
        } catch (Exception e12) {
            throw new IllegalStateException("Error instantiating FFmpeg extension", e12);
        }
    }

    public m.b m() {
        return this.f7280b;
    }

    public b.a n(Context context) {
        return new a.c(context);
    }

    public final C1013o o(boolean z10) {
        this.f7283e = z10;
        return this;
    }

    public final C1013o p(int i10) {
        this.f7281c = i10;
        return this;
    }

    public void i(Context context, Handler handler, int i10, ArrayList arrayList) {
    }
}
