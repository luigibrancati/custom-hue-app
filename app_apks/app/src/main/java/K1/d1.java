package K1;

import D1.C0743a;
import D1.D;
import a2.AbstractC2636w;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends AbstractC0984a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7033h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f7034i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f7035j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int[] f7036k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final D1.D[] f7037l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object[] f7038m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final HashMap f7039n;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends AbstractC2636w {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final D.c f7040f;

        public a(D1.D d10) {
            super(d10);
            this.f7040f = new D.c();
        }

        @Override // a2.AbstractC2636w, D1.D
        public D.b g(int i10, D.b bVar, boolean z10) {
            D.b bVarG = super.g(i10, bVar, z10);
            if (super.n(bVarG.f1452c, this.f7040f).f()) {
                bVarG.t(bVar.f1450a, bVar.f1451b, bVar.f1452c, bVar.f1453d, bVar.f1454e, C0743a.f1626g, true);
                return bVarG;
            }
            bVarG.f1455f = true;
            return bVarG;
        }
    }

    public d1(Collection collection, a2.e0 e0Var) {
        this(G(collection), H(collection), e0Var);
    }

    public static D1.D[] G(Collection collection) {
        D1.D[] dArr = new D1.D[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            dArr[i10] = ((L0) it.next()).a();
            i10++;
        }
        return dArr;
    }

    public static Object[] H(Collection collection) {
        Object[] objArr = new Object[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            objArr[i10] = ((L0) it.next()).getUid();
            i10++;
        }
        return objArr;
    }

    @Override // K1.AbstractC0984a
    public int A(int i10) {
        return this.f7036k[i10];
    }

    @Override // K1.AbstractC0984a
    public D1.D D(int i10) {
        return this.f7037l[i10];
    }

    public d1 E(a2.e0 e0Var) {
        D1.D[] dArr = new D1.D[this.f7037l.length];
        int i10 = 0;
        while (true) {
            D1.D[] dArr2 = this.f7037l;
            if (i10 >= dArr2.length) {
                return new d1(dArr, this.f7038m, e0Var);
            }
            dArr[i10] = new a(dArr2[i10]);
            i10++;
        }
    }

    public List F() {
        return Arrays.asList(this.f7037l);
    }

    @Override // D1.D
    public int i() {
        return this.f7034i;
    }

    @Override // D1.D
    public int p() {
        return this.f7033h;
    }

    @Override // K1.AbstractC0984a
    public int s(Object obj) {
        Integer num = (Integer) this.f7039n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // K1.AbstractC0984a
    public int t(int i10) {
        return G1.M.g(this.f7035j, i10 + 1, false, false);
    }

    @Override // K1.AbstractC0984a
    public int u(int i10) {
        return G1.M.g(this.f7036k, i10 + 1, false, false);
    }

    @Override // K1.AbstractC0984a
    public Object x(int i10) {
        return this.f7038m[i10];
    }

    @Override // K1.AbstractC0984a
    public int z(int i10) {
        return this.f7035j[i10];
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(D1.D[] dArr, Object[] objArr, a2.e0 e0Var) {
        super(false, e0Var);
        int i10 = 0;
        int length = dArr.length;
        this.f7037l = dArr;
        this.f7035j = new int[length];
        this.f7036k = new int[length];
        this.f7038m = objArr;
        this.f7039n = new HashMap();
        int length2 = dArr.length;
        int iP = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length2) {
            D1.D d10 = dArr[i10];
            this.f7037l[i12] = d10;
            this.f7036k[i12] = iP;
            this.f7035j[i12] = i11;
            iP += d10.p();
            i11 += this.f7037l[i12].i();
            this.f7039n.put(objArr[i12], Integer.valueOf(i12));
            i10++;
            i12++;
        }
        this.f7033h = iP;
        this.f7034i = i11;
    }
}
