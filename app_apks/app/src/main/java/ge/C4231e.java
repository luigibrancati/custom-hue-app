package ge;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ge.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4231e extends AbstractC4253q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ee.e f35699b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4231e(ce.b element) {
        super(element);
        AbstractC4862t.e(element, "element");
        this.f35699b = new C4229d(element.getDescriptor());
    }

    @Override // ge.AbstractC4252p, ce.b, ce.g, ce.InterfaceC3118a
    public ee.e getDescriptor() {
        return this.f35699b;
    }

    @Override // ge.AbstractC4223a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public ArrayList c() {
        return new ArrayList();
    }

    @Override // ge.AbstractC4223a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public int d(ArrayList arrayList) {
        AbstractC4862t.e(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // ge.AbstractC4223a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void e(ArrayList arrayList, int i10) {
        AbstractC4862t.e(arrayList, "<this>");
        arrayList.ensureCapacity(i10);
    }

    @Override // ge.AbstractC4252p
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void p(ArrayList arrayList, int i10, Object obj) {
        AbstractC4862t.e(arrayList, "<this>");
        arrayList.add(i10, obj);
    }

    @Override // ge.AbstractC4223a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public ArrayList m(List list) {
        AbstractC4862t.e(list, "<this>");
        ArrayList arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList(list) : arrayList;
    }

    @Override // ge.AbstractC4223a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public List n(ArrayList arrayList) {
        AbstractC4862t.e(arrayList, "<this>");
        return arrayList;
    }
}
