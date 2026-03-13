package Nd;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f10631a;

    public a(h sequence) {
        AbstractC4862t.e(sequence, "sequence");
        this.f10631a = new AtomicReference(sequence);
    }

    @Override // Nd.h
    public Iterator iterator() {
        h hVar = (h) this.f10631a.getAndSet(null);
        if (hVar != null) {
            return hVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
