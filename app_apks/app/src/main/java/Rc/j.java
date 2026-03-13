package Rc;

import Rc.f;
import bd.InterfaceC2913e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends f implements InterfaceC2913e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f15077c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(kd.f fVar, Object[] values) {
        super(fVar, null);
        AbstractC4862t.e(values, "values");
        this.f15077c = values;
    }

    @Override // bd.InterfaceC2913e
    public List getElements() {
        Object[] objArr = this.f15077c;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            f.a aVar = f.f15074b;
            AbstractC4862t.b(obj);
            arrayList.add(aVar.a(obj, null));
        }
        return arrayList;
    }
}
