package u6;

import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import u6.C5960i;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: u6.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C5962j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f45192a = Collections.newSetFromMap(new WeakHashMap());

    public static C5960i a(Object obj, Looper looper, String str) {
        AbstractC6056k.m(obj, "Listener must not be null");
        AbstractC6056k.m(looper, "Looper must not be null");
        AbstractC6056k.m(str, "Listener type must not be null");
        return new C5960i(looper, obj, str);
    }

    public static C5960i.a b(Object obj, String str) {
        AbstractC6056k.m(obj, "Listener must not be null");
        AbstractC6056k.m(str, "Listener type must not be null");
        AbstractC6056k.g(str, "Listener type must not be empty");
        return new C5960i.a(obj, str);
    }
}
