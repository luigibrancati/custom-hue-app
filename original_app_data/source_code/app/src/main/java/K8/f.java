package K8;

import K8.d;
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
public final class f implements H8.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f7755f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final H8.d f7756g = H8.d.a("key").b(K8.a.b().c(1).a()).a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final H8.d f7757h = H8.d.a("value").b(K8.a.b().c(2).a()).a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final H8.e f7758i = new H8.e() { // from class: K8.e
        @Override // H8.b
        public final void a(Object obj, Object obj2) {
            f.f((Map.Entry) obj, (H8.f) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f7759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f7760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f7761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H8.e f7762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f7763e = new i(this);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7764a;

        static {
            int[] iArr = new int[d.a.values().length];
            f7764a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7764a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7764a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f(OutputStream outputStream, Map map, Map map2, H8.e eVar) {
        this.f7759a = outputStream;
        this.f7760b = map;
        this.f7761c = map2;
        this.f7762d = eVar;
    }

    public static /* synthetic */ void f(Map.Entry entry, H8.f fVar) {
        fVar.e(f7756g, entry.getKey());
        fVar.e(f7757h, entry.getValue());
    }

    public static ByteBuffer p(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static d u(H8.d dVar) {
        d dVar2 = (d) dVar.c(d.class);
        if (dVar2 != null) {
            return dVar2;
        }
        throw new H8.c("Field has no @Protobuf config");
    }

    public static int v(H8.d dVar) {
        d dVar2 = (d) dVar.c(d.class);
        if (dVar2 != null) {
            return dVar2.tag();
        }
        throw new H8.c("Field has no @Protobuf config");
    }

    @Override // H8.f
    public H8.f d(H8.d dVar, double d10) {
        return g(dVar, d10, true);
    }

    @Override // H8.f
    public H8.f e(H8.d dVar, Object obj) {
        return i(dVar, obj, true);
    }

    public H8.f g(H8.d dVar, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        w((v(dVar) << 3) | 1);
        this.f7759a.write(p(8).putDouble(d10).array());
        return this;
    }

    public H8.f h(H8.d dVar, float f10, boolean z10) throws IOException {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        w((v(dVar) << 3) | 5);
        this.f7759a.write(p(4).putFloat(f10).array());
        return this;
    }

    public H8.f i(H8.d dVar, Object obj, boolean z10) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    w((v(dVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f7755f);
                    w(bytes.length);
                    this.f7759a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    i(dVar, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    r(f7758i, dVar, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    return g(dVar, ((Double) obj).doubleValue(), z10);
                }
                if (obj instanceof Float) {
                    return h(dVar, ((Float) obj).floatValue(), z10);
                }
                if (obj instanceof Number) {
                    return m(dVar, ((Number) obj).longValue(), z10);
                }
                if (obj instanceof Boolean) {
                    return o(dVar, ((Boolean) obj).booleanValue(), z10);
                }
                if (!(obj instanceof byte[])) {
                    H8.e eVar = (H8.e) this.f7760b.get(obj.getClass());
                    if (eVar != null) {
                        return r(eVar, dVar, obj, z10);
                    }
                    H8.g gVar = (H8.g) this.f7761c.get(obj.getClass());
                    return gVar != null ? s(gVar, dVar, obj, z10) : obj instanceof c ? c(dVar, ((c) obj).getNumber()) : obj instanceof Enum ? c(dVar, ((Enum) obj).ordinal()) : r(this.f7762d, dVar, obj, z10);
                }
                byte[] bArr = (byte[]) obj;
                if (!z10 || bArr.length != 0) {
                    w((v(dVar) << 3) | 2);
                    w(bArr.length);
                    this.f7759a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    @Override // H8.f
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public f c(H8.d dVar, int i10) {
        return k(dVar, i10, true);
    }

    public f k(H8.d dVar, int i10, boolean z10) throws IOException {
        if (!z10 || i10 != 0) {
            d dVarU = u(dVar);
            int i11 = a.f7764a[dVarU.intEncoding().ordinal()];
            if (i11 == 1) {
                w(dVarU.tag() << 3);
                w(i10);
                return this;
            }
            if (i11 == 2) {
                w(dVarU.tag() << 3);
                w((i10 << 1) ^ (i10 >> 31));
                return this;
            }
            if (i11 == 3) {
                w((dVarU.tag() << 3) | 5);
                this.f7759a.write(p(4).putInt(i10).array());
                return this;
            }
        }
        return this;
    }

    @Override // H8.f
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public f b(H8.d dVar, long j10) {
        return m(dVar, j10, true);
    }

    public f m(H8.d dVar, long j10, boolean z10) throws IOException {
        if (!z10 || j10 != 0) {
            d dVarU = u(dVar);
            int i10 = a.f7764a[dVarU.intEncoding().ordinal()];
            if (i10 == 1) {
                w(dVarU.tag() << 3);
                x(j10);
                return this;
            }
            if (i10 == 2) {
                w(dVarU.tag() << 3);
                x((j10 >> 63) ^ (j10 << 1));
                return this;
            }
            if (i10 == 3) {
                w((dVarU.tag() << 3) | 1);
                this.f7759a.write(p(8).putLong(j10).array());
                return this;
            }
        }
        return this;
    }

    @Override // H8.f
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public f a(H8.d dVar, boolean z10) {
        return o(dVar, z10, true);
    }

    public f o(H8.d dVar, boolean z10, boolean z11) {
        return k(dVar, z10 ? 1 : 0, z11);
    }

    public final long q(H8.e eVar, Object obj) throws IOException {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f7759a;
            this.f7759a = bVar;
            try {
                eVar.a(obj, this);
                this.f7759a = outputStream;
                long jA = bVar.a();
                bVar.close();
                return jA;
            } catch (Throwable th) {
                this.f7759a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final f r(H8.e eVar, H8.d dVar, Object obj, boolean z10) throws IOException {
        long jQ = q(eVar, obj);
        if (z10 && jQ == 0) {
            return this;
        }
        w((v(dVar) << 3) | 2);
        x(jQ);
        eVar.a(obj, this);
        return this;
    }

    public final f s(H8.g gVar, H8.d dVar, Object obj, boolean z10) {
        this.f7763e.b(dVar, z10);
        gVar.a(obj, this.f7763e);
        return this;
    }

    public f t(Object obj) {
        if (obj == null) {
            return this;
        }
        H8.e eVar = (H8.e) this.f7760b.get(obj.getClass());
        if (eVar != null) {
            eVar.a(obj, this);
            return this;
        }
        throw new H8.c("No encoder for " + obj.getClass());
    }

    public final void w(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f7759a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f7759a.write(i10 & 127);
    }

    public final void x(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f7759a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f7759a.write(((int) j10) & 127);
    }
}
