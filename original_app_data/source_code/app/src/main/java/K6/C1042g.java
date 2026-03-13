package K6;

import R6.AbstractC2076k;
import R6.C2075j;
import R6.InterfaceC2068c;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import b7.C2878l;
import b7.InterfaceC2869c;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import t6.AbstractC5846d;
import t6.C5843a;
import u6.AbstractC5970p;
import u6.C5960i;
import u6.C5962j;
import u6.C5967m;
import u6.InterfaceC5968n;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: K6.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1042g extends AbstractC5846d implements InterfaceC2068c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C5843a.g f7547l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C5843a f7548m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Object f7549n;

    static {
        C5843a.g gVar = new C5843a.g();
        f7547l = gVar;
        f7548m = new C5843a("LocationServices.API", new C1039d(), gVar);
        f7549n = new Object();
    }

    public C1042g(Activity activity) {
        super(activity, f7548m, (C5843a.d) C5843a.d.f44753a, AbstractC5846d.a.f44766c);
    }

    @Override // R6.InterfaceC2068c
    public final Task d(AbstractC2076k abstractC2076k) {
        return n(C5962j.b(abstractC2076k, AbstractC2076k.class.getSimpleName()), 2418).j(new Executor() { // from class: K6.m
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                runnable.run();
            }
        }, new InterfaceC2869c() { // from class: K6.i
            @Override // b7.InterfaceC2869c
            public final /* synthetic */ Object a(Task task) {
                C5843a.g gVar = C1042g.f7547l;
                return null;
            }
        });
    }

    @Override // R6.InterfaceC2068c
    public final Task f(LocationRequest locationRequest, AbstractC2076k abstractC2076k, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            AbstractC6056k.m(looper, "invalid null looper");
        }
        return v(locationRequest, C5962j.a(abstractC2076k, looper, AbstractC2076k.class.getSimpleName()));
    }

    @Override // R6.InterfaceC2068c
    public final Task i() {
        return l(AbstractC5970p.a().b(new InterfaceC5968n() { // from class: K6.j
            @Override // u6.InterfaceC5968n
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                ((G) obj).p0(new C2075j.a().a(), (C2878l) obj2);
            }
        }).e(2414).a());
    }

    public final Task v(final LocationRequest locationRequest, C5960i c5960i) {
        final C1041f c1041f = new C1041f(this, c5960i, new InterfaceC1040e() { // from class: K6.k
            @Override // K6.InterfaceC1040e
            public final /* synthetic */ void a(G g10, C5960i.a aVar, boolean z10, C2878l c2878l) {
                g10.r0(aVar, z10, c2878l);
            }
        });
        return m(C5967m.a().b(new InterfaceC5968n() { // from class: K6.h
            @Override // u6.InterfaceC5968n
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                C5843a.g gVar = C1042g.f7547l;
                ((G) obj).q0(c1041f, locationRequest, (C2878l) obj2);
            }
        }).d(c1041f).e(c5960i).c(2436).a());
    }

    public C1042g(Context context) {
        super(context, f7548m, C5843a.d.f44753a, AbstractC5846d.a.f44766c);
    }
}
