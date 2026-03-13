package u9;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
import w9.AbstractC6171A;
import w9.y;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f45473a;

    public o(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f45473a = bool;
    }

    public static boolean z(o oVar) {
        Object obj = oVar.f45473a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public boolean A() {
        return this.f45473a instanceof Number;
    }

    public boolean B() {
        return this.f45473a instanceof String;
    }

    @Override // u9.j
    public boolean c() {
        return y() ? ((Boolean) this.f45473a).booleanValue() : Boolean.parseBoolean(h());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f45473a == null) {
            return oVar.f45473a == null;
        }
        if (z(this) && z(oVar)) {
            return ((this.f45473a instanceof BigInteger) || (oVar.f45473a instanceof BigInteger)) ? s().equals(oVar.s()) : x().longValue() == oVar.x().longValue();
        }
        Object obj2 = this.f45473a;
        if (obj2 instanceof Number) {
            Object obj3 = oVar.f45473a;
            if (obj3 instanceof Number) {
                if ((obj2 instanceof BigDecimal) && (obj3 instanceof BigDecimal)) {
                    return r().compareTo(oVar.r()) == 0;
                }
                double dT = t();
                double dT2 = oVar.t();
                return dT == dT2 || (Double.isNaN(dT) && Double.isNaN(dT2));
            }
        }
        return obj2.equals(oVar.f45473a);
    }

    @Override // u9.j
    public String h() {
        Object obj = this.f45473a;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (A()) {
            return x().toString();
        }
        if (y()) {
            return ((Boolean) this.f45473a).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.f45473a.getClass());
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.f45473a == null) {
            return 31;
        }
        if (z(this)) {
            jDoubleToLongBits = x().longValue();
        } else {
            Object obj = this.f45473a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(x().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public BigDecimal r() {
        Object obj = this.f45473a;
        return obj instanceof BigDecimal ? (BigDecimal) obj : AbstractC6171A.b(h());
    }

    public BigInteger s() {
        Object obj = this.f45473a;
        return obj instanceof BigInteger ? (BigInteger) obj : z(this) ? BigInteger.valueOf(x().longValue()) : AbstractC6171A.c(h());
    }

    public double t() {
        return A() ? x().doubleValue() : Double.parseDouble(h());
    }

    public int v() {
        return A() ? x().intValue() : Integer.parseInt(h());
    }

    public long w() {
        return A() ? x().longValue() : Long.parseLong(h());
    }

    public Number x() {
        Object obj = this.f45473a;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new y((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public boolean y() {
        return this.f45473a instanceof Boolean;
    }

    public o(Number number) {
        Objects.requireNonNull(number);
        this.f45473a = number;
    }

    public o(String str) {
        Objects.requireNonNull(str);
        this.f45473a = str;
    }
}
