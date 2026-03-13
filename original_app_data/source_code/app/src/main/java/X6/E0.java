package X6;

import android.os.Bundle;
import b0.C2777a;
import java.util.Iterator;
import java.util.Map;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class E0 extends G1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f18232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f18233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18234d;

    public E0(C2416j3 c2416j3) {
        super(c2416j3);
        this.f18233c = new C2777a();
        this.f18232b = new C2777a();
    }

    public final void i(String str, long j10) {
        if (str == null || str.length() == 0) {
            this.f18400a.a().o().a("Ad unit id must be a non-empty string");
        } else {
            this.f18400a.b().t(new RunnableC2340a(this, str, j10));
        }
    }

    public final void j(String str, long j10) {
        if (str == null || str.length() == 0) {
            this.f18400a.a().o().a("Ad unit id must be a non-empty string");
        } else {
            this.f18400a.b().t(new B(this, str, j10));
        }
    }

    public final void k(long j10) {
        C2362c5 c2362c5Q = this.f18400a.I().q(false);
        Map map = this.f18232b;
        for (String str : map.keySet()) {
            p(str, j10 - ((Long) map.get(str)).longValue(), c2362c5Q);
        }
        if (!map.isEmpty()) {
            o(j10 - this.f18234d, c2362c5Q);
        }
        n(j10);
    }

    public final /* synthetic */ void l(String str, long j10) {
        h();
        AbstractC6056k.f(str);
        Map map = this.f18233c;
        if (map.isEmpty()) {
            this.f18234d = j10;
        }
        Integer num = (Integer) map.get(str);
        if (num != null) {
            map.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (map.size() >= 100) {
            this.f18400a.a().r().a("Too many ads visible");
        } else {
            map.put(str, 1);
            this.f18232b.put(str, Long.valueOf(j10));
        }
    }

    public final /* synthetic */ void m(String str, long j10) {
        h();
        AbstractC6056k.f(str);
        Map map = this.f18233c;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            this.f18400a.a().o().b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        C2362c5 c2362c5Q = this.f18400a.I().q(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            map.put(str, Integer.valueOf(iIntValue));
            return;
        }
        map.remove(str);
        Map map2 = this.f18232b;
        Long l10 = (Long) map2.get(str);
        if (l10 == null) {
            this.f18400a.a().o().a("First ad unit exposure time was never set");
        } else {
            long jLongValue = j10 - l10.longValue();
            map2.remove(str);
            p(str, jLongValue, c2362c5Q);
        }
        if (map.isEmpty()) {
            long j11 = this.f18234d;
            if (j11 == 0) {
                this.f18400a.a().o().a("First ad exposure time was never set");
            } else {
                o(j10 - j11, c2362c5Q);
                this.f18234d = 0L;
            }
        }
    }

    public final void o(long j10, C2362c5 c2362c5) {
        if (c2362c5 == null) {
            this.f18400a.a().w().a("Not logging ad exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            this.f18400a.a().w().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j10);
        a7.k0(c2362c5, bundle, true);
        this.f18400a.B().t("am", "_xa", bundle);
    }

    public final void p(String str, long j10, C2362c5 c2362c5) {
        if (c2362c5 == null) {
            this.f18400a.a().w().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            this.f18400a.a().w().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j10);
        a7.k0(c2362c5, bundle, true);
        this.f18400a.B().t("am", "_xu", bundle);
    }

    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void n(long j10) {
        Map map = this.f18232b;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            map.put((String) it.next(), Long.valueOf(j10));
        }
        if (map.isEmpty()) {
            return;
        }
        this.f18234d = j10;
    }
}
