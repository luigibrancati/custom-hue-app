package g9;

import android.app.ActivityManager;
import android.content.Context;
import b9.C2898a;
import com.google.firebase.perf.util.o;

/* JADX INFO: renamed from: g9.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C4169i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C2898a f35553e = C2898a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runtime f35554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActivityManager f35555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActivityManager.MemoryInfo f35556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f35557d;

    public C4169i(Context context) {
        this(Runtime.getRuntime(), context);
    }

    public int a() {
        return o.c(com.google.firebase.perf.util.k.BYTES.b(this.f35556c.totalMem));
    }

    public int b() {
        return o.c(com.google.firebase.perf.util.k.BYTES.b(this.f35554a.maxMemory()));
    }

    public int c() {
        return o.c(com.google.firebase.perf.util.k.MEGABYTES.b(this.f35555b.getMemoryClass()));
    }

    public C4169i(Runtime runtime, Context context) {
        this.f35554a = runtime;
        this.f35557d = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f35555b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f35556c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
