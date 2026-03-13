package ge;

import fe.InterfaceC4047c;
import fe.InterfaceC4048d;
import fe.InterfaceC4050f;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class T extends AbstractC4223a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ce.b f35681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ce.b f35682b;

    public /* synthetic */ T(ce.b bVar, ce.b bVar2, AbstractC4854k abstractC4854k) {
        this(bVar, bVar2);
    }

    @Override // ce.b, ce.g, ce.InterfaceC3118a
    public abstract ee.e getDescriptor();

    public final ce.b o() {
        return this.f35681a;
    }

    public final ce.b p() {
        return this.f35682b;
    }

    @Override // ge.AbstractC4223a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void i(InterfaceC4047c decoder, Map builder, int i10, int i11) {
        AbstractC4862t.e(decoder, "decoder");
        AbstractC4862t.e(builder, "builder");
        if (i11 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        Bc.d dVarN = Bc.k.n(Bc.k.p(0, i11 * 2), 2);
        int iC = dVarN.c();
        int iD = dVarN.d();
        int iE = dVarN.e();
        if ((iE <= 0 || iC > iD) && (iE >= 0 || iD > iC)) {
            return;
        }
        while (true) {
            j(decoder, i10 + iC, builder, false);
            if (iC == iD) {
                return;
            } else {
                iC += iE;
            }
        }
    }

    @Override // ge.AbstractC4223a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void j(InterfaceC4047c decoder, int i10, Map builder, boolean z10) {
        int iJ;
        AbstractC4862t.e(decoder, "decoder");
        AbstractC4862t.e(builder, "builder");
        Object objC = InterfaceC4047c.C(decoder, getDescriptor(), i10, this.f35681a, null, 8, null);
        if (z10) {
            iJ = decoder.j(getDescriptor());
            if (iJ != i10 + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i10 + ", returned index for value: " + iJ).toString());
            }
        } else {
            iJ = i10 + 1;
        }
        int i11 = iJ;
        builder.put(objC, (!builder.containsKey(objC) || (this.f35682b.getDescriptor().f() instanceof ee.d)) ? InterfaceC4047c.C(decoder, getDescriptor(), i11, this.f35682b, null, 8, null) : decoder.H(getDescriptor(), i11, this.f35682b, gc.Q.j(builder, objC)));
    }

    @Override // ce.g
    public void serialize(InterfaceC4050f encoder, Object obj) {
        AbstractC4862t.e(encoder, "encoder");
        int iG = g(obj);
        ee.e descriptor = getDescriptor();
        InterfaceC4048d interfaceC4048dK = encoder.k(descriptor, iG);
        Iterator itF = f(obj);
        int i10 = 0;
        while (itF.hasNext()) {
            Map.Entry entry = (Map.Entry) itF.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i11 = i10 + 1;
            interfaceC4048dK.E(getDescriptor(), i10, o(), key);
            i10 += 2;
            interfaceC4048dK.E(getDescriptor(), i11, p(), value);
        }
        interfaceC4048dK.c(descriptor);
    }

    public T(ce.b bVar, ce.b bVar2) {
        super(null);
        this.f35681a = bVar;
        this.f35682b = bVar2;
    }
}
