package N6;

/* JADX INFO: renamed from: N6.c2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1269c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1308f2 f10197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f10198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public A7 f10199c;

    /* JADX WARN: Method inline analysis failed
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList.removeIf(ArrayList.java:1768)
    	at java.base/java.util.ArrayList.removeIf(ArrayList.java:1743)
    	at jadx.core.dex.instructions.args.SSAVar.removeUse(SSAVar.java:139)
    	at jadx.core.dex.visitors.MarkMethodsForInline.lambda$unbindSsaVars$1(MarkMethodsForInline.java:150)
    	at jadx.core.dex.nodes.InsnNode.visitArgs(InsnNode.java:339)
    	at jadx.core.dex.visitors.MarkMethodsForInline.unbindSsaVars(MarkMethodsForInline.java:145)
    	at jadx.core.dex.visitors.MarkMethodsForInline.addInlineAttr(MarkMethodsForInline.java:140)
    	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:82)
    	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:55)
    	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:38)
     */
    public static /* bridge */ /* synthetic */ C1308f2 d(C1269c2 c1269c2) {
        return c1269c2.f10197a;
    }

    public final C1269c2 a(Integer num) {
        this.f10198b = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final C1269c2 b(A7 a72) {
        this.f10199c = a72;
        return this;
    }

    public final C1269c2 c(C1308f2 c1308f2) {
        this.f10197a = c1308f2;
        return this;
    }

    public final C1334h2 e() {
        return new C1334h2(this, null);
    }
}
