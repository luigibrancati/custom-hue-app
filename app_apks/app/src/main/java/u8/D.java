package u8;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.webrtc.WebrtcBuildVersion;
import x8.F;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class D {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Map f45253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f45254h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f45255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f45256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5984a f45257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D8.d f45258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C8.j f45259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r8.i f45260f = r8.i.f43833a;

    static {
        HashMap map = new HashMap();
        f45253g = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        f45254h = String.format(Locale.US, "Crashlytics Android SDK/%s", "20.0.3");
    }

    public D(Context context, M m10, C5984a c5984a, D8.d dVar, C8.j jVar) {
        this.f45255a = context;
        this.f45256b = m10;
        this.f45257c = c5984a;
        this.f45258d = dVar;
        this.f45259e = jVar;
    }

    public static long f(long j10) {
        if (j10 > 0) {
            return j10;
        }
        return 0L;
    }

    public static int g() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = (Integer) f45253g.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    public final F.e.d.a.c A(F.a aVar) {
        return this.f45260f.a(aVar.e(), aVar.d(), aVar.c());
    }

    public final F.a a(F.a aVar) {
        List listUnmodifiableList;
        if (!this.f45259e.b().f1171b.f1180c || this.f45257c.f45315c.size() <= 0) {
            listUnmodifiableList = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (C5989f c5989f : this.f45257c.f45315c) {
                arrayList.add(F.a.AbstractC0646a.a().d(c5989f.c()).b(c5989f.a()).c(c5989f.b()).a());
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return F.a.a().c(aVar.c()).e(aVar.e()).g(aVar.g()).i(aVar.i()).d(aVar.d()).f(aVar.f()).h(aVar.h()).j(aVar.j()).b(listUnmodifiableList).a();
    }

    public final F.b b() {
        return x8.F.b().l("20.0.3").h(this.f45257c.f45313a).i(this.f45256b.a().c()).g(this.f45256b.a().e()).f(this.f45256b.a().d()).d(this.f45257c.f45318f).e(this.f45257c.f45319g).k(4);
    }

    public F.e.d c(F.a aVar) {
        int i10 = this.f45255a.getResources().getConfiguration().orientation;
        return F.e.d.a().g("anr").f(aVar.i()).b(k(i10, a(aVar))).c(l(i10)).a();
    }

    public F.e.d d(Throwable th, Thread thread, String str, long j10, int i10, int i11, boolean z10) {
        int i12 = this.f45255a.getResources().getConfiguration().orientation;
        return F.e.d.a().g(str).f(j10).b(j(i12, D8.e.a(th, this.f45258d), thread, i10, i11, z10)).c(l(i12)).a();
    }

    public x8.F e(String str, long j10) {
        return b().m(t(str, j10)).a();
    }

    public final F.e.d.a.b.AbstractC0650a h() {
        return F.e.d.a.b.AbstractC0650a.a().b(0L).d(0L).c(this.f45257c.f45317e).e(this.f45257c.f45314b).a();
    }

    public final List i() {
        return Collections.singletonList(h());
    }

    public final F.e.d.a j(int i10, D8.e eVar, Thread thread, int i11, int i12, boolean z10) {
        Boolean boolValueOf;
        F.e.d.a.c cVarE = this.f45260f.e(this.f45255a);
        if (cVarE.b() > 0) {
            boolValueOf = Boolean.valueOf(cVarE.b() != 100);
        } else {
            boolValueOf = null;
        }
        return F.e.d.a.a().c(boolValueOf).d(cVarE).b(this.f45260f.d(this.f45255a)).h(i10).f(o(eVar, thread, i11, i12, z10)).a();
    }

    public final F.e.d.a k(int i10, F.a aVar) {
        return F.e.d.a.a().c(Boolean.valueOf(aVar.c() != 100)).d(A(aVar)).h(i10).f(p(aVar)).a();
    }

    public final F.e.d.c l(int i10) {
        C5988e c5988eA = C5988e.a(this.f45255a);
        Float fB = c5988eA.b();
        Double dValueOf = fB != null ? Double.valueOf(fB.doubleValue()) : null;
        int iC = c5988eA.c();
        boolean zN = C5992i.n(this.f45255a);
        return F.e.d.c.a().b(dValueOf).c(iC).f(zN).e(i10).g(f(C5992i.b(this.f45255a) - C5992i.a(this.f45255a))).d(C5992i.c(Environment.getDataDirectory().getPath())).a();
    }

    public final F.e.d.a.b.c m(D8.e eVar, int i10, int i11) {
        return n(eVar, i10, i11, 0);
    }

    public final F.e.d.a.b.c n(D8.e eVar, int i10, int i11, int i12) {
        String str = eVar.f2317b;
        String str2 = eVar.f2316a;
        StackTraceElement[] stackTraceElementArr = eVar.f2318c;
        int i13 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        D8.e eVar2 = eVar.f2319d;
        if (i12 >= i11) {
            D8.e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f2319d;
                i13++;
            }
        }
        F.e.d.a.b.c.AbstractC0653a abstractC0653aD = F.e.d.a.b.c.a().f(str).e(str2).c(r(stackTraceElementArr, i10)).d(i13);
        if (eVar2 != null && i13 == 0) {
            abstractC0653aD.b(n(eVar2, i10, i11, i12 + 1));
        }
        return abstractC0653aD.a();
    }

    public final F.e.d.a.b o(D8.e eVar, Thread thread, int i10, int i11, boolean z10) {
        return F.e.d.a.b.a().f(z(eVar, thread, i10, z10)).d(m(eVar, i10, i11)).e(w()).c(i()).a();
    }

    public final F.e.d.a.b p(F.a aVar) {
        return F.e.d.a.b.a().b(aVar).e(w()).c(i()).a();
    }

    public final F.e.d.a.b.AbstractC0656e.AbstractC0658b q(StackTraceElement stackTraceElement, F.e.d.a.b.AbstractC0656e.AbstractC0658b.AbstractC0659a abstractC0659a) {
        long lineNumber = 0;
        long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            lineNumber = stackTraceElement.getLineNumber();
        }
        return abstractC0659a.e(jMax).f(str).b(fileName).d(lineNumber).a();
    }

    public final List r(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(q(stackTraceElement, F.e.d.a.b.AbstractC0656e.AbstractC0658b.a().c(i10)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final F.e.a s() {
        return F.e.a.a().e(this.f45256b.f()).g(this.f45257c.f45318f).d(this.f45257c.f45319g).f(this.f45256b.a().c()).b(this.f45257c.f45320h.d()).c(this.f45257c.f45320h.e()).a();
    }

    public final F.e t(String str, long j10) {
        return F.e.a().m(j10).j(str).h(f45254h).b(s()).l(v()).e(u()).i(3).a();
    }

    public final F.e.c u() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int iG = g();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jB = C5992i.b(this.f45255a);
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean zX = C5992i.x();
        int iL = C5992i.l();
        String str = Build.MANUFACTURER;
        return F.e.c.a().b(iG).f(Build.MODEL).c(iAvailableProcessors).h(jB).d(blockCount).i(zX).j(iL).e(str).g(Build.PRODUCT).a();
    }

    public final F.e.AbstractC0663e v() {
        return F.e.AbstractC0663e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(C5992i.y()).a();
    }

    public final F.e.d.a.b.AbstractC0654d w() {
        return F.e.d.a.b.AbstractC0654d.a().d(WebrtcBuildVersion.maint_version).c(WebrtcBuildVersion.maint_version).b(0L).a();
    }

    public final F.e.d.a.b.AbstractC0656e x(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return y(thread, stackTraceElementArr, 0);
    }

    public final F.e.d.a.b.AbstractC0656e y(Thread thread, StackTraceElement[] stackTraceElementArr, int i10) {
        return F.e.d.a.b.AbstractC0656e.a().d(thread.getName()).c(i10).b(r(stackTraceElementArr, i10)).a();
    }

    public final List z(D8.e eVar, Thread thread, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(y(thread, eVar.f2318c, i10));
        if (z10) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(x(key, this.f45258d.a(entry.getValue())));
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
