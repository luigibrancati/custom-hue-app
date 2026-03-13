package ge;

import fe.InterfaceC4047c;
import fe.InterfaceC4048d;
import fe.InterfaceC4050f;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ge.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4252p extends AbstractC4223a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ce.b f35734a;

    public /* synthetic */ AbstractC4252p(ce.b bVar, AbstractC4854k abstractC4854k) {
        this(bVar);
    }

    @Override // ce.b, ce.g, ce.InterfaceC3118a
    public abstract ee.e getDescriptor();

    @Override // ge.AbstractC4223a
    public final void i(InterfaceC4047c decoder, Object obj, int i10, int i11) {
        AbstractC4862t.e(decoder, "decoder");
        if (i11 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        for (int i12 = 0; i12 < i11; i12++) {
            j(decoder, i10 + i12, obj, false);
        }
    }

    @Override // ge.AbstractC4223a
    public void j(InterfaceC4047c decoder, int i10, Object obj, boolean z10) {
        AbstractC4862t.e(decoder, "decoder");
        p(obj, i10, InterfaceC4047c.C(decoder, getDescriptor(), i10, this.f35734a, null, 8, null));
    }

    public abstract void p(Object obj, int i10, Object obj2);

    @Override // ce.g
    public void serialize(InterfaceC4050f encoder, Object obj) {
        AbstractC4862t.e(encoder, "encoder");
        int iG = g(obj);
        ee.e descriptor = getDescriptor();
        InterfaceC4048d interfaceC4048dK = encoder.k(descriptor, iG);
        Iterator itF = f(obj);
        for (int i10 = 0; i10 < iG; i10++) {
            interfaceC4048dK.E(getDescriptor(), i10, this.f35734a, itF.next());
        }
        interfaceC4048dK.c(descriptor);
    }

    public AbstractC4252p(ce.b bVar) {
        super(null);
        this.f35734a = bVar;
    }
}
