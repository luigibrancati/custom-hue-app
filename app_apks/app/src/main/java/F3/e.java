package F3;

import C3.c;
import C3.d;
import C3.s;
import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import fc.C4015H;
import gc.C4206t;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.l;
import z3.h;
import z3.j;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f3707b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f3708c = e.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f3709a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final int a(SidecarDeviceState sidecarDeviceState) {
            AbstractC4862t.e(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    return sidecarDeviceState.posture;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    return 0;
                }
            } catch (NoSuchFieldError unused2) {
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                AbstractC4862t.c(objInvoke, "null cannot be cast to non-null type kotlin.Int");
                return ((Integer) objInvoke).intValue();
            }
        }

        public final int b(SidecarDeviceState sidecarDeviceState) {
            AbstractC4862t.e(sidecarDeviceState, "sidecarDeviceState");
            int iA = a(sidecarDeviceState);
            if (iA < 0 || iA > 4) {
                return 0;
            }
            return iA;
        }

        public final List c(SidecarWindowLayoutInfo info) {
            AbstractC4862t.e(info, "info");
            try {
                try {
                    List list = info.displayFeatures;
                    return list == null ? C4206t.k() : list;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    return C4206t.k();
                }
                return C4206t.k();
            } catch (NoSuchFieldError unused2) {
                Object objInvoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(info, null);
                AbstractC4862t.c(objInvoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                return (List) objInvoke;
            }
        }

        public final void d(SidecarDeviceState sidecarDeviceState, int i10) {
            AbstractC4862t.e(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    sidecarDeviceState.posture = i10;
                } catch (IllegalAccessException unused) {
                    C4015H c4015h = C4015H.f34254a;
                } catch (NoSuchMethodException unused2) {
                    C4015H c4015h2 = C4015H.f34254a;
                } catch (InvocationTargetException unused3) {
                    C4015H c4015h3 = C4015H.f34254a;
                }
            } catch (NoSuchFieldError unused4) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i10));
            }
        }

        public a() {
        }
    }

    public e() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static final boolean k(SidecarDisplayFeature require) {
        AbstractC4862t.e(require, "$this$require");
        return require.getType() == 1 || require.getType() == 2;
    }

    public static final boolean l(SidecarDisplayFeature require) {
        AbstractC4862t.e(require, "$this$require");
        return (require.getRect().width() == 0 && require.getRect().height() == 0) ? false : true;
    }

    public static final boolean m(SidecarDisplayFeature require) {
        AbstractC4862t.e(require, "$this$require");
        return require.getType() != 1 || require.getRect().width() == 0 || require.getRect().height() == 0;
    }

    public static final boolean n(SidecarDisplayFeature require) {
        AbstractC4862t.e(require, "$this$require");
        return require.getRect().left == 0 || require.getRect().top == 0;
    }

    public final boolean e(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (AbstractC4862t.a(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null || sidecarDeviceState2 == null) {
            return false;
        }
        a aVar = f3707b;
        return aVar.b(sidecarDeviceState) == aVar.b(sidecarDeviceState2);
    }

    public final boolean f(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (AbstractC4862t.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return AbstractC4862t.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public final boolean g(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!f((SidecarDisplayFeature) list.get(i10), (SidecarDisplayFeature) list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final boolean h(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (AbstractC4862t.a(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        a aVar = f3707b;
        return g(aVar.c(sidecarWindowLayoutInfo), aVar.c(sidecarWindowLayoutInfo2));
    }

    public final s i(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState state) {
        AbstractC4862t.e(state, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new s(C4206t.k());
        }
        SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
        a aVar = f3707b;
        aVar.d(sidecarDeviceState, aVar.b(state));
        return new s(j(aVar.c(sidecarWindowLayoutInfo), sidecarDeviceState));
    }

    public final List j(List sidecarDisplayFeatures, SidecarDeviceState deviceState) {
        AbstractC4862t.e(sidecarDisplayFeatures, "sidecarDisplayFeatures");
        AbstractC4862t.e(deviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        Iterator it = sidecarDisplayFeatures.iterator();
        while (it.hasNext()) {
            C3.a aVarO = o((SidecarDisplayFeature) it.next(), deviceState);
            if (aVarO != null) {
                arrayList.add(aVarO);
            }
        }
        return arrayList;
    }

    public final C3.a o(SidecarDisplayFeature feature, SidecarDeviceState deviceState) {
        d.b bVarA;
        c.b bVar;
        AbstractC4862t.e(feature, "feature");
        AbstractC4862t.e(deviceState, "deviceState");
        h.a aVar = h.f48727a;
        String TAG = f3708c;
        AbstractC4862t.d(TAG, "TAG");
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) h.a.b(aVar, feature, TAG, this.f3709a, null, 4, null).c("Type must be either TYPE_FOLD or TYPE_HINGE", new l() { // from class: F3.a
            @Override // vc.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(e.k((SidecarDisplayFeature) obj));
            }
        }).c("Feature bounds must not be 0", new l() { // from class: F3.b
            @Override // vc.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(e.l((SidecarDisplayFeature) obj));
            }
        }).c("TYPE_FOLD must have 0 area", new l() { // from class: F3.c
            @Override // vc.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(e.m((SidecarDisplayFeature) obj));
            }
        }).c("Feature be pinned to either left or top", new l() { // from class: F3.d
            @Override // vc.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(e.n((SidecarDisplayFeature) obj));
            }
        }).a();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type = sidecarDisplayFeature.getType();
        if (type == 1) {
            bVarA = d.b.f1113b.a();
        } else {
            if (type != 2) {
                return null;
            }
            bVarA = d.b.f1113b.b();
        }
        int iB = f3707b.b(deviceState);
        if (iB != 0 && iB != 1) {
            if (iB == 2) {
                bVar = c.b.f1107d;
            } else if (iB == 3 || iB != 4) {
                bVar = c.b.f1106c;
            }
            Rect rect = feature.getRect();
            AbstractC4862t.d(rect, "getRect(...)");
            return new C3.d(new z3.b(rect), bVarA, bVar);
        }
        return null;
    }

    public e(j verificationMode) {
        AbstractC4862t.e(verificationMode, "verificationMode");
        this.f3709a = verificationMode;
    }

    public /* synthetic */ e(j jVar, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? j.QUIET : jVar);
    }
}
