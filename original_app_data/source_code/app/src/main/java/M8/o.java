package M8;

import android.content.Context;
import fc.C4015H;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k1.AbstractC4785h;
import k1.AbstractC4788k;
import k1.C4781d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC4785h.a f9404b = AbstractC4788k.f("fire-global");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC4785h.a f9405c = AbstractC4788k.f("fire-count");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC4785h.a f9406d = AbstractC4788k.g("last-used-date");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E8.c f9407a;

    public o(Context context, String str) {
        this.f9407a = new E8.c(context, "FirebaseHeartBeat" + str);
    }

    public static /* synthetic */ C4015H a(long j10, C4781d c4781d) {
        c4781d.l(f9404b, Long.valueOf(j10));
        return null;
    }

    public static /* synthetic */ C4015H b(o oVar, String str, String str2, AbstractC4785h.a aVar, C4781d c4781d) {
        oVar.getClass();
        AbstractC4785h.a aVar2 = f9406d;
        if (((String) E8.d.a(c4781d, aVar2, "")).equals(str)) {
            AbstractC4785h.a aVarI = oVar.i(c4781d, str);
            if (aVarI == null || aVarI.a().equals(str2)) {
                return null;
            }
            oVar.q(c4781d, aVar, str);
            return null;
        }
        AbstractC4785h.a aVar3 = f9405c;
        long jLongValue = ((Long) E8.d.a(c4781d, aVar3, 0L)).longValue();
        if (jLongValue + 1 == 30) {
            jLongValue = oVar.e(c4781d);
        }
        HashSet hashSet = new HashSet((Collection) E8.d.a(c4781d, aVar, new HashSet()));
        hashSet.add(str);
        c4781d.l(aVar, hashSet);
        c4781d.l(aVar3, Long.valueOf(jLongValue + 1));
        c4781d.l(aVar2, str);
        return null;
    }

    public static /* synthetic */ C4015H c(o oVar, C4781d c4781d) {
        oVar.getClass();
        long j10 = 0;
        for (Map.Entry entry : c4781d.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                AbstractC4785h.a aVar = (AbstractC4785h.a) entry.getKey();
                Set set = (Set) entry.getValue();
                String strH = oVar.h(System.currentTimeMillis());
                if (set.contains(strH)) {
                    c4781d.l(aVar, Set.of(strH));
                    j10++;
                } else {
                    c4781d.k(aVar);
                }
            }
        }
        if (j10 == 0) {
            c4781d.k(f9405c);
            return null;
        }
        c4781d.l(f9405c, Long.valueOf(j10));
        return null;
    }

    public static /* synthetic */ C4015H d(o oVar, String str, C4781d c4781d) {
        oVar.getClass();
        c4781d.l(f9406d, str);
        oVar.l(c4781d, str);
        return null;
    }

    public final synchronized long e(C4781d c4781d) {
        long j10;
        try {
            long jLongValue = ((Long) E8.d.a(c4781d, f9405c, 0L)).longValue();
            String strA = "";
            Set hashSet = new HashSet();
            String str = null;
            for (Map.Entry entry : c4781d.a().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set<String> set = (Set) entry.getValue();
                    for (String str2 : set) {
                        if (str == null || str.compareTo(str2) > 0) {
                            strA = ((AbstractC4785h.a) entry.getKey()).a();
                            hashSet = set;
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet2.remove(str);
            c4781d.l(AbstractC4788k.h(strA), hashSet2);
            j10 = jLongValue - 1;
            c4781d.l(f9405c, Long.valueOf(j10));
        } catch (Throwable th) {
            throw th;
        }
        return j10;
    }

    public synchronized void f() {
        this.f9407a.g(new vc.l() { // from class: M8.l
            @Override // vc.l
            public final Object invoke(Object obj) {
                return o.c(this.f9400a, (C4781d) obj);
            }
        });
    }

    public synchronized List g() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String strH = h(System.currentTimeMillis());
            for (Map.Entry entry : this.f9407a.h().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strH);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(p.a(((AbstractC4785h.a) entry.getKey()).a(), new ArrayList(hashSet)));
                    }
                }
            }
            p(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String h(long j10) {
        return new Date(j10).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public final synchronized AbstractC4785h.a i(C4781d c4781d, String str) {
        for (Map.Entry entry : c4781d.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return AbstractC4788k.h(((AbstractC4785h.a) entry.getKey()).a());
                    }
                }
            }
        }
        return null;
    }

    public synchronized boolean j(long j10, long j11) {
        return h(j10).equals(h(j11));
    }

    public synchronized void k() {
        final String strH = h(System.currentTimeMillis());
        this.f9407a.g(new vc.l() { // from class: M8.m
            @Override // vc.l
            public final Object invoke(Object obj) {
                return o.d(this.f9401a, strH, (C4781d) obj);
            }
        });
    }

    public final synchronized void l(C4781d c4781d, String str) {
        try {
            AbstractC4785h.a aVarI = i(c4781d, str);
            if (aVarI == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) E8.d.a(c4781d, aVarI, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                c4781d.k(aVarI);
            } else {
                c4781d.l(aVarI, hashSet);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean m(long j10) {
        return n(f9404b, j10);
    }

    public synchronized boolean n(AbstractC4785h.a aVar, long j10) {
        if (j(((Long) this.f9407a.j(aVar, -1L)).longValue(), j10)) {
            return false;
        }
        this.f9407a.k(aVar, Long.valueOf(j10));
        return true;
    }

    public synchronized void o(long j10, final String str) {
        final String strH = h(j10);
        final AbstractC4785h.a aVarH = AbstractC4788k.h(str);
        this.f9407a.g(new vc.l() { // from class: M8.k
            @Override // vc.l
            public final Object invoke(Object obj) {
                return o.b(this.f9396a, strH, str, aVarH, (C4781d) obj);
            }
        });
    }

    public synchronized void p(final long j10) {
        this.f9407a.g(new vc.l() { // from class: M8.n
            @Override // vc.l
            public final Object invoke(Object obj) {
                return o.a(j10, (C4781d) obj);
            }
        });
    }

    public final synchronized void q(C4781d c4781d, AbstractC4785h.a aVar, String str) {
        l(c4781d, str);
        HashSet hashSet = new HashSet((Collection) E8.d.a(c4781d, aVar, new HashSet()));
        hashSet.add(str);
        c4781d.l(aVar, hashSet);
    }
}
