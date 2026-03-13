package androidx.appcompat.app;

import Y0.E;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.b;
import androidx.core.widget.NestedScrollView;
import h.AbstractC4262a;
import h.f;
import h.j;
import i.l;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class AlertController {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public NestedScrollView f21359A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Drawable f21361C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ImageView f21362D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public TextView f21363E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public TextView f21364F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public View f21365G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ListAdapter f21366H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f21368J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f21369K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f21370L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f21371M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f21372N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f21373O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f21374P;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public Handler f21376R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f21379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f21380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f21382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f21383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ListView f21384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f21385h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21386i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f21387j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21388k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f21389l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f21390m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f21392o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f21393p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Message f21394q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f21395r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Button f21396s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CharSequence f21397t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Message f21398u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f21399v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Button f21400w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f21401x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Message f21402y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Drawable f21403z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f21391n = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f21360B = 0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f21367I = -1;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f21375Q = 0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final View.OnClickListener f21377S = new a();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f21405b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f36059c2);
            this.f21405b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(j.f36064d2, -1);
            this.f21404a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(j.f36069e2, -1);
        }

        public void a(boolean z10, boolean z11) {
            if (z11 && z10) {
                return;
            }
            setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f21404a, getPaddingRight(), z11 ? getPaddingBottom() : this.f21405b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message messageObtain = (view != alertController.f21392o || (message3 = alertController.f21394q) == null) ? (view != alertController.f21396s || (message2 = alertController.f21398u) == null) ? (view != alertController.f21400w || (message = alertController.f21402y) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f21376R.obtainMessage(1, alertController2.f21379b).sendToTarget();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f21407A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f21408B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f21409C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public int f21410D;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public boolean[] f21412F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public boolean f21413G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public boolean f21414H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public DialogInterface.OnMultiChoiceClickListener f21416J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public Cursor f21417K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public String f21418L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public String f21419M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public AdapterView.OnItemSelectedListener f21420N;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f21422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LayoutInflater f21423b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Drawable f21425d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f21427f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f21428g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f21429h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public CharSequence f21430i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Drawable f21431j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f21432k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f21433l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Drawable f21434m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f21435n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public CharSequence f21436o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Drawable f21437p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f21438q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f21440s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f21441t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f21442u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public CharSequence[] f21443v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ListAdapter f21444w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f21445x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f21446y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public View f21447z;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f21424c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f21426e = 0;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public boolean f21411E = false;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int f21415I = -1;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public boolean f21421O = true;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f21439r = true;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a extends ArrayAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ RecycleListView f21448a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f21448a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = b.this.f21412F;
                if (zArr != null && zArr[i10]) {
                    this.f21448a.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class C0269b extends CursorAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f21450a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f21451b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ RecycleListView f21452c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ AlertController f21453d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0269b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f21452c = recycleListView;
                this.f21453d = alertController;
                Cursor cursor2 = getCursor();
                this.f21450a = cursor2.getColumnIndexOrThrow(b.this.f21418L);
                this.f21451b = cursor2.getColumnIndexOrThrow(b.this.f21419M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f21450a));
                this.f21452c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f21451b) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.f21423b.inflate(this.f21453d.f21371M, viewGroup, false);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class c implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AlertController f21455a;

            public c(AlertController alertController) {
                this.f21455a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                b.this.f21445x.onClick(this.f21455a.f21379b, i10);
                if (b.this.f21414H) {
                    return;
                }
                this.f21455a.f21379b.dismiss();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class d implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ RecycleListView f21457a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AlertController f21458b;

            public d(RecycleListView recycleListView, AlertController alertController) {
                this.f21457a = recycleListView;
                this.f21458b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                boolean[] zArr = b.this.f21412F;
                if (zArr != null) {
                    zArr[i10] = this.f21457a.isItemChecked(i10);
                }
                b.this.f21416J.onClick(this.f21458b.f21379b, i10, this.f21457a.isItemChecked(i10));
            }
        }

        public b(Context context) {
            this.f21422a = context;
            this.f21423b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        public void a(AlertController alertController) {
            AlertController alertController2;
            View view = this.f21428g;
            if (view != null) {
                alertController.k(view);
            } else {
                CharSequence charSequence = this.f21427f;
                if (charSequence != null) {
                    alertController.p(charSequence);
                }
                Drawable drawable = this.f21425d;
                if (drawable != null) {
                    alertController.m(drawable);
                }
                int i10 = this.f21424c;
                if (i10 != 0) {
                    alertController.l(i10);
                }
                int i11 = this.f21426e;
                if (i11 != 0) {
                    alertController.l(alertController.c(i11));
                }
            }
            CharSequence charSequence2 = this.f21429h;
            if (charSequence2 != null) {
                alertController.n(charSequence2);
            }
            CharSequence charSequence3 = this.f21430i;
            if (charSequence3 == null && this.f21431j == null) {
                alertController2 = alertController;
            } else {
                alertController.j(-1, charSequence3, this.f21432k, null, this.f21431j);
                alertController2 = alertController;
            }
            CharSequence charSequence4 = this.f21433l;
            if (charSequence4 != null || this.f21434m != null) {
                alertController2.j(-2, charSequence4, this.f21435n, null, this.f21434m);
            }
            CharSequence charSequence5 = this.f21436o;
            if (charSequence5 != null || this.f21437p != null) {
                alertController2.j(-3, charSequence5, this.f21438q, null, this.f21437p);
            }
            if (this.f21443v != null || this.f21417K != null || this.f21444w != null) {
                b(alertController2);
            }
            View view2 = this.f21447z;
            if (view2 != null) {
                if (this.f21411E) {
                    alertController2.s(view2, this.f21407A, this.f21408B, this.f21409C, this.f21410D);
                    return;
                } else {
                    alertController2.r(view2);
                    return;
                }
            }
            int i12 = this.f21446y;
            if (i12 != 0) {
                alertController2.q(i12);
            }
        }

        public final void b(AlertController alertController) {
            b bVar;
            AlertController alertController2;
            ListAdapter dVar;
            RecycleListView recycleListView = (RecycleListView) this.f21423b.inflate(alertController.f21370L, (ViewGroup) null);
            if (!this.f21413G) {
                bVar = this;
                alertController2 = alertController;
                int i10 = bVar.f21414H ? alertController2.f21372N : alertController2.f21373O;
                if (bVar.f21417K != null) {
                    dVar = new SimpleCursorAdapter(bVar.f21422a, i10, bVar.f21417K, new String[]{bVar.f21418L}, new int[]{R.id.text1});
                } else {
                    dVar = bVar.f21444w;
                    if (dVar == null) {
                        dVar = new d(bVar.f21422a, i10, R.id.text1, bVar.f21443v);
                    }
                }
            } else if (this.f21417K == null) {
                bVar = this;
                dVar = bVar.new a(this.f21422a, alertController.f21371M, R.id.text1, this.f21443v, recycleListView);
                recycleListView = recycleListView;
                alertController2 = alertController;
            } else {
                bVar = this;
                alertController2 = alertController;
                dVar = bVar.new C0269b(bVar.f21422a, bVar.f21417K, false, recycleListView, alertController2);
            }
            alertController2.f21366H = dVar;
            alertController2.f21367I = bVar.f21415I;
            if (bVar.f21445x != null) {
                recycleListView.setOnItemClickListener(bVar.new c(alertController2));
            } else if (bVar.f21416J != null) {
                recycleListView.setOnItemClickListener(bVar.new d(recycleListView, alertController2));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = bVar.f21420N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (bVar.f21414H) {
                recycleListView.setChoiceMode(1);
            } else if (bVar.f21413G) {
                recycleListView.setChoiceMode(2);
            }
            alertController2.f21384g = recycleListView;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference f21460a;

        public c(DialogInterface dialogInterface) {
            this.f21460a = new WeakReference(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f21460a.get(), message.what);
            } else {
                if (i10 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d extends ArrayAdapter {
        public d(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, l lVar, Window window) {
        this.f21378a = context;
        this.f21379b = lVar;
        this.f21380c = window;
        this.f21376R = new c(lVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, j.f35962F, AbstractC4262a.f35802k, 0);
        this.f21368J = typedArrayObtainStyledAttributes.getResourceId(j.f35966G, 0);
        this.f21369K = typedArrayObtainStyledAttributes.getResourceId(j.f35974I, 0);
        this.f21370L = typedArrayObtainStyledAttributes.getResourceId(j.f35982K, 0);
        this.f21371M = typedArrayObtainStyledAttributes.getResourceId(j.f35986L, 0);
        this.f21372N = typedArrayObtainStyledAttributes.getResourceId(j.f35994N, 0);
        this.f21373O = typedArrayObtainStyledAttributes.getResourceId(j.f35978J, 0);
        this.f21374P = typedArrayObtainStyledAttributes.getBoolean(j.f35990M, true);
        this.f21381d = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f35970H, 0);
        typedArrayObtainStyledAttributes.recycle();
        lVar.q(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static boolean y(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC4262a.f35801j, typedValue, true);
        return typedValue.data != 0;
    }

    public final void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public int c(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f21378a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.f21384g;
    }

    public void e() {
        this.f21379b.setContentView(i());
        x();
    }

    public boolean f(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f21359A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public boolean g(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f21359A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public final ViewGroup h(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final int i() {
        int i10 = this.f21369K;
        return i10 == 0 ? this.f21368J : this.f21375Q == 1 ? i10 : this.f21368J;
    }

    public void j(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f21376R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f21401x = charSequence;
            this.f21402y = message;
            this.f21403z = drawable;
        } else if (i10 == -2) {
            this.f21397t = charSequence;
            this.f21398u = message;
            this.f21399v = drawable;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f21393p = charSequence;
            this.f21394q = message;
            this.f21395r = drawable;
        }
    }

    public void k(View view) {
        this.f21365G = view;
    }

    public void l(int i10) {
        this.f21361C = null;
        this.f21360B = i10;
        ImageView imageView = this.f21362D;
        if (imageView != null) {
            if (i10 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f21362D.setImageResource(this.f21360B);
            }
        }
    }

    public void m(Drawable drawable) {
        this.f21361C = drawable;
        this.f21360B = 0;
        ImageView imageView = this.f21362D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f21362D.setImageDrawable(drawable);
            }
        }
    }

    public void n(CharSequence charSequence) {
        this.f21383f = charSequence;
        TextView textView = this.f21364F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void o(ViewGroup viewGroup, View view, int i10, int i11) {
        View viewFindViewById = this.f21380c.findViewById(f.f35901t);
        View viewFindViewById2 = this.f21380c.findViewById(f.f35900s);
        E.s0(view, i10, i11);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    public void p(CharSequence charSequence) {
        this.f21382e = charSequence;
        TextView textView = this.f21363E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(int i10) {
        this.f21385h = null;
        this.f21386i = i10;
        this.f21391n = false;
    }

    public void r(View view) {
        this.f21385h = view;
        this.f21386i = 0;
        this.f21391n = false;
    }

    public void s(View view, int i10, int i11, int i12, int i13) {
        this.f21385h = view;
        this.f21386i = 0;
        this.f21391n = true;
        this.f21387j = i10;
        this.f21388k = i11;
        this.f21389l = i12;
        this.f21390m = i13;
    }

    public final void t(ViewGroup viewGroup) {
        int i10;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f21392o = button;
        button.setOnClickListener(this.f21377S);
        if (TextUtils.isEmpty(this.f21393p) && this.f21395r == null) {
            this.f21392o.setVisibility(8);
            i10 = 0;
        } else {
            this.f21392o.setText(this.f21393p);
            Drawable drawable = this.f21395r;
            if (drawable != null) {
                int i11 = this.f21381d;
                drawable.setBounds(0, 0, i11, i11);
                this.f21392o.setCompoundDrawables(this.f21395r, null, null, null);
            }
            this.f21392o.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f21396s = button2;
        button2.setOnClickListener(this.f21377S);
        if (TextUtils.isEmpty(this.f21397t) && this.f21399v == null) {
            this.f21396s.setVisibility(8);
        } else {
            this.f21396s.setText(this.f21397t);
            Drawable drawable2 = this.f21399v;
            if (drawable2 != null) {
                int i12 = this.f21381d;
                drawable2.setBounds(0, 0, i12, i12);
                this.f21396s.setCompoundDrawables(this.f21399v, null, null, null);
            }
            this.f21396s.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f21400w = button3;
        button3.setOnClickListener(this.f21377S);
        if (TextUtils.isEmpty(this.f21401x) && this.f21403z == null) {
            this.f21400w.setVisibility(8);
        } else {
            this.f21400w.setText(this.f21401x);
            Drawable drawable3 = this.f21403z;
            if (drawable3 != null) {
                int i13 = this.f21381d;
                drawable3.setBounds(0, 0, i13, i13);
                this.f21400w.setCompoundDrawables(this.f21403z, null, null, null);
            }
            this.f21400w.setVisibility(0);
            i10 |= 4;
        }
        if (y(this.f21378a)) {
            if (i10 == 1) {
                b(this.f21392o);
            } else if (i10 == 2) {
                b(this.f21396s);
            } else if (i10 == 4) {
                b(this.f21400w);
            }
        }
        if (i10 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    public final void u(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f21380c.findViewById(f.f35902u);
        this.f21359A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f21359A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f21364F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f21383f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f21359A.removeView(this.f21364F);
        if (this.f21384g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f21359A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.f21359A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f21384g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    public final void v(ViewGroup viewGroup) {
        View viewInflate = this.f21385h;
        if (viewInflate == null) {
            viewInflate = this.f21386i != 0 ? LayoutInflater.from(this.f21378a).inflate(this.f21386i, viewGroup, false) : null;
        }
        boolean z10 = viewInflate != null;
        if (!z10 || !a(viewInflate)) {
            this.f21380c.setFlags(131072, 131072);
        }
        if (!z10) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f21380c.findViewById(f.f35895n);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f21391n) {
            frameLayout.setPadding(this.f21387j, this.f21388k, this.f21389l, this.f21390m);
        }
        if (this.f21384g != null) {
            ((LinearLayout.LayoutParams) ((b.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    public final void w(ViewGroup viewGroup) {
        if (this.f21365G != null) {
            viewGroup.addView(this.f21365G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f21380c.findViewById(f.f35880D).setVisibility(8);
            return;
        }
        this.f21362D = (ImageView) this.f21380c.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.f21382e) || !this.f21374P) {
            this.f21380c.findViewById(f.f35880D).setVisibility(8);
            this.f21362D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f21380c.findViewById(f.f35891j);
        this.f21363E = textView;
        textView.setText(this.f21382e);
        int i10 = this.f21360B;
        if (i10 != 0) {
            this.f21362D.setImageResource(i10);
            return;
        }
        Drawable drawable = this.f21361C;
        if (drawable != null) {
            this.f21362D.setImageDrawable(drawable);
        } else {
            this.f21363E.setPadding(this.f21362D.getPaddingLeft(), this.f21362D.getPaddingTop(), this.f21362D.getPaddingRight(), this.f21362D.getPaddingBottom());
            this.f21362D.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f21380c.findViewById(f.f35899r);
        View viewFindViewById4 = viewFindViewById3.findViewById(f.f35881E);
        View viewFindViewById5 = viewFindViewById3.findViewById(f.f35894m);
        View viewFindViewById6 = viewFindViewById3.findViewById(f.f35892k);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(f.f35896o);
        v(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(f.f35881E);
        View viewFindViewById8 = viewGroup.findViewById(f.f35894m);
        View viewFindViewById9 = viewGroup.findViewById(f.f35892k);
        ViewGroup viewGroupH = h(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupH2 = h(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupH3 = h(viewFindViewById9, viewFindViewById6);
        u(viewGroupH2);
        t(viewGroupH3);
        w(viewGroupH);
        boolean z10 = viewGroup.getVisibility() != 8;
        boolean z11 = (viewGroupH == null || viewGroupH.getVisibility() == 8) ? 0 : 1;
        boolean z12 = (viewGroupH3 == null || viewGroupH3.getVisibility() == 8) ? false : true;
        if (!z12 && viewGroupH2 != null && (viewFindViewById2 = viewGroupH2.findViewById(f.f35907z)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z11 != 0) {
            NestedScrollView nestedScrollView = this.f21359A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f21383f == null && this.f21384g == null) ? null : viewGroupH.findViewById(f.f35879C);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupH2 != null && (viewFindViewById = viewGroupH2.findViewById(f.f35877A)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f21384g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z11, z12);
        }
        if (!z10) {
            View view = this.f21384g;
            if (view == null) {
                view = this.f21359A;
            }
            if (view != null) {
                o(viewGroupH2, view, z11 | (z12 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f21384g;
        if (listView2 == null || (listAdapter = this.f21366H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i10 = this.f21367I;
        if (i10 > -1) {
            listView2.setItemChecked(i10, true);
            listView2.setSelection(i10);
        }
    }
}
