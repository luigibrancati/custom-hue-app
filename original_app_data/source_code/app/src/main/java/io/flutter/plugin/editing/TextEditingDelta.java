package io.flutter.plugin.editing;

import io.flutter.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class TextEditingDelta {
    private static final String TAG = "TextEditingDelta";
    private int deltaEnd;
    private int deltaStart;
    private CharSequence deltaText;
    private int newComposingEnd;
    private int newComposingStart;
    private int newSelectionEnd;
    private int newSelectionStart;
    private CharSequence oldText;

    public TextEditingDelta(CharSequence charSequence, int i10, int i11, CharSequence charSequence2, int i12, int i13, int i14, int i15) {
        this.newSelectionStart = i12;
        this.newSelectionEnd = i13;
        this.newComposingStart = i14;
        this.newComposingEnd = i15;
        setDeltas(charSequence, charSequence2.toString(), i10, i11);
    }

    private void setDeltas(CharSequence charSequence, CharSequence charSequence2, int i10, int i11) {
        this.oldText = charSequence;
        this.deltaText = charSequence2;
        this.deltaStart = i10;
        this.deltaEnd = i11;
    }

    public int getDeltaEnd() {
        return this.deltaEnd;
    }

    public int getDeltaStart() {
        return this.deltaStart;
    }

    public CharSequence getDeltaText() {
        return this.deltaText;
    }

    public int getNewComposingEnd() {
        return this.newComposingEnd;
    }

    public int getNewComposingStart() {
        return this.newComposingStart;
    }

    public int getNewSelectionEnd() {
        return this.newSelectionEnd;
    }

    public int getNewSelectionStart() {
        return this.newSelectionStart;
    }

    public CharSequence getOldText() {
        return this.oldText;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oldText", this.oldText.toString());
            jSONObject.put("deltaText", this.deltaText.toString());
            jSONObject.put("deltaStart", this.deltaStart);
            jSONObject.put("deltaEnd", this.deltaEnd);
            jSONObject.put("selectionBase", this.newSelectionStart);
            jSONObject.put("selectionExtent", this.newSelectionEnd);
            jSONObject.put("composingBase", this.newComposingStart);
            jSONObject.put("composingExtent", this.newComposingEnd);
            return jSONObject;
        } catch (JSONException e10) {
            Log.e(TAG, "unable to create JSONObject: " + e10);
            return jSONObject;
        }
    }

    public TextEditingDelta(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        this.newSelectionStart = i10;
        this.newSelectionEnd = i11;
        this.newComposingStart = i12;
        this.newComposingEnd = i13;
        setDeltas(charSequence, "", -1, -1);
    }
}
