package H;

import E.C0781c0;
import E.C0822x0;
import E.W0;
import L.C1128v0;
import L.s1;
import L.t1;
import P.f;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.view.SurfaceHolder;
import fc.C4032o;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final a Companion;
    private final int defaultImageFormat;
    private final Class<?> surfaceClass;
    public static final c PREVIEW = new c("PREVIEW", 0, SurfaceHolder.class, 34);
    public static final c IMAGE_CAPTURE = new c("IMAGE_CAPTURE", 1, null, 256);
    public static final c VIDEO_CAPTURE = new c("VIDEO_CAPTURE", 2, MediaCodec.class, 34);
    public static final c STREAM_SHARING = new c("STREAM_SHARING", 3, SurfaceTexture.class, 34);
    public static final c UNDEFINED = new c("UNDEFINED", 4, null, 34);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: H.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public /* synthetic */ class C0082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f4788a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f4789b;

            static {
                int[] iArr = new int[t1.b.values().length];
                try {
                    iArr[t1.b.IMAGE_CAPTURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[t1.b.PREVIEW.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[t1.b.VIDEO_CAPTURE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[t1.b.STREAM_SHARING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f4788a = iArr;
                int[] iArr2 = new int[I.b.values().length];
                try {
                    iArr2[I.b.DYNAMIC_RANGE.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[I.b.FPS_RANGE.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[I.b.VIDEO_STABILIZATION.ordinal()] = 3;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[I.b.IMAGE_FORMAT.ordinal()] = 4;
                } catch (NoSuchFieldError unused8) {
                }
                f4789b = iArr2;
            }
        }

        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final I.b a(W0 w02) {
            Object next;
            AbstractC4862t.e(w02, "<this>");
            Iterator<E> it = I.b.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (c.Companion.d((I.b) next, w02)) {
                    break;
                }
            }
            return (I.b) next;
        }

        public final c b(W0 w02) {
            AbstractC4862t.e(w02, "<this>");
            return w02 instanceof C0822x0 ? c.PREVIEW : w02 instanceof C0781c0 ? c.IMAGE_CAPTURE : f.c0(w02) ? c.VIDEO_CAPTURE : w02 instanceof Y.f ? c.STREAM_SHARING : c.UNDEFINED;
        }

        public final c c(s1 s1Var) {
            AbstractC4862t.e(s1Var, "<this>");
            int i10 = C0082a.f4788a[s1Var.S().ordinal()];
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? c.UNDEFINED : c.STREAM_SHARING : c.VIDEO_CAPTURE : c.PREVIEW : c.IMAGE_CAPTURE;
        }

        public final boolean d(I.b bVar, W0 w02) {
            int i10 = C0082a.f4789b[bVar.ordinal()];
            if (i10 == 1) {
                return e(w02);
            }
            if (i10 == 2) {
                return f(w02);
            }
            if (i10 == 3) {
                return h(w02);
            }
            if (i10 == 4) {
                return g(w02);
            }
            throw new C4032o();
        }

        public final boolean e(W0 w02) {
            return w02.e().G();
        }

        public final boolean f(W0 w02) {
            return w02.e().b0();
        }

        public final boolean g(W0 w02) {
            return w02.e().d(C1128v0.f8203U);
        }

        public final boolean h(W0 w02) {
            return w02.e().d(s1.f8182H) || w02.e().d(s1.f8183I);
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4790a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.IMAGE_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.VIDEO_CAPTURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.STREAM_SHARING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f4790a = iArr;
        }
    }

    static {
        c[] cVarArrA = a();
        $VALUES = cVarArrA;
        $ENTRIES = AbstractC5277b.a(cVarArrA);
        Companion = new a(null);
    }

    public c(String str, int i10, Class cls, int i11) {
        this.surfaceClass = cls;
        this.defaultImageFormat = i11;
    }

    public static final /* synthetic */ c[] a() {
        return new c[]{PREVIEW, IMAGE_CAPTURE, VIDEO_CAPTURE, STREAM_SHARING, UNDEFINED};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final Class b() {
        return this.surfaceClass;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i10 = b.f4790a[ordinal()];
        if (i10 == 1) {
            return "Preview";
        }
        if (i10 == 2) {
            return "ImageCapture";
        }
        if (i10 == 3) {
            return "VideoCapture";
        }
        if (i10 == 4) {
            return "StreamSharing";
        }
        if (i10 == 5) {
            return "Undefined";
        }
        throw new C4032o();
    }
}
