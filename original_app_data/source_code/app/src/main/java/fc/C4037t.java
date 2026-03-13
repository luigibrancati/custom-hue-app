package fc;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: fc.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4037t implements InterfaceC4028k, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f34277d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f34278e = AtomicReferenceFieldUpdater.newUpdater(C4037t.class, Object.class, "b");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile InterfaceC6082a f34279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f34280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f34281c;

    /* JADX INFO: renamed from: fc.t$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public C4037t(InterfaceC6082a initializer) {
        AbstractC4862t.e(initializer, "initializer");
        this.f34279a = initializer;
        C4011D c4011d = C4011D.f34248a;
        this.f34280b = c4011d;
        this.f34281c = c4011d;
    }

    @Override // fc.InterfaceC4028k
    public Object getValue() {
        Object obj = this.f34280b;
        C4011D c4011d = C4011D.f34248a;
        if (obj != c4011d) {
            return obj;
        }
        InterfaceC6082a interfaceC6082a = this.f34279a;
        if (interfaceC6082a != null) {
            Object objInvoke = interfaceC6082a.invoke();
            if (B0.b.a(f34278e, this, c4011d, objInvoke)) {
                this.f34279a = null;
                return objInvoke;
            }
        }
        return this.f34280b;
    }

    @Override // fc.InterfaceC4028k
    public boolean isInitialized() {
        return this.f34280b != C4011D.f34248a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
