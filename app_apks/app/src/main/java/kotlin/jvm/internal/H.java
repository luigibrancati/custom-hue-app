package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class H extends AbstractC4849f implements Cc.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39772a;

    public H() {
        this.f39772a = false;
    }

    @Override // kotlin.jvm.internal.AbstractC4849f
    public Cc.c compute() {
        return this.f39772a ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof H) {
            H h10 = (H) obj;
            return getOwner().equals(h10.getOwner()) && getName().equals(h10.getName()) && getSignature().equals(h10.getSignature()) && AbstractC4862t.a(getBoundReceiver(), h10.getBoundReceiver());
        }
        if (obj instanceof Cc.l) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // kotlin.jvm.internal.AbstractC4849f
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Cc.l getReflected() {
        if (this.f39772a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (Cc.l) super.getReflected();
    }

    public String toString() {
        Cc.c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public H(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f39772a = (i10 & 2) == 2;
    }
}
