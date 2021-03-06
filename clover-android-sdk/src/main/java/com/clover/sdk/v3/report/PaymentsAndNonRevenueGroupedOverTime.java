/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2016 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.report;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * Holds summaries of payments and non-revenue item sales grouped by a configurable time period, like by hour
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getTotalPayments totalPayments}</li>
 * <li>{@link #getTotalNonRevenue totalNonRevenue}</li>
 * <li>{@link #getPaymentSummariesOverTime paymentSummariesOverTime}</li>
 * <li>{@link #getNonRevenueSummariesOverTime nonRevenueSummariesOverTime}</li>
 * <li>{@link #getPeriod period}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class PaymentsAndNonRevenueGroupedOverTime extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Sum of all payments. Does not include items marked non-revenue
   */
  public com.clover.sdk.v3.report.Summary getTotalPayments() {
    return genClient.cacheGet(CacheKey.totalPayments);
  }

  /**
   * Sum of all sales of items marked non-revenue including modifiers and discounts
   */
  public com.clover.sdk.v3.report.Summary getTotalNonRevenue() {
    return genClient.cacheGet(CacheKey.totalNonRevenue);
  }

  /**
   * Summaries grouped over time of payments. Does not include items marked non-revenue
   */
  public java.util.List<com.clover.sdk.v3.report.Summary> getPaymentSummariesOverTime() {
    return genClient.cacheGet(CacheKey.paymentSummariesOverTime);
  }

  /**
   * Summaries grouped over time of sales of items marked non-revenue including modifiers and discounts
   */
  public java.util.List<com.clover.sdk.v3.report.Summary> getNonRevenueSummariesOverTime() {
    return genClient.cacheGet(CacheKey.nonRevenueSummariesOverTime);
  }

  /**
   * The time period that defines the size of the groups: hour, day, week, month
   */
  public com.clover.sdk.v3.report.TimePeriod getPeriod() {
    return genClient.cacheGet(CacheKey.period);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<PaymentsAndNonRevenueGroupedOverTime> {
    totalPayments {
      @Override
      public Object extractValue(PaymentsAndNonRevenueGroupedOverTime instance) {
        return instance.genClient.extractRecord("totalPayments", com.clover.sdk.v3.report.Summary.JSON_CREATOR);
      }
    },
    totalNonRevenue {
      @Override
      public Object extractValue(PaymentsAndNonRevenueGroupedOverTime instance) {
        return instance.genClient.extractRecord("totalNonRevenue", com.clover.sdk.v3.report.Summary.JSON_CREATOR);
      }
    },
    paymentSummariesOverTime {
      @Override
      public Object extractValue(PaymentsAndNonRevenueGroupedOverTime instance) {
        return instance.genClient.extractListRecord("paymentSummariesOverTime", com.clover.sdk.v3.report.Summary.JSON_CREATOR);
      }
    },
    nonRevenueSummariesOverTime {
      @Override
      public Object extractValue(PaymentsAndNonRevenueGroupedOverTime instance) {
        return instance.genClient.extractListRecord("nonRevenueSummariesOverTime", com.clover.sdk.v3.report.Summary.JSON_CREATOR);
      }
    },
    period {
      @Override
      public Object extractValue(PaymentsAndNonRevenueGroupedOverTime instance) {
        return instance.genClient.extractEnum("period", com.clover.sdk.v3.report.TimePeriod.class);
      }
    },
      ;
  }

  private GenericClient<PaymentsAndNonRevenueGroupedOverTime> genClient;

  /**
  * Constructs a new empty instance.
  */
  public PaymentsAndNonRevenueGroupedOverTime() {
    genClient = new GenericClient<PaymentsAndNonRevenueGroupedOverTime>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected PaymentsAndNonRevenueGroupedOverTime(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public PaymentsAndNonRevenueGroupedOverTime(String json) throws IllegalArgumentException {
    this();
    try {
      genClient.setJsonObject(new org.json.JSONObject(json));
    } catch (org.json.JSONException e) {
      throw new IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public PaymentsAndNonRevenueGroupedOverTime(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public PaymentsAndNonRevenueGroupedOverTime(PaymentsAndNonRevenueGroupedOverTime src) {
    this();
    if (src.genClient.getJsonObject() != null) {
      genClient.setJsonObject(com.clover.sdk.v3.JsonHelper.deepCopy(src.genClient.getJSONObject()));
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    return genClient.getJSONObject();
  }

  @Override
  public void validate() {
  }

  /** Checks whether the 'totalPayments' field is set and is not null */
  public boolean isNotNullTotalPayments() {
    return genClient.cacheValueIsNotNull(CacheKey.totalPayments);
  }

  /** Checks whether the 'totalNonRevenue' field is set and is not null */
  public boolean isNotNullTotalNonRevenue() {
    return genClient.cacheValueIsNotNull(CacheKey.totalNonRevenue);
  }

  /** Checks whether the 'paymentSummariesOverTime' field is set and is not null */
  public boolean isNotNullPaymentSummariesOverTime() {
    return genClient.cacheValueIsNotNull(CacheKey.paymentSummariesOverTime);
  }

  /** Checks whether the 'paymentSummariesOverTime' field is set and is not null and is not empty */
  public boolean isNotEmptyPaymentSummariesOverTime() { return isNotNullPaymentSummariesOverTime() && !getPaymentSummariesOverTime().isEmpty(); }

  /** Checks whether the 'nonRevenueSummariesOverTime' field is set and is not null */
  public boolean isNotNullNonRevenueSummariesOverTime() {
    return genClient.cacheValueIsNotNull(CacheKey.nonRevenueSummariesOverTime);
  }

  /** Checks whether the 'nonRevenueSummariesOverTime' field is set and is not null and is not empty */
  public boolean isNotEmptyNonRevenueSummariesOverTime() { return isNotNullNonRevenueSummariesOverTime() && !getNonRevenueSummariesOverTime().isEmpty(); }

  /** Checks whether the 'period' field is set and is not null */
  public boolean isNotNullPeriod() {
    return genClient.cacheValueIsNotNull(CacheKey.period);
  }



  /** Checks whether the 'totalPayments' field has been set, however the value could be null */
  public boolean hasTotalPayments() {
    return genClient.cacheHasKey(CacheKey.totalPayments);
  }

  /** Checks whether the 'totalNonRevenue' field has been set, however the value could be null */
  public boolean hasTotalNonRevenue() {
    return genClient.cacheHasKey(CacheKey.totalNonRevenue);
  }

  /** Checks whether the 'paymentSummariesOverTime' field has been set, however the value could be null */
  public boolean hasPaymentSummariesOverTime() {
    return genClient.cacheHasKey(CacheKey.paymentSummariesOverTime);
  }

  /** Checks whether the 'nonRevenueSummariesOverTime' field has been set, however the value could be null */
  public boolean hasNonRevenueSummariesOverTime() {
    return genClient.cacheHasKey(CacheKey.nonRevenueSummariesOverTime);
  }

  /** Checks whether the 'period' field has been set, however the value could be null */
  public boolean hasPeriod() {
    return genClient.cacheHasKey(CacheKey.period);
  }


  /**
   * Sets the field 'totalPayments'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public PaymentsAndNonRevenueGroupedOverTime setTotalPayments(com.clover.sdk.v3.report.Summary totalPayments) {
    return genClient.setRecord(totalPayments, CacheKey.totalPayments);
  }

  /**
   * Sets the field 'totalNonRevenue'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public PaymentsAndNonRevenueGroupedOverTime setTotalNonRevenue(com.clover.sdk.v3.report.Summary totalNonRevenue) {
    return genClient.setRecord(totalNonRevenue, CacheKey.totalNonRevenue);
  }

  /**
   * Sets the field 'paymentSummariesOverTime'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public PaymentsAndNonRevenueGroupedOverTime setPaymentSummariesOverTime(java.util.List<com.clover.sdk.v3.report.Summary> paymentSummariesOverTime) {
    return genClient.setArrayRecord(paymentSummariesOverTime, CacheKey.paymentSummariesOverTime);
  }

  /**
   * Sets the field 'nonRevenueSummariesOverTime'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public PaymentsAndNonRevenueGroupedOverTime setNonRevenueSummariesOverTime(java.util.List<com.clover.sdk.v3.report.Summary> nonRevenueSummariesOverTime) {
    return genClient.setArrayRecord(nonRevenueSummariesOverTime, CacheKey.nonRevenueSummariesOverTime);
  }

  /**
   * Sets the field 'period'.
   */
  public PaymentsAndNonRevenueGroupedOverTime setPeriod(com.clover.sdk.v3.report.TimePeriod period) {
    return genClient.setOther(period, CacheKey.period);
  }


  /** Clears the 'totalPayments' field, the 'has' method for this field will now return false */
  public void clearTotalPayments() {
    genClient.clear(CacheKey.totalPayments);
  }
  /** Clears the 'totalNonRevenue' field, the 'has' method for this field will now return false */
  public void clearTotalNonRevenue() {
    genClient.clear(CacheKey.totalNonRevenue);
  }
  /** Clears the 'paymentSummariesOverTime' field, the 'has' method for this field will now return false */
  public void clearPaymentSummariesOverTime() {
    genClient.clear(CacheKey.paymentSummariesOverTime);
  }
  /** Clears the 'nonRevenueSummariesOverTime' field, the 'has' method for this field will now return false */
  public void clearNonRevenueSummariesOverTime() {
    genClient.clear(CacheKey.nonRevenueSummariesOverTime);
  }
  /** Clears the 'period' field, the 'has' method for this field will now return false */
  public void clearPeriod() {
    genClient.clear(CacheKey.period);
  }


  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return genClient.containsChanges();
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    genClient.resetChangeLog();
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public PaymentsAndNonRevenueGroupedOverTime copyChanges() {
    PaymentsAndNonRevenueGroupedOverTime copy = new PaymentsAndNonRevenueGroupedOverTime();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(PaymentsAndNonRevenueGroupedOverTime src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new PaymentsAndNonRevenueGroupedOverTime(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<PaymentsAndNonRevenueGroupedOverTime> CREATOR = new android.os.Parcelable.Creator<PaymentsAndNonRevenueGroupedOverTime>() {
    @Override
    public PaymentsAndNonRevenueGroupedOverTime createFromParcel(android.os.Parcel in) {
      PaymentsAndNonRevenueGroupedOverTime instance = new PaymentsAndNonRevenueGroupedOverTime(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public PaymentsAndNonRevenueGroupedOverTime[] newArray(int size) {
      return new PaymentsAndNonRevenueGroupedOverTime[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<PaymentsAndNonRevenueGroupedOverTime> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<PaymentsAndNonRevenueGroupedOverTime>() {
    @Override
    public PaymentsAndNonRevenueGroupedOverTime create(org.json.JSONObject jsonObject) {
      return new PaymentsAndNonRevenueGroupedOverTime(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean TOTALPAYMENTS_IS_REQUIRED = false;
    public static final boolean TOTALNONREVENUE_IS_REQUIRED = false;
    public static final boolean PAYMENTSUMMARIESOVERTIME_IS_REQUIRED = false;
    public static final boolean NONREVENUESUMMARIESOVERTIME_IS_REQUIRED = false;
    public static final boolean PERIOD_IS_REQUIRED = false;

  }

}
