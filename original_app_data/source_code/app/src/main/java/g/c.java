package g;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.provider.MediaStore;
import f.i;
import g.AbstractC4051a;
import g.d;
import gc.C4206t;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class c extends AbstractC4051a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f34773b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34774a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final int a() {
            if (d.f34775a.d()) {
                return MediaStore.getPickImagesMaxLimit();
            }
            return Integer.MAX_VALUE;
        }

        public a() {
        }
    }

    public c() {
        this(0, 1, null);
    }

    @Override // g.AbstractC4051a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, i input) {
        d.e eVarD;
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(input, "input");
        d.a aVar = d.f34775a;
        if (aVar.d()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(aVar.b(input.e()));
            int iMin = Math.min(this.f34774a, input.c());
            if (iMin <= 1 || iMin > MediaStore.getPickImagesMaxLimit()) {
                throw new IllegalArgumentException("Max items must be greater than 1 and lesser than or equal to MediaStore.getPickImagesMaxLimit()");
            }
            intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", iMin);
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", input.b().a());
            intent.putExtra("android.provider.extra.PICK_IMAGES_IN_ORDER", input.g());
            if (input.f()) {
                intent.putExtra("android.provider.extra.PICK_IMAGES_ACCENT_COLOR", input.a());
            }
            if (Build.VERSION.SDK_INT >= 33 && (eVarD = input.d()) != null) {
                intent.putExtra("android.provider.extra.MEDIA_CAPABILITIES", eVarD.a());
            }
            return intent;
        }
        if (!aVar.c(context)) {
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(aVar.b(input.e()));
            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            if (intent2.getType() == null) {
                intent2.setType("*/*");
                intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            return intent2;
        }
        ResolveInfo resolveInfoA = aVar.a(context);
        if (resolveInfoA == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ActivityInfo activityInfo = resolveInfoA.activityInfo;
        Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent3.setType(aVar.b(input.e()));
        int iMin2 = Math.min(this.f34774a, input.c());
        if (iMin2 <= 1) {
            throw new IllegalArgumentException("Max items must be greater than 1");
        }
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_MAX", iMin2);
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", input.b().a());
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_IN_ORDER", input.g());
        if (input.f()) {
            intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_ACCENT_COLOR", input.a());
        }
        return intent3;
    }

    @Override // g.AbstractC4051a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final AbstractC4051a.C0450a b(Context context, i input) {
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
        return (intent == null || (listA = C4052b.f34772a.a(intent)) == null) ? C4206t.k() : listA;
    }

    public c(int i10) {
        this.f34774a = i10;
        if (i10 <= 1) {
            throw new IllegalArgumentException("Max items must be higher than 1");
        }
    }

    public /* synthetic */ c(int i10, int i11, AbstractC4854k abstractC4854k) {
        this((i11 & 1) != 0 ? f34773b.a() : i10);
    }
}
