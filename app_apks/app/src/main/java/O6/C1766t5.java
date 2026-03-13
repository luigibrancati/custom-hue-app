package O6;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: O6.t5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1766t5 implements InterfaceC1746q5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11865a;

    public C1766t5(Context context, AbstractC1759s5 abstractC1759s5) {
        ArrayList arrayList = new ArrayList();
        this.f11865a = arrayList;
        if (abstractC1759s5.c()) {
            arrayList.add(new D5(context, abstractC1759s5));
        }
    }

    @Override // O6.InterfaceC1746q5
    public final void a(InterfaceC1739p5 interfaceC1739p5) {
        Iterator it = this.f11865a.iterator();
        while (it.hasNext()) {
            ((InterfaceC1746q5) it.next()).a(interfaceC1739p5);
        }
    }
}
