package Ga;

import android.content.Context;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f4653a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final String a(Context context, String text) {
            AbstractC4862t.e(context, "context");
            AbstractC4862t.e(text, "text");
            int iHashCode = text.hashCode();
            if (iHashCode != -1748585134) {
                if (iHashCode != 57834251) {
                    if (iHashCode == 1786672259 && text.equals("<HOME>")) {
                        String string = context.getString(f.f4645f);
                        AbstractC4862t.d(string, "getString(...)");
                        return string;
                    }
                } else if (text.equals("<OFF>")) {
                    String string2 = context.getString(f.f4647h);
                    AbstractC4862t.d(string2, "getString(...)");
                    return string2;
                }
            } else if (text.equals("<LAST_ON>")) {
                String string3 = context.getString(f.f4646g);
                AbstractC4862t.d(string3, "getString(...)");
                return string3;
            }
            return text;
        }

        public a() {
        }
    }
}
