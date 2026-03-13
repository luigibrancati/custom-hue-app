package g;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.media.ApplicationMediaCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import com.google.ar.core.ImageMetadata;
import f.i;
import fc.C4032o;
import g.AbstractC4051a;
import gc.C4179C;
import gc.U;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class d extends AbstractC4051a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f34775a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final ResolveInfo a(Context context) {
            AbstractC4862t.e(context, "context");
            return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), ImageMetadata.STATISTICS_FACE_DETECT_MODE);
        }

        public final String b(g input) {
            AbstractC4862t.e(input, "input");
            if (input instanceof C0451d) {
                return "image/*";
            }
            if (input instanceof f) {
                return "video/*";
            }
            if (input instanceof c) {
                return null;
            }
            throw new C4032o();
        }

        public final boolean c(Context context) {
            AbstractC4862t.e(context, "context");
            return a(context) != null;
        }

        public final boolean d() {
            return Build.VERSION.SDK_INT >= 33 || SdkExtensions.getExtensionVersion(30) >= 2;
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class b {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f34776a = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f34777b = 1;

            public a() {
                super(null);
            }

            @Override // g.d.b
            public int a() {
                return f34777b;
            }
        }

        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public abstract int a();

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f34778a = new c();
    }

    /* JADX INFO: renamed from: g.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0451d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0451d f34779a = new C0451d();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f34780b = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Set f34781a = U.d();

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a {
            public /* synthetic */ a(AbstractC4854k abstractC4854k) {
                this();
            }

            public a() {
            }
        }

        public final ApplicationMediaCapabilities a() {
            ApplicationMediaCapabilities.Builder builder = new ApplicationMediaCapabilities.Builder();
            builder.addSupportedVideoMimeType("video/hevc");
            Iterator it = this.f34781a.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (iIntValue == 0) {
                    builder.addSupportedHdrType("android.media.feature.hdr.hlg");
                } else if (iIntValue == 1) {
                    builder.addSupportedHdrType("android.media.feature.hdr.hdr10");
                } else if (iIntValue == 2) {
                    builder.addSupportedHdrType("android.media.feature.hdr.hdr10_plus");
                } else if (iIntValue == 3) {
                    builder.addSupportedHdrType("android.media.feature.hdr.dolby_vision");
                }
            }
            ApplicationMediaCapabilities applicationMediaCapabilitiesBuild = builder.build();
            AbstractC4862t.d(applicationMediaCapabilitiesBuild, "build(...)");
            return applicationMediaCapabilitiesBuild;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f34782a = new f();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface g {
    }

    @Override // g.AbstractC4051a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, i input) {
        e eVarD;
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(input, "input");
        a aVar = f34775a;
        if (aVar.d()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(aVar.b(input.e()));
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", input.b().a());
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
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", input.b().a());
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
    public final Uri c(int i10, Intent intent) {
        if (i10 != -1) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        return data == null ? (Uri) C4179C.j0(C4052b.f34772a.a(intent)) : data;
    }
}
