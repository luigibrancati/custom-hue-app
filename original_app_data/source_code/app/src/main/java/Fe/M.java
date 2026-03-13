package Fe;

import Fe.A;
import fc.C4022e;
import gc.C4179C;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class M extends AbstractC0849k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f4085i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final A f4086j = A.a.e(A.f4048b, "/", false, 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final A f4087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractC0849k f4088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f4089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f4090h;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public M(A zipPath, AbstractC0849k fileSystem, Map entries, String str) {
        AbstractC4862t.e(zipPath, "zipPath");
        AbstractC4862t.e(fileSystem, "fileSystem");
        AbstractC4862t.e(entries, "entries");
        this.f4087e = zipPath;
        this.f4088f = fileSystem;
        this.f4089g = entries;
        this.f4090h = str;
    }

    private final List s(A a10, boolean z10) throws IOException {
        Ge.i iVar = (Ge.i) this.f4089g.get(r(a10));
        if (iVar != null) {
            return C4179C.V0(iVar.c());
        }
        if (!z10) {
            return null;
        }
        throw new IOException("not a directory: " + a10);
    }

    @Override // Fe.AbstractC0849k
    public H b(A file, boolean z10) throws IOException {
        AbstractC4862t.e(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // Fe.AbstractC0849k
    public void c(A source, A target) throws IOException {
        AbstractC4862t.e(source, "source");
        AbstractC4862t.e(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // Fe.AbstractC0849k
    public void g(A dir, boolean z10) throws IOException {
        AbstractC4862t.e(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // Fe.AbstractC0849k
    public void i(A path, boolean z10) throws IOException {
        AbstractC4862t.e(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // Fe.AbstractC0849k
    public List k(A dir) throws IOException {
        AbstractC4862t.e(dir, "dir");
        List listS = s(dir, true);
        AbstractC4862t.b(listS);
        return listS;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060 A[Catch: all -> 0x004e, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x004e, blocks: (B:8:0x0027, B:34:0x0060, B:22:0x004a, B:9:0x0033, B:19:0x0045), top: B:60:0x0027, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    @Override // Fe.AbstractC0849k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Fe.C0848j m(Fe.A r14) throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.AbstractC4862t.e(r14, r0)
            Fe.A r14 = r13.r(r14)
            java.util.Map r0 = r13.f4089g
            java.lang.Object r14 = r0.get(r14)
            Ge.i r14 = (Ge.i) r14
            r1 = 0
            if (r14 != 0) goto L15
            return r1
        L15:
            long r2 = r14.i()
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L72
            Fe.k r0 = r13.f4088f
            Fe.A r13 = r13.f4087e
            Fe.i r13 = r0.n(r13)
            long r2 = r14.i()     // Catch: java.lang.Throwable -> L4e
            Fe.J r0 = r13.k(r2)     // Catch: java.lang.Throwable -> L4e
            Fe.g r2 = Fe.v.c(r0)     // Catch: java.lang.Throwable -> L4e
            Ge.i r14 = Ge.j.j(r2, r14)     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L3f
            r2.close()     // Catch: java.lang.Throwable -> L3d
            goto L3f
        L3d:
            r0 = move-exception
            goto L53
        L3f:
            r0 = r1
            goto L53
        L41:
            r0 = move-exception
            r14 = r0
            if (r2 == 0) goto L51
            r2.close()     // Catch: java.lang.Throwable -> L49
            goto L51
        L49:
            r0 = move-exception
            fc.C4022e.a(r14, r0)     // Catch: java.lang.Throwable -> L4e
            goto L51
        L4e:
            r0 = move-exception
            r14 = r0
            goto L61
        L51:
            r0 = r14
            r14 = r1
        L53:
            if (r0 != 0) goto L60
            if (r13 == 0) goto L5e
            r13.close()     // Catch: java.lang.Throwable -> L5b
            goto L5e
        L5b:
            r0 = move-exception
            r13 = r0
            goto L6e
        L5e:
            r13 = r1
            goto L6e
        L60:
            throw r0     // Catch: java.lang.Throwable -> L4e
        L61:
            if (r13 == 0) goto L6c
            r13.close()     // Catch: java.lang.Throwable -> L67
            goto L6c
        L67:
            r0 = move-exception
            r13 = r0
            fc.C4022e.a(r14, r13)
        L6c:
            r13 = r14
            r14 = r1
        L6e:
            if (r13 != 0) goto L71
            goto L72
        L71:
            throw r13
        L72:
            Fe.j r2 = new Fe.j
            boolean r13 = r14.k()
            r3 = r13 ^ 1
            boolean r4 = r14.k()
            boolean r13 = r14.k()
            if (r13 == 0) goto L86
        L84:
            r6 = r1
            goto L8f
        L86:
            long r0 = r14.j()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            goto L84
        L8f:
            java.lang.Long r7 = r14.f()
            java.lang.Long r8 = r14.h()
            java.lang.Long r9 = r14.g()
            r11 = 128(0x80, float:1.8E-43)
            r12 = 0
            r5 = 0
            r10 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Fe.M.m(Fe.A):Fe.j");
    }

    @Override // Fe.AbstractC0849k
    public AbstractC0847i n(A file) {
        AbstractC4862t.e(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // Fe.AbstractC0849k
    public H p(A file, boolean z10) throws IOException {
        AbstractC4862t.e(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // Fe.AbstractC0849k
    public J q(A file) throws FileNotFoundException {
        AbstractC4862t.e(file, "file");
        Ge.i iVar = (Ge.i) this.f4089g.get(r(file));
        if (iVar == null) {
            throw new FileNotFoundException("no such file: " + file);
        }
        AbstractC0847i abstractC0847iN = this.f4088f.n(this.f4087e);
        InterfaceC0845g th = null;
        try {
            InterfaceC0845g interfaceC0845gC = v.c(abstractC0847iN.k(iVar.i()));
            if (abstractC0847iN != null) {
                try {
                    abstractC0847iN.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            th = th;
            th = interfaceC0845gC;
        } catch (Throwable th3) {
            th = th3;
            if (abstractC0847iN != null) {
                try {
                    abstractC0847iN.close();
                } catch (Throwable th4) {
                    C4022e.a(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        Ge.j.m(th);
        return iVar.e() == 0 ? new Ge.g(th, iVar.j(), true) : new Ge.g(new q(new Ge.g(th, iVar.d(), true), new Inflater(true)), iVar.j(), false);
    }

    public final A r(A a10) {
        return f4086j.w(a10, true);
    }
}
