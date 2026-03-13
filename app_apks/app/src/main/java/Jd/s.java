package Jd;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f6488a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f6489b = new AtomicInteger(0);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements vc.l {
        public a() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(Cc.d it) {
            AbstractC4862t.e(it, "it");
            return Integer.valueOf(s.this.f6489b.getAndIncrement());
        }
    }

    public abstract int b(ConcurrentHashMap concurrentHashMap, Cc.d dVar, vc.l lVar);

    public final n c(Cc.d kClass) {
        AbstractC4862t.e(kClass, "kClass");
        return new n(kClass, d(kClass));
    }

    public final int d(Cc.d kClass) {
        AbstractC4862t.e(kClass, "kClass");
        return b(this.f6488a, kClass, new a());
    }

    public final Collection e() {
        Collection collectionValues = this.f6488a.values();
        AbstractC4862t.d(collectionValues, "idPerType.values");
        return collectionValues;
    }
}
