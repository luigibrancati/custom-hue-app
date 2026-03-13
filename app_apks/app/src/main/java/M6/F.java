package M6;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class F implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9305a;

    public F(Context context, E e10) {
        ArrayList arrayList = new ArrayList();
        this.f9305a = arrayList;
        if (e10.c()) {
            arrayList.add(new N(context, e10));
        }
    }
}
