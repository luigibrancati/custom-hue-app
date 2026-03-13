package O6;

import H8.d;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: O6.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1705l implements H8.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f11712f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final H8.d f11713g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final H8.d f11714h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final H8.e f11715i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f11716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f11717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f11718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H8.e f11719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1733p f11720e = new C1733p(this);

    static {
        d.b bVarA = H8.d.a("key");
        C1663f c1663f = new C1663f();
        c1663f.a(1);
        f11713g = bVarA.b(c1663f.b()).a();
        d.b bVarA2 = H8.d.a("value");
        C1663f c1663f2 = new C1663f();
        c1663f2.a(2);
        f11714h = bVarA2.b(c1663f2.b()).a();
        f11715i = new H8.e() { // from class: O6.k
            @Override // H8.b
            public final void a(Object obj, Object obj2) {
                C1705l.l((Map.Entry) obj, (H8.f) obj2);
            }
        };
    }

    public C1705l(OutputStream outputStream, Map map, Map map2, H8.e eVar) {
        this.f11716a = outputStream;
        this.f11717b = map;
        this.f11718c = map2;
        this.f11719d = eVar;
    }

    public static /* synthetic */ void l(Map.Entry entry, H8.f fVar) {
        fVar.e(f11713g, entry.getKey());
        fVar.e(f11714h, entry.getValue());
    }

    private static int m(H8.d dVar) {
        InterfaceC1691j interfaceC1691j = (InterfaceC1691j) dVar.c(InterfaceC1691j.class);
        if (interfaceC1691j != null) {
            return interfaceC1691j.zza();
        }
        throw new H8.c("Field has no @Protobuf config");
    }

    private final long n(H8.e eVar, Object obj) throws IOException {
        C1670g c1670g = new C1670g();
        try {
            OutputStream outputStream = this.f11716a;
            this.f11716a = c1670g;
            try {
                eVar.a(obj, this);
                this.f11716a = outputStream;
                long jA = c1670g.a();
                c1670g.close();
                return jA;
            } catch (Throwable th) {
                this.f11716a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c1670g.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    public static InterfaceC1691j o(H8.d dVar) {
        InterfaceC1691j interfaceC1691j = (InterfaceC1691j) dVar.c(InterfaceC1691j.class);
        if (interfaceC1691j != null) {
            return interfaceC1691j;
        }
        throw new H8.c("Field has no @Protobuf config");
    }

    private static ByteBuffer r(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void s(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f11716a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f11716a.write(i10 & 127);
    }

    private final void t(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f11716a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f11716a.write(((int) j10) & 127);
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
        this.f11716a.write(r(8).putDouble(d10).array());
        return this;
    }

    public final H8.f g(H8.d dVar, float f10, boolean z10) throws IOException {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        s((m(dVar) << 3) | 5);
        this.f11716a.write(r(4).putFloat(f10).array());
        return this;
    }

    public final H8.f h(H8.d dVar, Object obj, boolean z10) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    s((m(dVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f11712f);
                    s(bytes.length);
                    this.f11716a.write(bytes);
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
                    p(f11715i, dVar, (Map.Entry) it2.next(), false);
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
                    H8.e eVar = (H8.e) this.f11717b.get(obj.getClass());
                    if (eVar != null) {
                        p(eVar, dVar, obj, z10);
                        return this;
                    }
                    H8.g gVar = (H8.g) this.f11718c.get(obj.getClass());
                    if (gVar != null) {
                        q(gVar, dVar, obj, z10);
                        return this;
                    }
                    if (obj instanceof InterfaceC1677h) {
                        i(dVar, ((InterfaceC1677h) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        i(dVar, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    p(this.f11719d, dVar, obj, z10);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z10 || bArr.length != 0) {
                    s((m(dVar) << 3) | 2);
                    s(bArr.length);
                    this.f11716a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    public final C1705l i(H8.d dVar, int i10, boolean z10) throws IOException {
        if (!z10 || i10 != 0) {
            InterfaceC1691j interfaceC1691jO = o(dVar);
            EnumC1684i enumC1684i = EnumC1684i.DEFAULT;
            int iOrdinal = interfaceC1691jO.zzb().ordinal();
            if (iOrdinal == 0) {
                s(interfaceC1691jO.zza() << 3);
                s(i10);
                return this;
            }
            if (iOrdinal == 1) {
                s(interfaceC1691jO.zza() << 3);
                s((i10 + i10) ^ (i10 >> 31));
                return this;
            }
            if (iOrdinal == 2) {
                s((interfaceC1691jO.zza() << 3) | 5);
                this.f11716a.write(r(4).putInt(i10).array());
                return this;
            }
        }
        return this;
    }

    public final C1705l j(H8.d dVar, long j10, boolean z10) throws IOException {
        if (!z10 || j10 != 0) {
            InterfaceC1691j interfaceC1691jO = o(dVar);
            EnumC1684i enumC1684i = EnumC1684i.DEFAULT;
            int iOrdinal = interfaceC1691jO.zzb().ordinal();
            if (iOrdinal == 0) {
                s(interfaceC1691jO.zza() << 3);
                t(j10);
                return this;
            }
            if (iOrdinal == 1) {
                s(interfaceC1691jO.zza() << 3);
                t((j10 >> 63) ^ (j10 + j10));
                return this;
            }
            if (iOrdinal == 2) {
                s((interfaceC1691jO.zza() << 3) | 1);
                this.f11716a.write(r(8).putLong(j10).array());
                return this;
            }
        }
        return this;
    }

    public final C1705l k(Object obj) {
        if (obj == null) {
            return this;
        }
        H8.e eVar = (H8.e) this.f11717b.get(obj.getClass());
        if (eVar == null) {
            throw new H8.c("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        eVar.a(obj, this);
        return this;
    }

    public final C1705l p(H8.e eVar, H8.d dVar, Object obj, boolean z10) throws IOException {
        long jN = n(eVar, obj);
        if (z10 && jN == 0) {
            return this;
        }
        s((m(dVar) << 3) | 2);
        t(jN);
        eVar.a(obj, this);
        return this;
    }

    public final C1705l q(H8.g gVar, H8.d dVar, Object obj, boolean z10) {
        this.f11720e.a(dVar, z10);
        gVar.a(obj, this.f11720e);
        return this;
    }
}
