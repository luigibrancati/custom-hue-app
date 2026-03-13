package Fe;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Fe.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0850l extends AbstractC0849k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC0849k f4141e;

    public AbstractC0850l(AbstractC0849k delegate) {
        AbstractC4862t.e(delegate, "delegate");
        this.f4141e = delegate;
    }

    @Override // Fe.AbstractC0849k
    public H b(A file, boolean z10) {
        AbstractC4862t.e(file, "file");
        return this.f4141e.b(r(file, "appendingSink", Constants.FILE), z10);
    }

    @Override // Fe.AbstractC0849k
    public void c(A source, A target) {
        AbstractC4862t.e(source, "source");
        AbstractC4862t.e(target, "target");
        this.f4141e.c(r(source, "atomicMove", "source"), r(target, "atomicMove", "target"));
    }

    @Override // Fe.AbstractC0849k
    public void g(A dir, boolean z10) {
        AbstractC4862t.e(dir, "dir");
        this.f4141e.g(r(dir, "createDirectory", "dir"), z10);
    }

    @Override // Fe.AbstractC0849k
    public void i(A path, boolean z10) {
        AbstractC4862t.e(path, "path");
        this.f4141e.i(r(path, "delete", "path"), z10);
    }

    @Override // Fe.AbstractC0849k
    public List k(A dir) {
        AbstractC4862t.e(dir, "dir");
        List listK = this.f4141e.k(r(dir, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(s((A) it.next(), "list"));
        }
        gc.x.z(arrayList);
        return arrayList;
    }

    @Override // Fe.AbstractC0849k
    public C0848j m(A path) {
        AbstractC4862t.e(path, "path");
        C0848j c0848jM = this.f4141e.m(r(path, "metadataOrNull", "path"));
        if (c0848jM == null) {
            return null;
        }
        return c0848jM.d() == null ? c0848jM : C0848j.b(c0848jM, false, false, s(c0848jM.d(), "metadataOrNull"), null, null, null, null, null, 251, null);
    }

    @Override // Fe.AbstractC0849k
    public AbstractC0847i n(A file) {
        AbstractC4862t.e(file, "file");
        return this.f4141e.n(r(file, "openReadOnly", Constants.FILE));
    }

    @Override // Fe.AbstractC0849k
    public H p(A file, boolean z10) {
        AbstractC4862t.e(file, "file");
        return this.f4141e.p(r(file, "sink", Constants.FILE), z10);
    }

    @Override // Fe.AbstractC0849k
    public J q(A file) {
        AbstractC4862t.e(file, "file");
        return this.f4141e.q(r(file, "source", Constants.FILE));
    }

    public A r(A path, String functionName, String parameterName) {
        AbstractC4862t.e(path, "path");
        AbstractC4862t.e(functionName, "functionName");
        AbstractC4862t.e(parameterName, "parameterName");
        return path;
    }

    public A s(A path, String functionName) {
        AbstractC4862t.e(path, "path");
        AbstractC4862t.e(functionName, "functionName");
        return path;
    }

    public String toString() {
        return kotlin.jvm.internal.M.b(getClass()).l() + '(' + this.f4141e + ')';
    }
}
