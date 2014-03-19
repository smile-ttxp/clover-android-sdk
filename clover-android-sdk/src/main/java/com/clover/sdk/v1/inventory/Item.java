/*
 * Copyright (C) 2013 Clover Network, Inc.
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

/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */


package com.clover.sdk.v1.inventory;

@SuppressWarnings("all")
public class Item implements android.os.Parcelable, com.clover.sdk.v1.Validator {

  protected String jsonString = null;
  protected org.json.JSONObject jsonObject = null;

  public Item(String json, boolean ignore) {
    this.jsonString = json;
  }

  public Item(org.json.JSONObject jsonObject) {
    this.jsonObject = jsonObject;
  }

  public Item(java.lang.String name, java.lang.String alternateName, java.lang.String code, java.lang.Long price, com.clover.sdk.v1.inventory.PriceType priceType, java.lang.Boolean taxable, java.lang.Boolean defaultTaxRates, java.lang.String unitName, java.lang.Long cost) throws org.json.JSONException {
    if (name == null) {
      throw new IllegalArgumentException("'name' is required to be non-null");
    }
    if (price == null) {
      throw new IllegalArgumentException("'price' is required to be non-null");
    }
    if (taxable == null) {
      throw new IllegalArgumentException("'taxable' is required to be non-null");
    }
    setName(name);
    setAlternateName(alternateName);
    setCode(code);
    setPrice(price);
    setPriceType(priceType);
    setTaxable(taxable);
    setDefaultTaxRates(defaultTaxRates);
    setUnitName(unitName);
    setCost(cost);
  }

  public Item(java.lang.String id, java.lang.String name, java.lang.String alternateName, java.lang.String code, java.lang.Long price, com.clover.sdk.v1.inventory.PriceType priceType, java.lang.Boolean taxable, java.lang.Boolean defaultTaxRates, java.lang.String unitName, java.lang.Long cost, java.util.List<com.clover.sdk.v1.inventory.TaxRate> taxRates, java.util.List<com.clover.sdk.v1.inventory.ModifierGroup> modifierGroups, java.util.List<com.clover.sdk.v1.inventory.CategoryDescription> categories) throws org.json.JSONException {
    if (name == null) {
      throw new IllegalArgumentException("'name' is required to be non-null");
    }
    if (price == null) {
      throw new IllegalArgumentException("'price' is required to be non-null");
    }
    if (taxable == null) {
      throw new IllegalArgumentException("'taxable' is required to be non-null");
    }
    setId(id);
    setName(name);
    setAlternateName(alternateName);
    setCode(code);
    setPrice(price);
    setPriceType(priceType);
    setTaxable(taxable);
    setDefaultTaxRates(defaultTaxRates);
    setUnitName(unitName);
    setCost(cost);
    setTaxRates(taxRates);
    setModifierGroups(modifierGroups);
    setCategories(categories);
  }

  protected org.json.JSONObject getJSONObject() {
    try {
      if (jsonObject == null) {
        if (jsonString != null) {
          jsonObject = (org.json.JSONObject) new org.json.JSONTokener(jsonString).nextValue();
          jsonString = null; // null this so it will be recreated if jsonObject is modified
        } else {
          jsonObject = new org.json.JSONObject();
        }
      }
    } catch (org.json.JSONException e) {
      // print some kind of error
    }
    return jsonObject;
  }

  public void validate() throws org.json.JSONException {
    if (getName() == null) {
      throw new IllegalArgumentException("'name' is required to be non-null");
    }
    if (getPrice() == null) {
      throw new IllegalArgumentException("'price' is required to be non-null");
    }
    if (getTaxable() == null) {
      throw new IllegalArgumentException("'taxable' is required to be non-null");
    }
    java.lang.String id = getId();
    if (id != null && id.length() > 13) {
      throw new IllegalArgumentException("Maximum string length exceeded for 'id'");
    }
    java.lang.String name = getName();
    if (name != null && name.length() > 127) {
      throw new IllegalArgumentException("Maximum string length exceeded for 'name'");
    }
    java.lang.String alternateName = getAlternateName();

    java.lang.String code = getCode();

    java.lang.Long price = getPrice();
    if (price != null && price < 0) {
      throw new IllegalArgumentException("Invalid value for 'price'");
    }
    com.clover.sdk.v1.inventory.PriceType priceType = getPriceType();

    java.lang.Boolean taxable = getTaxable();

    java.lang.Boolean defaultTaxRates = getDefaultTaxRates();

    java.lang.String unitName = getUnitName();

    java.lang.Long cost = getCost();

    java.util.List<com.clover.sdk.v1.inventory.TaxRate> taxRates = getTaxRates();

    java.util.List<com.clover.sdk.v1.inventory.ModifierGroup> modifierGroups = getModifierGroups();

    java.util.List<com.clover.sdk.v1.inventory.CategoryDescription> categories = getCategories();

    // TODO: also validate string length, valid ranges and other integrity checks
  }

  /**
   * Unique identifier
   */
  public java.lang.String getId() {
    return getJSONObject().optString("id");
  }

  /**
   * Name of the item
   */
  public java.lang.String getName() {
    return getJSONObject().optString("name");
  }

  /**
   * Alternate name of the item
   */
  public java.lang.String getAlternateName() {
    return getJSONObject().optString("alternateName");
  }

  /**
   * Product code, e.g. UPC or EAN
   */
  public java.lang.String getCode() {
    return getJSONObject().optString("code");
  }

  /**
   * Sku
   */
  public java.lang.String getSku() {
    return getJSONObject().optString("sku");
  }

  /**
   * Price of the item, typically in cents; use priceType and merchant currency to determine actual item price
   */
  public java.lang.Long getPrice() {
    return getJSONObject().optLong("price");
  }

  public com.clover.sdk.v1.inventory.PriceType getPriceType() {
    com.clover.sdk.v1.inventory.PriceType[] enumValues = com.clover.sdk.v1.inventory.PriceType.class.getEnumConstants();
    // from last to first, so that in case of duplicate values, first wins
    for (int i = enumValues.length; --i >= 0; ) {
      com.clover.sdk.v1.inventory.PriceType e = enumValues[i];
      if (e.toString().equals(getJSONObject().optString("priceType"))) {
        return e;
      }
    }
    // throw exception or return null?
    return null;
  }

  /**
   * Flag to indicate whether this item is taxable or not
   */
  public java.lang.Boolean getTaxable() {
    return getJSONObject().optBoolean("taxable", false);
  }

  /**
   * Flag to indicate whether or not to use default tax rates
   */
  public java.lang.Boolean getDefaultTaxRates() {
    return getJSONObject().optBoolean("defaultTaxRates", true);
  }

  /**
   * Unit name, e.g. oz, lb
   */
  public java.lang.String getUnitName() {
    return getJSONObject().optString("unitName");
  }

  /**
   * Cost of the item to merchant, as opposed to customer price
   */
  public java.lang.Long getCost() {
    return getJSONObject().optLong("cost");
  }

  public java.util.List<com.clover.sdk.v1.inventory.TaxRate> getTaxRates() throws org.json.JSONException {
    java.util.List<com.clover.sdk.v1.inventory.TaxRate> itemList = null;
    if (getJSONObject().has("taxRates")) {
      itemList = new java.util.ArrayList<com.clover.sdk.v1.inventory.TaxRate>();
      org.json.JSONArray itemArray = getJSONObject().getJSONArray("taxRates");
      for (int i = 0; i < itemArray.length(); i++) {
        org.json.JSONObject obj = itemArray.getJSONObject(i);
        com.clover.sdk.v1.inventory.TaxRate item = new com.clover.sdk.v1.inventory.TaxRate(obj);
        itemList.add(item);
      }
    }
    return itemList;
  }

  public java.util.List<com.clover.sdk.v1.inventory.ModifierGroup> getModifierGroups() throws org.json.JSONException {
    java.util.List<com.clover.sdk.v1.inventory.ModifierGroup> itemList = null;
    if (getJSONObject().has("modifierGroups")) {
      itemList = new java.util.ArrayList<com.clover.sdk.v1.inventory.ModifierGroup>();
      org.json.JSONArray itemArray = getJSONObject().getJSONArray("modifierGroups");
      for (int i = 0; i < itemArray.length(); i++) {
        org.json.JSONObject obj = itemArray.getJSONObject(i);
        com.clover.sdk.v1.inventory.ModifierGroup item = new com.clover.sdk.v1.inventory.ModifierGroup(obj);
        itemList.add(item);
      }
    }
    return itemList;
  }

  public java.util.List<com.clover.sdk.v1.inventory.CategoryDescription> getCategories() throws org.json.JSONException {
    java.util.List<com.clover.sdk.v1.inventory.CategoryDescription> itemList = null;
    if (getJSONObject().has("categories")) {
      itemList = new java.util.ArrayList<com.clover.sdk.v1.inventory.CategoryDescription>();
      org.json.JSONArray itemArray = getJSONObject().getJSONArray("categories");
      for (int i = 0; i < itemArray.length(); i++) {
        org.json.JSONObject obj = itemArray.getJSONObject(i);
        com.clover.sdk.v1.inventory.CategoryDescription item = new com.clover.sdk.v1.inventory.CategoryDescription(obj);
        itemList.add(item);
      }
    }
    return itemList;
  }

  /**
   * Count of items available.
   */
  public java.lang.Long getCount() {
    return getJSONObject().optLong("count");
  }

  /**
   * Checks whether the 'id' field has been set
   */
  public boolean hasId() {
    return getJSONObject().has("id");
  }

  /**
   * Checks whether the 'name' field has been set
   */
  public boolean hasName() {
    return getJSONObject().has("name");
  }

  /**
   * Checks whether the 'alternateName' field has been set
   */
  public boolean hasAlternateName() {
    return getJSONObject().has("alternateName");
  }

  /**
   * Checks whether the 'code' field has been set
   */
  public boolean hasCode() {
    return getJSONObject().has("code");
  }

  /**
   * Checks whether the 'sku' field has been set
   */
  public boolean hasSku() {
    return getJSONObject().has("sku");
  }

  /**
   * Checks whether the 'price' field has been set
   */
  public boolean hasPrice() {
    return getJSONObject().has("price");
  }

  /**
   * Checks whether the 'priceType' field has been set
   */
  public boolean hasPriceType() {
    return getJSONObject().has("priceType");
  }

  /**
   * Checks whether the 'taxable' field has been set
   */
  public boolean hasTaxable() {
    return getJSONObject().has("taxable");
  }

  /**
   * Checks whether the 'defaultTaxRates' field has been set
   */
  public boolean hasDefaultTaxRates() {
    return getJSONObject().has("defaultTaxRates");
  }

  /**
   * Checks whether the 'unitName' field has been set
   */
  public boolean hasUnitName() {
    return getJSONObject().has("unitName");
  }

  /**
   * Checks whether the 'cost' field has been set
   */
  public boolean hasCost() {
    return getJSONObject().has("cost");
  }

  /**
   * Checks whether the 'taxRates' field has been set
   */
  public boolean hasTaxRates() {
    return getJSONObject().has("taxRates");
  }

  /**
   * Checks whether the 'modifierGroups' field has been set
   */
  public boolean hasModifierGroups() {
    return getJSONObject().has("modifierGroups");
  }

  /**
   * Checks whether the 'categories' field has been set
   */
  public boolean hasCategories() {
    return getJSONObject().has("categories");
  }

  /**
   * Checks whether the 'count' field has been set
   */
  public boolean hasCount() {
    return getJSONObject().has("count");
  }

  public void setId(java.lang.String id) throws org.json.JSONException {
    if (id != null && id.length() > 13) {
      throw new IllegalArgumentException("Maximum string length exceeded for 'id'");
    }
    getJSONObject().put("id", id);
  }

  public void setName(java.lang.String name) throws org.json.JSONException {
    if (name != null && name.length() > 127) {
      throw new IllegalArgumentException("Maximum string length exceeded for 'name'");
    }
    getJSONObject().put("name", name);
  }

  public void setAlternateName(java.lang.String alternateName) throws org.json.JSONException {

    getJSONObject().put("alternateName", alternateName);
  }

  public void setCode(java.lang.String code) throws org.json.JSONException {

    getJSONObject().put("code", code);
  }

  public void setSku(java.lang.String sku) throws org.json.JSONException {

    getJSONObject().put("sku", sku);
  }

  public void setPrice(java.lang.Long price) throws org.json.JSONException {
    if (price != null && price < 0) {
      throw new IllegalArgumentException("Invalid value for 'price'");
    }
    getJSONObject().put("price", price);
  }

  public void setPriceType(com.clover.sdk.v1.inventory.PriceType priceType) throws org.json.JSONException {

    getJSONObject().put("priceType", priceType);
  }

  public void setTaxable(java.lang.Boolean taxable) throws org.json.JSONException {

    getJSONObject().put("taxable", taxable);
  }

  public void setDefaultTaxRates(java.lang.Boolean defaultTaxRates) throws org.json.JSONException {

    getJSONObject().put("defaultTaxRates", defaultTaxRates);
  }

  public void setUnitName(java.lang.String unitName) throws org.json.JSONException {

    getJSONObject().put("unitName", unitName);
  }

  public void setCost(java.lang.Long cost) throws org.json.JSONException {

    getJSONObject().put("cost", cost);
  }

  public void setTaxRates(java.util.List<com.clover.sdk.v1.inventory.TaxRate> taxRates) throws org.json.JSONException {
    if (taxRates != null) {
      org.json.JSONArray array = new org.json.JSONArray();
      for (com.clover.sdk.v1.inventory.TaxRate obj : taxRates) {
        array.put(obj.getJSONObject());
      }
      getJSONObject().put("taxRates", array);
    }
  }

  public void setModifierGroups(java.util.List<com.clover.sdk.v1.inventory.ModifierGroup> modifierGroups) throws org.json.JSONException {
    if (modifierGroups != null) {
      org.json.JSONArray array = new org.json.JSONArray();
      for (com.clover.sdk.v1.inventory.ModifierGroup obj : modifierGroups) {
        array.put(obj.getJSONObject());
      }
      getJSONObject().put("modifierGroups", array);
    }
  }

  public void setCategories(java.util.List<com.clover.sdk.v1.inventory.CategoryDescription> categories) throws org.json.JSONException {
    if (categories != null) {
      org.json.JSONArray array = new org.json.JSONArray();
      for (com.clover.sdk.v1.inventory.CategoryDescription obj : categories) {
        array.put(obj.getJSONObject());
      }
      getJSONObject().put("categories", array);
    }
  }

  public void setCount(java.lang.Long count) throws org.json.JSONException {
    getJSONObject().put("count", count);
  }


  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(android.os.Parcel dest, int flags) {
    String json = jsonString != null ? jsonString : getJSONObject().toString();
    dest.writeString(json);
  }

  public static final android.os.Parcelable.Creator<Item> CREATOR = new android.os.Parcelable.Creator<Item>() {
    public Item createFromParcel(android.os.Parcel in) {
      String json = in.readString();
      return new Item(json, true);
    }

    public Item[] newArray(int size) {
      return new Item[size];
    }
  };

  public static class Builder {

    private java.lang.String name;
    private java.lang.String alternateName;
    private java.lang.String code;
    private java.lang.Long price;
    private com.clover.sdk.v1.inventory.PriceType priceType;
    private java.lang.Boolean taxable;
    private java.lang.Boolean defaultTaxRates;
    private java.lang.String unitName;
    private java.lang.Long cost;
    private java.lang.Long count;
    private java.lang.String sku;

    public Builder() {
    }

    public Builder name(java.lang.String name) {
      if (name != null && name.length() > 127) {
        throw new IllegalArgumentException("Maximum string length exceeded for 'name'");
      }
      this.name = name;
      return this;
    }

    public Builder alternateName(java.lang.String alternateName) {

      this.alternateName = alternateName;
      return this;
    }

    public Builder code(java.lang.String code) {

      this.code = code;
      return this;
    }

    public Builder sku(java.lang.String sku) {

      this.sku = sku;
      return this;
    }

    public Builder price(java.lang.Long price) {
      if (price != null && price < 0) {
        throw new IllegalArgumentException("Invalid value for 'price'");
      }
      this.price = price;
      return this;
    }

    public Builder priceType(com.clover.sdk.v1.inventory.PriceType priceType) {

      this.priceType = priceType;
      return this;
    }

    public Builder taxable(java.lang.Boolean taxable) {

      this.taxable = taxable;
      return this;
    }

    public Builder defaultTaxRates(java.lang.Boolean defaultTaxRates) {

      this.defaultTaxRates = defaultTaxRates;
      return this;
    }

    public Builder unitName(java.lang.String unitName) {

      this.unitName = unitName;
      return this;
    }

    public Builder cost(java.lang.Long cost) {

      this.cost = cost;
      return this;
    }

    public Builder count(java.lang.Long count) {
      this.count = count;
      return this;
    }


    public Item build() throws org.json.JSONException {
      Item item = new Item(name, alternateName, code, price, priceType, taxable, defaultTaxRates, unitName, cost);
      if (count != null) {
        item.setCount(count);
      }
      if (sku != null) {
        item.setSku(sku);
      }
      return item;
    }
  }

}
