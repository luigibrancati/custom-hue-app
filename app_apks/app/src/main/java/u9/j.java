package u9;

import java.io.IOException;
import java.io.StringWriter;
import w9.F;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j {
    @Deprecated
    public j() {
    }

    public boolean c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public g d() {
        if (k()) {
            return (g) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public m e() {
        if (n()) {
            return (m) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public o f() {
        if (p()) {
            return (o) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public String h() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean k() {
        return this instanceof g;
    }

    public boolean l() {
        return this instanceof l;
    }

    public boolean n() {
        return this instanceof m;
    }

    public boolean p() {
        return this instanceof o;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C9.c cVar = new C9.c(stringWriter);
            cVar.a0(t.LENIENT);
            F.b(this, cVar);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
