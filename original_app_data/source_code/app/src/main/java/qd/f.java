package qd;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kd.b f43436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43437b;

    public f(kd.b classId, int i10) {
        AbstractC4862t.e(classId, "classId");
        this.f43436a = classId;
        this.f43437b = i10;
    }

    public final kd.b a() {
        return this.f43436a;
    }

    public final int b() {
        return this.f43437b;
    }

    public final int c() {
        return this.f43437b;
    }

    public final kd.b d() {
        return this.f43436a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return AbstractC4862t.a(this.f43436a, fVar.f43436a) && this.f43437b == fVar.f43437b;
    }

    public int hashCode() {
        return (this.f43436a.hashCode() * 31) + Integer.hashCode(this.f43437b);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f43437b;
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("kotlin/Array<");
        }
        sb2.append(this.f43436a);
        int i12 = this.f43437b;
        for (int i13 = 0; i13 < i12; i13++) {
            sb2.append(">");
        }
        String string = sb2.toString();
        AbstractC4862t.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
