package n4;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.AbstractC2754j;
import androidx.lifecycle.InterfaceC2758n;
import j.AbstractC4666a;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC4862t;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: n4.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5087c {
    public static final Drawable a(Context context, int i10) {
        AbstractC4862t.e(context, "<this>");
        Drawable drawableB = AbstractC4666a.b(context, i10);
        if (drawableB != null) {
            return drawableB;
        }
        throw new IllegalStateException(AbstractC4862t.k("Invalid resource ID: ", Integer.valueOf(i10)).toString());
    }

    public static final Drawable b(Resources resources, int i10, Resources.Theme theme) {
        AbstractC4862t.e(resources, "<this>");
        Drawable drawableE = N0.f.e(resources, i10, theme);
        if (drawableE != null) {
            return drawableE;
        }
        throw new IllegalStateException(AbstractC4862t.k("Invalid resource ID: ", Integer.valueOf(i10)).toString());
    }

    public static final AbstractC2754j c(Context context) {
        Object baseContext = context;
        while (!(baseContext instanceof InterfaceC2758n)) {
            if (!(baseContext instanceof ContextWrapper)) {
                return null;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        return ((InterfaceC2758n) baseContext).getLifecycle();
    }

    public static final Drawable d(Context context, Resources resources, int i10) throws XmlPullParserException, IOException {
        AbstractC4862t.e(context, "<this>");
        AbstractC4862t.e(resources, "resources");
        XmlResourceParser xml = resources.getXml(i10);
        AbstractC4862t.d(xml, "resources.getXml(resId)");
        int next = xml.next();
        while (next != 2 && next != 1) {
            next = xml.next();
        }
        if (next == 2) {
            return b(resources, i10, context.getTheme());
        }
        throw new XmlPullParserException("No start tag found.");
    }
}
