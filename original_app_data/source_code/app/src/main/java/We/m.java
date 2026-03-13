package We;

import java.lang.reflect.Array;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f17969a = Logger.getLogger(m.class.getName());

    public static Object[] a(Object[] objArr, int i10) {
        return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
    }
}
