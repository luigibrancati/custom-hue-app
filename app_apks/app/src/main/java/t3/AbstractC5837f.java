package t3;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* JADX INFO: renamed from: t3.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5837f {

    /* JADX INFO: renamed from: t3.f$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static ObjectAnimator a(Object obj, Property property, Path path) {
            return ObjectAnimator.ofObject(obj, (Property<Object, V>) property, (TypeConverter) null, path);
        }
    }

    public static ObjectAnimator a(Object obj, Property property, Path path) {
        return a.a(obj, property, path);
    }
}
