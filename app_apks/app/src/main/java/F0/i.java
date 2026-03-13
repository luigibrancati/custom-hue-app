package F0;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class i extends e implements h {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public e[] f3562w0 = new e[4];

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f3563x0 = 0;

    @Override // F0.h
    public void b(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i10 = this.f3563x0 + 1;
        e[] eVarArr = this.f3562w0;
        if (i10 > eVarArr.length) {
            this.f3562w0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.f3562w0;
        int i11 = this.f3563x0;
        eVarArr2[i11] = eVar;
        this.f3563x0 = i11 + 1;
    }

    @Override // F0.h
    public void c() {
        this.f3563x0 = 0;
        Arrays.fill(this.f3562w0, (Object) null);
    }

    @Override // F0.h
    public void a(f fVar) {
    }
}
