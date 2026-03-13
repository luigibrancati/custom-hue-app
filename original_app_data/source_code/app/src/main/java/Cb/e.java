package Cb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb.AbstractC4755b;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1236a = new ArrayList();

    public final void a(AbstractC4755b sceneView) {
        AbstractC4862t.e(sceneView, "sceneView");
        Iterator it = this.f1236a.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.a.a(it.next());
            throw null;
        }
    }
}
