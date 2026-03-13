package g;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import g.AbstractC4051a;
import gc.C4206t;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: g.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C4052b extends AbstractC4051a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f34772a = new a(null);

    /* JADX INFO: renamed from: g.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final List a(Intent intent) {
            AbstractC4862t.e(intent, "<this>");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Uri data = intent.getData();
            if (data != null) {
                linkedHashSet.add(data);
            }
            ClipData clipData = intent.getClipData();
            if (clipData == null && linkedHashSet.isEmpty()) {
                return C4206t.k();
            }
            if (clipData != null) {
                int itemCount = clipData.getItemCount();
                for (int i10 = 0; i10 < itemCount; i10++) {
                    Uri uri = clipData.getItemAt(i10).getUri();
                    if (uri != null) {
                        linkedHashSet.add(uri);
                    }
                }
            }
            return new ArrayList(linkedHashSet);
        }

        public a() {
        }
    }

    @Override // g.AbstractC4051a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String input) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(input, "input");
        Intent intentPutExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        AbstractC4862t.d(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    @Override // g.AbstractC4051a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final AbstractC4051a.C0450a b(Context context, String input) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(input, "input");
        return null;
    }

    @Override // g.AbstractC4051a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final List c(int i10, Intent intent) {
        List listA;
        if (i10 != -1) {
            intent = null;
        }
        return (intent == null || (listA = f34772a.a(intent)) == null) ? C4206t.k() : listA;
    }
}
