//
// Model.java
// Autogenerated by plank
//
// DO NOT EDIT - EDITS WILL BE OVERWRITTEN
// @generated
//

package com.pinterest.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Model {

    public static final String TYPE = "model";

    @SerializedName("id") private @Nullable String uid;

    static final private int ID_INDEX = 0;

    private boolean[] _bits = new boolean[1];

    private Model(
        @Nullable String uid,
        boolean[] _bits
    ) {
        this.uid = uid;
        this._bits = _bits;
    }

    public static Model.Builder builder() {
        return new Model.Builder();
    }

    public Model.Builder toBuilder() {
        return new Model.Builder(this);
    }

    public Model mergeFrom(Model model) {
        Model.Builder builder = this.toBuilder();
        builder.mergeFrom(model);
        return builder.build();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Model that = (Model) o;
        return Objects.equals(this.uid, that.uid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid);
    }

    public @Nullable String getUid() {
        return this.uid;
    }

    public boolean getUidIsSet() {
        return this._bits.length > ID_INDEX && this._bits[ID_INDEX];
    }

    public static class Builder {

        private @Nullable String uid;

        private boolean[] _bits = new boolean[1];

        private Builder() {
        }

        private Builder(@NonNull Model model) {
            this.uid = model.uid;
            this._bits = model._bits;
        }

        public Builder setUid(@Nullable String value) {
            this.uid = value;
            if (this._bits.length > ID_INDEX) {
                this._bits[ID_INDEX] = true;
            }
            return this;
        }

        public @Nullable String getUid() {
            return this.uid;
        }

        @NonNull
        public Model build() {
            return new Model(
            this.uid,
            this._bits
            );
        }

        public void mergeFrom(Model model) {
            if (model.getUidIsSet()) {
                this.uid = model.uid;
                if (this._bits.length > ID_INDEX) {
                    this._bits[ID_INDEX] = true;
                }
            }
        }
    }

    public static class ModelTypeAdapterFactory implements TypeAdapterFactory {

        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (!Model.class.isAssignableFrom(typeToken.getRawType())) {
                return null;
            }
            return (TypeAdapter<T>) new ModelTypeAdapter(gson, this, typeToken);
        }
    }

    public static class ModelTypeAdapter extends TypeAdapter<Model> {

        final private ModelTypeAdapterFactory factory;
        final private Gson gson;
        final private TypeToken typeToken;
        private TypeAdapter<Model> delegateTypeAdapter;

        private TypeAdapter<String> stringTypeAdapter;

        public ModelTypeAdapter(Gson gson, ModelTypeAdapterFactory factory, TypeToken typeToken) {
            this.factory = factory;
            this.gson = gson;
            this.typeToken = typeToken;
        }

        @Override
        public void write(JsonWriter writer, Model value) throws IOException {
            if (this.delegateTypeAdapter == null) {
                this.delegateTypeAdapter = this.gson.getDelegateAdapter(this.factory, this.typeToken);
            }
            writer.setSerializeNulls(false);
            this.delegateTypeAdapter.write(writer, value);
        }

        @Override
        public Model read(JsonReader reader) throws IOException {
            if (reader.peek() == JsonToken.NULL) {
                reader.nextNull();
                return null;
            }
            Builder builder = Model.builder();
            boolean[] bits = null;
            reader.beginObject();
            while (reader.hasNext()) {
                String name = reader.nextName();
                switch (name) {
                    case ("id"):
                        if (this.stringTypeAdapter == null) {
                            this.stringTypeAdapter = this.gson.getAdapter(String.class).nullSafe();
                        }
                        builder.setUid(this.stringTypeAdapter.read(reader));
                        break;
                    case ("_bits"):
                        bits = new boolean[1];
                        int i = 0;
                        reader.beginArray();
                        while (reader.hasNext() && i < 1) {
                            bits[i] = reader.nextBoolean();
                            i++;
                        }
                        reader.endArray();
                        break;
                    default:
                        reader.skipValue();
                }
            }
            reader.endObject();
            if (bits != null) {
                builder._bits = bits;
            }
            return builder.build();
        }
    }
}
