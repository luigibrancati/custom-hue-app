package ia;

import android.net.Uri;
import fc.C4034q;
import gc.Q;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ia.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C4370a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f37325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f37326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f37327e;

    /* JADX INFO: renamed from: ia.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0488a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f37328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f37329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Uri f37330c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f37331d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f37332e;

        public final C4370a a() {
            return new C4370a(this.f37328a, this.f37329b, this.f37330c, this.f37331d, this.f37332e);
        }

        public final C0488a b(byte[] bytes) {
            AbstractC4862t.e(bytes, "bytes");
            this.f37332e = bytes;
            return this;
        }

        public final C0488a c(String str) {
            this.f37329b = str;
            return this;
        }

        public final C0488a d(String str) {
            this.f37328a = str;
            return this;
        }

        public final C0488a e(long j10) {
            this.f37331d = j10;
            return this;
        }

        public final C0488a f(Uri uri) {
            this.f37330c = uri;
            return this;
        }
    }

    public C4370a(String str, String str2, Uri uri, long j10, byte[] bArr) {
        this.f37323a = str;
        this.f37324b = str2;
        this.f37325c = uri;
        this.f37326d = j10;
        this.f37327e = bArr;
    }

    public final HashMap a() {
        return Q.k(new C4034q("path", this.f37323a), new C4034q("name", this.f37324b), new C4034q(RRWebVideoEvent.JsonKeys.SIZE, Long.valueOf(this.f37326d)), new C4034q("bytes", this.f37327e), new C4034q("identifier", String.valueOf(this.f37325c)));
    }
}
