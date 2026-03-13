package io.flutter.embedding.engine.systemchannels;

import android.os.Bundle;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.JSONMethodCodec;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.editing.TextEditingDelta;
import io.sentry.protocol.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class TextInputChannel {
    private static final String TAG = "TextInputChannel";
    public final MethodChannel channel;
    final MethodChannel.MethodCallHandler parsingMethodHandler;
    private TextInputMethodHandler textInputMethodHandler;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Configuration {
        public final String actionLabel;
        public final boolean autocorrect;
        public final Autofill autofill;
        public final String[] contentCommitMimeTypes;
        public final boolean enableDeltaModel;
        public final boolean enableIMEPersonalizedLearning;
        public final boolean enableSuggestions;
        public final Configuration[] fields;
        public final Locale[] hintLocales;
        public final Integer inputAction;
        public final InputType inputType;
        public final boolean obscureText;
        public final TextCapitalization textCapitalization;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class Autofill {
            public final TextEditState editState;
            public final String hintText;
            public final String[] hints;
            public final String uniqueIdentifier;

            public Autofill(String str, String[] strArr, String str2, TextEditState textEditState) {
                this.uniqueIdentifier = str;
                this.hints = strArr;
                this.hintText = str2;
                this.editState = textEditState;
            }

            public static Autofill fromJson(JSONObject jSONObject) throws JSONException {
                String string = jSONObject.getString("uniqueIdentifier");
                JSONArray jSONArray = jSONObject.getJSONArray("hints");
                String string2 = jSONObject.isNull("hintText") ? null : jSONObject.getString("hintText");
                JSONObject jSONObject2 = jSONObject.getJSONObject("editingValue");
                String[] strArr = new String[jSONArray.length()];
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    strArr[i10] = translateAutofillHint(jSONArray.getString(i10));
                }
                return new Autofill(string, strArr, string2, TextEditState.fromJson(jSONObject2));
            }

            private static String translateAutofillHint(String str) {
                str.getClass();
                switch (str) {
                    case "birthdayYear":
                        return "birthDateYear";
                    case "oneTimeCode":
                        return "smsOTPCode";
                    case "creditCardExpirationMonth":
                        return "creditCardExpirationMonth";
                    case "telephoneNumberNational":
                        return "phoneNational";
                    case "newPassword":
                        return "newPassword";
                    case "creditCardSecurityCode":
                        return "creditCardSecurityCode";
                    case "creditCardExpirationDay":
                        return "creditCardExpirationDay";
                    case "fullStreetAddress":
                        return "streetAddress";
                    case "telephoneNumberDevice":
                        return "phoneNumberDevice";
                    case "countryName":
                        return "addressCountry";
                    case "middleInitial":
                        return "personMiddleInitial";
                    case "addressCity":
                        return "addressLocality";
                    case "gender":
                        return "gender";
                    case "postalAddressExtendedPostalCode":
                        return "extendedPostalCode";
                    case "creditCardNumber":
                        return "creditCardNumber";
                    case "namePrefix":
                        return "personNamePrefix";
                    case "middleName":
                        return "personMiddleName";
                    case "nameSuffix":
                        return "personNameSuffix";
                    case "creditCardExpirationDate":
                        return "creditCardExpirationDate";
                    case "creditCardExpirationYear":
                        return "creditCardExpirationYear";
                    case "telephoneNumberCountryCode":
                        return "phoneCountryCode";
                    case "username":
                        return User.JsonKeys.USERNAME;
                    case "name":
                        return "personName";
                    case "email":
                        return "emailAddress";
                    case "addressState":
                        return "addressRegion";
                    case "birthdayMonth":
                        return "birthDateMonth";
                    case "familyName":
                        return "personFamilyName";
                    case "telephoneNumber":
                        return "phoneNumber";
                    case "newUsername":
                        return "newUsername";
                    case "birthday":
                        return "birthDateFull";
                    case "password":
                        return "password";
                    case "givenName":
                        return "personGivenName";
                    case "postalAddress":
                        return "postalAddress";
                    case "postalAddressExtended":
                        return "extendedAddress";
                    case "postalCode":
                        return "postalCode";
                    case "birthdayDay":
                        return "birthDateDay";
                    default:
                        return str;
                }
            }
        }

        public Configuration(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, TextCapitalization textCapitalization, InputType inputType, Integer num, String str, Autofill autofill, String[] strArr, Configuration[] configurationArr, Locale[] localeArr) {
            this.obscureText = z10;
            this.autocorrect = z11;
            this.enableSuggestions = z12;
            this.enableIMEPersonalizedLearning = z13;
            this.enableDeltaModel = z14;
            this.textCapitalization = textCapitalization;
            this.inputType = inputType;
            this.inputAction = num;
            this.actionLabel = str;
            this.autofill = autofill;
            this.contentCommitMimeTypes = strArr;
            this.fields = configurationArr;
            this.hintLocales = localeArr;
        }

        public static Configuration fromJson(JSONObject jSONObject) throws JSONException {
            Configuration[] configurationArr;
            Locale[] localeArr;
            String string = jSONObject.getString("inputAction");
            if (string == null) {
                throw new JSONException("Configuration JSON missing 'inputAction' property.");
            }
            if (jSONObject.isNull("fields")) {
                configurationArr = null;
            } else {
                JSONArray jSONArray = jSONObject.getJSONArray("fields");
                int length = jSONArray.length();
                Configuration[] configurationArr2 = new Configuration[length];
                for (int i10 = 0; i10 < length; i10++) {
                    configurationArr2[i10] = fromJson(jSONArray.getJSONObject(i10));
                }
                configurationArr = configurationArr2;
            }
            Integer numInputActionFromTextInputAction = inputActionFromTextInputAction(string);
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray2 = jSONObject.isNull("contentCommitMimeTypes") ? null : jSONObject.getJSONArray("contentCommitMimeTypes");
            if (jSONArray2 != null) {
                for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                    arrayList.add(jSONArray2.optString(i11));
                }
            }
            if (jSONObject.isNull("hintLocales")) {
                localeArr = null;
            } else {
                JSONArray jSONArray3 = jSONObject.getJSONArray("hintLocales");
                Locale[] localeArr2 = new Locale[jSONArray3.length()];
                for (int i12 = 0; i12 < jSONArray3.length(); i12++) {
                    localeArr2[i12] = Locale.forLanguageTag(jSONArray3.optString(i12));
                }
                localeArr = localeArr2;
            }
            return new Configuration(jSONObject.optBoolean("obscureText"), jSONObject.optBoolean("autocorrect", true), jSONObject.optBoolean("enableSuggestions"), jSONObject.optBoolean("enableIMEPersonalizedLearning"), jSONObject.optBoolean("enableDeltaModel"), TextCapitalization.fromValue(jSONObject.getString("textCapitalization")), InputType.fromJson(jSONObject.getJSONObject("inputType")), numInputActionFromTextInputAction, jSONObject.isNull("actionLabel") ? null : jSONObject.getString("actionLabel"), jSONObject.isNull("autofill") ? null : Autofill.fromJson(jSONObject.getJSONObject("autofill")), (String[]) arrayList.toArray(new String[arrayList.size()]), configurationArr, localeArr);
        }

        private static Integer inputActionFromTextInputAction(String str) {
            str.getClass();
            switch (str) {
                case "TextInputAction.unspecified":
                    return 0;
                case "TextInputAction.done":
                    return 6;
                case "TextInputAction.next":
                    return 5;
                case "TextInputAction.none":
                    return 1;
                case "TextInputAction.send":
                    return 4;
                case "TextInputAction.search":
                    return 3;
                case "TextInputAction.go":
                    return 2;
                case "TextInputAction.newline":
                    return 1;
                case "TextInputAction.previous":
                    return 7;
                default:
                    return 0;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class InputType {
        public final boolean isDecimal;
        public final boolean isSigned;
        public final TextInputType type;

        public InputType(TextInputType textInputType, boolean z10, boolean z11) {
            this.type = textInputType;
            this.isSigned = z10;
            this.isDecimal = z11;
        }

        public static InputType fromJson(JSONObject jSONObject) {
            return new InputType(TextInputType.fromValue(jSONObject.getString("name")), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum TextCapitalization {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");

        private final String encodedName;

        TextCapitalization(String str) {
            this.encodedName = str;
        }

        public static TextCapitalization fromValue(String str) throws NoSuchFieldException {
            for (TextCapitalization textCapitalization : values()) {
                if (textCapitalization.encodedName.equals(str)) {
                    return textCapitalization;
                }
            }
            throw new NoSuchFieldException("No such TextCapitalization: " + str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class TextEditState {
        public final int composingEnd;
        public final int composingStart;
        public final int selectionEnd;
        public final int selectionStart;
        public final String text;

        public TextEditState(String str, int i10, int i11, int i12, int i13) {
            if (!(i10 == -1 && i11 == -1) && (i10 < 0 || i11 < 0)) {
                throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i10) + ", " + String.valueOf(i11) + ")");
            }
            if (!(i12 == -1 && i13 == -1) && (i12 < 0 || i12 > i13)) {
                throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i12) + ", " + String.valueOf(i13) + ")");
            }
            if (i13 > str.length()) {
                throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i12));
            }
            if (i10 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i10));
            }
            if (i11 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i11));
            }
            this.text = str;
            this.selectionStart = i10;
            this.selectionEnd = i11;
            this.composingStart = i12;
            this.composingEnd = i13;
        }

        public static TextEditState fromJson(JSONObject jSONObject) {
            return new TextEditState(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
        }

        public boolean hasComposing() {
            int i10 = this.composingStart;
            return i10 >= 0 && this.composingEnd > i10;
        }

        public boolean hasSelection() {
            return this.selectionStart >= 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface TextInputMethodHandler {
        void clearClient();

        void finishAutofillContext(boolean z10);

        void hide();

        void requestAutofill();

        void sendAppPrivateCommand(String str, Bundle bundle);

        void setClient(int i10, Configuration configuration);

        void setEditableSizeAndTransform(double d10, double d11, double[] dArr);

        void setEditingState(TextEditState textEditState);

        void setPlatformViewClient(int i10, boolean z10);

        void show();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum TextInputType {
        TEXT("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NAME("TextInputType.name"),
        POSTAL_ADDRESS("TextInputType.address"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword"),
        NONE("TextInputType.none"),
        WEB_SEARCH("TextInputType.webSearch"),
        TWITTER("TextInputType.twitter");

        private final String encodedName;

        TextInputType(String str) {
            this.encodedName = str;
        }

        public static TextInputType fromValue(String str) throws NoSuchFieldException {
            for (TextInputType textInputType : values()) {
                if (textInputType.encodedName.equals(str)) {
                    return textInputType;
                }
            }
            throw new NoSuchFieldException("No such TextInputType: " + str);
        }
    }

    public TextInputChannel(DartExecutor dartExecutor) {
        MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.TextInputChannel.1
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                Object obj;
                int i10;
                Bundle bundle;
                if (TextInputChannel.this.textInputMethodHandler == null) {
                    return;
                }
                String str = methodCall.method;
                obj = methodCall.arguments;
                Log.v(TextInputChannel.TAG, "Received '" + str + "' message.");
                str.getClass();
                switch (str) {
                    case "TextInput.setPlatformViewClient":
                        try {
                            JSONObject jSONObject = (JSONObject) obj;
                            TextInputChannel.this.textInputMethodHandler.setPlatformViewClient(jSONObject.getInt("platformViewId"), jSONObject.optBoolean("usesVirtualDisplay", false));
                            result.success(null);
                            break;
                        } catch (JSONException e10) {
                            result.error("error", e10.getMessage(), null);
                            return;
                        }
                        break;
                    case "TextInput.setEditingState":
                        try {
                            TextInputChannel.this.textInputMethodHandler.setEditingState(TextEditState.fromJson((JSONObject) obj));
                            result.success(null);
                            break;
                        } catch (JSONException e11) {
                            result.error("error", e11.getMessage(), null);
                            return;
                        }
                        break;
                    case "TextInput.setClient":
                        try {
                            JSONArray jSONArray = (JSONArray) obj;
                            TextInputChannel.this.textInputMethodHandler.setClient(jSONArray.getInt(0), Configuration.fromJson(jSONArray.getJSONObject(1)));
                            result.success(null);
                            break;
                        } catch (NoSuchFieldException | JSONException e12) {
                            result.error("error", e12.getMessage(), null);
                            return;
                        }
                        break;
                    case "TextInput.hide":
                        TextInputChannel.this.textInputMethodHandler.hide();
                        result.success(null);
                        break;
                    case "TextInput.show":
                        TextInputChannel.this.textInputMethodHandler.show();
                        result.success(null);
                        break;
                    case "TextInput.sendAppPrivateCommand":
                        try {
                            JSONObject jSONObject2 = (JSONObject) obj;
                            String string = jSONObject2.getString("action");
                            String string2 = jSONObject2.getString("data");
                            if (string2 == null || string2.isEmpty()) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString("data", string2);
                            }
                            TextInputChannel.this.textInputMethodHandler.sendAppPrivateCommand(string, bundle);
                            result.success(null);
                            break;
                        } catch (JSONException e13) {
                            result.error("error", e13.getMessage(), null);
                            return;
                        }
                        break;
                    case "TextInput.setEditableSizeAndTransform":
                        try {
                            JSONObject jSONObject3 = (JSONObject) obj;
                            double d10 = jSONObject3.getDouble("width");
                            double d11 = jSONObject3.getDouble("height");
                            JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                            double[] dArr = new double[16];
                            for (i10 = 0; i10 < 16; i10++) {
                                dArr[i10] = jSONArray2.getDouble(i10);
                            }
                            TextInputChannel.this.textInputMethodHandler.setEditableSizeAndTransform(d10, d11, dArr);
                            result.success(null);
                            break;
                        } catch (JSONException e14) {
                            result.error("error", e14.getMessage(), null);
                            return;
                        }
                        break;
                    case "TextInput.finishAutofillContext":
                        TextInputChannel.this.textInputMethodHandler.finishAutofillContext(((Boolean) obj).booleanValue());
                        result.success(null);
                        break;
                    case "TextInput.clearClient":
                        TextInputChannel.this.textInputMethodHandler.clearClient();
                        result.success(null);
                        break;
                    case "TextInput.requestAutofill":
                        TextInputChannel.this.textInputMethodHandler.requestAutofill();
                        result.success(null);
                        break;
                    default:
                        result.notImplemented();
                        break;
                }
            }
        };
        this.parsingMethodHandler = methodCallHandler;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/textinput", JSONMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }

    private static HashMap<Object, Object> createEditingDeltaJSON(ArrayList<TextEditingDelta> arrayList) {
        HashMap<Object, Object> map = new HashMap<>();
        JSONArray jSONArray = new JSONArray();
        Iterator<TextEditingDelta> it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().toJSON());
        }
        map.put("deltas", jSONArray);
        return map;
    }

    private static HashMap<Object, Object> createEditingStateJSON(String str, int i10, int i11, int i12, int i13) {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("text", str);
        map.put("selectionBase", Integer.valueOf(i10));
        map.put("selectionExtent", Integer.valueOf(i11));
        map.put("composingBase", Integer.valueOf(i12));
        map.put("composingExtent", Integer.valueOf(i13));
        return map;
    }

    public void commitContent(int i10, Map<String, Object> map) {
        Log.v(TAG, "Sending 'commitContent' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.commitContent", map));
    }

    public void done(int i10) {
        Log.v(TAG, "Sending 'done' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.done"));
    }

    public void go(int i10) {
        Log.v(TAG, "Sending 'go' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.go"));
    }

    public void newline(int i10) {
        Log.v(TAG, "Sending 'newline' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.newline"));
    }

    public void next(int i10) {
        Log.v(TAG, "Sending 'next' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.next"));
    }

    public void performPrivateCommand(int i10, String str, Bundle bundle) {
        HashMap map = new HashMap();
        map.put("action", str);
        if (bundle != null) {
            HashMap map2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    map2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    map2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    map2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    map2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    map2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    map2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    map2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    map2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            map.put("data", map2);
        }
        this.channel.invokeMethod("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(i10), map));
    }

    public void previous(int i10) {
        Log.v(TAG, "Sending 'previous' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.previous"));
    }

    public void requestExistingInputState() {
        this.channel.invokeMethod("TextInputClient.requestExistingInputState", null);
    }

    public void search(int i10) {
        Log.v(TAG, "Sending 'search' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.search"));
    }

    public void send(int i10) {
        Log.v(TAG, "Sending 'send' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.send"));
    }

    public void setTextInputMethodHandler(TextInputMethodHandler textInputMethodHandler) {
        this.textInputMethodHandler = textInputMethodHandler;
    }

    public void unspecifiedAction(int i10) {
        Log.v(TAG, "Sending 'unspecified' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i10), "TextInputAction.unspecified"));
    }

    public void updateEditingState(int i10, String str, int i11, int i12, int i13, int i14) {
        Log.v(TAG, "Sending message to update editing state: \nText: " + str + "\nSelection start: " + i11 + "\nSelection end: " + i12 + "\nComposing start: " + i13 + "\nComposing end: " + i14);
        this.channel.invokeMethod("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i10), createEditingStateJSON(str, i11, i12, i13, i14)));
    }

    public void updateEditingStateWithDeltas(int i10, ArrayList<TextEditingDelta> arrayList) {
        Log.v(TAG, "Sending message to update editing state with deltas: \nNumber of deltas: " + arrayList.size());
        this.channel.invokeMethod("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i10), createEditingDeltaJSON(arrayList)));
    }

    public void updateEditingStateWithTag(int i10, HashMap<String, TextEditState> map) {
        Log.v(TAG, "Sending message to update editing state for " + String.valueOf(map.size()) + " field(s).");
        HashMap map2 = new HashMap();
        for (Map.Entry<String, TextEditState> entry : map.entrySet()) {
            TextEditState value = entry.getValue();
            map2.put(entry.getKey(), createEditingStateJSON(value.text, value.selectionStart, value.selectionEnd, -1, -1));
        }
        this.channel.invokeMethod("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i10), map2));
    }
}
