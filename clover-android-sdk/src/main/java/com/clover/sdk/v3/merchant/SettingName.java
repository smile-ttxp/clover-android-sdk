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

package com.clover.sdk.v3.merchant;

import android.os.Parcelable;
import android.os.Parcel;

/**
 * This is an auto-generated Clover data enum.
 */
@SuppressWarnings("all")
public enum SettingName implements Parcelable {
  TIPS_ENABLED, SIGNATURE_THRESHOLD, RECEIPT_PROPERTIES, TIP_RATE_DEFAULT, ON_PAPER_TIP_SIGNATURES, AUTO_LOGOUT, ORDER_TITLE, ORDER_TITLE_MAX, RESET_ON_REPORTING_TIME, NOTES_ON_ORDERS, DELETE_ORDERS, CASH_MANAGEMENT_ENABLED, REMOVE_TAX_ENABLED, AUTO_PRINT, HARDWARE_PROFILE, GROUP_LINE_ITEMS, ALTERNATE_INVENTORY_NAMES, STAY_IN_CATEGORY, TRACK_STOCK, UPDATE_STOCK, ALLOW_CLOCK_OUT_WITH_OPEN_ORDERS, LOG_IN_CLOCK_IN_PROMPT, SUMMARY_HOUR, SHIPPING_ADDRESS, BUSINESS_TYPE_CODE, MAX_CASH_BACK, CLICK_TO_CALL_SUPPORT, BROADCAST_PUSH_ENABLED, TIP_THRESHOLD_TYPE, TIP_THRESHOLD_LOW, TIP_THRESHOLD_HIGH, PIN_DISABLED, DEFAULT_CURRENCY, FAST_PAY_ENABLED, TASK_QUEUE_SYNC_THROTTLE_MILLIS, DBA_ATTENTION, SEND_PROMO_BUTTON_ENABLED, DESTINATIONS_TO_VERIFY, TOS_BILLING_MODEL, DEVICE_OPERATING_MODE, ORDERS_COMBINED_SYNC, ACCEPTED_BILLING_TERMS, ACTIVITY_AWARE_SYNC_CONFIG, APP_PERMISSIONS_IMPL, LAZY_FETCH_APP_TOKENS;

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(final Parcel dest, final int flags) {
    dest.writeString(name());
  }

  public static final Creator<SettingName> CREATOR = new Creator<SettingName>() {
    @Override
    public SettingName createFromParcel(final Parcel source) {
      return SettingName.valueOf(source.readString());
    }

    @Override
    public SettingName[] newArray(final int size) {
      return new SettingName[size];
    }
  };
}
