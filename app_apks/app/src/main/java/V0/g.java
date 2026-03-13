package V0;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f17229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17230b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17231c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f17232d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f17233e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f17234f;

        public b(Uri uri, int i10, int i11, boolean z10, int i12) {
            this(uri, i10, i11, z10, null, i12);
        }

        public static b a(Uri uri, int i10, int i11, boolean z10, int i12) {
            return new b(uri, i10, i11, z10, i12);
        }

        public int b() {
            return this.f17234f;
        }

        public String c() {
            if (i()) {
                return this.f17229a.getAuthority();
            }
            return null;
        }

        public int d() {
            return this.f17230b;
        }

        public Uri e() {
            return this.f17229a;
        }

        public String f() {
            return this.f17233e;
        }

        public int g() {
            return this.f17231c;
        }

        public boolean h() {
            return this.f17232d;
        }

        public boolean i() {
            return Objects.equals(this.f17229a.getScheme(), "systemfont");
        }

        public b(Uri uri, int i10, int i11, boolean z10, String str, int i12) {
            this.f17229a = (Uri) X0.h.g(uri);
            this.f17230b = i10;
            this.f17231c = i11;
            this.f17232d = z10;
            this.f17233e = str;
            this.f17234f = i12;
        }

        public b(String str, String str2) {
            this.f17229a = new Uri.Builder().scheme("systemfont").authority(str).build();
            this.f17230b = 0;
            this.f17231c = 400;
            this.f17232d = false;
            this.f17233e = str2;
            this.f17234f = 0;
        }
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return O0.d.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e eVar) {
        return d.e(context, List.of(eVar), cancellationSignal);
    }

    public static Typeface c(Context context, List list, int i10, boolean z10, int i11, Handler handler, c cVar) {
        V0.a aVar = new V0.a(cVar, h.b(handler));
        if (!z10) {
            return f.d(context, list, i10, null, aVar);
        }
        if (list.size() <= 1) {
            return f.e(context, (e) list.get(0), aVar, i10, i11);
        }
        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f17228b;

        public a(int i10, b[] bVarArr) {
            this.f17227a = i10;
            this.f17228b = Collections.singletonList(bVarArr);
        }

        public static a a(int i10, List list) {
            return new a(i10, list);
        }

        public static a b(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        public b[] c() {
            return (b[]) this.f17228b.get(0);
        }

        public List d() {
            return this.f17228b;
        }

        public int e() {
            return this.f17227a;
        }

        public boolean f() {
            return this.f17228b.size() > 1;
        }

        public a(int i10, List list) {
            this.f17227a = i10;
            this.f17228b = list;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {
        public void a(int i10) {
        }

        public void b(Typeface typeface) {
        }
    }
}
