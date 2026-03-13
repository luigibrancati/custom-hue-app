package ea;

import Jb.g;

/* JADX INFO: renamed from: ea.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C3973a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f33869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f33870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33871d;

    /* JADX INFO: renamed from: ea.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface InterfaceC0427a extends g {
        @Override // Jb.g
        boolean test(Object obj);
    }

    public C3973a(int i10) {
        this.f33868a = i10;
        Object[] objArr = new Object[i10 + 1];
        this.f33869b = objArr;
        this.f33870c = objArr;
    }

    public void a(d dVar) {
        int i10 = this.f33868a;
        for (Object[] objArr = this.f33869b; objArr != null; objArr = objArr[i10]) {
            for (int i11 = 0; i11 < i10; i11++) {
                Object obj = objArr[i11];
                if (obj == null) {
                    break;
                }
                dVar.accept(obj);
            }
        }
    }

    public void b(Object obj) {
        int i10 = this.f33868a;
        int i11 = this.f33871d;
        if (i11 == i10) {
            Object[] objArr = new Object[i10 + 1];
            this.f33870c[i10] = objArr;
            this.f33870c = objArr;
            i11 = 0;
        }
        this.f33870c[i11] = obj;
        this.f33871d = i11 + 1;
    }

    public void c(InterfaceC0427a interfaceC0427a) {
        int i10;
        int i11 = this.f33868a;
        for (Object[] objArr = this.f33869b; objArr != null; objArr = objArr[i11]) {
            while (i10 < i11) {
                Object obj = objArr[i10];
                i10 = (obj == null || interfaceC0427a.test(obj)) ? 0 : i10 + 1;
            }
        }
    }
}
