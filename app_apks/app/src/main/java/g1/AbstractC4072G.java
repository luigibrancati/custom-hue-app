package g1;

import Rd.InterfaceC2157v;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4992i;

/* JADX INFO: renamed from: g1.G, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4072G {

    /* JADX INFO: renamed from: g1.G$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC4072G {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final vc.p f34815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC2157v f34816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b0 f34817c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final InterfaceC4992i f34818d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(vc.p transform, InterfaceC2157v ack, b0 b0Var, InterfaceC4992i callerContext) {
            super(null);
            AbstractC4862t.e(transform, "transform");
            AbstractC4862t.e(ack, "ack");
            AbstractC4862t.e(callerContext, "callerContext");
            this.f34815a = transform;
            this.f34816b = ack;
            this.f34817c = b0Var;
            this.f34818d = callerContext;
        }

        public final InterfaceC2157v a() {
            return this.f34816b;
        }

        public final InterfaceC4992i b() {
            return this.f34818d;
        }

        public b0 c() {
            return this.f34817c;
        }

        public final vc.p d() {
            return this.f34815a;
        }
    }

    public /* synthetic */ AbstractC4072G(AbstractC4854k abstractC4854k) {
        this();
    }

    public AbstractC4072G() {
    }
}
