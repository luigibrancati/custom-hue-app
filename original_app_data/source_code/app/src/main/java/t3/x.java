package t3;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f44735b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f44734a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f44736c = new ArrayList();

    @Deprecated
    public x() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f44735b == xVar.f44735b && this.f44734a.equals(xVar.f44734a);
    }

    public int hashCode() {
        return (this.f44735b.hashCode() * 31) + this.f44734a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f44735b + "\n") + "    values:";
        for (String str2 : this.f44734a.keySet()) {
            str = str + "    " + str2 + ": " + this.f44734a.get(str2) + "\n";
        }
        return str;
    }

    public x(View view) {
        this.f44735b = view;
    }
}
