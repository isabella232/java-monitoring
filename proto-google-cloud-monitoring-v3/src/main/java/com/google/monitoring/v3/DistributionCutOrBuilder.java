/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/service.proto

package com.google.monitoring.v3;

public interface DistributionCutOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.DistributionCut)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
   * specifying a `TimeSeries` aggregating values. Must have `ValueType =
   * DISTRIBUTION` and `MetricKind = DELTA` or `MetricKind = CUMULATIVE`.
   * </pre>
   *
   * <code>string distribution_filter = 4;</code>
   *
   * @return The distributionFilter.
   */
  java.lang.String getDistributionFilter();
  /**
   *
   *
   * <pre>
   * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
   * specifying a `TimeSeries` aggregating values. Must have `ValueType =
   * DISTRIBUTION` and `MetricKind = DELTA` or `MetricKind = CUMULATIVE`.
   * </pre>
   *
   * <code>string distribution_filter = 4;</code>
   *
   * @return The bytes for distributionFilter.
   */
  com.google.protobuf.ByteString getDistributionFilterBytes();

  /**
   *
   *
   * <pre>
   * Range of values considered "good." For a one-sided range, set one bound to
   * an infinite value.
   * </pre>
   *
   * <code>.google.monitoring.v3.Range range = 5;</code>
   *
   * @return Whether the range field is set.
   */
  boolean hasRange();
  /**
   *
   *
   * <pre>
   * Range of values considered "good." For a one-sided range, set one bound to
   * an infinite value.
   * </pre>
   *
   * <code>.google.monitoring.v3.Range range = 5;</code>
   *
   * @return The range.
   */
  com.google.monitoring.v3.Range getRange();
  /**
   *
   *
   * <pre>
   * Range of values considered "good." For a one-sided range, set one bound to
   * an infinite value.
   * </pre>
   *
   * <code>.google.monitoring.v3.Range range = 5;</code>
   */
  com.google.monitoring.v3.RangeOrBuilder getRangeOrBuilder();
}