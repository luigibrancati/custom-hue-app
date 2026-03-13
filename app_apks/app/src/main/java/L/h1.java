package L;

import android.util.Size;
import com.google.android.libraries.barhopper.RecognitionOptions;
import fc.AbstractC4040w;
import gc.C4207u;
import io.flutter.plugin.platform.PlatformPlugin;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f8075e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f1 f8076f = f1.DEFAULT;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b[] f8077g = {b.S720P_16_9, b.S1080P_4_3, b.S1080P_16_9, b.S1440P_16_9, b.UHD, b.X_VGA};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Map f8078h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Map f8079i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f8080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f8081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f1 f8082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8083d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public static /* synthetic */ h1 c(a aVar, d dVar, b bVar, f1 f1Var, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                f1Var = h1.f8076f;
            }
            return aVar.b(dVar, bVar, f1Var);
        }

        public static /* synthetic */ h1 g(a aVar, int i10, Size size, i1 i1Var, int i11, c cVar, f1 f1Var, int i12, Object obj) {
            if ((i12 & 8) != 0) {
                i11 = 0;
            }
            int i13 = i11;
            if ((i12 & 16) != 0) {
                cVar = c.CAPTURE_SESSION_TABLES;
            }
            c cVar2 = cVar;
            if ((i12 & 32) != 0) {
                f1Var = h1.f8076f;
            }
            return aVar.f(i10, size, i1Var, i13, cVar2, f1Var);
        }

        public final h1 a(d type, b size) {
            AbstractC4862t.e(type, "type");
            AbstractC4862t.e(size, "size");
            return c(this, type, size, null, 4, null);
        }

        public final h1 b(d type, b size, f1 streamUseCase) {
            AbstractC4862t.e(type, "type");
            AbstractC4862t.e(size, "size");
            AbstractC4862t.e(streamUseCase, "streamUseCase");
            return new h1(type, size, streamUseCase);
        }

        public final d d(int i10) {
            d dVar = (d) h1.f8079i.get(Integer.valueOf(i10));
            return dVar == null ? d.PRIV : dVar;
        }

        public final h1 e(int i10, Size size, i1 surfaceSizeDefinition) {
            AbstractC4862t.e(size, "size");
            AbstractC4862t.e(surfaceSizeDefinition, "surfaceSizeDefinition");
            return g(this, i10, size, surfaceSizeDefinition, 0, null, null, 56, null);
        }

        public final h1 f(int i10, Size size, i1 surfaceSizeDefinition, int i11, c configSource, f1 streamUseCase) {
            AbstractC4862t.e(size, "size");
            AbstractC4862t.e(surfaceSizeDefinition, "surfaceSizeDefinition");
            AbstractC4862t.e(configSource, "configSource");
            AbstractC4862t.e(streamUseCase, "streamUseCase");
            d dVarD = d(i10);
            b bVar = b.NOT_SUPPORT;
            int iB = T.d.b(size);
            if (i11 == 1) {
                if (iB <= T.d.b(surfaceSizeDefinition.m(i10))) {
                    bVar = b.S720P_16_9;
                } else if (iB <= T.d.b(surfaceSizeDefinition.k(i10))) {
                    bVar = b.S1440P_4_3;
                }
            } else if (configSource == c.FEATURE_COMBINATION_TABLE) {
                Size sizeG = surfaceSizeDefinition.g(i10);
                b[] bVarArr = h1.f8077g;
                int length = bVarArr.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        break;
                    }
                    b bVar2 = bVarArr[i12];
                    if (AbstractC4862t.a(size, bVar2.j())) {
                        bVar = bVar2;
                        break;
                    }
                    i12++;
                }
                if (bVar == b.NOT_SUPPORT && AbstractC4862t.a(size, sizeG)) {
                    bVar = b.MAXIMUM;
                }
            } else if (iB <= T.d.b(surfaceSizeDefinition.b())) {
                bVar = b.VGA;
            } else if (iB <= T.d.b(surfaceSizeDefinition.i())) {
                bVar = b.PREVIEW;
            } else if (iB <= T.d.b(surfaceSizeDefinition.j())) {
                bVar = b.RECORD;
            } else {
                Size sizeG2 = surfaceSizeDefinition.g(i10);
                Size sizeO = surfaceSizeDefinition.o(i10);
                if ((sizeG2 == null || iB <= T.d.b(sizeG2)) && i11 != 2) {
                    bVar = b.MAXIMUM;
                } else if (sizeO != null && iB <= T.d.b(sizeO)) {
                    bVar = b.ULTRA_MAXIMUM;
                }
            }
            return b(dVarD, bVar, streamUseCase);
        }

        public a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        private static final /* synthetic */ InterfaceC5276a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b PREVIEW;
        public static final b RECORD;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final int f8084id;
        private final Size relatedFixedSize;
        public static final b VGA = new b("VGA", 0, 0, new Size(640, 480));
        public static final b X_VGA = new b("X_VGA", 1, 1, new Size(RecognitionOptions.UPC_E, 768));
        public static final b S720P_16_9 = new b("S720P_16_9", 2, 2, new Size(PlatformPlugin.DEFAULT_SYSTEM_UI, 720));
        public static final b S1080P_4_3 = new b("S1080P_4_3", 4, 4, new Size(1440, 1080));
        public static final b S1080P_16_9 = new b("S1080P_16_9", 5, 5, new Size(1920, 1080));
        public static final b S1440P_4_3 = new b("S1440P_4_3", 6, 6, new Size(1920, 1440));
        public static final b S1440P_16_9 = new b("S1440P_16_9", 7, 7, new Size(2560, 1440));
        public static final b UHD = new b("UHD", 8, 8, new Size(3840, 2160));
        public static final b MAXIMUM = new b("MAXIMUM", 10, 10, null, 2, null);
        public static final b MAXIMUM_4_3 = new b("MAXIMUM_4_3", 11, 11, null, 2, null);
        public static final b MAXIMUM_16_9 = new b("MAXIMUM_16_9", 12, 12, null, 2, null);
        public static final b ULTRA_MAXIMUM = new b("ULTRA_MAXIMUM", 13, 13, null, 2, null);
        public static final b NOT_SUPPORT = new b("NOT_SUPPORT", 14, 14, null, 2, null);

        static {
            int i10 = 2;
            AbstractC4854k abstractC4854k = null;
            Size size = null;
            PREVIEW = new b("PREVIEW", 3, 3, size, i10, abstractC4854k);
            RECORD = new b("RECORD", 9, 9, size, i10, abstractC4854k);
            b[] bVarArrA = a();
            $VALUES = bVarArrA;
            $ENTRIES = AbstractC5277b.a(bVarArrA);
        }

        public b(String str, int i10, int i11, Size size) {
            this.f8084id = i11;
            this.relatedFixedSize = size;
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{VGA, X_VGA, S720P_16_9, PREVIEW, S1080P_4_3, S1080P_16_9, S1440P_4_3, S1440P_16_9, UHD, RECORD, MAXIMUM, MAXIMUM_4_3, MAXIMUM_16_9, ULTRA_MAXIMUM, NOT_SUPPORT};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public final int b() {
            return this.f8084id;
        }

        public final Size j() {
            return this.relatedFixedSize;
        }

        public /* synthetic */ b(String str, int i10, int i11, Size size, int i12, AbstractC4854k abstractC4854k) {
            this(str, i10, i11, (i12 & 2) != 0 ? null : size);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {
        private static final /* synthetic */ InterfaceC5276a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c FEATURE_COMBINATION_TABLE = new c("FEATURE_COMBINATION_TABLE", 0);
        public static final c CAPTURE_SESSION_TABLES = new c("CAPTURE_SESSION_TABLES", 1);

        static {
            c[] cVarArrA = a();
            $VALUES = cVarArrA;
            $ENTRIES = AbstractC5277b.a(cVarArrA);
        }

        public c(String str, int i10) {
        }

        public static final /* synthetic */ c[] a() {
            return new c[]{FEATURE_COMBINATION_TABLE, CAPTURE_SESSION_TABLES};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d {
        private static final /* synthetic */ InterfaceC5276a $ENTRIES;
        private static final /* synthetic */ d[] $VALUES;
        public static final d PRIV = new d("PRIV", 0);
        public static final d YUV = new d("YUV", 1);
        public static final d JPEG = new d("JPEG", 2);
        public static final d JPEG_R = new d("JPEG_R", 3);
        public static final d RAW = new d("RAW", 4);

        static {
            d[] dVarArrA = a();
            $VALUES = dVarArrA;
            $ENTRIES = AbstractC5277b.a(dVarArrA);
        }

        public d(String str, int i10) {
        }

        public static final /* synthetic */ d[] a() {
            return new d[]{PRIV, YUV, JPEG, JPEG_R, RAW};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8085a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.RECORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.MAXIMUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.MAXIMUM_4_3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.MAXIMUM_16_9.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.ULTRA_MAXIMUM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b.NOT_SUPPORT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f8085a = iArr;
        }
    }

    static {
        Map mapL = gc.Q.l(AbstractC4040w.a(d.YUV, 35), AbstractC4040w.a(d.JPEG, 256), AbstractC4040w.a(d.JPEG_R, 4101), AbstractC4040w.a(d.RAW, 32), AbstractC4040w.a(d.PRIV, 34));
        f8078h = mapL;
        Set<Map.Entry> setEntrySet = mapL.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(Bc.k.e(gc.P.e(C4207u.v(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (d) entry.getKey());
        }
        f8079i = linkedHashMap;
    }

    public h1(d configType, b configSize, f1 streamUseCase) {
        AbstractC4862t.e(configType, "configType");
        AbstractC4862t.e(configSize, "configSize");
        AbstractC4862t.e(streamUseCase, "streamUseCase");
        this.f8080a = configType;
        this.f8081b = configSize;
        this.f8082c = streamUseCase;
        Integer num = (Integer) f8078h.get(configType);
        this.f8083d = num != null ? num.intValue() : 0;
    }

    public static final h1 c(d dVar, b bVar) {
        return f8075e.a(dVar, bVar);
    }

    public static final h1 d(d dVar, b bVar, f1 f1Var) {
        return f8075e.b(dVar, bVar, f1Var);
    }

    public static final d f(int i10) {
        return f8075e.d(i10);
    }

    public static final h1 k(int i10, Size size, i1 i1Var) {
        return f8075e.e(i10, size, i1Var);
    }

    public static final h1 l(int i10, Size size, i1 i1Var, int i11, c cVar, f1 f1Var) {
        return f8075e.f(i10, size, i1Var, i11, cVar, f1Var);
    }

    public final b e() {
        return this.f8081b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return this.f8080a == h1Var.f8080a && this.f8081b == h1Var.f8081b && this.f8082c == h1Var.f8082c;
    }

    public final int g() {
        return this.f8083d;
    }

    public final Size h(i1 definition) {
        Size sizeI;
        AbstractC4862t.e(definition, "definition");
        switch (e.f8085a[this.f8081b.ordinal()]) {
            case 1:
                sizeI = definition.i();
                break;
            case 2:
                sizeI = definition.j();
                break;
            case 3:
                sizeI = definition.g(this.f8083d);
                break;
            case 4:
                sizeI = definition.e(this.f8083d);
                break;
            case 5:
                sizeI = definition.c(this.f8083d);
                break;
            case 6:
                sizeI = definition.o(this.f8083d);
                break;
            case 7:
                throw new IllegalStateException("Not supported config size");
            default:
                sizeI = this.f8081b.j();
                break;
        }
        AbstractC4862t.b(sizeI);
        return sizeI;
    }

    public int hashCode() {
        return (((this.f8080a.hashCode() * 31) + this.f8081b.hashCode()) * 31) + this.f8082c.hashCode();
    }

    public final f1 i() {
        return this.f8082c;
    }

    public final boolean j(h1 other) {
        f1 f1Var;
        AbstractC4862t.e(other, "other");
        if (other.f8081b.b() > this.f8081b.b() || other.f8080a != this.f8080a) {
            return false;
        }
        f1 f1Var2 = this.f8082c;
        f1 f1Var3 = f1.DEFAULT;
        return f1Var2 == f1Var3 || (f1Var = other.f8082c) == f1Var3 || f1Var == f1Var2;
    }

    public String toString() {
        return "SurfaceConfig(configType=" + this.f8080a + ", configSize=" + this.f8081b + ", streamUseCase=" + this.f8082c + ')';
    }
}
