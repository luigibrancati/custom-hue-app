package p7;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;

/* JADX INFO: renamed from: p7.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5406g {
    public static Typeface a(Context context, Typeface typeface) {
        return b(context.getResources().getConfiguration(), typeface);
    }

    public static Typeface b(Configuration configuration, Typeface typeface) {
        int i10 = configuration.fontWeightAdjustment;
        if (i10 == Integer.MAX_VALUE || i10 == 0) {
            return null;
        }
        return Typeface.create(typeface, S0.a.c(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}
