package d3;

import Od.F;
import ae.AbstractC2693g;
import ae.InterfaceC2687a;
import fc.C4022e;
import gc.C4179C;
import java.util.Iterator;
import k3.InterfaceC4792b;
import k3.InterfaceC4794d;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class l implements InterfaceC4792b, InterfaceC2687a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4792b f33031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2687a f33032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC4992i f33033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Throwable f33034d;

    public l(InterfaceC4792b delegate, InterfaceC2687a lock) {
        AbstractC4862t.e(delegate, "delegate");
        AbstractC4862t.e(lock, "lock");
        this.f33031a = delegate;
        this.f33032b = lock;
    }

    @Override // ae.InterfaceC2687a
    public Object a(Object obj, InterfaceC4988e interfaceC4988e) {
        return this.f33032b.a(obj, interfaceC4988e);
    }

    @Override // k3.InterfaceC4792b
    public InterfaceC4794d a1(String sql) {
        AbstractC4862t.e(sql, "sql");
        return this.f33031a.a1(sql);
    }

    public final void b(StringBuilder builder) {
        AbstractC4862t.e(builder, "builder");
        if (this.f33033c == null && this.f33034d == null) {
            builder.append("\t\tStatus: Free connection");
            builder.append('\n');
            return;
        }
        builder.append("\t\tStatus: Acquired connection");
        builder.append('\n');
        InterfaceC4992i interfaceC4992i = this.f33033c;
        if (interfaceC4992i != null) {
            builder.append("\t\tCoroutine: " + interfaceC4992i);
            builder.append('\n');
        }
        Throwable th = this.f33034d;
        if (th != null) {
            builder.append("\t\tAcquired:");
            builder.append('\n');
            Iterator it = C4179C.b0(F.r0(C4022e.b(th)), 1).iterator();
            while (it.hasNext()) {
                builder.append("\t\t" + ((String) it.next()));
                builder.append('\n');
            }
        }
    }

    public final l c(InterfaceC4992i context) {
        AbstractC4862t.e(context, "context");
        this.f33033c = context;
        this.f33034d = new Throwable();
        return this;
    }

    @Override // k3.InterfaceC4792b, java.lang.AutoCloseable
    public void close() {
        this.f33031a.close();
    }

    public final l d() {
        this.f33033c = null;
        this.f33034d = null;
        return this;
    }

    @Override // ae.InterfaceC2687a
    public boolean f(Object obj) {
        return this.f33032b.f(obj);
    }

    @Override // ae.InterfaceC2687a
    public boolean g() {
        return this.f33032b.g();
    }

    @Override // ae.InterfaceC2687a
    public void h(Object obj) {
        this.f33032b.h(obj);
    }

    public String toString() {
        return this.f33031a.toString();
    }

    public /* synthetic */ l(InterfaceC4792b interfaceC4792b, InterfaceC2687a interfaceC2687a, int i10, AbstractC4854k abstractC4854k) {
        this(interfaceC4792b, (i10 & 2) != 0 ? AbstractC2693g.b(false, 1, null) : interfaceC2687a);
    }
}
