package org.jni_zero;

import android.util.ArrayMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class JniUtil {
    @CalledByNative
    private static Map<Object, Object> arrayToMap(Object[] objArr) {
        int length = objArr.length;
        ArrayMap arrayMap = new ArrayMap(length / 2);
        for (int i10 = 0; i10 < length; i10 += 2) {
            arrayMap.put(objArr[i10], objArr[i10 + 1]);
        }
        return arrayMap;
    }

    @CalledByNative
    private static Object[] mapToArray(Map<Object, Object> map) {
        Object[] objArr = new Object[map.size() * 2];
        int i10 = 0;
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            int i11 = i10 + 1;
            objArr[i10] = entry.getKey();
            i10 += 2;
            objArr[i11] = entry.getValue();
        }
        return objArr;
    }
}
