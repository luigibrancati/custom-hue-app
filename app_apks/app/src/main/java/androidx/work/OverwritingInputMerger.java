package androidx.work;

import I3.AbstractC0882l;
import androidx.work.b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/work/OverwritingInputMerger;", "LI3/l;", "<init>", "()V", "", "Landroidx/work/b;", "inputs", "a", "(Ljava/util/List;)Landroidx/work/b;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OverwritingInputMerger extends AbstractC0882l {
    @Override // I3.AbstractC0882l
    public b a(List inputs) {
        AbstractC4862t.e(inputs, "inputs");
        b.a aVar = new b.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = inputs.iterator();
        while (it.hasNext()) {
            linkedHashMap.putAll(((b) it.next()).d());
        }
        aVar.d(linkedHashMap);
        return aVar.a();
    }
}
