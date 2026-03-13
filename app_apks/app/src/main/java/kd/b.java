package kd;

import com.fasterxml.jackson.core.JsonPointer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f39548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f39549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f39550c;

    public b(c cVar, c cVar2, boolean z10) {
        if (cVar == null) {
            a(1);
        }
        if (cVar2 == null) {
            a(2);
        }
        this.f39548a = cVar;
        this.f39549b = cVar2;
        this.f39550c = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r10) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kd.b.a(int):void");
    }

    public static b e(String str) {
        if (str == null) {
            a(11);
        }
        return f(str, false);
    }

    public static b f(String str, boolean z10) {
        String str2;
        if (str == null) {
            a(12);
        }
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            str2 = "";
        } else {
            String strReplace = str.substring(0, iLastIndexOf).replace(JsonPointer.SEPARATOR, '.');
            str = str.substring(iLastIndexOf + 1);
            str2 = strReplace;
        }
        return new b(new c(str2), new c(str), z10);
    }

    public static b m(c cVar) {
        if (cVar == null) {
            a(0);
        }
        return new b(cVar.e(), cVar.g());
    }

    public c b() {
        if (this.f39548a.d()) {
            c cVar = this.f39549b;
            if (cVar == null) {
                a(9);
            }
            return cVar;
        }
        return new c(this.f39548a.b() + "." + this.f39549b.b());
    }

    public String c() {
        if (this.f39548a.d()) {
            String strB = this.f39549b.b();
            if (strB == null) {
                a(13);
            }
            return strB;
        }
        String str = this.f39548a.b().replace('.', JsonPointer.SEPARATOR) + "/" + this.f39549b.b();
        if (str == null) {
            a(14);
        }
        return str;
    }

    public b d(f fVar) {
        if (fVar == null) {
            a(8);
        }
        return new b(h(), this.f39549b.c(fVar), this.f39550c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f39548a.equals(bVar.f39548a) && this.f39549b.equals(bVar.f39549b) && this.f39550c == bVar.f39550c) {
                return true;
            }
        }
        return false;
    }

    public b g() {
        c cVarE = this.f39549b.e();
        if (cVarE.d()) {
            return null;
        }
        return new b(h(), cVarE, this.f39550c);
    }

    public c h() {
        c cVar = this.f39548a;
        if (cVar == null) {
            a(5);
        }
        return cVar;
    }

    public int hashCode() {
        return (((this.f39548a.hashCode() * 31) + this.f39549b.hashCode()) * 31) + Boolean.valueOf(this.f39550c).hashCode();
    }

    public c i() {
        c cVar = this.f39549b;
        if (cVar == null) {
            a(6);
        }
        return cVar;
    }

    public f j() {
        f fVarG = this.f39549b.g();
        if (fVarG == null) {
            a(7);
        }
        return fVarG;
    }

    public boolean k() {
        return this.f39550c;
    }

    public boolean l() {
        return !this.f39549b.e().d();
    }

    public String toString() {
        if (!this.f39548a.d()) {
            return c();
        }
        return "/" + c();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(c cVar, f fVar) {
        this(cVar, c.k(fVar), false);
        if (cVar == null) {
            a(3);
        }
        if (fVar == null) {
            a(4);
        }
    }
}
