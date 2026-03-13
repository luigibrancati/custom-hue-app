package kotlin.jvm.internal;

/* JADX INFO: renamed from: kotlin.jvm.internal.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4859p extends AbstractC4849f implements InterfaceC4858o, Cc.h {
    private final int arity;
    private final int flags;

    public AbstractC4859p(int i10) {
        this(i10, AbstractC4849f.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.AbstractC4849f
    public Cc.c computeReflected() {
        return M.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4859p) {
            AbstractC4859p abstractC4859p = (AbstractC4859p) obj;
            return getName().equals(abstractC4859p.getName()) && getSignature().equals(abstractC4859p.getSignature()) && this.flags == abstractC4859p.flags && this.arity == abstractC4859p.arity && AbstractC4862t.a(getBoundReceiver(), abstractC4859p.getBoundReceiver()) && AbstractC4862t.a(getOwner(), abstractC4859p.getOwner());
        }
        if (obj instanceof Cc.h) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC4858o
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // Cc.h
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // Cc.h
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // Cc.h
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // Cc.h
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // Cc.h
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        Cc.c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public AbstractC4859p(int i10, Object obj) {
        this(i10, obj, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.AbstractC4849f
    public Cc.h getReflected() {
        return (Cc.h) super.getReflected();
    }

    public AbstractC4859p(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = i11 >> 1;
    }
}
