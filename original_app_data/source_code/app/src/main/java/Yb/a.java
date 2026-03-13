package Yb;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f19874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f19875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19876d;

    /* JADX INFO: renamed from: Yb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface InterfaceC0251a extends Jb.g {
        @Override // Jb.g
        boolean test(Object obj);
    }

    public a(int i10) {
        this.f19873a = i10;
        Object[] objArr = new Object[i10 + 1];
        this.f19874b = objArr;
        this.f19875c = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0019, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(Eb.p r4) {
        /*
            r3 = this;
            java.lang.Object[] r0 = r3.f19874b
            int r3 = r3.f19873a
        L4:
            r1 = 0
            if (r0 == 0) goto L1e
        L7:
            if (r1 >= r3) goto L19
            r2 = r0[r1]
            if (r2 != 0) goto Le
            goto L19
        Le:
            boolean r2 = Yb.h.b(r2, r4)
            if (r2 == 0) goto L16
            r3 = 1
            return r3
        L16:
            int r1 = r1 + 1
            goto L7
        L19:
            r0 = r0[r3]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Yb.a.a(Eb.p):boolean");
    }

    public void b(Object obj) {
        int i10 = this.f19873a;
        int i11 = this.f19876d;
        if (i11 == i10) {
            Object[] objArr = new Object[i10 + 1];
            this.f19875c[i10] = objArr;
            this.f19875c = objArr;
            i11 = 0;
        }
        this.f19875c[i11] = obj;
        this.f19876d = i11 + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0018, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(Yb.a.InterfaceC0251a r4) {
        /*
            r3 = this;
            java.lang.Object[] r0 = r3.f19874b
            int r3 = r3.f19873a
        L4:
            if (r0 == 0) goto L1d
            r1 = 0
        L7:
            if (r1 >= r3) goto L18
            r2 = r0[r1]
            if (r2 != 0) goto Le
            goto L18
        Le:
            boolean r2 = r4.test(r2)
            if (r2 == 0) goto L15
            goto L1d
        L15:
            int r1 = r1 + 1
            goto L7
        L18:
            r0 = r0[r3]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Yb.a.c(Yb.a$a):void");
    }

    public void d(Object obj) {
        this.f19874b[0] = obj;
    }
}
