package R3;

import I3.AbstractC0889t;
import I3.AbstractC0890u;
import I3.C0880j;
import I3.InterfaceC0881k;
import Q3.I;
import Q3.J;
import Q3.q0;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class D implements InterfaceC0881k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f14511d = AbstractC0890u.i("WMFgUpdater");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S3.b f14512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P3.a f14513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J f14514c;

    public D(WorkDatabase workDatabase, P3.a aVar, S3.b bVar) {
        this.f14513b = aVar;
        this.f14512a = bVar;
        this.f14514c = workDatabase.W();
    }

    public static /* synthetic */ Void b(D d10, UUID uuid, C0880j c0880j, Context context) {
        d10.getClass();
        String string = uuid.toString();
        I i10 = d10.f14514c.i(string);
        if (i10 == null || i10.f13589b.b()) {
            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
        d10.f14513b.a(string, c0880j);
        context.startService(androidx.work.impl.foreground.a.e(context, q0.a(i10), c0880j));
        return null;
    }

    @Override // I3.InterfaceC0881k
    public O7.e a(final Context context, final UUID uuid, final C0880j c0880j) {
        return AbstractC0889t.f(this.f14512a.c(), "setForegroundAsync", new InterfaceC6082a() { // from class: R3.C
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return D.b(this.f14507a, uuid, c0880j, context);
            }
        });
    }
}
