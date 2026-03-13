package l9;

import k9.v;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class q implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39988b;

    public q(String str, int i10) {
        this.f39987a = str;
        this.f39988b = i10;
    }

    @Override // k9.v
    public byte[] a() {
        return this.f39988b == 0 ? k9.o.f39280n : this.f39987a.getBytes(l.f39960e);
    }

    @Override // k9.v
    public String b() {
        if (this.f39988b == 0) {
            return "";
        }
        g();
        return this.f39987a;
    }

    @Override // k9.v
    public long c() {
        if (this.f39988b == 0) {
            return 0L;
        }
        String strF = f();
        try {
            return Long.valueOf(strF).longValue();
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strF, "long"), e10);
        }
    }

    @Override // k9.v
    public double d() {
        if (this.f39988b == 0) {
            return 0.0d;
        }
        String strF = f();
        try {
            return Double.valueOf(strF).doubleValue();
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strF, "double"), e10);
        }
    }

    @Override // k9.v
    public boolean e() {
        if (this.f39988b == 0) {
            return false;
        }
        String strF = f();
        if (l.f39961f.matcher(strF).matches()) {
            return true;
        }
        if (l.f39962g.matcher(strF).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strF, "boolean"));
    }

    public final String f() {
        return b().trim();
    }

    public final void g() {
        if (this.f39987a == null) {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }

    @Override // k9.v
    public int j() {
        return this.f39988b;
    }
}
