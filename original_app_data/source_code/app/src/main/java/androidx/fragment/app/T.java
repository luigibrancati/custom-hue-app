package androidx.fragment.app;

import android.view.View;
import b0.C2777a;
import gc.C4179C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import t3.C5836e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final T f23156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final V f23157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final V f23158c;

    static {
        T t10 = new T();
        f23156a = t10;
        f23157b = new U();
        f23158c = t10.c();
    }

    public static final void a(ComponentCallbacksC2736q inFragment, ComponentCallbacksC2736q outFragment, boolean z10, C2777a sharedElements, boolean z11) {
        AbstractC4862t.e(inFragment, "inFragment");
        AbstractC4862t.e(outFragment, "outFragment");
        AbstractC4862t.e(sharedElements, "sharedElements");
        androidx.core.app.x enterTransitionCallback = z10 ? outFragment.getEnterTransitionCallback() : inFragment.getEnterTransitionCallback();
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList(sharedElements.size());
            Iterator it = sharedElements.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((View) ((Map.Entry) it.next()).getValue());
            }
            ArrayList arrayList2 = new ArrayList(sharedElements.size());
            Iterator it2 = sharedElements.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) ((Map.Entry) it2.next()).getKey());
            }
            if (z11) {
                enterTransitionCallback.g(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.f(arrayList2, arrayList, null);
            }
        }
    }

    public static final String b(C2777a c2777a, String value) {
        AbstractC4862t.e(c2777a, "<this>");
        AbstractC4862t.e(value, "value");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : c2777a.entrySet()) {
            if (AbstractC4862t.a(entry.getValue(), value)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return (String) C4179C.j0(arrayList);
    }

    public static final void d(C2777a c2777a, C2777a namedViews) {
        AbstractC4862t.e(c2777a, "<this>");
        AbstractC4862t.e(namedViews, "namedViews");
        int size = c2777a.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!namedViews.containsKey((String) c2777a.j(size))) {
                c2777a.h(size);
            }
        }
    }

    public static final void e(List views, int i10) {
        AbstractC4862t.e(views, "views");
        Iterator it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i10);
        }
    }

    public final V c() {
        try {
            AbstractC4862t.c(C5836e.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (V) C5836e.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
