package X6;

import java.lang.Thread;
import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: X6.c3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2360c3 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2384f3 f18729b;

    public C2360c3(C2384f3 c2384f3, String str) {
        Objects.requireNonNull(c2384f3);
        this.f18729b = c2384f3;
        AbstractC6056k.l(str);
        this.f18728a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f18729b.f18400a.a().o().b(this.f18728a, th);
    }
}
