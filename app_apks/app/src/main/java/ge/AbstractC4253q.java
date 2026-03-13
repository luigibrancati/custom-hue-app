package ge;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ge.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4253q extends AbstractC4252p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4253q(ce.b element) {
        super(element, null);
        AbstractC4862t.e(element, "element");
    }

    @Override // ge.AbstractC4223a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Iterator f(Collection collection) {
        AbstractC4862t.e(collection, "<this>");
        return collection.iterator();
    }

    @Override // ge.AbstractC4223a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int g(Collection collection) {
        AbstractC4862t.e(collection, "<this>");
        return collection.size();
    }
}
