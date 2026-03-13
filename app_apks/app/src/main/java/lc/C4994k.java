package lc;

import fc.C4035r;
import io.sentry.protocol.FeatureFlag;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import mc.C5046c;
import mc.EnumC5044a;
import nc.InterfaceC5161e;

/* JADX INFO: renamed from: lc.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4994k implements InterfaceC4988e, InterfaceC5161e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f40089b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f40090c = AtomicReferenceFieldUpdater.newUpdater(C4994k.class, Object.class, FeatureFlag.JsonKeys.RESULT);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4988e f40091a;
    private volatile Object result;

    /* JADX INFO: renamed from: lc.k$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public C4994k(InterfaceC4988e delegate, Object obj) {
        AbstractC4862t.e(delegate, "delegate");
        this.f40091a = delegate;
        this.result = obj;
    }

    public final Object a() throws Throwable {
        Object obj = this.result;
        EnumC5044a enumC5044a = EnumC5044a.UNDECIDED;
        if (obj == enumC5044a) {
            if (B0.b.a(f40090c, this, enumC5044a, C5046c.f())) {
                return C5046c.f();
            }
            obj = this.result;
        }
        if (obj == EnumC5044a.RESUMED) {
            return C5046c.f();
        }
        if (obj instanceof C4035r.b) {
            throw ((C4035r.b) obj).f34276a;
        }
        return obj;
    }

    @Override // nc.InterfaceC5161e
    public InterfaceC5161e getCallerFrame() {
        InterfaceC4988e interfaceC4988e = this.f40091a;
        if (interfaceC4988e instanceof InterfaceC5161e) {
            return (InterfaceC5161e) interfaceC4988e;
        }
        return null;
    }

    @Override // lc.InterfaceC4988e
    public InterfaceC4992i getContext() {
        return this.f40091a.getContext();
    }

    @Override // lc.InterfaceC4988e
    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC5044a enumC5044a = EnumC5044a.UNDECIDED;
            if (obj2 == enumC5044a) {
                if (B0.b.a(f40090c, this, enumC5044a, obj)) {
                    return;
                }
            } else {
                if (obj2 != C5046c.f()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (B0.b.a(f40090c, this, C5046c.f(), EnumC5044a.RESUMED)) {
                    this.f40091a.resumeWith(obj);
                    return;
                }
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f40091a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4994k(InterfaceC4988e delegate) {
        this(delegate, EnumC5044a.UNDECIDED);
        AbstractC4862t.e(delegate, "delegate");
    }
}
