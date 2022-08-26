/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package ru.tinkoff.sme.cryptobpm.requests;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Entrepreneur extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3858392608655988154L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Entrepreneur\",\"namespace\":\"ru.tinkoff.sme.cryptobpm.requests\",\"fields\":[{\"name\":\"innFl\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"ogrnip\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"snils\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Entrepreneur> ENCODER =
      new BinaryMessageEncoder<Entrepreneur>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Entrepreneur> DECODER =
      new BinaryMessageDecoder<Entrepreneur>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Entrepreneur> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Entrepreneur> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Entrepreneur> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Entrepreneur>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Entrepreneur to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Entrepreneur from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Entrepreneur instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Entrepreneur fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.String innFl;
  @Deprecated public java.lang.String ogrnip;
  @Deprecated public java.lang.String snils;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Entrepreneur() {}

  /**
   * All-args constructor.
   * @param innFl The new value for innFl
   * @param ogrnip The new value for ogrnip
   * @param snils The new value for snils
   */
  public Entrepreneur(java.lang.String innFl, java.lang.String ogrnip, java.lang.String snils) {
    this.innFl = innFl;
    this.ogrnip = ogrnip;
    this.snils = snils;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return innFl;
    case 1: return ogrnip;
    case 2: return snils;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: innFl = value$ != null ? value$.toString() : null; break;
    case 1: ogrnip = value$ != null ? value$.toString() : null; break;
    case 2: snils = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'innFl' field.
   * @return The value of the 'innFl' field.
   */
  public java.lang.String getInnFl() {
    return innFl;
  }


  /**
   * Sets the value of the 'innFl' field.
   * @param value the value to set.
   */
  public void setInnFl(java.lang.String value) {
    this.innFl = value;
  }

  /**
   * Gets the value of the 'ogrnip' field.
   * @return The value of the 'ogrnip' field.
   */
  public java.lang.String getOgrnip() {
    return ogrnip;
  }


  /**
   * Sets the value of the 'ogrnip' field.
   * @param value the value to set.
   */
  public void setOgrnip(java.lang.String value) {
    this.ogrnip = value;
  }

  /**
   * Gets the value of the 'snils' field.
   * @return The value of the 'snils' field.
   */
  public java.lang.String getSnils() {
    return snils;
  }


  /**
   * Sets the value of the 'snils' field.
   * @param value the value to set.
   */
  public void setSnils(java.lang.String value) {
    this.snils = value;
  }

  /**
   * Creates a new Entrepreneur RecordBuilder.
   * @return A new Entrepreneur RecordBuilder
   */
  public static ru.tinkoff.sme.cryptobpm.requests.Entrepreneur.Builder newBuilder() {
    return new ru.tinkoff.sme.cryptobpm.requests.Entrepreneur.Builder();
  }

  /**
   * Creates a new Entrepreneur RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Entrepreneur RecordBuilder
   */
  public static ru.tinkoff.sme.cryptobpm.requests.Entrepreneur.Builder newBuilder(ru.tinkoff.sme.cryptobpm.requests.Entrepreneur.Builder other) {
    if (other == null) {
      return new ru.tinkoff.sme.cryptobpm.requests.Entrepreneur.Builder();
    } else {
      return new ru.tinkoff.sme.cryptobpm.requests.Entrepreneur.Builder(other);
    }
  }

  /**
   * Creates a new Entrepreneur RecordBuilder by copying an existing Entrepreneur instance.
   * @param other The existing instance to copy.
   * @return A new Entrepreneur RecordBuilder
   */
  public static ru.tinkoff.sme.cryptobpm.requests.Entrepreneur.Builder newBuilder(ru.tinkoff.sme.cryptobpm.requests.Entrepreneur other) {
    if (other == null) {
      return new ru.tinkoff.sme.cryptobpm.requests.Entrepreneur.Builder();
    } else {
      return new ru.tinkoff.sme.cryptobpm.requests.Entrepreneur.Builder(other);
    }
  }

  /**
   * RecordBuilder for Entrepreneur instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Entrepreneur>
    implements org.apache.avro.data.RecordBuilder<Entrepreneur> {

    private java.lang.String innFl;
    private java.lang.String ogrnip;
    private java.lang.String snils;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(ru.tinkoff.sme.cryptobpm.requests.Entrepreneur.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.innFl)) {
        this.innFl = data().deepCopy(fields()[0].schema(), other.innFl);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.ogrnip)) {
        this.ogrnip = data().deepCopy(fields()[1].schema(), other.ogrnip);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.snils)) {
        this.snils = data().deepCopy(fields()[2].schema(), other.snils);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing Entrepreneur instance
     * @param other The existing instance to copy.
     */
    private Builder(ru.tinkoff.sme.cryptobpm.requests.Entrepreneur other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.innFl)) {
        this.innFl = data().deepCopy(fields()[0].schema(), other.innFl);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ogrnip)) {
        this.ogrnip = data().deepCopy(fields()[1].schema(), other.ogrnip);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.snils)) {
        this.snils = data().deepCopy(fields()[2].schema(), other.snils);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'innFl' field.
      * @return The value.
      */
    public java.lang.String getInnFl() {
      return innFl;
    }


    /**
      * Sets the value of the 'innFl' field.
      * @param value The value of 'innFl'.
      * @return This builder.
      */
    public ru.tinkoff.sme.cryptobpm.requests.Entrepreneur.Builder setInnFl(java.lang.String value) {
      validate(fields()[0], value);
      this.innFl = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'innFl' field has been set.
      * @return True if the 'innFl' field has been set, false otherwise.
      */
    public boolean hasInnFl() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'innFl' field.
      * @return This builder.
      */
    public ru.tinkoff.sme.cryptobpm.requests.Entrepreneur.Builder clearInnFl() {
      innFl = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'ogrnip' field.
      * @return The value.
      */
    public java.lang.String getOgrnip() {
      return ogrnip;
    }


    /**
      * Sets the value of the 'ogrnip' field.
      * @param value The value of 'ogrnip'.
      * @return This builder.
      */
    public ru.tinkoff.sme.cryptobpm.requests.Entrepreneur.Builder setOgrnip(java.lang.String value) {
      validate(fields()[1], value);
      this.ogrnip = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'ogrnip' field has been set.
      * @return True if the 'ogrnip' field has been set, false otherwise.
      */
    public boolean hasOgrnip() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'ogrnip' field.
      * @return This builder.
      */
    public ru.tinkoff.sme.cryptobpm.requests.Entrepreneur.Builder clearOgrnip() {
      ogrnip = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'snils' field.
      * @return The value.
      */
    public java.lang.String getSnils() {
      return snils;
    }


    /**
      * Sets the value of the 'snils' field.
      * @param value The value of 'snils'.
      * @return This builder.
      */
    public ru.tinkoff.sme.cryptobpm.requests.Entrepreneur.Builder setSnils(java.lang.String value) {
      validate(fields()[2], value);
      this.snils = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'snils' field has been set.
      * @return True if the 'snils' field has been set, false otherwise.
      */
    public boolean hasSnils() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'snils' field.
      * @return This builder.
      */
    public ru.tinkoff.sme.cryptobpm.requests.Entrepreneur.Builder clearSnils() {
      snils = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Entrepreneur build() {
      try {
        Entrepreneur record = new Entrepreneur();
        record.innFl = fieldSetFlags()[0] ? this.innFl : (java.lang.String) defaultValue(fields()[0]);
        record.ogrnip = fieldSetFlags()[1] ? this.ogrnip : (java.lang.String) defaultValue(fields()[1]);
        record.snils = fieldSetFlags()[2] ? this.snils : (java.lang.String) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Entrepreneur>
    WRITER$ = (org.apache.avro.io.DatumWriter<Entrepreneur>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Entrepreneur>
    READER$ = (org.apache.avro.io.DatumReader<Entrepreneur>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.innFl);

    out.writeString(this.ogrnip);

    if (this.snils == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.snils);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.innFl = in.readString();

      this.ogrnip = in.readString();

      if (in.readIndex() != 1) {
        in.readNull();
        this.snils = null;
      } else {
        this.snils = in.readString();
      }

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.innFl = in.readString();
          break;

        case 1:
          this.ogrnip = in.readString();
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.snils = null;
          } else {
            this.snils = in.readString();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










