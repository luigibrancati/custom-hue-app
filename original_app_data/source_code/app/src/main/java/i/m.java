package i;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import b0.J;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import n.C5059d;
import p.C5324C;
import p.C5326E;
import p.C5341c;
import p.C5343e;
import p.C5344f;
import p.C5345g;
import p.C5349k;
import p.C5353o;
import p.C5355q;
import p.C5356r;
import p.C5359u;
import p.C5360v;
import p.C5362x;
import p.C5364z;
import p.T;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class[] f36743b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f36744c = {R.attr.onClick};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f36745d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f36746e = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f36747f = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f36748g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final J f36749h = new J();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f36750a = new Object[2];

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f36751a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f36752b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Method f36753c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Context f36754d;

        public a(View view, String str) {
            this.f36751a = view;
            this.f36752b = str;
        }

        public final void a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f36752b, View.class)) != null) {
                        this.f36753c = method;
                        this.f36754d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id2 = this.f36751a.getId();
            if (id2 == -1) {
                str = "";
            } else {
                str = " with id '" + this.f36751a.getContext().getResources().getResourceEntryName(id2) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f36752b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f36751a.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f36753c == null) {
                a(this.f36751a.getContext());
            }
            try {
                this.f36753c.invoke(this.f36754d, view);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    public static Context u(Context context, AttributeSet attributeSet, boolean z10, boolean z11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.j.f36130q3, 0, 0);
        int resourceId = z10 ? typedArrayObtainStyledAttributes.getResourceId(h.j.f36135r3, 0) : 0;
        if (z11 && resourceId == 0 && (resourceId = typedArrayObtainStyledAttributes.getResourceId(h.j.f36140s3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == 0 || ((context instanceof C5059d) && ((C5059d) context).c() == resourceId)) ? context : new C5059d(context, resourceId);
    }

    public final void b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && view.hasOnClickListeners()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f36744c);
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public C5341c c(Context context, AttributeSet attributeSet) {
        return new C5341c(context, attributeSet);
    }

    public C5343e d(Context context, AttributeSet attributeSet) {
        return new C5343e(context, attributeSet);
    }

    public C5344f e(Context context, AttributeSet attributeSet) {
        return new C5344f(context, attributeSet);
    }

    public C5345g f(Context context, AttributeSet attributeSet) {
        return new C5345g(context, attributeSet);
    }

    public C5349k g(Context context, AttributeSet attributeSet) {
        return new C5349k(context, attributeSet);
    }

    public C5353o h(Context context, AttributeSet attributeSet) {
        return new C5353o(context, attributeSet);
    }

    public C5355q i(Context context, AttributeSet attributeSet) {
        return new C5355q(context, attributeSet);
    }

    public C5356r j(Context context, AttributeSet attributeSet) {
        return new C5356r(context, attributeSet);
    }

    public C5359u k(Context context, AttributeSet attributeSet) {
        return new C5359u(context, attributeSet);
    }

    public C5360v l(Context context, AttributeSet attributeSet) {
        return new C5360v(context, attributeSet);
    }

    public C5362x m(Context context, AttributeSet attributeSet) {
        return new C5362x(context, attributeSet);
    }

    public C5364z n(Context context, AttributeSet attributeSet) {
        return new C5364z(context, attributeSet);
    }

    public C5324C o(Context context, AttributeSet attributeSet) {
        return new C5324C(context, attributeSet);
    }

    public C5326E p(Context context, AttributeSet attributeSet) {
        return new C5326E(context, attributeSet);
    }

    public View q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View r(View view, String str, Context context, AttributeSet attributeSet, boolean z10, boolean z11, boolean z12, boolean z13) {
        Context context2;
        View viewL;
        context2 = (!z10 || view == null) ? context : view.getContext();
        if (z11 || z12) {
            context2 = u(context2, attributeSet, z11, z12);
        }
        if (z13) {
            context2 = T.b(context2);
        }
        str.getClass();
        switch (str) {
            case "RatingBar":
                viewL = l(context2, attributeSet);
                v(viewL, str);
                break;
            case "CheckedTextView":
                viewL = f(context2, attributeSet);
                v(viewL, str);
                break;
            case "MultiAutoCompleteTextView":
                viewL = j(context2, attributeSet);
                v(viewL, str);
                break;
            case "TextView":
                viewL = o(context2, attributeSet);
                v(viewL, str);
                break;
            case "ImageButton":
                viewL = h(context2, attributeSet);
                v(viewL, str);
                break;
            case "SeekBar":
                viewL = m(context2, attributeSet);
                v(viewL, str);
                break;
            case "Spinner":
                viewL = n(context2, attributeSet);
                v(viewL, str);
                break;
            case "RadioButton":
                viewL = k(context2, attributeSet);
                v(viewL, str);
                break;
            case "ToggleButton":
                viewL = p(context2, attributeSet);
                v(viewL, str);
                break;
            case "ImageView":
                viewL = i(context2, attributeSet);
                v(viewL, str);
                break;
            case "AutoCompleteTextView":
                viewL = c(context2, attributeSet);
                v(viewL, str);
                break;
            case "CheckBox":
                viewL = e(context2, attributeSet);
                v(viewL, str);
                break;
            case "EditText":
                viewL = g(context2, attributeSet);
                v(viewL, str);
                break;
            case "Button":
                viewL = d(context2, attributeSet);
                v(viewL, str);
                break;
            default:
                viewL = q(context2, str, attributeSet);
                break;
        }
        if (viewL == null && context != context2) {
            viewL = t(context2, str, attributeSet);
        }
        if (viewL != null) {
            b(viewL, attributeSet);
            a(context2, viewL, attributeSet);
        }
        return viewL;
    }

    public final View s(Context context, String str, String str2) {
        String str3;
        J j10 = f36749h;
        Constructor constructor = (Constructor) j10.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f36743b);
            j10.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f36750a);
    }

    public final View t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, Constants.CLASS);
        }
        try {
            Object[] objArr = this.f36750a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return s(context, str, null);
            }
            int i10 = 0;
            while (true) {
                String[] strArr = f36748g;
                if (i10 >= strArr.length) {
                    return null;
                }
                View viewS = s(context, str, strArr[i10]);
                if (viewS != null) {
                    return viewS;
                }
                i10++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f36750a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    public final void v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    public final void a(Context context, View view, AttributeSet attributeSet) {
    }
}
