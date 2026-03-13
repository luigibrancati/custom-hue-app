package je;

import ce.InterfaceC3118a;
import ce.g;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.T;
import vc.l;

/* JADX INFO: renamed from: je.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4770a extends AbstractC4771b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f39180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f39181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f39182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f39183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f39184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f39185f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4770a(Map class2ContextualFactory, Map polyBase2Serializers, Map polyBase2DefaultSerializerProvider, Map polyBase2NamedSerializers, Map polyBase2DefaultDeserializerProvider, boolean z10) {
        super(null);
        AbstractC4862t.e(class2ContextualFactory, "class2ContextualFactory");
        AbstractC4862t.e(polyBase2Serializers, "polyBase2Serializers");
        AbstractC4862t.e(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        AbstractC4862t.e(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        AbstractC4862t.e(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f39180a = class2ContextualFactory;
        this.f39181b = polyBase2Serializers;
        this.f39182c = polyBase2DefaultSerializerProvider;
        this.f39183d = polyBase2NamedSerializers;
        this.f39184e = polyBase2DefaultDeserializerProvider;
        this.f39185f = z10;
    }

    @Override // je.AbstractC4771b
    public ce.b a(Cc.d kClass, List typeArgumentsSerializers) {
        AbstractC4862t.e(kClass, "kClass");
        AbstractC4862t.e(typeArgumentsSerializers, "typeArgumentsSerializers");
        android.support.v4.media.session.a.a(this.f39180a.get(kClass));
        return null;
    }

    @Override // je.AbstractC4771b
    public InterfaceC3118a c(Cc.d baseClass, String str) {
        AbstractC4862t.e(baseClass, "baseClass");
        Map map = (Map) this.f39183d.get(baseClass);
        ce.b bVar = map != null ? (ce.b) map.get(str) : null;
        if (!(bVar instanceof ce.b)) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        Object obj = this.f39184e.get(baseClass);
        l lVar = T.m(obj, 1) ? (l) obj : null;
        if (lVar != null) {
            return (InterfaceC3118a) lVar.invoke(str);
        }
        return null;
    }

    @Override // je.AbstractC4771b
    public g d(Cc.d baseClass, Object value) {
        AbstractC4862t.e(baseClass, "baseClass");
        AbstractC4862t.e(value, "value");
        if (!baseClass.e(value)) {
            return null;
        }
        Map map = (Map) this.f39181b.get(baseClass);
        ce.b bVar = map != null ? (ce.b) map.get(M.b(value.getClass())) : null;
        ce.b bVar2 = bVar instanceof g ? bVar : null;
        if (bVar2 != null) {
            return bVar2;
        }
        Object obj = this.f39182c.get(baseClass);
        l lVar = T.m(obj, 1) ? (l) obj : null;
        if (lVar != null) {
            return (g) lVar.invoke(value);
        }
        return null;
    }
}
