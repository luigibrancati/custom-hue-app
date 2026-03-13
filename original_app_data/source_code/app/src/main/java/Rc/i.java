package Rc;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import uc.AbstractC6017a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i {
    public static final e a(Annotation[] annotationArr, kd.c fqName) {
        Annotation annotation;
        AbstractC4862t.e(annotationArr, "<this>");
        AbstractC4862t.e(fqName, "fqName");
        int length = annotationArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i10];
            if (AbstractC4862t.a(d.a(AbstractC6017a.b(AbstractC6017a.a(annotation))).b(), fqName)) {
                break;
            }
            i10++;
        }
        if (annotation != null) {
            return new e(annotation);
        }
        return null;
    }

    public static final List b(Annotation[] annotationArr) {
        AbstractC4862t.e(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new e(annotation));
        }
        return arrayList;
    }
}
