package I1;

import G1.AbstractC0853a;
import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f5437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f5440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f5441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f5442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f5443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f5444h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f5445i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f5446j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f5447k;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Uri f5448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f5449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5450c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f5451d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Map f5452e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f5453f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f5454g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f5455h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f5456i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f5457j;

        public j a() {
            AbstractC0853a.j(this.f5448a, "The uri must be set.");
            return new j(this.f5448a, this.f5449b, this.f5450c, this.f5451d, this.f5452e, this.f5453f, this.f5454g, this.f5455h, this.f5456i, this.f5457j);
        }

        public b b(int i10) {
            this.f5456i = i10;
            return this;
        }

        public b c(byte[] bArr) {
            this.f5451d = bArr;
            return this;
        }

        public b d(int i10) {
            this.f5450c = i10;
            return this;
        }

        public b e(Map map) {
            this.f5452e = map;
            return this;
        }

        public b f(String str) {
            this.f5455h = str;
            return this;
        }

        public b g(long j10) {
            this.f5454g = j10;
            return this;
        }

        public b h(long j10) {
            this.f5453f = j10;
            return this;
        }

        public b i(Uri uri) {
            this.f5448a = uri;
            return this;
        }

        public b j(String str) {
            this.f5448a = Uri.parse(str);
            return this;
        }

        public b() {
            this.f5450c = 1;
            this.f5452e = Collections.EMPTY_MAP;
            this.f5454g = -1L;
        }

        public b(j jVar) {
            this.f5448a = jVar.f5437a;
            this.f5449b = jVar.f5438b;
            this.f5450c = jVar.f5439c;
            this.f5451d = jVar.f5440d;
            this.f5452e = jVar.f5441e;
            this.f5453f = jVar.f5443g;
            this.f5454g = jVar.f5444h;
            this.f5455h = jVar.f5445i;
            this.f5456i = jVar.f5446j;
            this.f5457j = jVar.f5447k;
        }
    }

    static {
        D1.s.a("media3.datasource");
    }

    public static String c(int i10) {
        if (i10 == 1) {
            return "GET";
        }
        if (i10 == 2) {
            return "POST";
        }
        if (i10 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public b a() {
        return new b();
    }

    public final String b() {
        return c(this.f5439c);
    }

    public boolean d(int i10) {
        return (this.f5446j & i10) == i10;
    }

    public j e(long j10) {
        long j11 = this.f5444h;
        return f(j10, j11 != -1 ? j11 - j10 : -1L);
    }

    public j f(long j10, long j11) {
        return (j10 == 0 && this.f5444h == j11) ? this : new j(this.f5437a, this.f5438b, this.f5439c, this.f5440d, this.f5441e, this.f5443g + j10, j11, this.f5445i, this.f5446j, this.f5447k);
    }

    public String toString() {
        return "DataSpec[" + b() + StringUtils.SPACE + this.f5437a + ", " + this.f5443g + ", " + this.f5444h + ", " + this.f5445i + ", " + this.f5446j + "]";
    }

    public j(Uri uri) {
        this(uri, 0L, -1L);
    }

    public j(Uri uri, long j10, long j11) {
        this(uri, j10, j11, null);
    }

    public j(Uri uri, long j10, long j11, String str) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j10, j11, str, 0, null);
    }

    public j(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11, Object obj) {
        byte[] bArr2 = bArr;
        long j13 = j10 + j11;
        AbstractC0853a.a(j13 >= 0);
        AbstractC0853a.a(j11 >= 0);
        AbstractC0853a.a(j12 > 0 || j12 == -1);
        this.f5437a = (Uri) AbstractC0853a.e(uri);
        this.f5438b = j10;
        this.f5439c = i10;
        this.f5440d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f5441e = Collections.unmodifiableMap(new HashMap(map));
        this.f5443g = j11;
        this.f5442f = j13;
        this.f5444h = j12;
        this.f5445i = str;
        this.f5446j = i11;
        this.f5447k = obj;
    }
}
