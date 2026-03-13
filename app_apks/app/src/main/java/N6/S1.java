package N6;

import H8.d;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class S1 implements H8.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f10035f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final H8.d f10036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final H8.d f10037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final H8.e f10038i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f10039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f10040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f10041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H8.e f10042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final W1 f10043e = new W1(this);

    static {
        d.b bVarA = H8.d.a("key");
        M1 m12 = new M1();
        m12.a(1);
        f10036g = bVarA.b(m12.b()).a();
        d.b bVarA2 = H8.d.a("value");
        M1 m13 = new M1();
        m13.a(2);
        f10037h = bVarA2.b(m13.b()).a();
        f10038i = new H8.e() { // from class: N6.R1
            @Override // H8.b
            public final void a(Object obj, Object obj2) {
                S1.l((Map.Entry) obj, (H8.f) obj2);
            }
        };
    }

    public S1(OutputStream outputStream, Map map, Map map2, H8.e eVar) {
        this.f10039a = outputStream;
        this.f10040b = map;
        this.f10041c = map2;
        this.f10042d = eVar;
    }

    public static /* synthetic */ void l(Map.Entry entry, H8.f fVar) {
        fVar.e(f10036g, entry.getKey());
        fVar.e(f10037h, entry.getValue());
    }

    public static int m(H8.d dVar) {
        Q1 q12 = (Q1) dVar.c(Q1.class);
        if (q12 != null) {
            return q12.zza();
        }
        throw new H8.c("Field has no @Protobuf config");
    }

    public static Q1 o(H8.d dVar) {
        Q1 q12 = (Q1) dVar.c(Q1.class);
        if (q12 != null) {
            return q12;
        }
        throw new H8.c("Field has no @Protobuf config");
    }

    public static ByteBuffer r(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // H8.f
    public final /* synthetic */ H8.f a(H8.d dVar, boolean z10) throws IOException {
        i(dVar, z10 ? 1 : 0, true);
        return this;
    }

    @Override // H8.f
    public final /* synthetic */ H8.f b(H8.d dVar, long j10) throws IOException {
        j(dVar, j10, true);
        return this;
    }

    @Override // H8.f
    public final /* synthetic */ H8.f c(H8.d dVar, int i10) throws IOException {
        i(dVar, i10, true);
        return this;
    }

    @Override // H8.f
    public final H8.f d(H8.d dVar, double d10) throws IOException {
        f(dVar, d10, true);
        return this;
    }

    @Override // H8.f
    public final H8.f e(H8.d dVar, Object obj) throws IOException {
        h(dVar, obj, true);
        return this;
    }

    public final H8.f f(H8.d dVar, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        s((m(dVar) << 3) | 1);
        this.f10039a.write(r(8).putDouble(d10).array());
        return this;
    }

    public final H8.f g(H8.d dVar, float f10, boolean z10) throws IOException {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        s((m(dVar) << 3) | 5);
        this.f10039a.write(r(4).putFloat(f10).array());
        return this;
    }

    public final H8.f h(H8.d dVar, Object obj, boolean z10) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    s((m(dVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f10035f);
                    s(bytes.length);
                    this.f10039a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    h(dVar, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    p(f10038i, dVar, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    f(dVar, ((Double) obj).doubleValue(), z10);
                    return this;
                }
                if (obj instanceof Float) {
                    g(dVar, ((Float) obj).floatValue(), z10);
                    return this;
                }
                if (obj instanceof Number) {
                    j(dVar, ((Number) obj).longValue(), z10);
                    return this;
                }
                if (obj instanceof Boolean) {
                    i(dVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
                    return this;
                }
                if (!(obj instanceof byte[])) {
                    H8.e eVar = (H8.e) this.f10040b.get(obj.getClass());
                    if (eVar != null) {
                        p(eVar, dVar, obj, z10);
                        return this;
                    }
                    H8.g gVar = (H8.g) this.f10041c.get(obj.getClass());
                    if (gVar != null) {
                        q(gVar, dVar, obj, z10);
                        return this;
                    }
                    if (obj instanceof O1) {
                        i(dVar, ((O1) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        i(dVar, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    p(this.f10042d, dVar, obj, z10);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z10 || bArr.length != 0) {
                    s((m(dVar) << 3) | 2);
                    s(bArr.length);
                    this.f10039a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    public final S1 i(H8.d dVar, int i10, boolean z10) throws IOException {
        if (!z10 || i10 != 0) {
            Q1 q1O = o(dVar);
            int iOrdinal = q1O.zzb().ordinal();
            if (iOrdinal == 0) {
                s(q1O.zza() << 3);
                s(i10);
                return this;
            }
            if (iOrdinal == 1) {
                s(q1O.zza() << 3);
                s((i10 + i10) ^ (i10 >> 31));
                return this;
            }
            if (iOrdinal == 2) {
                s((q1O.zza() << 3) | 5);
                this.f10039a.write(r(4).putInt(i10).array());
                return this;
            }
        }
        return this;
    }

    public final S1 j(H8.d dVar, long j10, boolean z10) throws IOException {
        if (!z10 || j10 != 0) {
            Q1 q1O = o(dVar);
            int iOrdinal = q1O.zzb().ordinal();
            if (iOrdinal == 0) {
                s(q1O.zza() << 3);
                t(j10);
                return this;
            }
            if (iOrdinal == 1) {
                s(q1O.zza() << 3);
                t((j10 >> 63) ^ (j10 + j10));
                return this;
            }
            if (iOrdinal == 2) {
                s((q1O.zza() << 3) | 1);
                this.f10039a.write(r(8).putLong(j10).array());
                return this;
            }
        }
        return this;
    }

    public final S1 k(Object obj) {
        if (obj == null) {
            return this;
        }
        H8.e eVar = (H8.e) this.f10040b.get(obj.getClass());
        if (eVar == null) {
            throw new H8.c("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        eVar.a(obj, this);
        return this;
    }

    public final long n(H8.e eVar, Object obj) throws IOException {
        N1 n12 = new N1();
        try {
            OutputStream outputStream = this.f10039a;
            this.f10039a = n12;
            try {
                eVar.a(obj, this);
                this.f10039a = outputStream;
                long jA = n12.a();
                n12.close();
                return jA;
            } catch (Throwable th) {
                this.f10039a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                n12.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final S1 p(H8.e eVar, H8.d dVar, Object obj, boolean z10) throws IOException {
        long jN = n(eVar, obj);
        if (z10 && jN == 0) {
            return this;
        }
        s((m(dVar) << 3) | 2);
        t(jN);
        eVar.a(obj, this);
        return this;
    }

    public final S1 q(H8.g gVar, H8.d dVar, Object obj, boolean z10) {
        this.f10043e.a(dVar, z10);
        gVar.a(obj, this.f10043e);
        return this;
    }

    public final void s(int i10) throws IOException {
        while (true) {
            int i11 = i10 & 127;
            if ((i10 & (-128)) == 0) {
                this.f10039a.write(i11);
                return;
            } else {
                this.f10039a.write(i11 | 128);
                i10 >>>= 7;
            }
        }
    }

    public final void t(long j10) throws IOException {
        while (true) {
            int i10 = ((int) j10) & 127;
            if (((-128) & j10) == 0) {
                this.f10039a.write(i10);
                return;
            } else {
                this.f10039a.write(i10 | 128);
                j10 >>>= 7;
            }
        }
    }
}
