package org.jni_zero;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class JniTestInstancesSnapshot {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final Object[] mValues;

    private JniTestInstancesSnapshot(Object[] objArr) {
        this.mValues = objArr;
    }

    public static void clearAllForTesting() {
        restoreSnapshotForTesting(new JniTestInstancesSnapshot(new Object[0]));
    }

    public static void restoreSnapshotForTesting(JniTestInstancesSnapshot jniTestInstancesSnapshot) {
        synchronized (JniTestInstanceHolder.class) {
            try {
                Object[] objArr = jniTestInstancesSnapshot.mValues;
                ArrayList<JniTestInstanceHolder> arrayList = JniTestInstanceHolder.sAllOverrides;
                int length = objArr.length;
                if (arrayList == null) {
                    return;
                }
                int size = arrayList.size();
                for (int i10 = 0; i10 < length; i10++) {
                    arrayList.get(i10).value = objArr[i10];
                }
                while (length < size) {
                    arrayList.get(length).value = null;
                    length++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static JniTestInstancesSnapshot snapshotOverridesForTesting() {
        synchronized (JniTestInstanceHolder.class) {
            try {
                ArrayList<JniTestInstanceHolder> arrayList = JniTestInstanceHolder.sAllOverrides;
                if (arrayList == null) {
                    return new JniTestInstancesSnapshot(new Object[0]);
                }
                Object[] objArr = new Object[arrayList.size()];
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    objArr[i10] = arrayList.get(i10).value;
                }
                return new JniTestInstancesSnapshot(objArr);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
