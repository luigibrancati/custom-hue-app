package P8;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.apache.tika.metadata.TikaCoreProperties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f13205b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f13206c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static p f13207d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S8.a f13208a;

    public p(S8.a aVar) {
        this.f13208a = aVar;
    }

    public static p c() {
        return d(S8.b.b());
    }

    public static p d(S8.a aVar) {
        if (f13207d == null) {
            f13207d = new p(aVar);
        }
        return f13207d;
    }

    public static boolean g(String str) {
        return f13206c.matcher(str).matches();
    }

    public static boolean h(String str) {
        return str.contains(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
    }

    public long a() {
        return this.f13208a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(Q8.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f13205b;
    }
}
