package Rd;

import Rd.AbstractC2149q0;
import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC4854k;
import lc.AbstractC4985b;
import lc.InterfaceC4992i;

/* JADX INFO: renamed from: Rd.q0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2149q0 extends I implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15203b = new a(null);

    /* JADX INFO: renamed from: Rd.q0$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC4985b {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public static final AbstractC2149q0 d(InterfaceC4992i.b bVar) {
            if (bVar instanceof AbstractC2149q0) {
                return (AbstractC2149q0) bVar;
            }
            return null;
        }

        public a() {
            super(I.f15136a, new vc.l() { // from class: Rd.p0
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return AbstractC2149q0.a.d((InterfaceC4992i.b) obj);
                }
            });
        }
    }

    public abstract Executor J0();
}
