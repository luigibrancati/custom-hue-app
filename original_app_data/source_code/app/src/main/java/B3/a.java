package B3;

import C3.n;
import Ud.InterfaceC2313e;
import android.app.Activity;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A3.a f622c;

    public a(n nVar, A3.a aVar) {
        this.f621b = nVar;
        this.f622c = aVar;
    }

    @Override // C3.n
    public InterfaceC2313e a(Activity activity) {
        AbstractC4862t.e(activity, "activity");
        return this.f621b.a(activity);
    }

    public final void b(Activity activity, Executor executor, X0.a consumer) {
        AbstractC4862t.e(activity, "activity");
        AbstractC4862t.e(executor, "executor");
        AbstractC4862t.e(consumer, "consumer");
        this.f622c.a(executor, consumer, this.f621b.a(activity));
    }

    public final void c(X0.a consumer) {
        AbstractC4862t.e(consumer, "consumer");
        this.f622c.b(consumer);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(n tracker) {
        this(tracker, new A3.a());
        AbstractC4862t.e(tracker, "tracker");
    }
}
