/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package ru.tinkoff.bpm.pledge.submission.registration.process;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class StartEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6996137380059963059L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"StartEvent\",\"namespace\":\"ru.tinkoff.bpm.pledge.submission.registration.process\",\"fields\":[{\"name\":\"applicationIntegrationId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"submissionType\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"submissionId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"additionalFields\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"AdditionalFields\",\"fields\":[{\"name\":\"kuvd\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"sendDate\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"local-timestamp-millis\"},{\"name\":\"mortgageRegDate\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"local-timestamp-millis\"},{\"name\":\"mortgageRegNumber\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<StartEvent> ENCODER =
      new BinaryMessageEncoder<StartEvent>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<StartEvent> DECODER =
      new BinaryMessageDecoder<StartEvent>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<StartEvent> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<StartEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<StartEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<StartEvent>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this StartEvent to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a StartEvent from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a StartEvent instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static StartEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.String applicationIntegrationId;
  @Deprecated public java.lang.String submissionType;
  @Deprecated public java.lang.String submissionId;
  @Deprecated public ru.tinkoff.bpm.pledge.submission.registration.process.AdditionalFields additionalFields;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public StartEvent() {}

  /**
   * All-args constructor.
   * @param applicationIntegrationId The new value for applicationIntegrationId
   * @param submissionType The new value for submissionType
   * @param submissionId The new value for submissionId
   * @param additionalFields The new value for additionalFields
   */
  public StartEvent(java.lang.String applicationIntegrationId, java.lang.String submissionType, java.lang.String submissionId, ru.tinkoff.bpm.pledge.submission.registration.process.AdditionalFields additionalFields) {
    this.applicationIntegrationId = applicationIntegrationId;
    this.submissionType = submissionType;
    this.submissionId = submissionId;
    this.additionalFields = additionalFields;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return applicationIntegrationId;
    case 1: return submissionType;
    case 2: return submissionId;
    case 3: return additionalFields;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: applicationIntegrationId = value$ != null ? value$.toString() : null; break;
    case 1: submissionType = value$ != null ? value$.toString() : null; break;
    case 2: submissionId = value$ != null ? value$.toString() : null; break;
    case 3: additionalFields = (ru.tinkoff.bpm.pledge.submission.registration.process.AdditionalFields)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'applicationIntegrationId' field.
   * @return The value of the 'applicationIntegrationId' field.
   */
  public java.lang.String getApplicationIntegrationId() {
    return applicationIntegrationId;
  }


  /**
   * Sets the value of the 'applicationIntegrationId' field.
   * @param value the value to set.
   */
  public void setApplicationIntegrationId(java.lang.String value) {
    this.applicationIntegrationId = value;
  }

  /**
   * Gets the value of the 'submissionType' field.
   * @return The value of the 'submissionType' field.
   */
  public java.lang.String getSubmissionType() {
    return submissionType;
  }


  /**
   * Sets the value of the 'submissionType' field.
   * @param value the value to set.
   */
  public void setSubmissionType(java.lang.String value) {
    this.submissionType = value;
  }

  /**
   * Gets the value of the 'submissionId' field.
   * @return The value of the 'submissionId' field.
   */
  public java.lang.String getSubmissionId() {
    return submissionId;
  }


  /**
   * Sets the value of the 'submissionId' field.
   * @param value the value to set.
   */
  public void setSubmissionId(java.lang.String value) {
    this.submissionId = value;
  }

  /**
   * Gets the value of the 'additionalFields' field.
   * @return The value of the 'additionalFields' field.
   */
  public ru.tinkoff.bpm.pledge.submission.registration.process.AdditionalFields getAdditionalFields() {
    return additionalFields;
  }


  /**
   * Sets the value of the 'additionalFields' field.
   * @param value the value to set.
   */
  public void setAdditionalFields(ru.tinkoff.bpm.pledge.submission.registration.process.AdditionalFields value) {
    this.additionalFields = value;
  }

  /**
   * Creates a new StartEvent RecordBuilder.
   * @return A new StartEvent RecordBuilder
   */
  public static ru.tinkoff.bpm.pledge.submission.registration.process.StartEvent.Builder newBuilder() {
    return new ru.tinkoff.bpm.pledge.submission.registration.process.StartEvent.Builder();
  }

  /**
   * Creates a new StartEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new StartEvent RecordBuilder
   */
  public static ru.tinkoff.bpm.pledge.submission.registration.process.StartEvent.Builder newBuilder(ru.tinkoff.bpm.pledge.submission.registration.process.StartEvent.Builder other) {
    if (other == null) {
      return new ru.tinkoff.bpm.pledge.submission.registration.process.StartEvent.Builder();
    } else {
      return new ru.tinkoff.bpm.pledge.submission.registration.process.StartEvent.Builder(other);
    }
  }

  /**
   * Creates a new StartEvent RecordBuilder by copying an existing StartEvent instance.
   * @param other The existing instance to copy.
   * @return A new StartEvent RecordBuilder
   */
  public static ru.tinkoff.bpm.pledge.submission.registration.process.StartEvent.Builder newBuilder(ru.tinkoff.bpm.pledge.submission.registration.process.StartEvent other) {
    if (other == null) {
      return new ru.tinkoff.bpm.pledge.submission.registration.process.StartEvent.Builder();
    } else {
      return new ru.tinkoff.bpm.pledge.submission.registration.process.StartEvent.Builder(other);
    }
  }

  /**
   * RecordBuilder for StartEvent instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<StartEvent>
    implements org.apache.avro.data.RecordBuilder<StartEvent> {

    private java.lang.String applicationIntegrationId;
    private java.lang.String submissionType;
    private java.lang.String submissionId;
    private ru.tinkoff.bpm.pledge.submission.registration.process.AdditionalFields additionalFields;
    private ru.tinkoff.bpm.pledge.submission.registration.process.AdditionalFields.Builder additionalFieldsBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(ru.tinkoff.bpm.pledge.submission.registration.process.StartEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.applicationIntegrationId)) {
        this.applicationIntegrationId = data().deepCopy(fields()[0].schema(), other.applicationIntegrationId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.submissionType)) {
        this.submissionType = data().deepCopy(fields()[1].schema(), other.submissionType);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.submissionId)) {
        this.submissionId = data().deepCopy(fields()[2].schema(), other.submissionId);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.additionalFields)) {
        this.additionalFields = data().deepCopy(fields()[3].schema(), other.additionalFields);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (other.hasAdditionalFieldsBuilder()) {
        this.additionalFieldsBuilder = ru.tinkoff.bpm.pledge.submission.registration.process.AdditionalFields.newBuilder(other.getAdditionalFieldsBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing StartEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(ru.tinkoff.bpm.pledge.submission.registration.process.StartEvent other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.applicationIntegrationId)) {
        this.applicationIntegrationId = data().deepCopy(fields()[0].schema(), other.applicationIntegrationId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.submissionType)) {
        this.submissionType = data().deepCopy(fields()[1].schema(), other.submissionType);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.submissionId)) {
        this.submissionId = data().deepCopy(fields()[2].schema(), other.submissionId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.additionalFields)) {
        this.additionalFields = data().deepCopy(fields()[3].schema(), other.additionalFields);
        fieldSetFlags()[3] = true;
      }
      this.additionalFieldsBuilder = null;
    }

    /**
      * Gets the value of the 'applicationIntegrationId' field.
      * @return The value.
      */
    public java.lang.String getApplicationIntegrationId() {
      return applicationIntegrationId;
    }


    /**
      * Sets the value of the 'applicationIntegrationId' field.
      * @param value The value of 'applicationIntegrationId'.
      * @return This builder.
      */
    public ru.tinkoff.bpm.pledge.submission.registration.process.StartEvent.Builder setApplicationIntegrationId(java.lang.String value) {
      validate(fields()[0], value);
      this.applicationIntegrationId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'applicationIntegrationId' field has been set.
      * @return True if the 'applicationIntegrationId' field has been set, false otherwise.
      */
    public boolean hasApplicationIntegrationId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'applicationIntegrationId' field.
      * @return This builder.
      */
    public ru.tinkoff.bpm.pledge.submission.registration.process.StartEvent.Builder clearApplicationIntegrationId() {
      applicationIntegrationId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'submissionType' field.
      * @return The value.
      */
    public java.lang.String getSubmissionType() {
      return submissionType;
    }


    /**
      * Sets the value of the 'submissionType' field.
      * @param value The value of 'submissionType'.
      * @return This builder.
      */
    public ru.tinkoff.bpm.pledge.submission.registration.process.StartEvent.Builder setSubmissionType(java.lang.String value) {
      validate(fields()[1], value);
      this.submissionType = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'submissionType' field has been set.
      * @return True if the 'submissionType' field has been set, false otherwise.
      */
    public boolean hasSubmissionType() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'submissionType' field.
      * @return This builder.
      */
    public ru.tinkoff.bpm.pledge.submission.registration.process.StartEvent.Builder clearSubmissionType() {
      submissionType = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'submissionId' field.
      * @return The value.
      */
    public java.lang.String getSubmissionId() {
      return submissionId;
    }


    /**
      * Sets the value of the 'submissionId' field.
      * @param value The value of 'submissionId'.
      * @return This builder.
      */
    public ru.tinkoff.bpm.pledge.submission.registration.process.StartEvent.Builder setSubmissionId(java.lang.String value) {
      validate(fields()[2], value);
      this.submissionId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'submissionId' field has been set.
      * @return True if the 'submissionId' field has been set, false otherwise.
      */
    public boolean hasSubmissionId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'submissionId' field.
      * @return This builder.
      */
    public ru.tinkoff.bpm.pledge.submission.registration.process.StartEvent.Builder clearSubmissionId() {
      submissionId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'additionalFields' field.
      * @return The value.
      */
    public ru.tinkoff.bpm.pledge.submission.registration.process.AdditionalFields getAdditionalFields() {
      return additionalFields;
    }


    /**
      * Sets the value of the 'additionalFields' field.
      * @param value The value of 'additionalFields'.
      * @return This builder.
      */
    public ru.tinkoff.bpm.pledge.submission.registration.process.StartEvent.Builder setAdditionalFields(ru.tinkoff.bpm.pledge.submission.registration.process.AdditionalFields value) {
      validate(fields()[3], value);
      this.additionalFieldsBuilder = null;
      this.additionalFields = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'additionalFields' field has been set.
      * @return True if the 'additionalFields' field has been set, false otherwise.
      */
    public boolean hasAdditionalFields() {
      return fieldSetFlags()[3];
    }

    /**
     * Gets the Builder instance for the 'additionalFields' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public ru.tinkoff.bpm.pledge.submission.registration.process.AdditionalFields.Builder getAdditionalFieldsBuilder() {
      if (additionalFieldsBuilder == null) {
        if (hasAdditionalFields()) {
          setAdditionalFieldsBuilder(ru.tinkoff.bpm.pledge.submission.registration.process.AdditionalFields.newBuilder(additionalFields));
        } else {
          setAdditionalFieldsBuilder(ru.tinkoff.bpm.pledge.submission.registration.process.AdditionalFields.newBuilder());
        }
      }
      return additionalFieldsBuilder;
    }

    /**
     * Sets the Builder instance for the 'additionalFields' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public ru.tinkoff.bpm.pledge.submission.registration.process.StartEvent.Builder setAdditionalFieldsBuilder(ru.tinkoff.bpm.pledge.submission.registration.process.AdditionalFields.Builder value) {
      clearAdditionalFields();
      additionalFieldsBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'additionalFields' field has an active Builder instance
     * @return True if the 'additionalFields' field has an active Builder instance
     */
    public boolean hasAdditionalFieldsBuilder() {
      return additionalFieldsBuilder != null;
    }

    /**
      * Clears the value of the 'additionalFields' field.
      * @return This builder.
      */
    public ru.tinkoff.bpm.pledge.submission.registration.process.StartEvent.Builder clearAdditionalFields() {
      additionalFields = null;
      additionalFieldsBuilder = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public StartEvent build() {
      try {
        StartEvent record = new StartEvent();
        record.applicationIntegrationId = fieldSetFlags()[0] ? this.applicationIntegrationId : (java.lang.String) defaultValue(fields()[0]);
        record.submissionType = fieldSetFlags()[1] ? this.submissionType : (java.lang.String) defaultValue(fields()[1]);
        record.submissionId = fieldSetFlags()[2] ? this.submissionId : (java.lang.String) defaultValue(fields()[2]);
        if (additionalFieldsBuilder != null) {
          try {
            record.additionalFields = this.additionalFieldsBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("additionalFields"));
            throw e;
          }
        } else {
          record.additionalFields = fieldSetFlags()[3] ? this.additionalFields : (ru.tinkoff.bpm.pledge.submission.registration.process.AdditionalFields) defaultValue(fields()[3]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<StartEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<StartEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<StartEvent>
    READER$ = (org.apache.avro.io.DatumReader<StartEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.applicationIntegrationId);

    out.writeString(this.submissionType);

    out.writeString(this.submissionId);

    if (this.additionalFields == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.additionalFields.customEncode(out);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.applicationIntegrationId = in.readString();

      this.submissionType = in.readString();

      this.submissionId = in.readString();

      if (in.readIndex() != 1) {
        in.readNull();
        this.additionalFields = null;
      } else {
        if (this.additionalFields == null) {
          this.additionalFields = new ru.tinkoff.bpm.pledge.submission.registration.process.AdditionalFields();
        }
        this.additionalFields.customDecode(in);
      }

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.applicationIntegrationId = in.readString();
          break;

        case 1:
          this.submissionType = in.readString();
          break;

        case 2:
          this.submissionId = in.readString();
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.additionalFields = null;
          } else {
            if (this.additionalFields == null) {
              this.additionalFields = new ru.tinkoff.bpm.pledge.submission.registration.process.AdditionalFields();
            }
            this.additionalFields.customDecode(in);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










