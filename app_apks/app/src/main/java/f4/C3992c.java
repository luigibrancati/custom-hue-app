package f4;

import android.content.Context;
import android.net.Uri;
import com.fasterxml.jackson.core.JsonPointer;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: f4.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C3992c implements InterfaceC3991b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f34134a;

    public C3992c(Context context) {
        AbstractC4862t.e(context, "context");
        this.f34134a = context;
    }

    @Override // f4.InterfaceC3991b
    public /* bridge */ /* synthetic */ boolean a(Object obj) {
        return b(((Number) obj).intValue());
    }

    public boolean b(int i10) {
        return this.f34134a.getResources().getResourceEntryName(i10) != null;
    }

    public Uri c(int i10) {
        Uri uri = Uri.parse("android.resource://" + ((Object) this.f34134a.getPackageName()) + JsonPointer.SEPARATOR + i10);
        AbstractC4862t.d(uri, "parse(this)");
        return uri;
    }

    @Override // f4.InterfaceC3991b
    public /* bridge */ /* synthetic */ Object map(Object obj) {
        return c(((Number) obj).intValue());
    }
}
