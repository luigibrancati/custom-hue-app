package J8;

import H8.g;
import H8.h;
import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements H8.f, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f6329a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6330b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JsonWriter f6331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f6332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f6333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final H8.e f6334f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f6335g;

    public e(Writer writer, Map map, Map map2, H8.e eVar, boolean z10) {
        this.f6331c = new JsonWriter(writer);
        this.f6332d = map;
        this.f6333e = map2;
        this.f6334f = eVar;
        this.f6335g = z10;
    }

    @Override // H8.f
    public H8.f a(H8.d dVar, boolean z10) {
        return q(dVar.b(), z10);
    }

    @Override // H8.f
    public H8.f b(H8.d dVar, long j10) {
        return o(dVar.b(), j10);
    }

    @Override // H8.f
    public H8.f c(H8.d dVar, int i10) {
        return n(dVar.b(), i10);
    }

    @Override // H8.f
    public H8.f d(H8.d dVar, double d10) {
        return m(dVar.b(), d10);
    }

    @Override // H8.f
    public H8.f e(H8.d dVar, Object obj) {
        return p(dVar.b(), obj);
    }

    public e h(double d10) throws IOException {
        y();
        this.f6331c.value(d10);
        return this;
    }

    public e i(int i10) throws IOException {
        y();
        this.f6331c.value(i10);
        return this;
    }

    public e j(long j10) throws IOException {
        y();
        this.f6331c.value(j10);
        return this;
    }

    public e k(Object obj, boolean z10) {
        if (z10 && t(obj)) {
            throw new H8.c(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f6331c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f6331c.value((Number) obj);
            return this;
        }
        int i10 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f6331c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    k(it.next(), false);
                }
                this.f6331c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f6331c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        p((String) key, entry.getValue());
                    } catch (ClassCastException e10) {
                        throw new H8.c(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                this.f6331c.endObject();
                return this;
            }
            H8.e eVar = (H8.e) this.f6332d.get(obj.getClass());
            if (eVar != null) {
                return v(eVar, obj, z10);
            }
            g gVar = (g) this.f6333e.get(obj.getClass());
            if (gVar != null) {
                gVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return v(this.f6334f, obj, z10);
            }
            if (obj instanceof f) {
                i(((f) obj).getNumber());
                return this;
            }
            f(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return s((byte[]) obj);
        }
        this.f6331c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i10 < length) {
                this.f6331c.value(r6[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                j(jArr[i10]);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                this.f6331c.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                this.f6331c.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                k(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                k(obj2, false);
            }
        }
        this.f6331c.endArray();
        return this;
    }

    @Override // H8.h
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public e f(String str) throws IOException {
        y();
        this.f6331c.value(str);
        return this;
    }

    public e m(String str, double d10) throws IOException {
        y();
        this.f6331c.name(str);
        return h(d10);
    }

    public e n(String str, int i10) throws IOException {
        y();
        this.f6331c.name(str);
        return i(i10);
    }

    public e o(String str, long j10) throws IOException {
        y();
        this.f6331c.name(str);
        return j(j10);
    }

    public e p(String str, Object obj) {
        return this.f6335g ? x(str, obj) : w(str, obj);
    }

    public e q(String str, boolean z10) throws IOException {
        y();
        this.f6331c.name(str);
        return g(z10);
    }

    @Override // H8.h
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public e g(boolean z10) throws IOException {
        y();
        this.f6331c.value(z10);
        return this;
    }

    public e s(byte[] bArr) throws IOException {
        y();
        if (bArr == null) {
            this.f6331c.nullValue();
            return this;
        }
        this.f6331c.value(Base64.encodeToString(bArr, 2));
        return this;
    }

    public final boolean t(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    public void u() {
        y();
        this.f6331c.flush();
    }

    public e v(H8.e eVar, Object obj, boolean z10) throws IOException {
        if (!z10) {
            this.f6331c.beginObject();
        }
        eVar.a(obj, this);
        if (!z10) {
            this.f6331c.endObject();
        }
        return this;
    }

    public final e w(String str, Object obj) throws IOException {
        y();
        this.f6331c.name(str);
        if (obj != null) {
            return k(obj, false);
        }
        this.f6331c.nullValue();
        return this;
    }

    public final e x(String str, Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        y();
        this.f6331c.name(str);
        return k(obj, false);
    }

    public final void y() throws IOException {
        if (!this.f6330b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        e eVar = this.f6329a;
        if (eVar != null) {
            eVar.y();
            this.f6329a.f6330b = false;
            this.f6329a = null;
            this.f6331c.endObject();
        }
    }
}
