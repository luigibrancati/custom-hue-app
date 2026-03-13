package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import uc.C6018b;

/* JADX INFO: renamed from: kotlin.jvm.internal.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4849f implements Cc.c, Serializable {
    public static final Object NO_RECEIVER = a.f39788a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient Cc.c reflected;
    private final String signature;

    /* JADX INFO: renamed from: kotlin.jvm.internal.f$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f39788a = new a();
    }

    public AbstractC4849f() {
        this(NO_RECEIVER);
    }

    @Override // Cc.c
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // Cc.c
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public Cc.c compute() {
        Cc.c cVar = this.reflected;
        if (cVar != null) {
            return cVar;
        }
        Cc.c cVarComputeReflected = computeReflected();
        this.reflected = cVarComputeReflected;
        return cVarComputeReflected;
    }

    public abstract Cc.c computeReflected();

    @Override // Cc.b
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // Cc.c
    public String getName() {
        return this.name;
    }

    public Cc.g getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? M.c(cls) : M.b(cls);
    }

    @Override // Cc.c
    public List<Cc.k> getParameters() {
        return getReflected().getParameters();
    }

    public Cc.c getReflected() {
        Cc.c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute;
        }
        throw new C6018b();
    }

    @Override // Cc.c
    public Cc.p getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // Cc.c
    public List<Cc.q> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // Cc.c
    public Cc.t getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // Cc.c
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // Cc.c
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // Cc.c
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    public AbstractC4849f(Object obj) {
        this(obj, null, null, null, false);
    }

    public AbstractC4849f(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }
}
