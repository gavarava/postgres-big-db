package io.datastreamer.core.model;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class OrderCountsAboveThreshold implements AnalyticsCriteria {

  BigDecimal threshold;
  BigDecimal orderCountAboveThreshold;
}
