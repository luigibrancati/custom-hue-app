package t6;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import b7.C2878l;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.zacm;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import t6.C5843a;
import u6.AbstractC5970p;
import u6.AbstractC5972r;
import u6.C5919A;
import u6.C5925G;
import u6.C5944a;
import u6.C5946b;
import u6.C5952e;
import u6.C5960i;
import u6.C5967m;
import u6.C5974t;
import u6.InterfaceC5969o;
import v6.AbstractC6056k;
import v6.C6048c;

/* JADX INFO: renamed from: t6.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5846d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f44755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D6.a f44757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5843a f44758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C5843a.d f44759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C5946b f44760f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Looper f44761g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f44762h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AbstractC5847e f44763i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC5969o f44764j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C5952e f44765k;

    /* JADX INFO: renamed from: t6.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f44766c = new C0608a().a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC5969o f44767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Looper f44768b;

        /* JADX INFO: renamed from: t6.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class C0608a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public InterfaceC5969o f44769a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Looper f44770b;

            public a a() {
                if (this.f44769a == null) {
                    this.f44769a = new C5944a();
                }
                if (this.f44770b == null) {
                    this.f44770b = Looper.getMainLooper();
                }
                return new a(this.f44769a, null, this.f44770b, 0 == true ? 1 : 0);
            }
        }

        public a(InterfaceC5969o interfaceC5969o, Account account, Looper looper) {
            this.f44767a = interfaceC5969o;
            this.f44768b = looper;
        }

        public /* synthetic */ a(InterfaceC5969o interfaceC5969o, Account account, Looper looper, byte[] bArr) {
            this(interfaceC5969o, null, looper);
        }
    }

    public AbstractC5846d(Activity activity, C5843a c5843a, C5843a.d dVar, a aVar) {
        this(activity, activity, c5843a, dVar, aVar);
    }

    public C6048c.a j() {
        C6048c.a aVar = new C6048c.a();
        aVar.c(null);
        aVar.d(Collections.EMPTY_SET);
        Context context = this.f44755a;
        aVar.e(context.getClass().getName());
        aVar.b(context.getPackageName());
        return aVar;
    }

    public Task k(AbstractC5970p abstractC5970p) {
        return u(2, abstractC5970p);
    }

    public Task l(AbstractC5970p abstractC5970p) {
        return u(0, abstractC5970p);
    }

    public Task m(C5967m c5967m) {
        AbstractC6056k.l(c5967m);
        AbstractC6056k.m(c5967m.f45202a.b(), "Listener has already been released.");
        AbstractC5972r abstractC5972r = c5967m.f45203b;
        AbstractC6056k.m(abstractC5972r.a(), "Listener has already been released.");
        return this.f44765k.v(this, c5967m.f45202a, abstractC5972r, c5967m.f45204c);
    }

    public Task n(C5960i.a aVar, int i10) {
        AbstractC6056k.m(aVar, "Listener key cannot be null.");
        return this.f44765k.w(this, aVar, i10);
    }

    public Task o(AbstractC5970p abstractC5970p) {
        return u(1, abstractC5970p);
    }

    public final C5946b p() {
        return this.f44760f;
    }

    public String q() {
        return this.f44756b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C5843a.f r(Looper looper, C5919A c5919a) {
        C6048c c6048cA = j().a();
        C5843a.f fVarA = ((C5843a.AbstractC0606a) AbstractC6056k.l(this.f44758d.a())).a(this.f44755a, looper, c6048cA, this.f44759e, c5919a, c5919a);
        D6.a aVar = this.f44757c;
        if (aVar != null && (fVarA instanceof com.google.android.gms.common.internal.a)) {
            ((com.google.android.gms.common.internal.a) fVarA).O(aVar);
            return fVarA;
        }
        String strQ = q();
        if (strQ != null && (fVarA instanceof com.google.android.gms.common.internal.a)) {
            ((com.google.android.gms.common.internal.a) fVarA).P(strQ);
        }
        return fVarA;
    }

    public final int s() {
        return this.f44762h;
    }

    public final zacm t(Context context, Handler handler) {
        return new zacm(context, handler, j().a());
    }

    public final Task u(int i10, AbstractC5970p abstractC5970p) {
        C2878l c2878l = new C2878l();
        this.f44765k.t(this, i10, abstractC5970p, c2878l, this.f44764j);
        return c2878l.a();
    }

    public AbstractC5846d(Context context, Activity activity, C5843a c5843a, C5843a.d dVar, a aVar) {
        AbstractC6056k.m(context, "Null context is not permitted.");
        AbstractC6056k.m(c5843a, "Api must not be null.");
        AbstractC6056k.m(aVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) AbstractC6056k.m(context.getApplicationContext(), "The provided context did not have an application context.");
        this.f44755a = context2;
        String strC = L0.a.c(context);
        this.f44756b = strC;
        this.f44757c = new D6.a(context.getAttributionSource());
        this.f44758d = c5843a;
        this.f44759e = dVar;
        this.f44761g = aVar.f44768b;
        C5946b c5946bA = C5946b.a(c5843a, dVar, strC);
        this.f44760f = c5946bA;
        this.f44763i = new C5925G(this);
        C5952e c5952eM = C5952e.m(context2);
        this.f44765k = c5952eM;
        this.f44762h = c5952eM.n();
        this.f44764j = aVar.f44767a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C5974t.t(activity, c5952eM, c5946bA);
        }
        c5952eM.o(this);
    }

    public AbstractC5846d(Context context, C5843a c5843a, C5843a.d dVar, a aVar) {
        this(context, null, c5843a, dVar, aVar);
    }
}
