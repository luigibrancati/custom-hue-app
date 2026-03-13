package Ge;

import Fe.A;
import Fe.AbstractC0849k;
import Fe.C0848j;
import gc.C4199l;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {
    public static final void a(AbstractC0849k abstractC0849k, A dir, boolean z10) {
        AbstractC4862t.e(abstractC0849k, "<this>");
        AbstractC4862t.e(dir, "dir");
        C4199l c4199l = new C4199l();
        for (A aU = dir; aU != null && !abstractC0849k.j(aU); aU = aU.u()) {
            c4199l.addFirst(aU);
        }
        if (z10 && c4199l.isEmpty()) {
            throw new IOException(dir + " already exists.");
        }
        Iterator<E> it = c4199l.iterator();
        while (it.hasNext()) {
            abstractC0849k.f((A) it.next());
        }
    }

    public static final boolean b(AbstractC0849k abstractC0849k, A path) {
        AbstractC4862t.e(abstractC0849k, "<this>");
        AbstractC4862t.e(path, "path");
        return abstractC0849k.m(path) != null;
    }

    public static final C0848j c(AbstractC0849k abstractC0849k, A path) throws FileNotFoundException {
        AbstractC4862t.e(abstractC0849k, "<this>");
        AbstractC4862t.e(path, "path");
        C0848j c0848jM = abstractC0849k.m(path);
        if (c0848jM != null) {
            return c0848jM;
        }
        throw new FileNotFoundException("no such file: " + path);
    }
}
