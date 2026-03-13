package androidx.preference;

import T2.c;
import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final Context f23902V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final ArrayAdapter f23903W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public Spinner f23904X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final AdapterView.OnItemSelectedListener f23905Y;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f16068c);
    }

    @Override // androidx.preference.Preference
    public void F() {
        super.F();
        ArrayAdapter arrayAdapter = this.f23903W;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public void H() {
        this.f23904X.performClick();
    }

    public ArrayAdapter a0() {
        return new ArrayAdapter(this.f23902V, R.layout.simple_spinner_dropdown_item);
    }

    public final void b0() {
        this.f23903W.clear();
        if (U() != null) {
            for (CharSequence charSequence : U()) {
                this.f23903W.add(charSequence.toString());
            }
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f23905Y = new a();
        this.f23902V = context;
        this.f23903W = a0();
        b0();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            if (i10 >= 0) {
                String string = DropDownPreference.this.W()[i10].toString();
                if (string.equals(DropDownPreference.this.X()) || !DropDownPreference.this.a(string)) {
                    return;
                }
                DropDownPreference.this.Z(string);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }
}
