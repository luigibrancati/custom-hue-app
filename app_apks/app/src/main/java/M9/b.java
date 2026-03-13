package M9;

import D9.d;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.maps.android.ui.RotationLayout;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f9412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RotationLayout f9413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f9414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f9415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f9417g = 0.5f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f9418h = 1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f9419i;

    public b(Context context) {
        this.f9411a = context;
        this.f9419i = new a(context);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(D9.c.f2323a, (ViewGroup) null);
        this.f9412b = viewGroup;
        RotationLayout rotationLayout = (RotationLayout) viewGroup.getChildAt(0);
        this.f9413c = rotationLayout;
        TextView textView = (TextView) rotationLayout.findViewById(D9.b.f2322a);
        this.f9414d = textView;
        this.f9415e = textView;
        h(1);
    }

    public static int a(int i10) {
        if (i10 == 3) {
            return -3407872;
        }
        if (i10 == 4) {
            return -16737844;
        }
        if (i10 == 5) {
            return -10053376;
        }
        if (i10 != 6) {
            return i10 != 7 ? -1 : -30720;
        }
        return -6736948;
    }

    public static int b(int i10) {
        return (i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? d.f2325b : d.f2324a;
    }

    public Bitmap c() {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f9412b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredWidth = this.f9412b.getMeasuredWidth();
        int measuredHeight = this.f9412b.getMeasuredHeight();
        this.f9412b.layout(0, 0, measuredWidth, measuredHeight);
        int i10 = this.f9416f;
        if (i10 == 1 || i10 == 3) {
            measuredHeight = this.f9412b.getMeasuredWidth();
            measuredWidth = this.f9412b.getMeasuredHeight();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(0);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int i11 = this.f9416f;
        if (i11 == 1) {
            canvas.translate(measuredWidth, 0.0f);
            canvas.rotate(90.0f);
        } else if (i11 == 2) {
            canvas.rotate(180.0f, measuredWidth / 2, measuredHeight / 2);
        } else if (i11 == 3) {
            canvas.translate(0.0f, measuredHeight);
            canvas.rotate(270.0f);
        }
        this.f9412b.draw(canvas);
        return bitmapCreateBitmap;
    }

    public Bitmap d(CharSequence charSequence) {
        TextView textView = this.f9414d;
        if (textView != null) {
            textView.setText(charSequence);
        }
        return c();
    }

    public void e(Drawable drawable) {
        this.f9412b.setBackgroundDrawable(drawable);
        if (drawable == null) {
            this.f9412b.setPadding(0, 0, 0, 0);
            return;
        }
        Rect rect = new Rect();
        drawable.getPadding(rect);
        this.f9412b.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void f(int i10) {
        this.f9419i.a(i10);
        e(this.f9419i);
    }

    public void g(View view) {
        this.f9413c.removeAllViews();
        this.f9413c.addView(view);
        this.f9415e = view;
        View viewFindViewById = this.f9413c.findViewById(D9.b.f2322a);
        this.f9414d = viewFindViewById instanceof TextView ? (TextView) viewFindViewById : null;
    }

    public void h(int i10) {
        f(a(i10));
        j(this.f9411a, b(i10));
    }

    public void i(int i10) {
        j(this.f9411a, i10);
    }

    public void j(Context context, int i10) {
        TextView textView = this.f9414d;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }
}
