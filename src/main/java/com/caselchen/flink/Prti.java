/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.caselchen.flink;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Prti extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6554465296839026545L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Prti\",\"namespace\":\"com.caselchen.flink\",\"fields\":[{\"name\":\"passingTime\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"plateNo\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Prti> ENCODER =
      new BinaryMessageEncoder<Prti>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Prti> DECODER =
      new BinaryMessageDecoder<Prti>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Prti> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Prti> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Prti>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Prti to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Prti from a ByteBuffer. */
  public static Prti fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.String passingTime;
  @Deprecated public java.lang.String plateNo;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Prti() {}

  /**
   * All-args constructor.
   * @param passingTime The new value for passingTime
   * @param plateNo The new value for plateNo
   */
  public Prti(java.lang.String passingTime, java.lang.String plateNo) {
    this.passingTime = passingTime;
    this.plateNo = plateNo;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return passingTime;
    case 1: return plateNo;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: passingTime = (java.lang.String)value$; break;
    case 1: plateNo = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'passingTime' field.
   * @return The value of the 'passingTime' field.
   */
  public java.lang.String getPassingTime() {
    return passingTime;
  }

  /**
   * Sets the value of the 'passingTime' field.
   * @param value the value to set.
   */
  public void setPassingTime(java.lang.String value) {
    this.passingTime = value;
  }

  /**
   * Gets the value of the 'plateNo' field.
   * @return The value of the 'plateNo' field.
   */
  public java.lang.String getPlateNo() {
    return plateNo;
  }

  /**
   * Sets the value of the 'plateNo' field.
   * @param value the value to set.
   */
  public void setPlateNo(java.lang.String value) {
    this.plateNo = value;
  }

  /**
   * Creates a new Prti RecordBuilder.
   * @return A new Prti RecordBuilder
   */
  public static com.caselchen.flink.Prti.Builder newBuilder() {
    return new com.caselchen.flink.Prti.Builder();
  }

  /**
   * Creates a new Prti RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Prti RecordBuilder
   */
  public static com.caselchen.flink.Prti.Builder newBuilder(com.caselchen.flink.Prti.Builder other) {
    return new com.caselchen.flink.Prti.Builder(other);
  }

  /**
   * Creates a new Prti RecordBuilder by copying an existing Prti instance.
   * @param other The existing instance to copy.
   * @return A new Prti RecordBuilder
   */
  public static com.caselchen.flink.Prti.Builder newBuilder(com.caselchen.flink.Prti other) {
    return new com.caselchen.flink.Prti.Builder(other);
  }

  /**
   * RecordBuilder for Prti instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Prti>
    implements org.apache.avro.data.RecordBuilder<Prti> {

    private java.lang.String passingTime;
    private java.lang.String plateNo;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.caselchen.flink.Prti.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.passingTime)) {
        this.passingTime = data().deepCopy(fields()[0].schema(), other.passingTime);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.plateNo)) {
        this.plateNo = data().deepCopy(fields()[1].schema(), other.plateNo);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Prti instance
     * @param other The existing instance to copy.
     */
    private Builder(com.caselchen.flink.Prti other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.passingTime)) {
        this.passingTime = data().deepCopy(fields()[0].schema(), other.passingTime);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.plateNo)) {
        this.plateNo = data().deepCopy(fields()[1].schema(), other.plateNo);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'passingTime' field.
      * @return The value.
      */
    public java.lang.String getPassingTime() {
      return passingTime;
    }

    /**
      * Sets the value of the 'passingTime' field.
      * @param value The value of 'passingTime'.
      * @return This builder.
      */
    public com.caselchen.flink.Prti.Builder setPassingTime(java.lang.String value) {
      validate(fields()[0], value);
      this.passingTime = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'passingTime' field has been set.
      * @return True if the 'passingTime' field has been set, false otherwise.
      */
    public boolean hasPassingTime() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'passingTime' field.
      * @return This builder.
      */
    public com.caselchen.flink.Prti.Builder clearPassingTime() {
      passingTime = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'plateNo' field.
      * @return The value.
      */
    public java.lang.String getPlateNo() {
      return plateNo;
    }

    /**
      * Sets the value of the 'plateNo' field.
      * @param value The value of 'plateNo'.
      * @return This builder.
      */
    public com.caselchen.flink.Prti.Builder setPlateNo(java.lang.String value) {
      validate(fields()[1], value);
      this.plateNo = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'plateNo' field has been set.
      * @return True if the 'plateNo' field has been set, false otherwise.
      */
    public boolean hasPlateNo() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'plateNo' field.
      * @return This builder.
      */
    public com.caselchen.flink.Prti.Builder clearPlateNo() {
      plateNo = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Prti build() {
      try {
        Prti record = new Prti();
        record.passingTime = fieldSetFlags()[0] ? this.passingTime : (java.lang.String) defaultValue(fields()[0]);
        record.plateNo = fieldSetFlags()[1] ? this.plateNo : (java.lang.String) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Prti>
    WRITER$ = (org.apache.avro.io.DatumWriter<Prti>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Prti>
    READER$ = (org.apache.avro.io.DatumReader<Prti>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}