package n7;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p7.AbstractC5405f;
import p7.C5403d;

/* JADX INFO: renamed from: n7.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C5147j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f40725c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C5403d f40728f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f40723a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC5405f f40724b = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f40726d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WeakReference f40727e = new WeakReference(null);

    /* JADX INFO: renamed from: n7.j$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends AbstractC5405f {
        public a() {
        }

        @Override // p7.AbstractC5405f
        public void a(int i10) {
            C5147j.this.f40726d = true;
            b bVar = (b) C5147j.this.f40727e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // p7.AbstractC5405f
        public void b(Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            C5147j.this.f40726d = true;
            b bVar = (b) C5147j.this.f40727e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* JADX INFO: renamed from: n7.j$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C5147j(b bVar) {
        g(bVar);
    }

    public final float c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f40723a.measureText(charSequence, 0, charSequence.length());
    }

    public C5403d d() {
        return this.f40728f;
    }

    public TextPaint e() {
        return this.f40723a;
    }

    public float f(String str) {
        if (!this.f40726d) {
            return this.f40725c;
        }
        float fC = c(str);
        this.f40725c = fC;
        this.f40726d = false;
        return fC;
    }

    public void g(b bVar) {
        this.f40727e = new WeakReference(bVar);
    }

    public void h(C5403d c5403d, Context context) {
        if (this.f40728f != c5403d) {
            this.f40728f = c5403d;
            if (c5403d != null) {
                c5403d.o(context, this.f40723a, this.f40724b);
                b bVar = (b) this.f40727e.get();
                if (bVar != null) {
                    this.f40723a.drawableState = bVar.getState();
                }
                c5403d.n(context, this.f40723a, this.f40724b);
                this.f40726d = true;
            }
            b bVar2 = (b) this.f40727e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void i(boolean z10) {
        this.f40726d = z10;
    }

    public void j(Context context) {
        this.f40728f.n(context, this.f40723a, this.f40724b);
    }
}
