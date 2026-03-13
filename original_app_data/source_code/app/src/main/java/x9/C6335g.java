package x9;

import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: x9.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6335g extends C9.a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Reader f47958u = new a();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Object f47959v = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object[] f47960q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f47961r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String[] f47962s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int[] f47963t;

    /* JADX INFO: renamed from: x9.g$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: x9.g$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47964a;

        static {
            int[] iArr = new int[C9.b.values().length];
            f47964a = iArr;
            try {
                iArr[C9.b.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47964a[C9.b.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47964a[C9.b.END_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47964a[C9.b.END_DOCUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C6335g(u9.j jVar) {
        super(f47958u);
        this.f47960q = new Object[32];
        this.f47961r = 0;
        this.f47962s = new String[32];
        this.f47963t = new int[32];
        Q0(jVar);
    }

    private String m() {
        return " at path " + getPath();
    }

    @Override // C9.a
    public C9.b C() throws C9.d {
        if (this.f47961r == 0) {
            return C9.b.END_DOCUMENT;
        }
        Object objG0 = G0();
        if (objG0 instanceof Iterator) {
            boolean z10 = this.f47960q[this.f47961r - 2] instanceof u9.m;
            Iterator it = (Iterator) objG0;
            if (!it.hasNext()) {
                return z10 ? C9.b.END_OBJECT : C9.b.END_ARRAY;
            }
            if (z10) {
                return C9.b.NAME;
            }
            Q0(it.next());
            return C();
        }
        if (objG0 instanceof u9.m) {
            return C9.b.BEGIN_OBJECT;
        }
        if (objG0 instanceof u9.g) {
            return C9.b.BEGIN_ARRAY;
        }
        if (objG0 instanceof u9.o) {
            u9.o oVar = (u9.o) objG0;
            if (oVar.B()) {
                return C9.b.STRING;
            }
            if (oVar.y()) {
                return C9.b.BOOLEAN;
            }
            if (oVar.A()) {
                return C9.b.NUMBER;
            }
            throw new AssertionError();
        }
        if (objG0 instanceof u9.l) {
            return C9.b.NULL;
        }
        if (objG0 == f47959v) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new C9.d("Custom JsonElement subclass " + objG0.getClass().getName() + " is not supported");
    }

    public final String C0(boolean z10) {
        v0(C9.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) G0()).next();
        String str = (String) entry.getKey();
        this.f47962s[this.f47961r - 1] = z10 ? "<skipped>" : str;
        Q0(entry.getValue());
        return str;
    }

    public final Object G0() {
        return this.f47960q[this.f47961r - 1];
    }

    public final Object J0() {
        Object[] objArr = this.f47960q;
        int i10 = this.f47961r - 1;
        this.f47961r = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public void M0() {
        v0(C9.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) G0()).next();
        Q0(entry.getValue());
        Q0(new u9.o((String) entry.getKey()));
    }

    public final void Q0(Object obj) {
        int i10 = this.f47961r;
        Object[] objArr = this.f47960q;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.f47960q = Arrays.copyOf(objArr, i11);
            this.f47963t = Arrays.copyOf(this.f47963t, i11);
            this.f47962s = (String[]) Arrays.copyOf(this.f47962s, i11);
        }
        Object[] objArr2 = this.f47960q;
        int i12 = this.f47961r;
        this.f47961r = i12 + 1;
        objArr2[i12] = obj;
    }

    @Override // C9.a
    public void beginArray() {
        v0(C9.b.BEGIN_ARRAY);
        Q0(((u9.g) G0()).iterator());
        this.f47963t[this.f47961r - 1] = 0;
    }

    @Override // C9.a
    public void beginObject() {
        v0(C9.b.BEGIN_OBJECT);
        Q0(((u9.m) G0()).s().iterator());
    }

    @Override // C9.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f47960q = new Object[]{f47959v};
        this.f47961r = 1;
    }

    @Override // C9.a
    public void endArray() {
        v0(C9.b.END_ARRAY);
        J0();
        J0();
        int i10 = this.f47961r;
        if (i10 > 0) {
            int[] iArr = this.f47963t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // C9.a
    public void endObject() {
        v0(C9.b.END_OBJECT);
        this.f47962s[this.f47961r - 1] = null;
        J0();
        J0();
        int i10 = this.f47961r;
        if (i10 > 0) {
            int[] iArr = this.f47963t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public final String g(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.f47961r;
            if (i10 >= i11) {
                return sb2.toString();
            }
            Object[] objArr = this.f47960q;
            Object obj = objArr[i10];
            if (obj instanceof u9.g) {
                i10++;
                if (i10 < i11 && (objArr[i10] instanceof Iterator)) {
                    int i12 = this.f47963t[i10];
                    if (z10 && i12 > 0 && (i10 == i11 - 1 || i10 == i11 - 2)) {
                        i12--;
                    }
                    sb2.append('[');
                    sb2.append(i12);
                    sb2.append(']');
                }
            } else if ((obj instanceof u9.m) && (i10 = i10 + 1) < i11 && (objArr[i10] instanceof Iterator)) {
                sb2.append('.');
                String str = this.f47962s[i10];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i10++;
        }
    }

    @Override // C9.a
    public String getPath() {
        return g(false);
    }

    @Override // C9.a
    public String h() {
        return g(true);
    }

    @Override // C9.a
    public boolean hasNext() throws C9.d {
        C9.b bVarC = C();
        return (bVarC == C9.b.END_OBJECT || bVarC == C9.b.END_ARRAY || bVarC == C9.b.END_DOCUMENT) ? false : true;
    }

    @Override // C9.a
    public boolean nextBoolean() {
        v0(C9.b.BOOLEAN);
        boolean zC = ((u9.o) J0()).c();
        int i10 = this.f47961r;
        if (i10 > 0) {
            int[] iArr = this.f47963t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return zC;
    }

    @Override // C9.a
    public double nextDouble() throws C9.d {
        C9.b bVarC = C();
        C9.b bVar = C9.b.NUMBER;
        if (bVarC != bVar && bVarC != C9.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarC + m());
        }
        double dT = ((u9.o) G0()).t();
        if (!j() && (Double.isNaN(dT) || Double.isInfinite(dT))) {
            throw new C9.d("JSON forbids NaN and infinities: " + dT);
        }
        J0();
        int i10 = this.f47961r;
        if (i10 > 0) {
            int[] iArr = this.f47963t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return dT;
    }

    @Override // C9.a
    public int nextInt() throws C9.d {
        C9.b bVarC = C();
        C9.b bVar = C9.b.NUMBER;
        if (bVarC != bVar && bVarC != C9.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarC + m());
        }
        int iV = ((u9.o) G0()).v();
        J0();
        int i10 = this.f47961r;
        if (i10 > 0) {
            int[] iArr = this.f47963t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return iV;
    }

    @Override // C9.a
    public long nextLong() throws C9.d {
        C9.b bVarC = C();
        C9.b bVar = C9.b.NUMBER;
        if (bVarC != bVar && bVarC != C9.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarC + m());
        }
        long jW = ((u9.o) G0()).w();
        J0();
        int i10 = this.f47961r;
        if (i10 > 0) {
            int[] iArr = this.f47963t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return jW;
    }

    @Override // C9.a
    public String nextName() {
        return C0(false);
    }

    @Override // C9.a
    public void nextNull() {
        v0(C9.b.NULL);
        J0();
        int i10 = this.f47961r;
        if (i10 > 0) {
            int[] iArr = this.f47963t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // C9.a
    public String nextString() throws C9.d {
        C9.b bVarC = C();
        C9.b bVar = C9.b.STRING;
        if (bVarC == bVar || bVarC == C9.b.NUMBER) {
            String strH = ((u9.o) J0()).h();
            int i10 = this.f47961r;
            if (i10 > 0) {
                int[] iArr = this.f47963t;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return strH;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + bVarC + m());
    }

    @Override // C9.a
    public void skipValue() throws C9.d {
        int i10 = b.f47964a[C().ordinal()];
        if (i10 == 1) {
            C0(true);
            return;
        }
        if (i10 == 2) {
            endArray();
            return;
        }
        if (i10 == 3) {
            endObject();
            return;
        }
        if (i10 != 4) {
            J0();
            int i11 = this.f47961r;
            if (i11 > 0) {
                int[] iArr = this.f47963t;
                int i12 = i11 - 1;
                iArr[i12] = iArr[i12] + 1;
            }
        }
    }

    @Override // C9.a
    public String toString() {
        return C6335g.class.getSimpleName() + m();
    }

    public final void v0(C9.b bVar) {
        if (C() == bVar) {
            return;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + C() + m());
    }

    public u9.j x0() throws C9.d {
        C9.b bVarC = C();
        if (bVarC != C9.b.NAME && bVarC != C9.b.END_ARRAY && bVarC != C9.b.END_OBJECT && bVarC != C9.b.END_DOCUMENT) {
            u9.j jVar = (u9.j) G0();
            skipValue();
            return jVar;
        }
        throw new IllegalStateException("Unexpected " + bVarC + " when reading a JsonElement.");
    }
}
