package Z0;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20142a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f20143a;

        public a(i iVar) {
            this.f20143a = iVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            h hVarB = this.f20143a.b(i10);
            if (hVarB == null) {
                return null;
            }
            return hVarB.H0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List findAccessibilityNodeInfosByText(String str, int i10) {
            List listC = this.f20143a.c(str, i10);
            if (listC == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listC.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(((h) listC.get(i11)).H0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i10) {
            h hVarD = this.f20143a.d(i10);
            if (hVarD == null) {
                return null;
            }
            return hVarD.H0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f20143a.f(i10, i11, bundle);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends a {
        public b(i iVar) {
            super(iVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f20143a.a(i10, h.I0(accessibilityNodeInfo), str, bundle);
        }
    }

    public i() {
        this.f20142a = new b(this);
    }

    public h b(int i10) {
        return null;
    }

    public List c(String str, int i10) {
        return null;
    }

    public h d(int i10) {
        return null;
    }

    public Object e() {
        return this.f20142a;
    }

    public boolean f(int i10, int i11, Bundle bundle) {
        return false;
    }

    public i(Object obj) {
        this.f20142a = obj;
    }

    public void a(int i10, h hVar, String str, Bundle bundle) {
    }
}
