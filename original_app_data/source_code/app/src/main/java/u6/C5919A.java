package u6;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import b0.C2777a;
import b7.C2878l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zacm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import s6.C5783b;
import s6.C5785d;
import t6.AbstractC5846d;
import t6.AbstractC5847e;
import t6.C5843a;
import t6.C5852j;
import u6.C5960i;
import v6.AbstractC6055j;
import v6.AbstractC6056k;
import x6.C6316f;

/* JADX INFO: renamed from: u6.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5919A implements AbstractC5847e.a, AbstractC5847e.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final List f45080A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C5783b f45081B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f45082C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ C5952e f45083D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Queue f45084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5843a.f f45085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5946b f45086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5973s f45087d;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Set f45088v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Map f45089w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f45090x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final zacm f45091y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f45092z;

    public C5919A(C5952e c5952e, AbstractC5846d abstractC5846d) {
        Objects.requireNonNull(c5952e);
        this.f45083D = c5952e;
        this.f45084a = new LinkedList();
        this.f45088v = new HashSet();
        this.f45089w = new HashMap();
        this.f45080A = new ArrayList();
        this.f45081B = null;
        this.f45082C = 0;
        C5843a.f fVarR = abstractC5846d.r(c5952e.f().getLooper(), this);
        this.f45085b = fVarR;
        this.f45086c = abstractC5846d.p();
        this.f45087d = new C5973s();
        this.f45090x = abstractC5846d.s();
        if (fVarR.h()) {
            this.f45091y = abstractC5846d.t(c5952e.F(), c5952e.f());
        } else {
            this.f45091y = null;
        }
    }

    public final boolean A() {
        return this.f45085b.h();
    }

    public final int B() {
        return this.f45090x;
    }

    public final int C() {
        return this.f45082C;
    }

    @Override // u6.InterfaceC5964k
    public final void D(C5783b c5783b) {
        q(c5783b, null);
    }

    public final void E() {
        this.f45082C++;
    }

    public final /* synthetic */ void I(C5920B c5920b) {
        if (this.f45080A.contains(c5920b) && !this.f45092z) {
            if (this.f45085b.isConnected()) {
                f();
            } else {
                z();
            }
        }
    }

    public final /* synthetic */ void J(C5920B c5920b) {
        C5785d[] c5785dArrF;
        if (this.f45080A.remove(c5920b)) {
            C5952e c5952e = this.f45083D;
            c5952e.f().removeMessages(15, c5920b);
            c5952e.f().removeMessages(16, c5920b);
            C5785d c5785dB = c5920b.b();
            Queue<AbstractC5947b0> queue = this.f45084a;
            ArrayList arrayList = new ArrayList(queue.size());
            for (AbstractC5947b0 abstractC5947b0 : queue) {
                if ((abstractC5947b0 instanceof AbstractC5931M) && (c5785dArrF = ((AbstractC5931M) abstractC5947b0).f(this)) != null && B6.b.b(c5785dArrF, c5785dB)) {
                    arrayList.add(abstractC5947b0);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC5947b0 abstractC5947b02 = (AbstractC5947b0) arrayList.get(i10);
                queue.remove(abstractC5947b02);
                abstractC5947b02.b(new C5852j(c5785dB));
            }
        }
    }

    @Override // u6.InterfaceC5950d
    public final void K(Bundle bundle) {
        C5952e c5952e = this.f45083D;
        if (Looper.myLooper() == c5952e.f().getLooper()) {
            F();
        } else {
            c5952e.f().post(new RunnableC5977w(this));
        }
    }

    public final /* synthetic */ C5843a.f L() {
        return this.f45085b;
    }

    @Override // u6.InterfaceC5950d
    public final void X(int i10) {
        C5952e c5952e = this.f45083D;
        if (Looper.myLooper() == c5952e.f().getLooper()) {
            G(i10);
        } else {
            c5952e.f().post(new RunnableC5978x(this, i10));
        }
    }

    public final /* synthetic */ C5946b a() {
        return this.f45086c;
    }

    public final /* synthetic */ boolean b() {
        return this.f45092z;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void F() {
        v();
        n(C5783b.f44145f);
        k();
        Iterator it = this.f45089w.values().iterator();
        while (it.hasNext()) {
            AbstractC5966l abstractC5966l = ((C5933O) it.next()).f45122a;
            if (o(abstractC5966l.c()) != null) {
                it.remove();
            } else {
                try {
                    abstractC5966l.d(this.f45085b, new C2878l());
                } catch (DeadObjectException unused) {
                    X(3);
                    this.f45085b.a("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException | RuntimeException e10) {
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e10);
                    it.remove();
                }
            }
        }
        f();
        l();
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void G(int i10) {
        v();
        this.f45092z = true;
        this.f45087d.d(i10, this.f45085b.o());
        C5946b c5946b = this.f45086c;
        C5952e c5952e = this.f45083D;
        c5952e.f().sendMessageDelayed(Message.obtain(c5952e.f(), 9, c5946b), 5000L);
        c5952e.f().sendMessageDelayed(Message.obtain(c5952e.f(), 11, c5946b), 120000L);
        c5952e.b().c();
        Iterator it = this.f45089w.values().iterator();
        while (it.hasNext()) {
            ((C5933O) it.next()).f45124c.run();
        }
    }

    public final boolean e(C5783b c5783b) {
        synchronized (C5952e.f45154r) {
            try {
                C5952e c5952e = this.f45083D;
                if (c5952e.d() == null || !c5952e.e().contains(this.f45086c)) {
                    return false;
                }
                c5952e.d().q(c5783b, this.f45090x);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        Queue queue = this.f45084a;
        ArrayList arrayList = new ArrayList(queue);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC5947b0 abstractC5947b0 = (AbstractC5947b0) arrayList.get(i10);
            if (!this.f45085b.isConnected()) {
                return;
            }
            if (g(abstractC5947b0)) {
                queue.remove(abstractC5947b0);
            }
        }
    }

    public final boolean g(AbstractC5947b0 abstractC5947b0) {
        if (!(abstractC5947b0 instanceof AbstractC5931M)) {
            h(abstractC5947b0);
            return true;
        }
        AbstractC5931M abstractC5931M = (AbstractC5931M) abstractC5947b0;
        C5785d c5785dO = o(abstractC5931M.f(this));
        if (c5785dO == null) {
            h(abstractC5947b0);
            return true;
        }
        String name = this.f45085b.getClass().getName();
        String strE = c5785dO.e();
        long jF = c5785dO.f();
        int length = name.length();
        StringBuilder sb2 = new StringBuilder(length + 53 + String.valueOf(strE).length() + 2 + String.valueOf(jF).length() + 2);
        sb2.append(name);
        sb2.append(" could not execute call because it requires feature (");
        sb2.append(strE);
        sb2.append(", ");
        sb2.append(jF);
        sb2.append(").");
        Log.w("GoogleApiManager", sb2.toString());
        C5952e c5952e = this.f45083D;
        if (!c5952e.g() || !abstractC5931M.g(this)) {
            abstractC5931M.b(new C5852j(c5785dO));
            return true;
        }
        C5920B c5920b = new C5920B(this.f45086c, c5785dO, null);
        List list = this.f45080A;
        int iIndexOf = list.indexOf(c5920b);
        if (iIndexOf >= 0) {
            C5920B c5920b2 = (C5920B) list.get(iIndexOf);
            c5952e.f().removeMessages(15, c5920b2);
            c5952e.f().sendMessageDelayed(Message.obtain(c5952e.f(), 15, c5920b2), 5000L);
            return false;
        }
        list.add(c5920b);
        c5952e.f().sendMessageDelayed(Message.obtain(c5952e.f(), 15, c5920b), 5000L);
        c5952e.f().sendMessageDelayed(Message.obtain(c5952e.f(), 16, c5920b), 120000L);
        C5783b c5783b = new C5783b(2, null);
        if (e(c5783b)) {
            String strE2 = c5785dO.e();
            long jF2 = c5785dO.f();
            StringBuilder sb3 = new StringBuilder(String.valueOf(strE2).length() + 61 + String.valueOf(jF2).length());
            sb3.append("A dialog should be displayed for missing feature: ");
            sb3.append(strE2);
            sb3.append(", version: ");
            sb3.append(jF2);
            Log.w("GoogleApiManager", sb3.toString());
            return false;
        }
        if (!c5952e.x(c5783b, this.f45090x)) {
            return false;
        }
        String strE3 = c5785dO.e();
        long jF3 = c5785dO.f();
        StringBuilder sb4 = new StringBuilder(String.valueOf(strE3).length() + 55 + String.valueOf(jF3).length());
        sb4.append("Notification displayed for missing feature: ");
        sb4.append(strE3);
        sb4.append(", version: ");
        sb4.append(jF3);
        Log.w("GoogleApiManager", sb4.toString());
        return false;
    }

    public final void h(AbstractC5947b0 abstractC5947b0) {
        abstractC5947b0.c(this.f45087d, A());
        try {
            abstractC5947b0.d(this);
        } catch (DeadObjectException unused) {
            X(1);
            this.f45085b.a("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    public final void i(Status status, Exception exc, boolean z10) {
        AbstractC6056k.d(this.f45083D.f());
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f45084a.iterator();
        while (it.hasNext()) {
            AbstractC5947b0 abstractC5947b0 = (AbstractC5947b0) it.next();
            if (!z10 || abstractC5947b0.f45142a == 2) {
                if (status != null) {
                    abstractC5947b0.a(status);
                } else {
                    abstractC5947b0.b(exc);
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void H(Status status) {
        AbstractC6056k.d(this.f45083D.f());
        i(status, null, false);
    }

    public final void k() {
        if (this.f45092z) {
            C5952e c5952e = this.f45083D;
            C5946b c5946b = this.f45086c;
            c5952e.f().removeMessages(11, c5946b);
            c5952e.f().removeMessages(9, c5946b);
            this.f45092z = false;
        }
    }

    public final void l() {
        C5946b c5946b = this.f45086c;
        C5952e c5952e = this.f45083D;
        c5952e.f().removeMessages(12, c5946b);
        c5952e.f().sendMessageDelayed(c5952e.f().obtainMessage(12, c5946b), c5952e.C());
    }

    public final boolean m(boolean z10) {
        AbstractC6056k.d(this.f45083D.f());
        C5843a.f fVar = this.f45085b;
        if (!fVar.isConnected() || !this.f45089w.isEmpty()) {
            return false;
        }
        if (!this.f45087d.b()) {
            fVar.a("Timing out service connection.");
            return true;
        }
        if (!z10) {
            return false;
        }
        l();
        return false;
    }

    public final void n(C5783b c5783b) {
        Set set = this.f45088v;
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            set.clear();
            return;
        }
        android.support.v4.media.session.a.a(it.next());
        if (AbstractC6055j.a(c5783b, C5783b.f44145f)) {
            this.f45085b.c();
        }
        throw null;
    }

    public final C5785d o(C5785d[] c5785dArr) {
        if (c5785dArr != null && c5785dArr.length != 0) {
            C5785d[] c5785dArrN = this.f45085b.n();
            if (c5785dArrN == null) {
                c5785dArrN = new C5785d[0];
            }
            C2777a c2777a = new C2777a(c5785dArrN.length);
            for (C5785d c5785d : c5785dArrN) {
                c2777a.put(c5785d.e(), Long.valueOf(c5785d.f()));
            }
            for (C5785d c5785d2 : c5785dArr) {
                Long l10 = (Long) c2777a.get(c5785d2.e());
                if (l10 == null || l10.longValue() < c5785d2.f()) {
                    return c5785d2;
                }
            }
        }
        return null;
    }

    public final void p(C5783b c5783b) {
        AbstractC6056k.d(this.f45083D.f());
        C5843a.f fVar = this.f45085b;
        String name = fVar.getClass().getName();
        String strValueOf = String.valueOf(c5783b);
        StringBuilder sb2 = new StringBuilder(name.length() + 25 + strValueOf.length());
        sb2.append("onSignInFailed for ");
        sb2.append(name);
        sb2.append(" with ");
        sb2.append(strValueOf);
        fVar.a(sb2.toString());
        q(c5783b, null);
    }

    public final void q(C5783b c5783b, Exception exc) {
        C5952e c5952e = this.f45083D;
        AbstractC6056k.d(c5952e.f());
        zacm zacmVar = this.f45091y;
        if (zacmVar != null) {
            zacmVar.K6();
        }
        v();
        c5952e.b().c();
        n(c5783b);
        if ((this.f45085b instanceof C6316f) && c5783b.e() != 24) {
            c5952e.D(true);
            c5952e.f().sendMessageDelayed(c5952e.f().obtainMessage(19), 300000L);
        }
        if (c5783b.e() == 4) {
            H(C5952e.f45153q);
            return;
        }
        if (c5783b.e() == 25) {
            H(C5952e.j(this.f45086c, c5783b));
            return;
        }
        Queue queue = this.f45084a;
        if (queue.isEmpty()) {
            this.f45081B = c5783b;
            return;
        }
        if (exc != null) {
            AbstractC6056k.d(c5952e.f());
            i(null, exc, false);
            return;
        }
        if (!c5952e.g()) {
            H(C5952e.j(this.f45086c, c5783b));
            return;
        }
        C5946b c5946b = this.f45086c;
        i(C5952e.j(c5946b, c5783b), null, true);
        if (queue.isEmpty() || e(c5783b) || c5952e.x(c5783b, this.f45090x)) {
            return;
        }
        if (c5783b.e() == 18) {
            this.f45092z = true;
        }
        if (this.f45092z) {
            c5952e.f().sendMessageDelayed(Message.obtain(c5952e.f(), 9, c5946b), 5000L);
        } else {
            H(C5952e.j(c5946b, c5783b));
        }
    }

    public final void r(AbstractC5947b0 abstractC5947b0) {
        AbstractC6056k.d(this.f45083D.f());
        if (this.f45085b.isConnected()) {
            if (g(abstractC5947b0)) {
                l();
                return;
            } else {
                this.f45084a.add(abstractC5947b0);
                return;
            }
        }
        this.f45084a.add(abstractC5947b0);
        C5783b c5783b = this.f45081B;
        if (c5783b == null || !c5783b.k()) {
            z();
        } else {
            q(this.f45081B, null);
        }
    }

    public final void s() {
        AbstractC6056k.d(this.f45083D.f());
        H(C5952e.f45152p);
        this.f45087d.c();
        for (C5960i.a aVar : (C5960i.a[]) this.f45089w.keySet().toArray(new C5960i.a[0])) {
            r(new C5945a0(aVar, new C2878l()));
        }
        n(new C5783b(4));
        C5843a.f fVar = this.f45085b;
        if (fVar.isConnected()) {
            fVar.l(new C5980z(this));
        }
    }

    public final C5843a.f t() {
        return this.f45085b;
    }

    public final Map u() {
        return this.f45089w;
    }

    public final void v() {
        AbstractC6056k.d(this.f45083D.f());
        this.f45081B = null;
    }

    public final void w() {
        AbstractC6056k.d(this.f45083D.f());
        if (this.f45092z) {
            z();
        }
    }

    public final void x() {
        C5952e c5952e = this.f45083D;
        AbstractC6056k.d(c5952e.f());
        if (this.f45092z) {
            k();
            H(c5952e.a().g(c5952e.F()) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f45085b.a("Timing out connection while resuming.");
        }
    }

    public final boolean y() {
        return m(true);
    }

    public final void z() {
        C5952e c5952e = this.f45083D;
        AbstractC6056k.d(c5952e.f());
        C5843a.f fVar = this.f45085b;
        if (fVar.isConnected() || fVar.b()) {
            return;
        }
        try {
            int iA = c5952e.b().a(c5952e.F(), fVar);
            if (iA == 0) {
                C5922D c5922d = new C5922D(c5952e, fVar, this.f45086c);
                if (fVar.h()) {
                    ((zacm) AbstractC6056k.l(this.f45091y)).J6(c5922d);
                }
                try {
                    fVar.d(c5922d);
                    return;
                } catch (SecurityException e10) {
                    q(new C5783b(10), e10);
                    return;
                }
            }
            C5783b c5783b = new C5783b(iA, null);
            String name = this.f45085b.getClass().getName();
            String string = c5783b.toString();
            StringBuilder sb2 = new StringBuilder(name.length() + 35 + string.length());
            sb2.append("The service for ");
            sb2.append(name);
            sb2.append(" is not available: ");
            sb2.append(string);
            Log.w("GoogleApiManager", sb2.toString());
            q(c5783b, null);
        } catch (IllegalStateException e11) {
            q(new C5783b(10), e11);
        }
    }
}
