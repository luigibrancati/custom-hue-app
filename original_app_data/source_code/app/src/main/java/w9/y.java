package w9;

import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class y extends Number {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46440a;

    public y(String str) {
        this.f46440a = str;
    }

    public final BigDecimal a() {
        return AbstractC6171A.b(this.f46440a);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f46440a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            return this.f46440a.equals(((y) obj).f46440a);
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f46440a);
    }

    public int hashCode() {
        return this.f46440a.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f46440a);
            } catch (NumberFormatException unused) {
                return this.a().intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.f46440a);
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f46440a);
        } catch (NumberFormatException unused) {
            return a().longValue();
        }
    }

    public String toString() {
        return this.f46440a;
    }
}
